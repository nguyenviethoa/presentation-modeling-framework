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
package org.eclipse.pmf.pim.databinding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.pmf.pim.databinding.DatabindingFactory
 * @model kind="package"
 * @generated
 */
public interface DatabindingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "databinding";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/databinding";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "databinding";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DatabindingPackage eINSTANCE = org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingPathImpl <em>Data Binding Path</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingPathImpl
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingPath()
	 * @generated
	 */
	int DATA_BINDING_PATH = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_PATH__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Data Binding Path</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_PATH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingNodeImpl <em>Data Binding Node</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingNodeImpl
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingNode()
	 * @generated
	 */
	int DATA_BINDING_NODE = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_NODE__FEATURE = DATA_BINDING_PATH__FEATURE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_NODE__NEXT = DATA_BINDING_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Binding Node</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_NODE_FEATURE_COUNT = DATA_BINDING_PATH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingLeafImpl <em>Data Binding Leaf</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingLeafImpl
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingLeaf()
	 * @generated
	 */
	int DATA_BINDING_LEAF = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_LEAF__FEATURE = DATA_BINDING_PATH__FEATURE;

	/**
	 * The feature id for the '<em><b>Aggregation Next</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_LEAF__AGGREGATION_NEXT = DATA_BINDING_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Binding Leaf</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_LEAF_FEATURE_COUNT = DATA_BINDING_PATH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl
	 * <em>Data Binding</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingImpl
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBinding()
	 * @generated
	 */
	int DATA_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__PATH = 1;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CONVERTER = 2;

	/**
	 * The feature id for the '<em><b>Local Converter</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__LOCAL_CONVERTER = 3;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VALIDATORS = 4;

	/**
	 * The feature id for the '<em><b>Local Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__LOCAL_VALIDATORS = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__MODE = 6;

	/**
	 * The feature id for the '<em><b>Update Source Trigger</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__UPDATE_SOURCE_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__STATUS = 8;

	/**
	 * The number of structural features of the '<em>Data Binding</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.databinding.BindingMode <em>Binding Mode</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.databinding.BindingMode
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getBindingMode()
	 * @generated
	 */
	int BINDING_MODE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.databinding.UpdateSourceTrigger <em>Update Source Trigger</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.databinding.UpdateSourceTrigger
	 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getUpdateSourceTrigger()
	 * @generated
	 */
	int UPDATE_SOURCE_TRIGGER = 5;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.databinding.DataBindingNode
	 * <em>Data Binding Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Data Binding Node</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingNode
	 * @generated
	 */
	EClass getDataBindingNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.databinding.DataBindingNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingNode#getNext()
	 * @see #getDataBindingNode()
	 * @generated
	 */
	EReference getDataBindingNode_Next();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.databinding.DataBindingLeaf
	 * <em>Data Binding Leaf</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Data Binding Leaf</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingLeaf
	 * @generated
	 */
	EClass getDataBindingLeaf();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.databinding.DataBindingLeaf#getAggregationNext
	 * <em>Aggregation Next</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Aggregation Next</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingLeaf#getAggregationNext()
	 * @see #getDataBindingLeaf()
	 * @generated
	 */
	EReference getDataBindingLeaf_AggregationNext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.databinding.DataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Binding</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding
	 * @generated
	 */
	EClass getDataBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.databinding.DataBinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getType()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.databinding.DataBinding#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getPath()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Path();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.databinding.DataBinding#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Converter</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getConverter()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Converter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.databinding.DataBinding#getLocalConverter <em>Local Converter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Converter</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getLocalConverter()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_LocalConverter();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.databinding.DataBinding#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validators</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getValidators()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Validators();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.databinding.DataBinding#getLocalValidators
	 * <em>Local Validators</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Local Validators</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getLocalValidators()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_LocalValidators();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.databinding.DataBinding#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getMode()
	 * @see #getDataBinding()
	 * @generated
	 */
	EAttribute getDataBinding_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.databinding.DataBinding#getUpdateSourceTrigger <em>Update Source Trigger</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Source Trigger</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getUpdateSourceTrigger()
	 * @see #getDataBinding()
	 * @generated
	 */
	EAttribute getDataBinding_UpdateSourceTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.databinding.DataBinding#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBinding#getStatus()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_Status();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.databinding.DataBindingPath
	 * <em>Data Binding Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Data Binding Path</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingPath
	 * @generated
	 */
	EClass getDataBindingPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.databinding.DataBindingPath#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.pmf.pim.databinding.DataBindingPath#getFeature()
	 * @see #getDataBindingPath()
	 * @generated
	 */
	EReference getDataBindingPath_Feature();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.databinding.BindingMode <em>Binding Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Mode</em>'.
	 * @see org.eclipse.pmf.pim.databinding.BindingMode
	 * @generated
	 */
	EEnum getBindingMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.databinding.UpdateSourceTrigger <em>Update Source Trigger</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Update Source Trigger</em>'.
	 * @see org.eclipse.pmf.pim.databinding.UpdateSourceTrigger
	 * @generated
	 */
	EEnum getUpdateSourceTrigger();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabindingFactory getDatabindingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingNodeImpl <em>Data Binding Node</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingNodeImpl
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingNode()
		 * @generated
		 */
		EClass DATA_BINDING_NODE = eINSTANCE.getDataBindingNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING_NODE__NEXT = eINSTANCE
				.getDataBindingNode_Next();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingLeafImpl <em>Data Binding Leaf</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingLeafImpl
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingLeaf()
		 * @generated
		 */
		EClass DATA_BINDING_LEAF = eINSTANCE.getDataBindingLeaf();

		/**
		 * The meta object literal for the '<em><b>Aggregation Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING_LEAF__AGGREGATION_NEXT = eINSTANCE
				.getDataBindingLeaf_AggregationNext();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl <em>Data Binding</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingImpl
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBinding()
		 * @generated
		 */
		EClass DATA_BINDING = eINSTANCE.getDataBinding();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__TYPE = eINSTANCE.getDataBinding_Type();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__PATH = eINSTANCE.getDataBinding_Path();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__CONVERTER = eINSTANCE
				.getDataBinding_Converter();

		/**
		 * The meta object literal for the '<em><b>Local Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__LOCAL_CONVERTER = eINSTANCE
				.getDataBinding_LocalConverter();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__VALIDATORS = eINSTANCE
				.getDataBinding_Validators();

		/**
		 * The meta object literal for the '<em><b>Local Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__LOCAL_VALIDATORS = eINSTANCE
				.getDataBinding_LocalValidators();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BINDING__MODE = eINSTANCE.getDataBinding_Mode();

		/**
		 * The meta object literal for the '
		 * <em><b>Update Source Trigger</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_BINDING__UPDATE_SOURCE_TRIGGER = eINSTANCE
				.getDataBinding_UpdateSourceTrigger();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__STATUS = eINSTANCE.getDataBinding_Status();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.impl.DataBindingPathImpl <em>Data Binding Path</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.impl.DataBindingPathImpl
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getDataBindingPath()
		 * @generated
		 */
		EClass DATA_BINDING_PATH = eINSTANCE.getDataBindingPath();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING_PATH__FEATURE = eINSTANCE
				.getDataBindingPath_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.BindingMode <em>Binding Mode</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.BindingMode
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getBindingMode()
		 * @generated
		 */
		EEnum BINDING_MODE = eINSTANCE.getBindingMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.databinding.UpdateSourceTrigger <em>Update Source Trigger</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.databinding.UpdateSourceTrigger
		 * @see org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl#getUpdateSourceTrigger()
		 * @generated
		 */
		EEnum UPDATE_SOURCE_TRIGGER = eINSTANCE.getUpdateSourceTrigger();

	}

} // DatabindingPackage
