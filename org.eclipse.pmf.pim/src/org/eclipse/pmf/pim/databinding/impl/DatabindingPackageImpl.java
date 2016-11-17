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
package org.eclipse.pmf.pim.databinding.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.impl.DataPackageImpl;
import org.eclipse.pmf.pim.databinding.BindingMode;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingLeaf;
import org.eclipse.pmf.pim.databinding.DataBindingNode;
import org.eclipse.pmf.pim.databinding.DataBindingPath;
import org.eclipse.pmf.pim.databinding.DatabindingFactory;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.UpdateSourceTrigger;
import org.eclipse.pmf.pim.datainput.DatainputPackage;
import org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl;
import org.eclipse.pmf.pim.impl.PMFPackageImpl;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DatabindingPackageImpl extends EPackageImpl implements
		DatabindingPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBindingNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBindingLeafEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBindingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBindingPathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingModeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateSourceTriggerEEnum = null;

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
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabindingPackageImpl() {
		super(eNS_URI, DatabindingFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DatabindingPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabindingPackage init() {
		if (isInited)
			return (DatabindingPackage) EPackage.Registry.INSTANCE
					.getEPackage(DatabindingPackage.eNS_URI);

		// Obtain or create and register package
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DatabindingPackageImpl());

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
		InteractivePackageImpl theInteractivePackage = (InteractivePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InteractivePackage.eNS_URI) instanceof InteractivePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InteractivePackage.eNS_URI)
				: InteractivePackage.eINSTANCE);
		DatainputPackageImpl theDatainputPackage = (DatainputPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI) instanceof DatainputPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI)
				: DatainputPackage.eINSTANCE);
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI)
				: TransformationPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabindingPackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		theDatabindingPackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabindingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabindingPackage.eNS_URI,
				theDatabindingPackage);
		return theDatabindingPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBindingNode() {
		return dataBindingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBindingNode_Next() {
		return (EReference) dataBindingNodeEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBindingLeaf() {
		return dataBindingLeafEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBindingLeaf_AggregationNext() {
		return (EReference) dataBindingLeafEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBinding() {
		return dataBindingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_Type() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_Path() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_Converter() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_LocalConverter() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_Validators() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_LocalValidators() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBinding_Mode() {
		return (EAttribute) dataBindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBinding_UpdateSourceTrigger() {
		return (EAttribute) dataBindingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_Status() {
		return (EReference) dataBindingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBindingPath() {
		return dataBindingPathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBindingPath_Feature() {
		return (EReference) dataBindingPathEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingMode() {
		return bindingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateSourceTrigger() {
		return updateSourceTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabindingFactory getDatabindingFactory() {
		return (DatabindingFactory) getEFactoryInstance();
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
		dataBindingNodeEClass = createEClass(DATA_BINDING_NODE);
		createEReference(dataBindingNodeEClass, DATA_BINDING_NODE__NEXT);

		dataBindingLeafEClass = createEClass(DATA_BINDING_LEAF);
		createEReference(dataBindingLeafEClass,
				DATA_BINDING_LEAF__AGGREGATION_NEXT);

		dataBindingEClass = createEClass(DATA_BINDING);
		createEReference(dataBindingEClass, DATA_BINDING__TYPE);
		createEReference(dataBindingEClass, DATA_BINDING__PATH);
		createEReference(dataBindingEClass, DATA_BINDING__CONVERTER);
		createEReference(dataBindingEClass, DATA_BINDING__LOCAL_CONVERTER);
		createEReference(dataBindingEClass, DATA_BINDING__VALIDATORS);
		createEReference(dataBindingEClass, DATA_BINDING__LOCAL_VALIDATORS);
		createEAttribute(dataBindingEClass, DATA_BINDING__MODE);
		createEAttribute(dataBindingEClass, DATA_BINDING__UPDATE_SOURCE_TRIGGER);
		createEReference(dataBindingEClass, DATA_BINDING__STATUS);

		dataBindingPathEClass = createEClass(DATA_BINDING_PATH);
		createEReference(dataBindingPathEClass, DATA_BINDING_PATH__FEATURE);

		// Create enums
		bindingModeEEnum = createEEnum(BINDING_MODE);
		updateSourceTriggerEEnum = createEEnum(UPDATE_SOURCE_TRIGGER);
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
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI);
		PMFPackage thePMFPackage = (PMFPackage) EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage) EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataBindingNodeEClass.getESuperTypes().add(this.getDataBindingPath());
		dataBindingLeafEClass.getESuperTypes().add(this.getDataBindingPath());

		// Initialize classes and features; add operations and parameters
		initEClass(dataBindingNodeEClass, DataBindingNode.class,
				"DataBindingNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBindingNode_Next(), this.getDataBindingPath(),
				null, "next", null, 1, 1, DataBindingNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBindingLeafEClass, DataBindingLeaf.class,
				"DataBindingLeaf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBindingLeaf_AggregationNext(),
				this.getDataBindingLeaf(), null, "aggregationNext", null, 0, 1,
				DataBindingLeaf.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBindingEClass, DataBinding.class, "DataBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBinding_Type(), theDataPackage.getDataType(),
				null, "type", null, 0, 1, DataBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBinding_Path(), this.getDataBindingPath(), null,
				"path", null, 1, 1, DataBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBinding_Converter(),
				thePMFPackage.getDataConverter(), null, "converter", null, 0,
				1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBinding_LocalConverter(),
				thePMFPackage.getDataConverter(), null, "localConverter", null,
				0, 1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBinding_Validators(),
				thePMFPackage.getValidator(), null, "validators", null, 0, -1,
				DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataBinding_LocalValidators(),
				thePMFPackage.getValidator(), null, "localValidators", null, 0,
				-1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataBinding_Mode(), this.getBindingMode(), "mode",
				null, 0, 1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDataBinding_UpdateSourceTrigger(),
				theEcorePackage.getEString(), "updateSourceTrigger", null, 0,
				1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDataBinding_Status(), theUiPackage.getUIElement(),
				null, "status", null, 0, 1, DataBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBindingPathEClass, DataBindingPath.class,
				"DataBindingPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBindingPath_Feature(),
				theDataPackage.getDataProperty(), null, "feature", null, 1, 1,
				DataBindingPath.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingModeEEnum, BindingMode.class, "BindingMode");
		addEEnumLiteral(bindingModeEEnum, BindingMode.TWO_WAY);
		addEEnumLiteral(bindingModeEEnum, BindingMode.ONE_WAY);
		addEEnumLiteral(bindingModeEEnum, BindingMode.ONE_TIME);

		initEEnum(updateSourceTriggerEEnum, UpdateSourceTrigger.class,
				"UpdateSourceTrigger");
		addEEnumLiteral(updateSourceTriggerEEnum, UpdateSourceTrigger.DEFAULT);
		addEEnumLiteral(updateSourceTriggerEEnum,
				UpdateSourceTrigger.PROPERTY_CHANGED);
		addEEnumLiteral(updateSourceTriggerEEnum,
				UpdateSourceTrigger.LOST_FOCUS);
	}

} // DatabindingPackageImpl
