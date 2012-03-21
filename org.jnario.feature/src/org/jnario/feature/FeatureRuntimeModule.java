/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.feature;

import org.eclipse.xtend.core.compiler.XtendOutputConfigurationProvider;
import org.eclipse.xtend.core.jvmmodel.DispatchUtil;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.resource.XtendEObjectAtOffsetHelper;
import org.eclipse.xtend.core.resource.XtendResource;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionStrategy;
import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtend.core.scoping.XtendScopeProvider;
import org.eclipse.xtend.core.validation.ClasspathBasedChecks;
import org.eclipse.xtend.core.validation.XtendEarlyExitValidator;
import org.eclipse.xtext.generator.IFilePostProcessor;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.TraceAwarePostProcessor;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.validation.EarlyExitValidator;
import org.jnario.feature.generator.FeatureCompiler;
import org.jnario.feature.generator.FeatureJvmModelGenerator;
import org.jnario.feature.jvmmodel.FeatureFeatureCallToJavaMapping;
import org.jnario.feature.jvmmodel.FeatureJvmModelInferrer;
import org.jnario.feature.linking.FeatureLazyLinker;
import org.jnario.feature.linking.FeatureLinkingService;
import org.jnario.feature.naming.FeatureIdentifiableSimpleNameProvider;
import org.jnario.feature.naming.FeatureQualifiedNameProvider;
import org.jnario.feature.validation.FeatureClasspathBasedChecks;
import org.jnario.feature.validation.FeatureResourceValidator;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioDispatchUtil;
import org.jnario.scoping.JnarioExtensionClassNameProvider;
import org.jnario.typing.JnarioTypeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureRuntimeModule extends org.jnario.feature.AbstractFeatureRuntimeModule {
	
	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder(){
		return ExtendedJvmTypesBuilder.class;
	}
	
	public Class<? extends JvmModelGenerator> bindJvmModelGenerator(){
		return ExtendedJvmModelGenerator.class;
	}
	
	@Override
	public java.lang.Class<? extends IScopeProvider> bindIScopeProvider() {
		return XtendScopeProvider.class;
	}
	
	public Class<? extends ExtensionClassNameProvider> bindExtensionClassNameProvider(){
		return JnarioExtensionClassNameProvider.class;
	}
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider(){
		return JnarioTypeProvider.class;
	}
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return XtendResource.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(XtendImportedNamespaceScopeProvider.class);
	}

	@Override
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return FeatureIdentifiableSimpleNameProvider.class;
	}

	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return FeatureJvmModelInferrer.class;
	}

	public Class <? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return XtendResourceDescriptionStrategy.class;
	}

	public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
		return IXtendJvmAssociations.Impl.class;
	}

	public Class<? extends EarlyExitValidator> bindEarlyExitValidator() {
		return XtendEarlyExitValidator.class;
	}
	
	public Class<? extends EObjectAtOffsetHelper> bindEObjectAtOffsetHelper() {
		return XtendEObjectAtOffsetHelper.class;
	}
	
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return FeatureCompiler.class; 
	}	

	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return XtendOutputConfigurationProvider.class;
	}
	
	public Class<? extends FeatureCallToJavaMapping> bindFeatureCallToJavaMapping(){
		return FeatureFeatureCallToJavaMapping.class;
	}
	
	public Class<? extends ClasspathBasedChecks> bindClasspathBasedChecks(){
		return FeatureClasspathBasedChecks.class;
	}
	
	public Class<? extends DispatchUtil> bindDispatchUtil(){
		return JnarioDispatchUtil.class;
	}
	
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider(){
		return FeatureQualifiedNameProvider.class;
	}
	
	
	public Class<? extends IResourceValidator> bindIResourceValidator(){
		return FeatureResourceValidator.class;
	}
	
	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return FeatureJvmModelGenerator.class;
	}
	
	
	public Class<? extends IFilePostProcessor> bindPostProcessor() {
		return TraceAwarePostProcessor.class;
	}
	
	@Override
	public Class<? extends ILinker> bindILinker() {
		return FeatureLazyLinker.class;
	}
	
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return FeatureLinkingService.class;
	}
	
}
