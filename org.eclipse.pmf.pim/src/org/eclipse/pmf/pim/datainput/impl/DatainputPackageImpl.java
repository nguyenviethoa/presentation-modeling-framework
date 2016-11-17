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
package org.eclipse.pmf.pim.datainput.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.impl.DataPackageImpl;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl;
import org.eclipse.pmf.pim.datainput.DataInput;
import org.eclipse.pmf.pim.datainput.DatainputFactory;
import org.eclipse.pmf.pim.datainput.DatainputPackage;
import org.eclipse.pmf.pim.datainput.FileInput;
import org.eclipse.pmf.pim.datainput.SelectionInput;
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
public class DatainputPackageImpl extends EPackageImpl implements
		DatainputPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileInputEClass = null;

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
	 * @see org.eclipse.pmf.pim.datainput.DatainputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatainputPackageImpl() {
		super(eNS_URI, DatainputFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DatainputPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatainputPackage init() {
		if (isInited)
			return (DatainputPackage) EPackage.Registry.INSTANCE
					.getEPackage(DatainputPackage.eNS_URI);

		// Obtain or create and register package
		DatainputPackageImpl theDatainputPackage = (DatainputPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DatainputPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DatainputPackageImpl());

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
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI)
				: DatabindingPackage.eINSTANCE);
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI)
				: TransformationPackage.eINSTANCE);

		// Create package meta-data objects
		theDatainputPackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatabindingPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		theDatainputPackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatainputPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatainputPackage.eNS_URI,
				theDatainputPackage);
		return theDatainputPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInput() {
		return dataInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionInput() {
		return selectionInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileInput() {
		return fileInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileInput_FileName() {
		return (EAttribute) fileInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatainputFactory getDatainputFactory() {
		return (DatainputFactory) getEFactoryInstance();
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
		dataInputEClass = createEClass(DATA_INPUT);

		selectionInputEClass = createEClass(SELECTION_INPUT);

		fileInputEClass = createEClass(FILE_INPUT);
		createEAttribute(fileInputEClass, FILE_INPUT__FILE_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selectionInputEClass.getESuperTypes().add(this.getDataInput());
		fileInputEClass.getESuperTypes().add(this.getDataInput());

		// Initialize classes and features; add operations and parameters
		initEClass(dataInputEClass, DataInput.class, "DataInput", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionInputEClass, SelectionInput.class,
				"SelectionInput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileInputEClass, FileInput.class, "FileInput", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileInput_FileName(), ecorePackage.getEString(),
				"fileName", null, 0, 1, FileInput.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
	}

} // DatainputPackageImpl
