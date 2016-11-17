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
package org.eclipse.pmf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.datainput.DatainputPackage;

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
 * @see org.eclipse.pmf.emf.PEMFFactory
 * @model kind="package"
 * @generated
 */
public interface PEMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pemf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	PEMFPackage eINSTANCE = org.eclipse.pmf.emf.impl.PEMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EMFDataModelManagerFactoryImpl <em>EMF Data Model Manager Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EMFDataModelManagerFactoryImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFDataModelManagerFactory()
	 * @generated
	 */
	int EMF_DATA_MODEL_MANAGER_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>EMF Data Model Manager Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_MODEL_MANAGER_FACTORY_FEATURE_COUNT = PMFPackage.DATA_MODEL_MANAGER_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EMFDataModelManagerImpl <em>EMF Data Model Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EMFDataModelManagerImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFDataModelManager()
	 * @generated
	 */
	int EMF_DATA_MODEL_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Type Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_MODEL_MANAGER__TYPE_MAP = DataPackage.DATA_MODEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Data Model Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_MODEL_MANAGER_FEATURE_COUNT = DataPackage.DATA_MODEL_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EMFTypeImpl <em>EMF Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EMFTypeImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFType()
	 * @generated
	 */
	int EMF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__NAME = DataPackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__DESCRIPTION = DataPackage.DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__ID = DataPackage.DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__MANAGER = DataPackage.DATA_TYPE__MANAGER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__PROPERTIES = DataPackage.DATA_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__ABSTRACT = DataPackage.DATA_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__PRIMITIVE = DataPackage.DATA_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__SUPER_TYPES = DataPackage.DATA_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__TYPE_PARAMETERS = DataPackage.DATA_TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Generic Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__GENERIC_SUPER_TYPES = DataPackage.DATA_TYPE__GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__ENUM = DataPackage.DATA_TYPE__ENUM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__CONTENT = DataPackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Genmodel</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE__GENMODEL = DataPackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_TYPE_FEATURE_COUNT = DataPackage.DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EMFPropertyImpl <em>EMF Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EMFPropertyImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFProperty()
	 * @generated
	 */
	int EMF_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__NAME = DataPackage.DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__DESCRIPTION = DataPackage.DATA_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__ID = DataPackage.DATA_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__MANDATORY = DataPackage.DATA_PROPERTY__MANDATORY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__TYPE = DataPackage.DATA_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__MANY = DataPackage.DATA_PROPERTY__MANY;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__GENERIC_TYPE = DataPackage.DATA_PROPERTY__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__CONTENT = DataPackage.DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Genmodel</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY__GENMODEL = DataPackage.DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Property</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_FEATURE_COUNT = DataPackage.DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EClassToDataTypeMapEntryImpl <em>EClass To Data Type Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EClassToDataTypeMapEntryImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEClassToDataTypeMapEntry()
	 * @generated
	 */
	int ECLASS_TO_DATA_TYPE_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_DATA_TYPE_MAP_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_DATA_TYPE_MAP_ENTRY__KEY = 1;

	/**
	 * The number of structural features of the '<em>EClass To Data Type Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_DATA_TYPE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.emf.impl.EMFFileInputImpl <em>EMF File Input</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.emf.impl.EMFFileInputImpl
	 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFFileInput()
	 * @generated
	 */
	int EMF_FILE_INPUT = 5;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_INPUT__FILE_NAME = DatainputPackage.FILE_INPUT__FILE_NAME;

	/**
	 * The number of structural features of the '<em>EMF File Input</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_INPUT_FEATURE_COUNT = DatainputPackage.FILE_INPUT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.emf.EMFDataModelManagerFactory <em>EMF Data Model Manager Factory</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>EMF Data Model Manager Factory</em>'.
	 * @see org.eclipse.pmf.emf.EMFDataModelManagerFactory
	 * @generated
	 */
	EClass getEMFDataModelManagerFactory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.emf.EMFDataModelManager <em>EMF Data Model Manager</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>EMF Data Model Manager</em>'.
	 * @see org.eclipse.pmf.emf.EMFDataModelManager
	 * @generated
	 */
	EClass getEMFDataModelManager();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.emf.EMFDataModelManager#getTypeMap <em>Type Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Type Map</em>'.
	 * @see org.eclipse.pmf.emf.EMFDataModelManager#getTypeMap()
	 * @see #getEMFDataModelManager()
	 * @generated
	 */
	EReference getEMFDataModelManager_TypeMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.emf.EMFType <em>EMF Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Type</em>'.
	 * @see org.eclipse.pmf.emf.EMFType
	 * @generated
	 */
	EClass getEMFType();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.emf.EMFType#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.eclipse.pmf.emf.EMFType#getContent()
	 * @see #getEMFType()
	 * @generated
	 */
	EReference getEMFType_Content();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.emf.EMFType#getGenmodel <em>Genmodel</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Genmodel</em>'.
	 * @see org.eclipse.pmf.emf.EMFType#getGenmodel()
	 * @see #getEMFType()
	 * @generated
	 */
	EReference getEMFType_Genmodel();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.emf.EMFProperty <em>EMF Property</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EMF Property</em>'.
	 * @see org.eclipse.pmf.emf.EMFProperty
	 * @generated
	 */
	EClass getEMFProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.emf.EMFProperty#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.eclipse.pmf.emf.EMFProperty#getContent()
	 * @see #getEMFProperty()
	 * @generated
	 */
	EReference getEMFProperty_Content();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.emf.EMFProperty#getGenmodel <em>Genmodel</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genmodel</em>'.
	 * @see org.eclipse.pmf.emf.EMFProperty#getGenmodel()
	 * @see #getEMFProperty()
	 * @generated
	 */
	EReference getEMFProperty_Genmodel();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EClass To Data Type Map Entry</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>EClass To Data Type Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="org.eclipse.pmf.emf.EMFType" valueContainment="true"
	 *        keyType="org.eclipse.emf.ecore.EClassifier"
	 * @generated
	 */
	EClass getEClassToDataTypeMapEntry();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEClassToDataTypeMapEntry()
	 * @generated
	 */
	EReference getEClassToDataTypeMapEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEClassToDataTypeMapEntry()
	 * @generated
	 */
	EReference getEClassToDataTypeMapEntry_Key();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.emf.EMFFileInput <em>EMF File Input</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EMF File Input</em>'.
	 * @see org.eclipse.pmf.emf.EMFFileInput
	 * @generated
	 */
	EClass getEMFFileInput();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PEMFFactory getPEMFFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EMFDataModelManagerFactoryImpl <em>EMF Data Model Manager Factory</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EMFDataModelManagerFactoryImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFDataModelManagerFactory()
		 * @generated
		 */
		EClass EMF_DATA_MODEL_MANAGER_FACTORY = eINSTANCE
				.getEMFDataModelManagerFactory();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EMFDataModelManagerImpl <em>EMF Data Model Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EMFDataModelManagerImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFDataModelManager()
		 * @generated
		 */
		EClass EMF_DATA_MODEL_MANAGER = eINSTANCE.getEMFDataModelManager();

		/**
		 * The meta object literal for the '<em><b>Type Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_DATA_MODEL_MANAGER__TYPE_MAP = eINSTANCE
				.getEMFDataModelManager_TypeMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EMFTypeImpl <em>EMF Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EMFTypeImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFType()
		 * @generated
		 */
		EClass EMF_TYPE = eINSTANCE.getEMFType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_TYPE__CONTENT = eINSTANCE.getEMFType_Content();

		/**
		 * The meta object literal for the '<em><b>Genmodel</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_TYPE__GENMODEL = eINSTANCE.getEMFType_Genmodel();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EMFPropertyImpl <em>EMF Property</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EMFPropertyImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFProperty()
		 * @generated
		 */
		EClass EMF_PROPERTY = eINSTANCE.getEMFProperty();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_PROPERTY__CONTENT = eINSTANCE.getEMFProperty_Content();

		/**
		 * The meta object literal for the '<em><b>Genmodel</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_PROPERTY__GENMODEL = eINSTANCE.getEMFProperty_Genmodel();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EClassToDataTypeMapEntryImpl <em>EClass To Data Type Map Entry</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EClassToDataTypeMapEntryImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEClassToDataTypeMapEntry()
		 * @generated
		 */
		EClass ECLASS_TO_DATA_TYPE_MAP_ENTRY = eINSTANCE
				.getEClassToDataTypeMapEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_TO_DATA_TYPE_MAP_ENTRY__VALUE = eINSTANCE
				.getEClassToDataTypeMapEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_TO_DATA_TYPE_MAP_ENTRY__KEY = eINSTANCE
				.getEClassToDataTypeMapEntry_Key();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.emf.impl.EMFFileInputImpl <em>EMF File Input</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.emf.impl.EMFFileInputImpl
		 * @see org.eclipse.pmf.emf.impl.PEMFPackageImpl#getEMFFileInput()
		 * @generated
		 */
		EClass EMF_FILE_INPUT = eINSTANCE.getEMFFileInput();

	}

} // PEMFPackage
