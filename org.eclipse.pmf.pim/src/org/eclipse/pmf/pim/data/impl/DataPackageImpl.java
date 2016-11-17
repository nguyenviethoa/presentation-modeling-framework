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
package org.eclipse.pmf.pim.data.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataFactory;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.GenericType;
import org.eclipse.pmf.pim.data.Property;
import org.eclipse.pmf.pim.data.TypeParameter;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl;
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
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeEClass = null;

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
	 * @see org.eclipse.pmf.pim.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DataPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited)
			return (DataPackage) EPackage.Registry.INSTANCE
					.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PMFPackageImpl thePMFPackage = (PMFPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) instanceof PMFPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) : PMFPackage.eINSTANCE);
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
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI)
				: DatabindingPackage.eINSTANCE);
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI)
				: TransformationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theDatabindingPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModelManager() {
		return dataModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Manager() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Properties() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Abstract() {
		return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Primitive() {
		return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_SuperTypes() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_TypeParameters() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_GenericSuperTypes() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Enum() {
		return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_Mandatory() {
		return (EAttribute) dataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_Type() {
		return (EReference) dataPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_Many() {
		return (EAttribute) dataPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_GenericType() {
		return (EReference) dataPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_Bounds() {
		return (EReference) typeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericType() {
		return genericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_Type() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_TypeParameter() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_TypeArguments() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_UpperBound() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_LowerBound() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory) getEFactoryInstance();
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
		dataModelManagerEClass = createEClass(DATA_MODEL_MANAGER);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__MANAGER);
		createEReference(dataTypeEClass, DATA_TYPE__PROPERTIES);
		createEAttribute(dataTypeEClass, DATA_TYPE__ABSTRACT);
		createEAttribute(dataTypeEClass, DATA_TYPE__PRIMITIVE);
		createEReference(dataTypeEClass, DATA_TYPE__SUPER_TYPES);
		createEReference(dataTypeEClass, DATA_TYPE__TYPE_PARAMETERS);
		createEReference(dataTypeEClass, DATA_TYPE__GENERIC_SUPER_TYPES);
		createEAttribute(dataTypeEClass, DATA_TYPE__ENUM);

		dataPropertyEClass = createEClass(DATA_PROPERTY);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__MANDATORY);
		createEReference(dataPropertyEClass, DATA_PROPERTY__TYPE);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__MANY);
		createEReference(dataPropertyEClass, DATA_PROPERTY__GENERIC_TYPE);

		propertyEClass = createEClass(PROPERTY);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__BOUNDS);

		genericTypeEClass = createEClass(GENERIC_TYPE);
		createEReference(genericTypeEClass, GENERIC_TYPE__TYPE);
		createEReference(genericTypeEClass, GENERIC_TYPE__TYPE_PARAMETER);
		createEReference(genericTypeEClass, GENERIC_TYPE__TYPE_ARGUMENTS);
		createEReference(genericTypeEClass, GENERIC_TYPE__UPPER_BOUND);
		createEReference(genericTypeEClass, GENERIC_TYPE__LOWER_BOUND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		dataPropertyEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		propertyEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		typeParameterEClass.getESuperTypes().add(thePMFPackage.getPMFObject());

		// Initialize classes and features; add operations and parameters
		initEClass(dataModelManagerEClass, DataModelManager.class,
				"DataModelManager", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dataModelManagerEClass,
				ecorePackage.getEBoolean(), "isTargetFor", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "type", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(dataModelManagerEClass, this.getDataType(),
				"getDataModelType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "type", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(dataModelManagerEClass, null, "loadFor", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePMFPackage.getElementalDataForm(), "view", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataType(), "dataType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Manager(), this.getDataModelManager(), null,
				"manager", null, 0, 1, DataType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Properties(), this.getDataProperty(), null,
				"properties", null, 0, -1, DataType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Abstract(), ecorePackage.getEBoolean(),
				"abstract", null, 0, 1, DataType.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Primitive(), ecorePackage.getEBoolean(),
				"primitive", null, 0, 1, DataType.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_SuperTypes(), this.getDataType(), null,
				"superTypes", null, 0, -1, DataType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_TypeParameters(), this.getTypeParameter(),
				null, "typeParameters", null, 0, -1, DataType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDataType_GenericSuperTypes(), this.getGenericType(),
				null, "genericSuperTypes", null, 0, -1, DataType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDataType_Enum(), ecorePackage.getEBoolean(), "enum",
				null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(dataTypeEClass, ecorePackage.getEString(),
				"getRuntimeName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProperty_Mandatory(), ecorePackage.getEBoolean(),
				"mandatory", null, 0, 1, DataProperty.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_Type(), this.getDataType(), null,
				"type", null, 0, 1, DataProperty.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProperty_Many(), ecorePackage.getEBoolean(),
				"many", null, 0, 1, DataProperty.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_GenericType(), this.getGenericType(),
				null, "genericType", null, 0, 1, DataProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_Bounds(), this.getGenericType(), null,
				"bounds", null, 0, -1, TypeParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericTypeEClass, GenericType.class, "GenericType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericType_Type(), this.getDataType(), null, "type",
				null, 0, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType_TypeParameter(), this.getTypeParameter(),
				null, "typeParameter", null, 0, 1, GenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGenericType_TypeArguments(), this.getGenericType(),
				null, "typeArguments", null, 0, -1, GenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGenericType_UpperBound(), this.getGenericType(),
				null, "upperBound", null, 0, 1, GenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGenericType_LowerBound(), this.getGenericType(),
				null, "lowerBound", null, 0, 1, GenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
	}

} // DataPackageImpl
