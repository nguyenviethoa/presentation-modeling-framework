/*******************************************************************************
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.pmf.pim.interactive.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.pmf.pim.interactive.ClassHandlerAction;
import org.eclipse.pmf.pim.interactive.Condition;
import org.eclipse.pmf.pim.interactive.ConditionTrigger;
import org.eclipse.pmf.pim.interactive.DataPredicate;
import org.eclipse.pmf.pim.interactive.EventTrigger;
import org.eclipse.pmf.pim.interactive.ExpressionCondition;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.LogicPredicate;
import org.eclipse.pmf.pim.interactive.Operator;
import org.eclipse.pmf.pim.interactive.Predicate;
import org.eclipse.pmf.pim.interactive.PredicateTerm;
import org.eclipse.pmf.pim.interactive.SetAction;
import org.eclipse.pmf.pim.interactive.Trigger;
import org.eclipse.pmf.pim.interactive.TriggerAction;
import org.eclipse.pmf.pim.interactive.UIPredicate;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage
 * @generated
 */
public class InteractiveValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final InteractiveValidator INSTANCE = new InteractiveValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.pmf.pim.interactive";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public InteractiveValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return InteractivePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case InteractivePackage.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case InteractivePackage.TRIGGER_ACTION:
			return validateTriggerAction((TriggerAction) value, diagnostics,
					context);
		case InteractivePackage.PREDICATE:
			return validatePredicate((Predicate) value, diagnostics, context);
		case InteractivePackage.DATA_PREDICATE:
			return validateDataPredicate((DataPredicate) value, diagnostics,
					context);
		case InteractivePackage.UI_PREDICATE:
			return validateUIPredicate((UIPredicate) value, diagnostics,
					context);
		case InteractivePackage.EXPRESSION_CONDITION:
			return validateExpressionCondition((ExpressionCondition) value,
					diagnostics, context);
		case InteractivePackage.SET_ACTION:
			return validateSetAction((SetAction) value, diagnostics, context);
		case InteractivePackage.TRIGGER:
			return validateTrigger((Trigger) value, diagnostics, context);
		case InteractivePackage.PREDICATE_TERM:
			return validatePredicateTerm((PredicateTerm) value, diagnostics,
					context);
		case InteractivePackage.LOGIC_PREDICATE:
			return validateLogicPredicate((LogicPredicate) value, diagnostics,
					context);
		case InteractivePackage.CONDITION_TRIGGER:
			return validateConditionTrigger((ConditionTrigger) value,
					diagnostics, context);
		case InteractivePackage.EVENT_TRIGGER:
			return validateEventTrigger((EventTrigger) value, diagnostics,
					context);
		case InteractivePackage.CLASS_HANDLER_ACTION:
			return validateClassHandlerAction((ClassHandlerAction) value,
					diagnostics, context);
		case InteractivePackage.OPERATOR:
			return validateOperator((Operator) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerAction(TriggerAction triggerAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerAction, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate(Predicate predicate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPredicate(DataPredicate dataPredicate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPredicate, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIPredicate(UIPredicate uiPredicate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiPredicate, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionCondition(
			ExpressionCondition expressionCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionCondition,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetAction(SetAction setAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(trigger,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(trigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(trigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(trigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(trigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateTrigger_triggerValidate(trigger, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the triggerValidate constraint of '<em>Trigger</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTrigger_triggerValidate(Trigger trigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "triggerValidate",
								getObjectLabel(trigger, context) },
						new Object[] { trigger }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicateTerm(PredicateTerm predicateTerm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predicateTerm, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicPredicate(LogicPredicate logicPredicate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicPredicate, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionTrigger(ConditionTrigger conditionTrigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionTrigger, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conditionTrigger,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conditionTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conditionTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					conditionTrigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conditionTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conditionTrigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conditionTrigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conditionTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTrigger_triggerValidate(conditionTrigger,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTrigger(EventTrigger eventTrigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventTrigger, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eventTrigger,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eventTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eventTrigger,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					eventTrigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eventTrigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eventTrigger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eventTrigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eventTrigger, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateTrigger_triggerValidate(eventTrigger,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassHandlerAction(
			ClassHandlerAction classHandlerAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classHandlerAction, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // InteractiveValidator
