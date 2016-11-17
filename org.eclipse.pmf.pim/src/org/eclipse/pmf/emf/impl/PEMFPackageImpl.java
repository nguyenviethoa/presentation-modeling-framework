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
package org.eclipse.pmf.emf.impl;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.emf.EMFDataModelManager;
import org.eclipse.pmf.emf.EMFDataModelManagerFactory;
import org.eclipse.pmf.emf.EMFFileInput;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFFactory;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.datainput.DatainputPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PEMFPackageImpl extends EPackageImpl implements PEMFPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfDataModelManagerFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfDataModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassToDataTypeMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFileInputEClass = null;

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
	 * @see org.eclipse.pmf.emf.PEMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PEMFPackageImpl() {
		super(eNS_URI, PEMFFactory.eINSTANCE);
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
	 * This method is used to initialize {@link PEMFPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PEMFPackage init() {
		if (isInited)
			return (PEMFPackage) EPackage.Registry.INSTANCE
					.getEPackage(PEMFPackage.eNS_URI);

		// Obtain or create and register package
		PEMFPackageImpl thePEMFPackage = (PEMFPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PEMFPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PEMFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PMFPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenModelPackageImpl theGenModelPackage = (GenModelPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GenModelPackage.eNS_URI) instanceof GenModelPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenModelPackage.eNS_URI)
				: GenModelPackage.eINSTANCE);

		// Create package meta-data objects
		thePEMFPackage.createPackageContents();
		theGenModelPackage.createPackageContents();

		// Initialize created meta-data
		thePEMFPackage.initializePackageContents();
		theGenModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePEMFPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PEMFPackage.eNS_URI, thePEMFPackage);
		return thePEMFPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFDataModelManagerFactory() {
		return emfDataModelManagerFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFDataModelManager() {
		return emfDataModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFDataModelManager_TypeMap() {
		return (EReference) emfDataModelManagerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFType() {
		return emfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFType_Content() {
		return (EReference) emfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFType_Genmodel() {
		return (EReference) emfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFProperty() {
		return emfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFProperty_Content() {
		return (EReference) emfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFProperty_Genmodel() {
		return (EReference) emfPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassToDataTypeMapEntry() {
		return eClassToDataTypeMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassToDataTypeMapEntry_Value() {
		return (EReference) eClassToDataTypeMapEntryEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassToDataTypeMapEntry_Key() {
		return (EReference) eClassToDataTypeMapEntryEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFileInput() {
		return emfFileInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PEMFFactory getPEMFFactory() {
		return (PEMFFactory) getEFactoryInstance();
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
		emfDataModelManagerFactoryEClass = createEClass(EMF_DATA_MODEL_MANAGER_FACTORY);

		emfDataModelManagerEClass = createEClass(EMF_DATA_MODEL_MANAGER);
		createEReference(emfDataModelManagerEClass,
				EMF_DATA_MODEL_MANAGER__TYPE_MAP);

		emfTypeEClass = createEClass(EMF_TYPE);
		createEReference(emfTypeEClass, EMF_TYPE__CONTENT);
		createEReference(emfTypeEClass, EMF_TYPE__GENMODEL);

		emfPropertyEClass = createEClass(EMF_PROPERTY);
		createEReference(emfPropertyEClass, EMF_PROPERTY__CONTENT);
		createEReference(emfPropertyEClass, EMF_PROPERTY__GENMODEL);

		eClassToDataTypeMapEntryEClass = createEClass(ECLASS_TO_DATA_TYPE_MAP_ENTRY);
		createEReference(eClassToDataTypeMapEntryEClass,
				ECLASS_TO_DATA_TYPE_MAP_ENTRY__VALUE);
		createEReference(eClassToDataTypeMapEntryEClass,
				ECLASS_TO_DATA_TYPE_MAP_ENTRY__KEY);

		emfFileInputEClass = createEClass(EMF_FILE_INPUT);
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
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI);
		GenModelPackage theGenModelPackage = (GenModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenModelPackage.eNS_URI);
		DatainputPackage theDatainputPackage = (DatainputPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emfDataModelManagerFactoryEClass.getESuperTypes().add(
				thePMFPackage.getDataModelManagerFactory());
		emfDataModelManagerEClass.getESuperTypes().add(
				theDataPackage.getDataModelManager());
		emfTypeEClass.getESuperTypes().add(theDataPackage.getDataType());
		emfPropertyEClass.getESuperTypes()
				.add(theDataPackage.getDataProperty());
		emfFileInputEClass.getESuperTypes().add(
				theDatainputPackage.getFileInput());

		// Initialize classes and features; add operations and parameters
		initEClass(emfDataModelManagerFactoryEClass,
				EMFDataModelManagerFactory.class, "EMFDataModelManagerFactory",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emfDataModelManagerEClass, EMFDataModelManager.class,
				"EMFDataModelManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFDataModelManager_TypeMap(),
				this.getEClassToDataTypeMapEntry(), null, "typeMap", null, 0,
				-1, EMFDataModelManager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfTypeEClass, EMFType.class, "EMFType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFType_Content(), ecorePackage.getEClassifier(),
				null, "content", null, 0, 1, EMFType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFType_Genmodel(),
				theGenModelPackage.getGenClassifier(), null, "genmodel", null,
				0, 1, EMFType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(emfTypeEClass, null, "updateGenmodel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenModelPackage.getGenClassifier(), "genmodel", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(emfPropertyEClass, EMFProperty.class, "EMFProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFProperty_Content(),
				ecorePackage.getEStructuralFeature(), null, "content", null, 0,
				1, EMFProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFProperty_Genmodel(),
				theGenModelPackage.getGenFeature(), null, "genmodel", null, 0,
				1, EMFProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassToDataTypeMapEntryEClass, Map.Entry.class,
				"EClassToDataTypeMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassToDataTypeMapEntry_Value(), this.getEMFType(),
				null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassToDataTypeMapEntry_Key(),
				ecorePackage.getEClassifier(), null, "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(emfFileInputEClass, EMFFileInput.class, "EMFFileInput",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // PEMFPackageImpl
