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
package org.eclipse.pmf.pim.transformation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl;
import org.eclipse.pmf.pim.transformation.CodeGenContext;
import org.eclipse.pmf.pim.transformation.Context;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationFactory;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class TransformationPackageImpl extends EPackageImpl implements
		TransformationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceResolverEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGenContextEClass = null;

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
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransformationPackageImpl() {
		super(eNS_URI, TransformationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link TransformationPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransformationPackage init() {
		if (isInited)
			return (TransformationPackage) EPackage.Registry.INSTANCE
					.getEPackage(TransformationPackage.eNS_URI);

		// Obtain or create and register package
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new TransformationPackageImpl());

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
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI)
				: DatabindingPackage.eINSTANCE);

		// Create package meta-data objects
		theTransformationPackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theDatabindingPackage.createPackageContents();

		// Initialize created meta-data
		theTransformationPackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransformationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransformationPackage.eNS_URI,
				theTransformationPackage);
		return theTransformationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Parent() {
		return (EReference) contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Name() {
		return (EAttribute) contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceResolver() {
		return resourceResolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_ValidatorMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_DataConverterMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_CommandMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_ViewProfileMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_SystemActionMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceResolver_ImageMap() {
		return (EReference) resourceResolverEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeGenContext() {
		return codeGenContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_ResourceResolvers() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllValidatorMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllDataConverterMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllCommandMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllSystemActionMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllViewProfileMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeGenContext_AllImageMap() {
		return (EReference) codeGenContextEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationFactory getTransformationFactory() {
		return (TransformationFactory) getEFactoryInstance();
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
		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__PARENT);
		createEAttribute(contextEClass, CONTEXT__NAME);

		resourceResolverEClass = createEClass(RESOURCE_RESOLVER);
		createEReference(resourceResolverEClass,
				RESOURCE_RESOLVER__VALIDATOR_MAP);
		createEReference(resourceResolverEClass,
				RESOURCE_RESOLVER__DATA_CONVERTER_MAP);
		createEReference(resourceResolverEClass, RESOURCE_RESOLVER__COMMAND_MAP);
		createEReference(resourceResolverEClass,
				RESOURCE_RESOLVER__VIEW_PROFILE_MAP);
		createEReference(resourceResolverEClass, RESOURCE_RESOLVER__IMAGE_MAP);
		createEReference(resourceResolverEClass,
				RESOURCE_RESOLVER__SYSTEM_ACTION_MAP);

		codeGenContextEClass = createEClass(CODE_GEN_CONTEXT);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__RESOURCE_RESOLVERS);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__ALL_COMMAND_MAP);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP);
		createEReference(codeGenContextEClass,
				CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP);
		createEReference(codeGenContextEClass, CODE_GEN_CONTEXT__ALL_IMAGE_MAP);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceResolverEClass.getESuperTypes().add(
				thePMFPackage.getPMFObject());
		codeGenContextEClass.getESuperTypes().add(this.getResourceResolver());

		// Initialize classes and features; add operations and parameters
		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Parent(), this.getContext(), null, "parent",
				null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = addEOperation(contextEClass, null, "getPropertyValue",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(contextEClass, ecorePackage.getEEList(),
				"getAllPropertyNames", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "hasProperty", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(contextEClass, null, "removeProperty", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(contextEClass, null, "setPropertyValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(contextEClass, this.getContext(), "createChild", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(resourceResolverEClass, ResourceResolver.class,
				"ResourceResolver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceResolver_ValidatorMap(),
				theEcorePackage.getEStringToStringMapEntry(), null,
				"validatorMap", null, 0, -1, ResourceResolver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResourceResolver_DataConverterMap(),
				theEcorePackage.getEStringToStringMapEntry(), null,
				"dataConverterMap", null, 0, -1, ResourceResolver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResourceResolver_CommandMap(),
				theEcorePackage.getEStringToStringMapEntry(), null,
				"commandMap", null, 0, -1, ResourceResolver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResourceResolver_ViewProfileMap(),
				theEcorePackage.getEStringToStringMapEntry(), null,
				"viewProfileMap", null, 0, -1, ResourceResolver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResourceResolver_ImageMap(),
				theEcorePackage.getEStringToStringMapEntry(), null, "imageMap",
				null, 0, -1, ResourceResolver.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceResolver_SystemActionMap(),
				theEcorePackage.getEStringToStringMapEntry(), null,
				"systemActionMap", null, 0, -1, ResourceResolver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(codeGenContextEClass, CodeGenContext.class,
				"CodeGenContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeGenContext_ResourceResolvers(),
				this.getResourceResolver(), null, "resourceResolvers", null, 0,
				-1, CodeGenContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeGenContext_AllValidatorMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"allValidatorMap", null, 0, -1, CodeGenContext.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeGenContext_AllDataConverterMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"allDataConverterMap", null, 0, -1, CodeGenContext.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeGenContext_AllCommandMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"allCommandMap", null, 0, -1, CodeGenContext.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeGenContext_AllSystemActionMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"allSystemActionMap", null, 0, -1, CodeGenContext.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeGenContext_AllViewProfileMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"allViewProfileMap", null, 0, -1, CodeGenContext.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeGenContext_AllImageMap(),
				ecorePackage.getEStringToStringMapEntry(), null, "allImageMap",
				null, 0, -1, CodeGenContext.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getDataConverter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getValidator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getSystemAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getViewProfile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(codeGenContextEClass, theEcorePackage.getEString(),
				"getImage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} // TransformationPackageImpl
