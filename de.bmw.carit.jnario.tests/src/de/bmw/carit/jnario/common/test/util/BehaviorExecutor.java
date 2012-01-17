/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.fail;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.internal.core.AbstractBundle;
import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.osgi.framework.BundleException;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.inject.Inject;

import de.bmw.carit.jnario.Activator;

@SuppressWarnings("restriction")
public abstract class BehaviorExecutor {

	
	public static class CompositeResult extends Result{

		private List<Result> children = newArrayList();

		public void add(Result child) {
			children.add(child);
		}
		
		@Override
		public int getFailureCount() {
			int failureCount = 0;
			for (Result child : children) {
				failureCount += child.getFailureCount();
			}
			return failureCount;
		}
		
		@Override
		public List<Failure> getFailures() {
			List<Failure> failures = newArrayList();
			for (Result child : children) {
				failures.addAll(child.getFailures());
			}
			return failures;
		}
		
		@Override
		public int getIgnoreCount() {
			int ignoreCount = 0;
			for (Result child : children) {
				ignoreCount += child.getIgnoreCount();
			}
			return ignoreCount;
		}
		
		@Override
		public int getRunCount() {
			int runCount = 0;
			for (Result child : children) {
				runCount += child.getRunCount();
			}
			return runCount;
		}
		
		@Override
		public long getRunTime() {
			long runtime = 0;
			for (Result child : children) {
				runtime += child.getRunTime();
			}
			return runtime;
		}
		
	}
	
	private static final String BUNDLE_REFERENCE = "reference:file:";
	private static final String PLUGIN_CLASSES_FOLDER = "plugins";
	private static final String SYSTEM_BUNDLE = "System Bundle";

	private final IGenerator generator;
	private final JavaIoFileSystemAccess fsa;
	private final TemporaryFolder tempFolder;
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	private IResourceValidator validator;
	protected boolean validate = true;

