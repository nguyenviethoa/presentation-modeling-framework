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
package org.eclipse.pmf.pim.interactive;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.interactive.InteractiveFactory
 * @model kind="package"
 * @generated
 */
public interface InteractivePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interactive";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/interactive";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interactive";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	InteractivePackage eINSTANCE = org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.ConditionImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.TriggerActionImpl <em>Trigger Action</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.TriggerActionImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getTriggerAction()
	 * @generated
	 */
	int TRIGGER_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ACTION__NAME = PMFPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ACTION__DESCRIPTION = PMFPackage.ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ACTION__ID = PMFPackage.ACTION__ID;

	/**
	 * The number of structural features of the '<em>Trigger Action</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ACTION_FEATURE_COUNT = PMFPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.PredicateImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 2;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.LogicPredicateImpl <em>Logic Predicate</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.LogicPredicateImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getLogicPredicate()
	 * @generated
	 */
	int LOGIC_PREDICATE = 9;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGIC_PREDICATE__OPERATOR = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGIC_PREDICATE__VALUE = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logic Predicate</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.DataPredicateImpl <em>Data Predicate</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.DataPredicateImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getDataPredicate()
	 * @generated
	 */
	int DATA_PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PREDICATE__OPERATOR = LOGIC_PREDICATE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PREDICATE__VALUE = LOGIC_PREDICATE__VALUE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREDICATE__BINDING = LOGIC_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Predicate</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREDICATE_FEATURE_COUNT = LOGIC_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.interactive.impl.UIPredicateImpl
	 * <em>UI Predicate</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.interactive.impl.UIPredicateImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getUIPredicate()
	 * @generated
	 */
	int UI_PREDICATE = 4;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_PREDICATE__OPERATOR = LOGIC_PREDICATE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_PREDICATE__VALUE = LOGIC_PREDICATE__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_PREDICATE__SOURCE = LOGIC_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_PREDICATE__PROPERTY = LOGIC_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Predicate</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PREDICATE_FEATURE_COUNT = LOGIC_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.ExpressionConditionImpl <em>Expression Condition</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.ExpressionConditionImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getExpressionCondition()
	 * @generated
	 */
	int EXPRESSION_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONDITION__EXPRESSION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONDITION__LANGUAGE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Condition</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.interactive.impl.SetActionImpl
	 * <em>Set Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.interactive.impl.SetActionImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getSetAction()
	 * @generated
	 */
	int SET_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__NAME = TRIGGER_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__DESCRIPTION = TRIGGER_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__ID = TRIGGER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__VALUE = TRIGGER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__TARGET = TRIGGER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SET_ACTION__PROPERTY = TRIGGER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Action</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACTION_FEATURE_COUNT = TRIGGER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.TriggerImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.PredicateTermImpl <em>Predicate Term</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.PredicateTermImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getPredicateTerm()
	 * @generated
	 */
	int PREDICATE_TERM = 8;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TERM__TERMS = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Term</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TERM_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.ConditionTriggerImpl <em>Condition Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.ConditionTriggerImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getConditionTrigger()
	 * @generated
	 */
	int CONDITION_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TRIGGER__ACTIONS = TRIGGER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TRIGGER__CONDITION = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.EventTriggerImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getEventTrigger()
	 * @generated
	 */
	int EVENT_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__ACTIONS = TRIGGER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__EVENT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.impl.ClassHandlerActionImpl <em>Class Handler Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.impl.ClassHandlerActionImpl
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getClassHandlerAction()
	 * @generated
	 */
	int CLASS_HANDLER_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_HANDLER_ACTION__NAME = TRIGGER_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_HANDLER_ACTION__DESCRIPTION = TRIGGER_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_HANDLER_ACTION__ID = TRIGGER_ACTION__ID;

	/**
	 * The number of structural features of the '<em>Class Handler Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_HANDLER_ACTION_FEATURE_COUNT = TRIGGER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.interactive.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.interactive.Operator
	 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 13;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.eclipse.pmf.pim.interactive.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.TriggerAction <em>Trigger Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Action</em>'.
	 * @see org.eclipse.pmf.pim.interactive.TriggerAction
	 * @generated
	 */
	EClass getTriggerAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.eclipse.pmf.pim.interactive.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.DataPredicate <em>Data Predicate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Predicate</em>'.
	 * @see org.eclipse.pmf.pim.interactive.DataPredicate
	 * @generated
	 */
	EClass getDataPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.interactive.DataPredicate#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see org.eclipse.pmf.pim.interactive.DataPredicate#getBinding()
	 * @see #getDataPredicate()
	 * @generated
	 */
	EReference getDataPredicate_Binding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.UIPredicate <em>UI Predicate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Predicate</em>'.
	 * @see org.eclipse.pmf.pim.interactive.UIPredicate
	 * @generated
	 */
	EClass getUIPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.interactive.UIPredicate#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.pmf.pim.interactive.UIPredicate#getSource()
	 * @see #getUIPredicate()
	 * @generated
	 */
	EReference getUIPredicate_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.interactive.UIPredicate#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.interactive.UIPredicate#getProperty()
	 * @see #getUIPredicate()
	 * @generated
	 */
	EReference getUIPredicate_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.ExpressionCondition <em>Expression Condition</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Expression Condition</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ExpressionCondition
	 * @generated
	 */
	EClass getExpressionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.interactive.ExpressionCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ExpressionCondition#getExpression()
	 * @see #getExpressionCondition()
	 * @generated
	 */
	EAttribute getExpressionCondition_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.interactive.ExpressionCondition#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ExpressionCondition#getLanguage()
	 * @see #getExpressionCondition()
	 * @generated
	 */
	EAttribute getExpressionCondition_Language();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.SetAction <em>Set Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Action</em>'.
	 * @see org.eclipse.pmf.pim.interactive.SetAction
	 * @generated
	 */
	EClass getSetAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.interactive.SetAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.pmf.pim.interactive.SetAction#getValue()
	 * @see #getSetAction()
	 * @generated
	 */
	EAttribute getSetAction_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.interactive.SetAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.pmf.pim.interactive.SetAction#getTarget()
	 * @see #getSetAction()
	 * @generated
	 */
	EReference getSetAction_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.interactive.SetAction#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.interactive.SetAction#getProperty()
	 * @see #getSetAction()
	 * @generated
	 */
	EReference getSetAction_Property();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.interactive.Trigger <em>Trigger</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.eclipse.pmf.pim.interactive.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.interactive.Trigger#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.pmf.pim.interactive.Trigger#getActions()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.PredicateTerm <em>Predicate Term</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Term</em>'.
	 * @see org.eclipse.pmf.pim.interactive.PredicateTerm
	 * @generated
	 */
	EClass getPredicateTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.interactive.PredicateTerm#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see org.eclipse.pmf.pim.interactive.PredicateTerm#getTerms()
	 * @see #getPredicateTerm()
	 * @generated
	 */
	EReference getPredicateTerm_Terms();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.LogicPredicate <em>Logic Predicate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Predicate</em>'.
	 * @see org.eclipse.pmf.pim.interactive.LogicPredicate
	 * @generated
	 */
	EClass getLogicPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.interactive.LogicPredicate#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.pmf.pim.interactive.LogicPredicate#getOperator()
	 * @see #getLogicPredicate()
	 * @generated
	 */
	EAttribute getLogicPredicate_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.interactive.LogicPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.pmf.pim.interactive.LogicPredicate#getValue()
	 * @see #getLogicPredicate()
	 * @generated
	 */
	EAttribute getLogicPredicate_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.ConditionTrigger <em>Condition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Trigger</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ConditionTrigger
	 * @generated
	 */
	EClass getConditionTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.interactive.ConditionTrigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ConditionTrigger#getCondition()
	 * @see #getConditionTrigger()
	 * @generated
	 */
	EReference getConditionTrigger_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.EventTrigger <em>Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Trigger</em>'.
	 * @see org.eclipse.pmf.pim.interactive.EventTrigger
	 * @generated
	 */
	EClass getEventTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.interactive.EventTrigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.pmf.pim.interactive.EventTrigger#getEvent()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.interactive.ClassHandlerAction <em>Class Handler Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Handler Action</em>'.
	 * @see org.eclipse.pmf.pim.interactive.ClassHandlerAction
	 * @generated
	 */
	EClass getClassHandlerAction();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.pmf.pim.interactive.Operator <em>Operator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see org.eclipse.pmf.pim.interactive.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractiveFactory getInteractiveFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.interactive.impl.ConditionImpl
		 * <em>Condition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.pmf.pim.interactive.impl.ConditionImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.TriggerActionImpl <em>Trigger Action</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.TriggerActionImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getTriggerAction()
		 * @generated
		 */
		EClass TRIGGER_ACTION = eINSTANCE.getTriggerAction();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.interactive.impl.PredicateImpl
		 * <em>Predicate</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.pmf.pim.interactive.impl.PredicateImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.DataPredicateImpl <em>Data Predicate</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.DataPredicateImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getDataPredicate()
		 * @generated
		 */
		EClass DATA_PREDICATE = eINSTANCE.getDataPredicate();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREDICATE__BINDING = eINSTANCE
				.getDataPredicate_Binding();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.UIPredicateImpl <em>UI Predicate</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.UIPredicateImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getUIPredicate()
		 * @generated
		 */
		EClass UI_PREDICATE = eINSTANCE.getUIPredicate();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PREDICATE__SOURCE = eINSTANCE.getUIPredicate_Source();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PREDICATE__PROPERTY = eINSTANCE.getUIPredicate_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.ExpressionConditionImpl <em>Expression Condition</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.ExpressionConditionImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getExpressionCondition()
		 * @generated
		 */
		EClass EXPRESSION_CONDITION = eINSTANCE.getExpressionCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_CONDITION__EXPRESSION = eINSTANCE
				.getExpressionCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_CONDITION__LANGUAGE = eINSTANCE
				.getExpressionCondition_Language();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.SetActionImpl <em>Set Action</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.SetActionImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getSetAction()
		 * @generated
		 */
		EClass SET_ACTION = eINSTANCE.getSetAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ACTION__VALUE = eINSTANCE.getSetAction_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ACTION__TARGET = eINSTANCE.getSetAction_Target();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ACTION__PROPERTY = eINSTANCE.getSetAction_Property();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.interactive.impl.TriggerImpl
		 * <em>Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.pmf.pim.interactive.impl.TriggerImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__ACTIONS = eINSTANCE.getTrigger_Actions();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.PredicateTermImpl <em>Predicate Term</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.PredicateTermImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getPredicateTerm()
		 * @generated
		 */
		EClass PREDICATE_TERM = eINSTANCE.getPredicateTerm();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_TERM__TERMS = eINSTANCE.getPredicateTerm_Terms();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.LogicPredicateImpl <em>Logic Predicate</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.LogicPredicateImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getLogicPredicate()
		 * @generated
		 */
		EClass LOGIC_PREDICATE = eINSTANCE.getLogicPredicate();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_PREDICATE__OPERATOR = eINSTANCE
				.getLogicPredicate_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_PREDICATE__VALUE = eINSTANCE.getLogicPredicate_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.ConditionTriggerImpl <em>Condition Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.ConditionTriggerImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getConditionTrigger()
		 * @generated
		 */
		EClass CONDITION_TRIGGER = eINSTANCE.getConditionTrigger();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_TRIGGER__CONDITION = eINSTANCE
				.getConditionTrigger_Condition();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.EventTriggerImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getEventTrigger()
		 * @generated
		 */
		EClass EVENT_TRIGGER = eINSTANCE.getEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGER__EVENT = eINSTANCE.getEventTrigger_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.impl.ClassHandlerActionImpl <em>Class Handler Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.impl.ClassHandlerActionImpl
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getClassHandlerAction()
		 * @generated
		 */
		EClass CLASS_HANDLER_ACTION = eINSTANCE.getClassHandlerAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.interactive.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.interactive.Operator
		 * @see org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} // InteractivePackage
