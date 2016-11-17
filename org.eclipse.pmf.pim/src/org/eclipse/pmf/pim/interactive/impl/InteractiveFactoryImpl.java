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
package org.eclipse.pmf.pim.interactive.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.pmf.pim.interactive.ClassHandlerAction;
import org.eclipse.pmf.pim.interactive.ConditionTrigger;
import org.eclipse.pmf.pim.interactive.DataPredicate;
import org.eclipse.pmf.pim.interactive.EventTrigger;
import org.eclipse.pmf.pim.interactive.ExpressionCondition;
import org.eclipse.pmf.pim.interactive.InteractiveFactory;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.Operator;
import org.eclipse.pmf.pim.interactive.PredicateTerm;
import org.eclipse.pmf.pim.interactive.SetAction;
import org.eclipse.pmf.pim.interactive.Trigger;
import org.eclipse.pmf.pim.interactive.TriggerAction;
import org.eclipse.pmf.pim.interactive.UIPredicate;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class InteractiveFactoryImpl extends EFactoryImpl implements
		InteractiveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static InteractiveFactory init() {
		try {
			InteractiveFactory theInteractiveFactory = (InteractiveFactory) EPackage.Registry.INSTANCE
					.getEFactory(InteractivePackage.eNS_URI);
			if (theInteractiveFactory != null) {
				return theInteractiveFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractiveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public InteractiveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case InteractivePackage.TRIGGER_ACTION:
			return createTriggerAction();
		case InteractivePackage.DATA_PREDICATE:
			return createDataPredicate();
		case InteractivePackage.UI_PREDICATE:
			return createUIPredicate();
		case InteractivePackage.EXPRESSION_CONDITION:
			return createExpressionCondition();
		case InteractivePackage.SET_ACTION:
			return createSetAction();
		case InteractivePackage.TRIGGER:
			return createTrigger();
		case InteractivePackage.PREDICATE_TERM:
			return createPredicateTerm();
		case InteractivePackage.CONDITION_TRIGGER:
			return createConditionTrigger();
		case InteractivePackage.EVENT_TRIGGER:
			return createEventTrigger();
		case InteractivePackage.CLASS_HANDLER_ACTION:
			return createClassHandlerAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case InteractivePackage.OPERATOR:
			return createOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case InteractivePackage.OPERATOR:
			return convertOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerAction createTriggerAction() {
		TriggerActionImpl triggerAction = new TriggerActionImpl();
		return triggerAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataPredicate createDataPredicate() {
		DataPredicateImpl dataPredicate = new DataPredicateImpl();
		return dataPredicate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UIPredicate createUIPredicate() {
		UIPredicateImpl uiPredicate = new UIPredicateImpl();
		return uiPredicate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionCondition createExpressionCondition() {
		ExpressionConditionImpl expressionCondition = new ExpressionConditionImpl();
		return expressionCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SetAction createSetAction() {
		SetActionImpl setAction = new SetActionImpl();
		return setAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateTerm createPredicateTerm() {
		PredicateTermImpl predicateTerm = new PredicateTermImpl();
		return predicateTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionTrigger createConditionTrigger() {
		ConditionTriggerImpl conditionTrigger = new ConditionTriggerImpl();
		return conditionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTrigger createEventTrigger() {
		EventTriggerImpl eventTrigger = new EventTriggerImpl();
		return eventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassHandlerAction createClassHandlerAction() {
		ClassHandlerActionImpl classHandlerAction = new ClassHandlerActionImpl();
		return classHandlerAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType,
			String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InteractivePackage getInteractivePackage() {
		return (InteractivePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractivePackage getPackage() {
		return InteractivePackage.eINSTANCE;
	}

} // InteractiveFactoryImpl
