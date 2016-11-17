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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.pmf.pim.Action;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.interactive.ClassHandlerAction;
import org.eclipse.pmf.pim.interactive.Condition;
import org.eclipse.pmf.pim.interactive.ConditionTrigger;
import org.eclipse.pmf.pim.interactive.DataPredicate;
import org.eclipse.pmf.pim.interactive.EventTrigger;
import org.eclipse.pmf.pim.interactive.ExpressionCondition;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.LogicPredicate;
import org.eclipse.pmf.pim.interactive.Predicate;
import org.eclipse.pmf.pim.interactive.PredicateTerm;
import org.eclipse.pmf.pim.interactive.SetAction;
import org.eclipse.pmf.pim.interactive.Trigger;
import org.eclipse.pmf.pim.interactive.TriggerAction;
import org.eclipse.pmf.pim.interactive.UIPredicate;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage
 * @generated
 */
public class InteractiveSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractivePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public InteractiveSwitch() {
		if (modelPackage == null) {
			modelPackage = InteractivePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case InteractivePackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.TRIGGER_ACTION: {
			TriggerAction triggerAction = (TriggerAction) theEObject;
			T result = caseTriggerAction(triggerAction);
			if (result == null)
				result = caseAction(triggerAction);
			if (result == null)
				result = casePMFObject(triggerAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.PREDICATE: {
			Predicate predicate = (Predicate) theEObject;
			T result = casePredicate(predicate);
			if (result == null)
				result = caseCondition(predicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.DATA_PREDICATE: {
			DataPredicate dataPredicate = (DataPredicate) theEObject;
			T result = caseDataPredicate(dataPredicate);
			if (result == null)
				result = caseLogicPredicate(dataPredicate);
			if (result == null)
				result = casePredicate(dataPredicate);
			if (result == null)
				result = caseCondition(dataPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.UI_PREDICATE: {
			UIPredicate uiPredicate = (UIPredicate) theEObject;
			T result = caseUIPredicate(uiPredicate);
			if (result == null)
				result = caseLogicPredicate(uiPredicate);
			if (result == null)
				result = casePredicate(uiPredicate);
			if (result == null)
				result = caseCondition(uiPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.EXPRESSION_CONDITION: {
			ExpressionCondition expressionCondition = (ExpressionCondition) theEObject;
			T result = caseExpressionCondition(expressionCondition);
			if (result == null)
				result = caseCondition(expressionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.SET_ACTION: {
			SetAction setAction = (SetAction) theEObject;
			T result = caseSetAction(setAction);
			if (result == null)
				result = caseTriggerAction(setAction);
			if (result == null)
				result = caseAction(setAction);
			if (result == null)
				result = casePMFObject(setAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.PREDICATE_TERM: {
			PredicateTerm predicateTerm = (PredicateTerm) theEObject;
			T result = casePredicateTerm(predicateTerm);
			if (result == null)
				result = casePredicate(predicateTerm);
			if (result == null)
				result = caseCondition(predicateTerm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.LOGIC_PREDICATE: {
			LogicPredicate logicPredicate = (LogicPredicate) theEObject;
			T result = caseLogicPredicate(logicPredicate);
			if (result == null)
				result = casePredicate(logicPredicate);
			if (result == null)
				result = caseCondition(logicPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.CONDITION_TRIGGER: {
			ConditionTrigger conditionTrigger = (ConditionTrigger) theEObject;
			T result = caseConditionTrigger(conditionTrigger);
			if (result == null)
				result = caseTrigger(conditionTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.EVENT_TRIGGER: {
			EventTrigger eventTrigger = (EventTrigger) theEObject;
			T result = caseEventTrigger(eventTrigger);
			if (result == null)
				result = caseTrigger(eventTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InteractivePackage.CLASS_HANDLER_ACTION: {
			ClassHandlerAction classHandlerAction = (ClassHandlerAction) theEObject;
			T result = caseClassHandlerAction(classHandlerAction);
			if (result == null)
				result = caseTriggerAction(classHandlerAction);
			if (result == null)
				result = caseAction(classHandlerAction);
			if (result == null)
				result = casePMFObject(classHandlerAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Action</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerAction(TriggerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Predicate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPredicate(DataPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Predicate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIPredicate(UIPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Condition</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionCondition(ExpressionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Action</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAction(SetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Term</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateTerm(PredicateTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Predicate</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicPredicate(LogicPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionTrigger(ConditionTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTrigger(EventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Handler Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Handler Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassHandlerAction(ClassHandlerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMFObject(PMFObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // InteractiveSwitch
