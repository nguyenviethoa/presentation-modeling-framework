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
package org.eclipse.pmf.pim.data;

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
 * @see org.eclipse.pmf.pim.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.eclipse.pmf.pim.data.impl.DataPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.data.impl.DataModelManagerImpl
	 * <em>Model Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.data.impl.DataModelManagerImpl
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataModelManager()
	 * @generated
	 */
	int DATA_MODEL_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Model Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.data.DataType <em>Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.data.DataType
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MANAGER = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PROPERTIES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ABSTRACT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRIMITIVE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_TYPES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE_PARAMETERS = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GENERIC_SUPER_TYPES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ENUM = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.data.impl.DataPropertyImpl
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__MANDATORY = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__TYPE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__MANY = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__GENERIC_TYPE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.data.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.data.Property
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.data.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.data.impl.TypeParameterImpl
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl
	 * <em>Generic Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.data.impl.GenericTypeImpl
	 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE_ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__UPPER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__LOWER_BOUND = 4;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = 5;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.data.DataModelManager <em>Model Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Manager</em>'.
	 * @see org.eclipse.pmf.pim.data.DataModelManager
	 * @generated
	 */
	EClass getDataModelManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.data.DataType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.data.DataType#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#getManager()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.data.DataType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#getProperties()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.data.DataType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#isAbstract()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.data.DataType#isPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#isPrimitive()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Primitive();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.data.DataType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#getSuperTypes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.data.DataType#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#getTypeParameters()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.data.DataType#getGenericSuperTypes
	 * <em>Generic Super Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Generic Super Types</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#getGenericSuperTypes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_GenericSuperTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.data.DataType#isEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see org.eclipse.pmf.pim.data.DataType#isEnum()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Enum();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.data.DataProperty <em>Property</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.data.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.data.DataProperty#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.eclipse.pmf.pim.data.DataProperty#isMandatory()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.data.DataProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.data.DataProperty#getType()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.data.DataProperty#isMany <em>Many</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.eclipse.pmf.pim.data.DataProperty#isMany()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_Many();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.data.DataProperty#getGenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Type</em>'.
	 * @see org.eclipse.pmf.pim.data.DataProperty#getGenericType()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_GenericType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.data.Property <em>Property</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.data.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.data.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see org.eclipse.pmf.pim.data.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.data.TypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounds</em>'.
	 * @see org.eclipse.pmf.pim.data.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.data.GenericType <em>Generic Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.data.GenericType#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType#getType()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.data.GenericType#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Parameter</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType#getTypeParameter()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_TypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.data.GenericType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType#getTypeArguments()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_TypeArguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.data.GenericType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType#getUpperBound()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.data.GenericType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.eclipse.pmf.pim.data.GenericType#getLowerBound()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_LowerBound();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.data.impl.DataModelManagerImpl <em>Model Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.data.impl.DataModelManagerImpl
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataModelManager()
		 * @generated
		 */
		EClass DATA_MODEL_MANAGER = eINSTANCE.getDataModelManager();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.data.DataType <em>Type</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.data.DataType
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__MANAGER = eINSTANCE.getDataType_Manager();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__PROPERTIES = eINSTANCE.getDataType_Properties();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ABSTRACT = eINSTANCE.getDataType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PRIMITIVE = eINSTANCE.getDataType_Primitive();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__SUPER_TYPES = eINSTANCE.getDataType_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__TYPE_PARAMETERS = eINSTANCE
				.getDataType_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Generic Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__GENERIC_SUPER_TYPES = eINSTANCE
				.getDataType_GenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ENUM = eINSTANCE.getDataType_Enum();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.data.impl.DataPropertyImpl
		 * <em>Property</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.pmf.pim.data.impl.DataPropertyImpl
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__MANDATORY = eINSTANCE
				.getDataProperty_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__TYPE = eINSTANCE.getDataProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__MANY = eINSTANCE.getDataProperty_Many();

		/**
		 * The meta object literal for the '<em><b>Generic Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__GENERIC_TYPE = eINSTANCE
				.getDataProperty_GenericType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.data.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.data.Property
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.data.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.data.impl.TypeParameterImpl
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__BOUNDS = eINSTANCE.getTypeParameter_Bounds();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.data.impl.GenericTypeImpl <em>Generic Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.data.impl.GenericTypeImpl
		 * @see org.eclipse.pmf.pim.data.impl.DataPackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE = eINSTANCE.getGenericType_Type();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE_PARAMETER = eINSTANCE
				.getGenericType_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE_ARGUMENTS = eINSTANCE
				.getGenericType_TypeArguments();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__UPPER_BOUND = eINSTANCE
				.getGenericType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__LOWER_BOUND = eINSTANCE
				.getGenericType_LowerBound();

	}

} // DataPackage
