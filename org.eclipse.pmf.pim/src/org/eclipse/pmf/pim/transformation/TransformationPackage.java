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
package org.eclipse.pmf.pim.transformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.pmf.pim.transformation.TransformationFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/transformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	TransformationPackage eINSTANCE = org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.transformation.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.transformation.impl.ContextImpl
	 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl <em>Resource Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl
	 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getResourceResolver()
	 * @generated
	 */
	int RESOURCE_RESOLVER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Validator Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__VALIDATOR_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Converter Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__DATA_CONVERTER_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__COMMAND_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Profile Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__VIEW_PROFILE_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__IMAGE_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Action Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER__SYSTEM_ACTION_MAP = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Resource Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RESOLVER_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl <em>Code Gen Context</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl
	 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getCodeGenContext()
	 * @generated
	 */
	int CODE_GEN_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__NAME = RESOURCE_RESOLVER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__DESCRIPTION = RESOURCE_RESOLVER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ID = RESOURCE_RESOLVER__ID;

	/**
	 * The feature id for the '<em><b>Validator Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__VALIDATOR_MAP = RESOURCE_RESOLVER__VALIDATOR_MAP;

	/**
	 * The feature id for the '<em><b>Data Converter Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__DATA_CONVERTER_MAP = RESOURCE_RESOLVER__DATA_CONVERTER_MAP;

	/**
	 * The feature id for the '<em><b>Command Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__COMMAND_MAP = RESOURCE_RESOLVER__COMMAND_MAP;

	/**
	 * The feature id for the '<em><b>View Profile Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__VIEW_PROFILE_MAP = RESOURCE_RESOLVER__VIEW_PROFILE_MAP;

	/**
	 * The feature id for the '<em><b>Image Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__IMAGE_MAP = RESOURCE_RESOLVER__IMAGE_MAP;

	/**
	 * The feature id for the '<em><b>System Action Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__SYSTEM_ACTION_MAP = RESOURCE_RESOLVER__SYSTEM_ACTION_MAP;

	/**
	 * The feature id for the '<em><b>Resource Resolvers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__RESOURCE_RESOLVERS = RESOURCE_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Validator Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Data Converter Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Command Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_COMMAND_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All System Action Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All View Profile Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Image Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT__ALL_IMAGE_MAP = RESOURCE_RESOLVER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Code Gen Context</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_CONTEXT_FEATURE_COUNT = RESOURCE_RESOLVER_FEATURE_COUNT + 7;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.transformation.Context <em>Context</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.pmf.pim.transformation.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.transformation.Context#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.pmf.pim.transformation.Context#getParent()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.transformation.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.pmf.pim.transformation.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.transformation.ResourceResolver <em>Resource Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Resolver</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver
	 * @generated
	 */
	EClass getResourceResolver();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getValidatorMap <em>Validator Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Validator Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getValidatorMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_ValidatorMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getDataConverterMap <em>Data Converter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data Converter Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getDataConverterMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_DataConverterMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getCommandMap <em>Command Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Command Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getCommandMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_CommandMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getViewProfileMap <em>View Profile Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>View Profile Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getViewProfileMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_ViewProfileMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getSystemActionMap <em>System Action Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>System Action Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getSystemActionMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_SystemActionMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getImageMap <em>Image Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Image Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver#getImageMap()
	 * @see #getResourceResolver()
	 * @generated
	 */
	EReference getResourceResolver_ImageMap();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.transformation.ResourceResolver
	 * <em>Code Gen Context</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Code Gen Context</em>'.
	 * @see org.eclipse.pmf.pim.transformation.ResourceResolver
	 * @generated
	 */
	EClass getCodeGenContext();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getResourceResolvers <em>Resource Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Resolvers</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getResourceResolvers()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_ResourceResolvers();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllValidatorMap <em>All Validator Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All Validator Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllValidatorMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllValidatorMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllDataConverterMap <em>All Data Converter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All Data Converter Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllDataConverterMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllDataConverterMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllCommandMap <em>All Command Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All Command Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllCommandMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllCommandMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllSystemActionMap <em>All System Action Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All System Action Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllSystemActionMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllSystemActionMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllViewProfileMap <em>All View Profile Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All View Profile Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllViewProfileMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllViewProfileMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllImageMap <em>All Image Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>All Image Map</em>'.
	 * @see org.eclipse.pmf.pim.transformation.CodeGenContext#getAllImageMap()
	 * @see #getCodeGenContext()
	 * @generated
	 */
	EReference getCodeGenContext_AllImageMap();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformationFactory getTransformationFactory();

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
		 * {@link org.eclipse.pmf.pim.transformation.impl.ContextImpl
		 * <em>Context</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.pmf.pim.transformation.impl.ContextImpl
		 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT = eINSTANCE.getContext_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl <em>Resource Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.transformation.impl.ResourceResolverImpl
		 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getResourceResolver()
		 * @generated
		 */
		EClass RESOURCE_RESOLVER = eINSTANCE.getResourceResolver();

		/**
		 * The meta object literal for the '<em><b>Validator Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__VALIDATOR_MAP = eINSTANCE
				.getResourceResolver_ValidatorMap();

		/**
		 * The meta object literal for the '<em><b>Data Converter Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__DATA_CONVERTER_MAP = eINSTANCE
				.getResourceResolver_DataConverterMap();

		/**
		 * The meta object literal for the '<em><b>Command Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__COMMAND_MAP = eINSTANCE
				.getResourceResolver_CommandMap();

		/**
		 * The meta object literal for the '<em><b>View Profile Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__VIEW_PROFILE_MAP = eINSTANCE
				.getResourceResolver_ViewProfileMap();

		/**
		 * The meta object literal for the '<em><b>System Action Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__SYSTEM_ACTION_MAP = eINSTANCE
				.getResourceResolver_SystemActionMap();

		/**
		 * The meta object literal for the '<em><b>Image Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RESOLVER__IMAGE_MAP = eINSTANCE
				.getResourceResolver_ImageMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl <em>Code Gen Context</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl
		 * @see org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl#getCodeGenContext()
		 * @generated
		 */
		EClass CODE_GEN_CONTEXT = eINSTANCE.getCodeGenContext();

		/**
		 * The meta object literal for the '<em><b>Resource Resolvers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__RESOURCE_RESOLVERS = eINSTANCE
				.getCodeGenContext_ResourceResolvers();

		/**
		 * The meta object literal for the '<em><b>All Validator Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP = eINSTANCE
				.getCodeGenContext_AllValidatorMap();

		/**
		 * The meta object literal for the '<em><b>All Data Converter Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP = eINSTANCE
				.getCodeGenContext_AllDataConverterMap();

		/**
		 * The meta object literal for the '<em><b>All Command Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_COMMAND_MAP = eINSTANCE
				.getCodeGenContext_AllCommandMap();

		/**
		 * The meta object literal for the '<em><b>All System Action Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP = eINSTANCE
				.getCodeGenContext_AllSystemActionMap();

		/**
		 * The meta object literal for the '<em><b>All View Profile Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP = eINSTANCE
				.getCodeGenContext_AllViewProfileMap();

		/**
		 * The meta object literal for the '<em><b>All Image Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_CONTEXT__ALL_IMAGE_MAP = eINSTANCE
				.getCodeGenContext_AllImageMap();

	}

} // TransformationPackage
