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
package org.eclipse.pmf.pim.metamodel;

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
 * 
 * @see org.eclipse.pmf.pim.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/metamodel";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "MM";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	MetamodelPackage eINSTANCE = org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.pmf.pim.metamodel.impl.TypeImpl
	 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__PROPERTIES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__ABSTRACT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__PRIMITIVE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_PARAMETERS = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Super Types</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__GENERIC_SUPER_TYPES = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.metamodel.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.pmf.pim.metamodel.Property
	 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

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
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MANY = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GENERIC_TYPE = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.metamodel.impl.TypeParameterImpl
	 * <em>Type Parameter</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.pmf.pim.metamodel.impl.TypeParameterImpl
	 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.metamodel.impl.GenericTypeImpl
	 * <em>Generic Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.metamodel.impl.GenericTypeImpl
	 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 3;

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
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE_ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__UPPER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__LOWER_BOUND = 4;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = 5;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.metamodel.Type <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#getProperties
	 * <em>Properties</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Properties</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#getProperties()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Properties();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#isAbstract()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Abstract();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#isPrimitive <em>Primitive</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#isPrimitive()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Primitive();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#getSuperTypes
	 * <em>Super Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#getSuperTypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#getTypeParameters
	 * <em>Type Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Type Parameters</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#getTypeParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.Type#getGenericSuperTypes
	 * <em>Generic Super Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Generic Super Types</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Type#getGenericSuperTypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_GenericSuperTypes();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.metamodel.Property <em>Property</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.metamodel.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.metamodel.Property#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Property#isMany()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Many();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.metamodel.Property#getGenericType
	 * <em>Generic Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Generic Type</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.Property#getGenericType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_GenericType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.metamodel.TypeParameter
	 * <em>Type Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.TypeParameter#getBounds
	 * <em>Bounds</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Bounds</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.metamodel.TypeParameter#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.TypeParameter#getName()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EAttribute getTypeParameter_Name();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType#getType()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_Type();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType#getTypeParameter
	 * <em>Type Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type Parameter</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType#getTypeParameter()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_TypeParameter();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType#getTypeArguments
	 * <em>Type Arguments</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Type Arguments</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType#getTypeArguments()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_TypeArguments();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType#getUpperBound
	 * <em>Upper Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Upper Bound</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType#getUpperBound()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_UpperBound();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType#getLowerBound
	 * <em>Lower Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Lower Bound</em>'.
	 * @see org.eclipse.pmf.pim.metamodel.GenericType#getLowerBound()
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
	MetamodelFactory getMetamodelFactory();

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
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl <em>Type</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.metamodel.impl.TypeImpl
		 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__PROPERTIES = eINSTANCE.getType_Properties();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE__ABSTRACT = eINSTANCE.getType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE__PRIMITIVE = eINSTANCE.getType_Primitive();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__SUPER_TYPES = eINSTANCE.getType_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__TYPE_PARAMETERS = eINSTANCE.getType_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Generic Super Types</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__GENERIC_SUPER_TYPES = eINSTANCE
				.getType_GenericSuperTypes();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.metamodel.Property <em>Property</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.metamodel.Property
		 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROPERTY__MANY = eINSTANCE.getProperty_Many();

		/**
		 * The meta object literal for the '<em><b>Generic Type</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY__GENERIC_TYPE = eINSTANCE.getProperty_GenericType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.metamodel.impl.TypeParameterImpl
		 * <em>Type Parameter</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.metamodel.impl.TypeParameterImpl
		 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE_PARAMETER__BOUNDS = eINSTANCE.getTypeParameter_Bounds();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE_PARAMETER__NAME = eINSTANCE.getTypeParameter_Name();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.metamodel.impl.GenericTypeImpl
		 * <em>Generic Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.metamodel.impl.GenericTypeImpl
		 * @see org.eclipse.pmf.pim.metamodel.impl.MetamodelPackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE = eINSTANCE.getGenericType_Type();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE_PARAMETER = eINSTANCE
				.getGenericType_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE_ARGUMENTS = eINSTANCE
				.getGenericType_TypeArguments();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERIC_TYPE__UPPER_BOUND = eINSTANCE
				.getGenericType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERIC_TYPE__LOWER_BOUND = eINSTANCE
				.getGenericType_LowerBound();

	}

} // MetamodelPackage