	@Inject
	public BehaviorExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, IResourceValidator validator) {
		this.generator = generator;
		this.fsa = fsa;
		this.tempFolder = tempFolder;
		this.validator = validator;
	}

	public Result run(EObject object) {
		try {
			configureOutlet();
			if(validate){
				validate(object);
			}
			generateJava(object);
			return runExamples(object);
		} catch (Exception e) {
			e.printStackTrace();
			validate(object);
			fail(e.getMessage());
			return null; // not reachable
		} finally {
			tempFolder.delete();
		}
	}

	protected void validate(EObject object) {
		Iterable<Issue> issues = validator.validate(object.eResource(),
				CheckMode.NORMAL_AND_FAST, CancelIndicator.NullImpl);
		Iterable<Issue> onlyErrors = filterErrors(issues);
		assertFalse("Validation errors\n" + Joiner.on("\n  ").join(issues),
		onlyErrors.iterator().hasNext());
	}

	protected Iterable<Issue> filterErrors(Iterable<Issue> issues) {
		Iterable<Issue> onlyErrors = filter(issues, new Predicate<Issue>() {

			public boolean apply(Issue input) {
				return input.getSeverity() == Severity.ERROR;
			}
		});
		return onlyErrors;
	}

	private void configureOutlet() throws IOException {
		tempFolder.create();
		fsa.setOutputPath(tempFolder.getRoot().getAbsolutePath());
	}

	protected void generateJava(EObject object) {
		generator.doGenerate(object.eResource(), fsa);
	}

	protected abstract Result runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException;

	protected void compileJavaFile(String packageName, String className) {
		String[] args = findGeneratedJavaFiles(packageName);
		if (isLoadedAsPlugin()) {
			args = addOsgiBundlesToClassPath(args);
		}
		compiler.run(System.in, System.out, System.err, args);
	}

	protected String[] addOsgiBundlesToClassPath(String[] args) {
		String classPathEntries = Joiner.on(";").join(getClassPath());
		String[] classPathAndJavaFiles = new String[args.length + 2];
		classPathAndJavaFiles[0] = "-classpath";
		classPathAndJavaFiles[1] = classPathEntries;
		System.arraycopy(args, 0, classPathAndJavaFiles, 2, args.length);
		System.out.println(Joiner.on("\n").join(getClassPath()));
		return classPathAndJavaFiles;
	}

	protected Result execute(Class<?> cls) {
		return JUnitCore.runClasses(cls);
	}

	protected Class<?> loadGeneratedClass(String packageName,
			String specClassName) throws MalformedURLException,
			ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader.newInstance(
				new URL[] { tempFolder.getRoot().toURI().toURL() }, getClass()
						.getClassLoader());
		String className = packageName + "." + specClassName;
		return Class.forName(className, true, classLoader);
	}

	private String[] findGeneratedJavaFiles(String packageName) {
		File packageDir = resolvePackageDir(packageName);
		return allJavaFilesIn(packageDir);
	}

	protected File resolvePackageDir(String packageName) {
		StringBuilder sb = new StringBuilder();
		sb.append(tempFolder.getRoot().getAbsolutePath());
		sb.append(File.separator);
		sb.append(packageName
				.replaceAll("\\.", File.separator + File.separator));
		sb.append(File.separator);

		File packageDir = new File(sb.toString());
		return packageDir;
	}

	protected String[] allJavaFilesIn(File packageDir) {
		File[] allJavaFiles = packageDir.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		String[] result = new String[allJavaFiles.length];
		for (int i = 0; i < allJavaFiles.length; i++) {
			File file = allJavaFiles[i];
			result[i] = file.getAbsolutePath();
		}
		return result;
	}

	protected Result runTestsInClass(String className,
			String packageName)
			throws MalformedURLException, ClassNotFoundException {
		compileJavaFile(packageName, className);
		Class<?> testClass = loadGeneratedClass(packageName, className);
		return execute(testClass);
	}

	private boolean isLoadedAsPlugin() {
		ClassLoader pluginClassLoader = getClass().getClassLoader();
		if (pluginClassLoader instanceof DefaultClassLoader) {
			return true;
		}
		return false;
	}

	private List<String> getClassPath() {
		String installLocation = Platform.getInstallLocation().getURL()
				.getPath();

		AbstractBundle[] bundles = (AbstractBundle[]) Activator.getDefault()
				.getBundle().getBundleContext().getBundles();
		List<String> classpath = new ArrayList<String>();

		for (AbstractBundle bundle : bundles) {
			BundleData bundleData = bundle.getBundleData();
			String pathToBundle = getPathOfBundle(bundleData);
			try {
				for (String subFolders : bundleData.getClassPath()) {
					String fullLocation = pathToBundle + File.separator + subFolders;
					String finalClassPath = getAbsoluteClassPath(fullLocation, installLocation);
					if(finalClassPath.length() > 0){
						if(finalClassPath.endsWith("//.")){
							finalClassPath = finalClassPath.substring(0, finalClassPath.length()-3);
						}else if(finalClassPath.endsWith("/.")){
							finalClassPath = finalClassPath.substring(0, finalClassPath.length()-2);
						}
						classpath.add(finalClassPath.replace("/", File.separator));
					}
				}
			} catch (BundleException e) {
				e.printStackTrace();
			}
		}
		return classpath;
	}

	private String getPathOfBundle(BundleData bundleData) {
		String pathOfBundle = bundleData.getLocation();
		int indexOf = pathOfBundle.indexOf(BUNDLE_REFERENCE);
		if (indexOf >= 0) {
			return pathOfBundle.substring(indexOf + BUNDLE_REFERENCE.length());
		}
		return pathOfBundle;
	}

	private String getAbsoluteClassPath(String fullLocation, 
			String installLocation) {
		if (fullLocation.contains(SYSTEM_BUNDLE)) {
			return "";
		}
		if (fullLocation.contains("..")	|| fullLocation.startsWith(PLUGIN_CLASSES_FOLDER)) {
			return installLocation + fullLocation;
		}
		return fullLocation;
	}

}