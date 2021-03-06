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
package org.jnario.spec.ui.contentassist;

import static com.google.common.collect.Iterables.filter;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend.core.xtend.XtendParameter;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions;
import org.eclipse.xtext.common.types.xtext.ui.TypeMatchFilters;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions.VariableType;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.spec.spec.TestFunction;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecProposalProvider extends AbstractSpecProposalProvider {
	
	@Inject
	private JdtVariableCompletions completions;
	
	@Override
	public void completeXAnnotation_AnnotationType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeJavaTypes(context, XAnnotationsPackage.Literals.XANNOTATION__ANNOTATION_TYPE, 
				TypeMatchFilters.all(IJavaSearchConstants.ANNOTATION_TYPE), acceptor);
	}
	
//	@Override
//	public void completeMockLiteral_Type(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		completeJavaTypes(context, XbasePackage.Literals.XTYPE_LITERAL__TYPE, 
//				TypeMatchFilters.all(IJavaSearchConstants.CLASS_AND_INTERFACE), acceptor);
//	}
	
	@Override
	public void completeType_TargetType(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeJavaTypes(context, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE, true, getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
	}
	
	@Override
	public void completeMember_TargetType(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeJavaTypes(context, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE, true, getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
	}
	
	@Override
	public void completeMember_TargetOperation(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeMember_TargetOperation(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeXFeatureCall_Feature(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof TestFunction) {
			EObject xtendClass = model.eContainer();
			while(xtendClass != null && (xtendClass instanceof XtendClass)){
				for (XtendField field : filter(((XtendClass)xtendClass).getMembers(), XtendField.class)) {
					acceptor.accept(createCompletionProposal(field.getName(), field.getName(), getImage(field),  context));
				}
				xtendClass = xtendClass.eContainer();
			}
			createLocalVariableAndImplicitProposals(model, context, acceptor);
		}else if (model instanceof XtendField) {
			createLocalVariableAndImplicitProposals(model, context, acceptor);
		} else {
			super.completeXFeatureCall_Feature(model, assignment, context, acceptor);
		}
	}

	@Override
	public void complete_RICH_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_RICH_TEXT_START(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_RICH_TEXT_END(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_RICH_TEXT_INBETWEEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_COMMENT_RICH_TEXT_END(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_COMMENT_RICH_TEXT_INBETWEEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeInRichString(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void completeParameter_Name(final EObject model, Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		if (model instanceof XtendParameter) {
			final List<XtendParameter> siblings = EcoreUtil2.getSiblingsOfType(model, XtendParameter.class);
			Set<String> alreadyTaken = Sets.newHashSet();
			for(XtendParameter sibling: siblings) {
				alreadyTaken.add(sibling.getName());
			}
			alreadyTaken.addAll(getAllKeywords());
			completions.getVariableProposals(model, XtendPackage.Literals.XTEND_PARAMETER__PARAMETER_TYPE,
					VariableType.PARAMETER, alreadyTaken, new JdtVariableCompletions.CompletionDataAcceptor() {
						public void accept(String replaceText, StyledString label, Image img) {
							acceptor.accept(createCompletionProposal(replaceText, label, img, context));
						}
					});
		} else {
			super.completeParameter_Name(model, assignment, context, acceptor);
		}
	}
	
	@Override
	public void completeMember_Type(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof XtendField) {
			// don't propose types everywhere but only if there's already an indicator for fields, e.g. static, extension, var, val
			completeJavaTypes(context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, true,
					getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
		}
	}
	
	@Override
	public void completeMember_ReturnType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeJavaTypes(context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, true,
				getQualifiedNameValueConverter(), new TypeMatchFilters.All(IJavaSearchConstants.TYPE), acceptor);
	}
	
	@Override
	public void completeMember_Name(final EObject model, Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		if (model instanceof XtendField) {
			//TODO go up type hierarchy and collect all local fields
			final List<XtendField> siblings = EcoreUtil2.getSiblingsOfType(model, XtendField.class);
			Set<String> alreadyTaken = Sets.newHashSet();
			for(XtendField sibling: siblings) {
				alreadyTaken.add(sibling.getName());
			}
			alreadyTaken.addAll(getAllKeywords());
			completions.getVariableProposals(model, XtendPackage.Literals.XTEND_FIELD__TYPE,
					VariableType.INSTANCE_FIELD, alreadyTaken, new JdtVariableCompletions.CompletionDataAcceptor() {
						public void accept(String replaceText, StyledString label, Image img) {
							acceptor.accept(createCompletionProposal(replaceText, label, img, context));
						}
					});
		} else {
			super.completeMember_Name(model, assignment, context, acceptor);
		}
	}
	

}
