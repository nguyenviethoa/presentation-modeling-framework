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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.impl.DataPackageImpl;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl;
import org.eclipse.pmf.pim.datainput.DatainputPackage;
import org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl;
import org.eclipse.pmf.pim.impl.PMFPackageImpl;
import org.eclipse.pmf.pim.interactive.ClassHandlerAction;
import org.eclipse.pmf.pim.interactive.Condition;
import org.eclipse.pmf.pim.interactive.ConditionTrigger;
import org.eclipse.pmf.pim.interactive.DataPredicate;
import org.eclipse.pmf.pim.interactive.EventTrigger;
import org.eclipse.pmf.pim.interactive.ExpressionCondition;
import org.eclipse.pmf.pim.interactive.InteractiveFactory;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.LogicPredicate;
import org.eclipse.pmf.pim.interactive.Operator;
import org.eclipse.pmf.pim.interactive.Predicate;
import org.eclipse.pmf.pim.interactive.PredicateTerm;
import org.eclipse.pmf.pim.interactive.SetAction;
import org.eclipse.pmf.pim.interactive.Trigger;
import org.eclipse.pmf.pim.interactive.TriggerAction;
import org.eclipse.pmf.pim.interactive.UIPredicate;
import org.eclipse.pmf.pim.interactive.util.InteractiveValidator;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class InteractivePackageImpl extends EPackageImpl implements
		InteractivePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPredicateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPredicateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionConditionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateTermEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classHandlerActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractivePackageImpl() {
		super(eNS_URI, InteractiveFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link InteractivePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractivePackage init() {
		if (isInited)
			return (InteractivePackage) EPackage.Registry.INSTANCE
					.getEPackage(InteractivePackage.eNS_URI);

		// Obtain or create and register package
		InteractivePackageImpl theInteractivePackage = (InteractivePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof InteractivePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new InteractivePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PMFPackageImpl thePMFPackage = (PMFPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) instanceof PMFPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) : PMFPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		DatainputPackageImpl theDatainputPackage = (DatainputPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI) instanceof DatainputPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI)
				: DatainputPackage.eINSTANCE);
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI)
				: DatabindingPackage.eINSTANCE);
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI)
				: TransformationPackage.eINSTANCE);

		// Create package meta-data objects
		theInteractivePackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theDatabindingPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		theInteractivePackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theInteractivePackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return InteractiveValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theInteractivePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractivePackage.eNS_URI,
				theInteractivePackage);
		return theInteractivePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerAction() {
		return triggerActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPredicate() {
		return dataPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPredicate_Binding() {
		return (EReference) dataPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIPredicate() {
		return uiPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPredicate_Source() {
		return (EReference) uiPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPredicate_Property() {
		return (EReference) uiPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionCondition() {
		return expressionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionCondition_Expression() {
		return (EAttribute) expressionConditionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionCondition_Language() {
		return (EAttribute) expressionConditionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAction() {
		return setActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAction_Value() {
		return (EAttribute) setActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetAction_Target() {
		return (EReference) setActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetAction_Property() {
		return (EReference) setActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Actions() {
		return (EReference) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateTerm() {
		return predicateTermEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateTerm_Terms() {
		return (EReference) predicateTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicPredicate() {
		return logicPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicPredicate_Operator() {
		return (EAttribute) logicPredicateEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicPredicate_Value() {
		return (EAttribute) logicPredicateEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionTrigger() {
		return conditionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionTrigger_Condition() {
		return (EReference) conditionTriggerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTrigger() {
		return eventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Event() {
		return (EReference) eventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassHandlerAction() {
		return classHandlerActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InteractiveFactory getInteractiveFactory() {
		return (InteractiveFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		conditionEClass = createEClass(CONDITION);

		triggerActionEClass = createEClass(TRIGGER_ACTION);

		predicateEClass = createEClass(PREDICATE);

		dataPredicateEClass = createEClass(DATA_PREDICATE);
		createEReference(dataPredicateEClass, DATA_PREDICATE__BINDING);

		uiPredicateEClass = createEClass(UI_PREDICATE);
		createEReference(uiPredicateEClass, UI_PREDICATE__SOURCE);
		createEReference(uiPredicateEClass, UI_PREDICATE__PROPERTY);

		expressionConditionEClass = createEClass(EXPRESSION_CONDITION);
		createEAttribute(expressionConditionEClass,
				EXPRESSION_CONDITION__EXPRESSION);
		createEAttribute(expressionConditionEClass,
				EXPRESSION_CONDITION__LANGUAGE);

		setActionEClass = createEClass(SET_ACTION);
		createEAttribute(setActionEClass, SET_ACTION__VALUE);
		createEReference(setActionEClass, SET_ACTION__TARGET);
		createEReference(setActionEClass, SET_ACTION__PROPERTY);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__ACTIONS);

		predicateTermEClass = createEClass(PREDICATE_TERM);
		createEReference(predicateTermEClass, PREDICATE_TERM__TERMS);

		logicPredicateEClass = createEClass(LOGIC_PREDICATE);
		createEAttribute(logicPredicateEClass, LOGIC_PREDICATE__OPERATOR);
		createEAttribute(logicPredicateEClass, LOGIC_PREDICATE__VALUE);

		conditionTriggerEClass = createEClass(CONDITION_TRIGGER);
		createEReference(conditionTriggerEClass, CONDITION_TRIGGER__CONDITION);

		eventTriggerEClass = createEClass(EVENT_TRIGGER);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__EVENT);

		classHandlerActionEClass = createEClass(CLASS_HANDLER_ACTION);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PMFPackage thePMFPackage = (PMFPackage) EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI);
		DatabindingPackage theDatabindingPackage = (DatabindingPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage) EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		triggerActionEClass.getESuperTypes().add(thePMFPackage.getAction());
		predicateEClass.getESuperTypes().add(this.getCondition());
		dataPredicateEClass.getESuperTypes().add(this.getLogicPredicate());
		uiPredicateEClass.getESuperTypes().add(this.getLogicPredicate());
		expressionConditionEClass.getESuperTypes().add(this.getCondition());
		setActionEClass.getESuperTypes().add(this.getTriggerAction());
		predicateTermEClass.getESuperTypes().add(this.getPredicate());
		logicPredicateEClass.getESuperTypes().add(this.getPredicate());
		conditionTriggerEClass.getESuperTypes().add(this.getTrigger());
		eventTriggerEClass.getESuperTypes().add(this.getTrigger());
		classHandlerActionEClass.getESuperTypes().add(this.getTriggerAction());

		// Initialize classes and features; add operations and parameters
		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerActionEClass, TriggerAction.class, "TriggerAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPredicateEClass, DataPredicate.class, "DataPredicate",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPredicate_Binding(),
				theDatabindingPackage.getDataBinding(), null, "binding", null,
				0, 1, DataPredicate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPredicateEClass, UIPredicate.class, "UIPredicate",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIPredicate_Source(), thePMFPackage.getUIObject(),
				null, "source", null, 0, 1, UIPredicate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPredicate_Property(),
				ecorePackage.getEStructuralFeature(), null, "property", null,
				0, 1, UIPredicate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionConditionEClass, ExpressionCondition.class,
				"ExpressionCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionCondition_Expression(),
				ecorePackage.getEString(), "expression", null, 0, 1,
				ExpressionCondition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getExpressionCondition_Language(),
				ecorePackage.getEString(), "language", null, 0, 1,
				ExpressionCondition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(setActionEClass, SetAction.class, "SetAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetAction_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, SetAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSetAction_Target(), thePMFPackage.getUIObject(),
				null, "target", null, 0, 1, SetAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetAction_Property(),
				theEcorePackage.getEStructuralFeature(), null, "property",
				null, 0, 1, SetAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Actions(), this.getTriggerAction(), null,
				"actions", null, 1, -1, Trigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateTermEClass, PredicateTerm.class, "PredicateTerm",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateTerm_Terms(), this.getPredicate(), null,
				"terms", null, 0, -1, PredicateTerm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicPredicateEClass, LogicPredicate.class,
				"LogicPredicate", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicPredicate_Operator(), this.getOperator(),
				"operator", null, 0, 1, LogicPredicate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicPredicate_Value(), theEcorePackage.getEString(),
				"value", null, 0, 1, LogicPredicate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(conditionTriggerEClass, ConditionTrigger.class,
				"ConditionTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionTrigger_Condition(), this.getCondition(),
				null, "condition", null, 0, 1, ConditionTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventTriggerEClass, EventTrigger.class, "EventTrigger",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventTrigger_Event(), theUiPackage.getUIEvent(),
				null, "event", null, 0, 1, EventTrigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classHandlerActionEClass, ClassHandlerAction.class,
				"ClassHandlerAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.EQ);
		addEEnumLiteral(operatorEEnum, Operator.NE);
		addEEnumLiteral(operatorEEnum, Operator.GT);
		addEEnumLiteral(operatorEEnum, Operator.LT);
		addEEnumLiteral(operatorEEnum, Operator.GE);
		addEEnumLiteral(operatorEEnum, Operator.LE);
		addEEnumLiteral(operatorEEnum, Operator.LIKE);
		addEEnumLiteral(operatorEEnum, Operator.IS_A);
		addEEnumLiteral(operatorEEnum, Operator.IS_KIND_OF);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(triggerEClass, source, new String[] { "constraints",
				"triggerValidate" });
	}

} // InteractivePackageImpl
