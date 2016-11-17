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
package org.eclipse.pmf.pim;

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
 * @see org.eclipse.pmf.pim.PMFFactory
 * @model kind="package"
 * @generated
 */
public interface PMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	PMFPackage eINSTANCE = org.eclipse.pmf.pim.impl.PMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.PMFObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.PMFObjectImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getPMFObject()
	 * @generated
	 */
	int PMF_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PMF_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PMF_OBJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PMF_OBJECT__ID = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PMF_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.UIObjectImpl <em>UI Object</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.UIObjectImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getUIObject()
	 * @generated
	 */
	int UI_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__ID = PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__VIEW_ID = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__VISIBLE = PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__ENABLED = PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__TRIGGERS = PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataElementImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = UI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DESCRIPTION = UI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ID = UI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VIEW_ID = UI_OBJECT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VISIBLE = UI_OBJECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ENABLED = UI_OBJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TRIGGERS = UI_OBJECT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATA_CONTEXT_TYPE = UI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATA_BINDING = UI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE = UI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE = UI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CHANGEABLE = UI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PROPERTY_CHANGED = UI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CONTROL = UI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = UI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataFormImpl <em>Data Form</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataFormImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataForm()
	 * @generated
	 */
	int DATA_FORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__ID = DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__VIEW_ID = DATA_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__VISIBLE = DATA_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__ENABLED = DATA_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__TRIGGERS = DATA_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__DATA_CONTEXT_TYPE = DATA_ELEMENT__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__DATA_BINDING = DATA_ELEMENT__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE = DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE = DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__CHANGEABLE = DATA_ELEMENT__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__PROPERTY_CHANGED = DATA_ELEMENT__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__CONTROL = DATA_ELEMENT__CONTROL;

	/**
	 * The number of structural features of the '<em>Data Form</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl <em>Elemental Data Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ElementalDataFormImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getElementalDataForm()
	 * @generated
	 */
	int ELEMENTAL_DATA_FORM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__NAME = DATA_FORM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__DESCRIPTION = DATA_FORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__ID = DATA_FORM__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__VIEW_ID = DATA_FORM__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__VISIBLE = DATA_FORM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__ENABLED = DATA_FORM__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__TRIGGERS = DATA_FORM__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__DATA_CONTEXT_TYPE = DATA_FORM__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__DATA_BINDING = DATA_FORM__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE = DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE = DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__CHANGEABLE = DATA_FORM__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__PROPERTY_CHANGED = DATA_FORM__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__CONTROL = DATA_FORM__CONTROL;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__VALIDATORS = DATA_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS = DATA_FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__CHILDREN = DATA_FORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__VIEW_PROFILES = DATA_FORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM__LAYOUT = DATA_FORM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Elemental Data Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTAL_DATA_FORM_FEATURE_COUNT = DATA_FORM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.CompositeDataFormImpl <em>Composite Data Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.CompositeDataFormImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getCompositeDataForm()
	 * @generated
	 */
	int COMPOSITE_DATA_FORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__NAME = DATA_FORM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__DESCRIPTION = DATA_FORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__ID = DATA_FORM__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__VIEW_ID = DATA_FORM__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__VISIBLE = DATA_FORM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__ENABLED = DATA_FORM__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__TRIGGERS = DATA_FORM__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__DATA_CONTEXT_TYPE = DATA_FORM__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__DATA_BINDING = DATA_FORM__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE = DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE = DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__CHANGEABLE = DATA_FORM__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__PROPERTY_CHANGED = DATA_FORM__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__CONTROL = DATA_FORM__CONTROL;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM__ELEMENTS = DATA_FORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Data Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_FORM_FEATURE_COUNT = DATA_FORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataFormSelectorImpl <em>Data Form Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataFormSelectorImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataFormSelector()
	 * @generated
	 */
	int DATA_FORM_SELECTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__NAME = COMPOSITE_DATA_FORM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__DESCRIPTION = COMPOSITE_DATA_FORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__ID = COMPOSITE_DATA_FORM__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__VIEW_ID = COMPOSITE_DATA_FORM__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__VISIBLE = COMPOSITE_DATA_FORM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__ENABLED = COMPOSITE_DATA_FORM__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__TRIGGERS = COMPOSITE_DATA_FORM__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__DATA_CONTEXT_TYPE = COMPOSITE_DATA_FORM__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__DATA_BINDING = COMPOSITE_DATA_FORM__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__RESOLVED_TARGET_CONTEXT_TYPE = COMPOSITE_DATA_FORM__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__RESOLVED_DATA_CONTEXT_TYPE = COMPOSITE_DATA_FORM__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__CHANGEABLE = COMPOSITE_DATA_FORM__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__PROPERTY_CHANGED = COMPOSITE_DATA_FORM__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__CONTROL = COMPOSITE_DATA_FORM__CONTROL;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__ELEMENTS = COMPOSITE_DATA_FORM__ELEMENTS;

	/**
	 * The feature id for the '<em><b>UI Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR__UI_MODE = COMPOSITE_DATA_FORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Form Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_SELECTOR_FEATURE_COUNT = COMPOSITE_DATA_FORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataItemImpl <em>Data Item</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataItemImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__ID = DATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__VIEW_ID = DATA_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__VISIBLE = DATA_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__ENABLED = DATA_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__TRIGGERS = DATA_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__DATA_CONTEXT_TYPE = DATA_ELEMENT__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__DATA_BINDING = DATA_ELEMENT__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__RESOLVED_TARGET_CONTEXT_TYPE = DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__RESOLVED_DATA_CONTEXT_TYPE = DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__CHANGEABLE = DATA_ELEMENT__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__PROPERTY_CHANGED = DATA_ELEMENT__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__CONTROL = DATA_ELEMENT__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__MANDATORY = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__LABEL = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__HELP = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__LAYOUT_DATA = DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Item</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataFieldImpl <em>Data Field</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataFieldImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DESCRIPTION = DATA_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__ID = DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__VIEW_ID = DATA_ITEM__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__VISIBLE = DATA_ITEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__ENABLED = DATA_ITEM__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__TRIGGERS = DATA_ITEM__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DATA_CONTEXT_TYPE = DATA_ITEM__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DATA_BINDING = DATA_ITEM__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__RESOLVED_TARGET_CONTEXT_TYPE = DATA_ITEM__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__RESOLVED_DATA_CONTEXT_TYPE = DATA_ITEM__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__CHANGEABLE = DATA_ITEM__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__PROPERTY_CHANGED = DATA_ITEM__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__CONTROL = DATA_ITEM__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__MANDATORY = DATA_ITEM__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__LABEL = DATA_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__HELP = DATA_ITEM__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__LAYOUT_DATA = DATA_ITEM__LAYOUT_DATA;

	/**
	 * The number of structural features of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataCompositeImpl <em>Data Composite</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataCompositeImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataComposite()
	 * @generated
	 */
	int DATA_COMPOSITE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__DESCRIPTION = DATA_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__ID = DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__VIEW_ID = DATA_ITEM__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__VISIBLE = DATA_ITEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__ENABLED = DATA_ITEM__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__TRIGGERS = DATA_ITEM__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__DATA_CONTEXT_TYPE = DATA_ITEM__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__DATA_BINDING = DATA_ITEM__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__RESOLVED_TARGET_CONTEXT_TYPE = DATA_ITEM__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__RESOLVED_DATA_CONTEXT_TYPE = DATA_ITEM__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__CHANGEABLE = DATA_ITEM__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__PROPERTY_CHANGED = DATA_ITEM__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__CONTROL = DATA_ITEM__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__MANDATORY = DATA_ITEM__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__LABEL = DATA_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__HELP = DATA_ITEM__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__LAYOUT_DATA = DATA_ITEM__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE__ITEMS = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Composite</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPOSITE_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataCollectionImpl <em>Data Collection</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataCollectionImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataCollection()
	 * @generated
	 */
	int DATA_COLLECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__NAME = DATA_COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__DESCRIPTION = DATA_COMPOSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ID = DATA_COMPOSITE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__VIEW_ID = DATA_COMPOSITE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__VISIBLE = DATA_COMPOSITE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ENABLED = DATA_COMPOSITE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__TRIGGERS = DATA_COMPOSITE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__DATA_CONTEXT_TYPE = DATA_COMPOSITE__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__DATA_BINDING = DATA_COMPOSITE__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__RESOLVED_TARGET_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__RESOLVED_DATA_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__CHANGEABLE = DATA_COMPOSITE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__PROPERTY_CHANGED = DATA_COMPOSITE__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__CONTROL = DATA_COMPOSITE__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__MANDATORY = DATA_COMPOSITE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__LABEL = DATA_COMPOSITE__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__HELP = DATA_COMPOSITE__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__LAYOUT_DATA = DATA_COMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ITEMS = DATA_COMPOSITE__ITEMS;

	/**
	 * The feature id for the '<em><b>Add New</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ADD_NEW = DATA_COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Removable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__REMOVABLE = DATA_COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reorderable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__REORDERABLE = DATA_COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__EDITABLE = DATA_COMPOSITE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__COLUMNS = DATA_COMPOSITE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sorters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__SORTERS = DATA_COMPOSITE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__EDITOR = DATA_COMPOSITE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__DETAIL = DATA_COMPOSITE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Collection</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_FEATURE_COUNT = DATA_COMPOSITE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ApplicationImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataReferenceImpl <em>Data Reference</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataReferenceImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataReference()
	 * @generated
	 */
	int DATA_REFERENCE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.CommandImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ActionImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.SystemActionImpl <em>System Action</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.SystemActionImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSystemAction()
	 * @generated
	 */
	int SYSTEM_ACTION = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ApplicationActionImpl <em>Application Action</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ApplicationActionImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getApplicationAction()
	 * @generated
	 */
	int APPLICATION_ACTION = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataFormFolderImpl <em>Data Form Folder</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataFormFolderImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataFormFolder()
	 * @generated
	 */
	int DATA_FORM_FOLDER = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.TypeToDataFormFolderEntryMapImpl <em>Type To Data Form Folder Entry Map</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.TypeToDataFormFolderEntryMapImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getTypeToDataFormFolderEntryMap()
	 * @generated
	 */
	int TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.PMFImpl <em>PMF</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.PMFImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getPMF()
	 * @generated
	 */
	int PMF = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataModelManagerFactoryImpl <em>Data Model Manager Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataModelManagerFactoryImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataModelManagerFactory()
	 * @generated
	 */
	int DATA_MODEL_MANAGER_FACTORY = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataConverterImpl <em>Data Converter</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataConverterImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataConverter()
	 * @generated
	 */
	int DATA_CONVERTER = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ValidatorImpl <em>Validator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ValidatorImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getValidator()
	 * @generated
	 */
	int VALIDATOR = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.ViewProfileImpl <em>View Profile</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.ViewProfileImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getViewProfile()
	 * @generated
	 */
	int VIEW_PROFILE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.SorterImpl <em>Sorter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.SorterImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSorter()
	 * @generated
	 */
	int SORTER = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataInheritanceImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataInheritance()
	 * @generated
	 */
	int DATA_INHERITANCE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataAssocicationImpl <em>Data Assocication</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataAssocicationImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataAssocication()
	 * @generated
	 */
	int DATA_ASSOCICATION = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.LibraryImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__VIEW_PROFILES = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SYSTEM_ACTIONS = PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COMMANDS = PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONVERTERS = PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__VALIDATORS = PMF_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TYPES = PMF_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Form Folders</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DATA_FORM_FOLDERS = PMF_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IMAGES = PMF_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__EVENTS = PMF_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>View Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VIEW_PROFILES = LIBRARY__VIEW_PROFILES;

	/**
	 * The feature id for the '<em><b>System Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SYSTEM_ACTIONS = LIBRARY__SYSTEM_ACTIONS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMMANDS = LIBRARY__COMMANDS;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONVERTERS = LIBRARY__CONVERTERS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VALIDATORS = LIBRARY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TYPES = LIBRARY__TYPES;

	/**
	 * The feature id for the '<em><b>Data Form Folders</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DATA_FORM_FOLDERS = LIBRARY__DATA_FORM_FOLDERS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IMAGES = LIBRARY__IMAGES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__EVENTS = LIBRARY__EVENTS;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAIN = LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Model Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DATA_MODEL_MANAGERS = LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LIBRARIES = LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All View Profiles</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_VIEW_PROFILES = LIBRARY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All System Actions</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_SYSTEM_ACTIONS = LIBRARY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Commands</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_COMMANDS = LIBRARY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Converters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_CONVERTERS = LIBRARY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Validators</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_VALIDATORS = LIBRARY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Types</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_TYPES = LIBRARY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ALL_IMAGES = LIBRARY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__AUTHENTICATION = LIBRARY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mandatory Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MANDATORY_FIELD = LIBRARY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wizards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__WIZARDS = LIBRARY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.DataGroupImpl <em>Data Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.DataGroupImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataGroup()
	 * @generated
	 */
	int DATA_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__NAME = DATA_COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__DESCRIPTION = DATA_COMPOSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__ID = DATA_COMPOSITE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__VIEW_ID = DATA_COMPOSITE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__VISIBLE = DATA_COMPOSITE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__ENABLED = DATA_COMPOSITE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__TRIGGERS = DATA_COMPOSITE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__DATA_CONTEXT_TYPE = DATA_COMPOSITE__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__DATA_BINDING = DATA_COMPOSITE__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__RESOLVED_TARGET_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__RESOLVED_DATA_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__CHANGEABLE = DATA_COMPOSITE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__PROPERTY_CHANGED = DATA_COMPOSITE__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__CONTROL = DATA_COMPOSITE__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__MANDATORY = DATA_COMPOSITE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__LABEL = DATA_COMPOSITE__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__HELP = DATA_COMPOSITE__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__LAYOUT_DATA = DATA_COMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__ITEMS = DATA_COMPOSITE__ITEMS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__LAYOUT = DATA_COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_FEATURE_COUNT = DATA_COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__NAME = DATA_COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DESCRIPTION = DATA_COMPOSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__ID = DATA_COMPOSITE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__VIEW_ID = DATA_COMPOSITE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__VISIBLE = DATA_COMPOSITE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__ENABLED = DATA_COMPOSITE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__TRIGGERS = DATA_COMPOSITE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DATA_CONTEXT_TYPE = DATA_COMPOSITE__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DATA_BINDING = DATA_COMPOSITE__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__RESOLVED_TARGET_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__RESOLVED_DATA_CONTEXT_TYPE = DATA_COMPOSITE__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__CHANGEABLE = DATA_COMPOSITE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__PROPERTY_CHANGED = DATA_COMPOSITE__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__CONTROL = DATA_COMPOSITE__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__MANDATORY = DATA_COMPOSITE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__LABEL = DATA_COMPOSITE__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__HELP = DATA_COMPOSITE__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__LAYOUT_DATA = DATA_COMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__ITEMS = DATA_COMPOSITE__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Form</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DATA_FORM = DATA_COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DATA_TYPE = DATA_COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE_FEATURE_COUNT = DATA_COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Command</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__COMMANDS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Action</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ACTION__ID = ACTION__ID;

	/**
	 * The number of structural features of the '<em>Application Action</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_FOLDER__DATA_FORMS = 0;

	/**
	 * The feature id for the '<em><b>Default Data Form</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_FOLDER__DEFAULT_DATA_FORM = 1;

	/**
	 * The number of structural features of the '<em>Data Form Folder</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_FOLDER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Type To Data Form Folder Entry Map</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Model Manager Factories</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMF__MODEL_MANAGER_FACTORIES = 0;

	/**
	 * The number of structural features of the '<em>PMF</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PMF_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Data Model Manager Factory</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_MANAGER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER__ID = PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>From Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER__FROM_TYPE = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER__TO_TYPE = PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Converter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONVERTER_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR__ID = PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Validator</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROFILE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>View Profile</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORTER__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORTER__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTER__COMPARATOR = 2;

	/**
	 * The number of structural features of the '<em>Sorter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORTER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__NAME = DATA_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__DESCRIPTION = DATA_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__ID = DATA_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__VIEW_ID = DATA_REFERENCE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__VISIBLE = DATA_REFERENCE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__ENABLED = DATA_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__TRIGGERS = DATA_REFERENCE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__DATA_CONTEXT_TYPE = DATA_REFERENCE__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__DATA_BINDING = DATA_REFERENCE__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__RESOLVED_TARGET_CONTEXT_TYPE = DATA_REFERENCE__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__RESOLVED_DATA_CONTEXT_TYPE = DATA_REFERENCE__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__CHANGEABLE = DATA_REFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__PROPERTY_CHANGED = DATA_REFERENCE__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__CONTROL = DATA_REFERENCE__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__MANDATORY = DATA_REFERENCE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__LABEL = DATA_REFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__HELP = DATA_REFERENCE__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__LAYOUT_DATA = DATA_REFERENCE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__ITEMS = DATA_REFERENCE__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Form</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__DATA_FORM = DATA_REFERENCE__DATA_FORM;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__DATA_TYPE = DATA_REFERENCE__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Data Inheritance</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE_FEATURE_COUNT = DATA_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__NAME = DATA_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__DESCRIPTION = DATA_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__ID = DATA_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__VIEW_ID = DATA_REFERENCE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__VISIBLE = DATA_REFERENCE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__ENABLED = DATA_REFERENCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__TRIGGERS = DATA_REFERENCE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__DATA_CONTEXT_TYPE = DATA_REFERENCE__DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__DATA_BINDING = DATA_REFERENCE__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Resolved Target Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__RESOLVED_TARGET_CONTEXT_TYPE = DATA_REFERENCE__RESOLVED_TARGET_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Resolved Data Context Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__RESOLVED_DATA_CONTEXT_TYPE = DATA_REFERENCE__RESOLVED_DATA_CONTEXT_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__CHANGEABLE = DATA_REFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Property Changed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__PROPERTY_CHANGED = DATA_REFERENCE__PROPERTY_CHANGED;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__CONTROL = DATA_REFERENCE__CONTROL;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__MANDATORY = DATA_REFERENCE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__LABEL = DATA_REFERENCE__LABEL;

	/**
	 * The feature id for the '<em><b>Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__HELP = DATA_REFERENCE__HELP;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__LAYOUT_DATA = DATA_REFERENCE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__ITEMS = DATA_REFERENCE__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Form</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__DATA_FORM = DATA_REFERENCE__DATA_FORM;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION__DATA_TYPE = DATA_REFERENCE__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Data Assocication</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCICATION_FEATURE_COUNT = DATA_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.RegexValidatorImpl <em>Regex Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.RegexValidatorImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getRegexValidator()
	 * @generated
	 */
	int REGEX_VALIDATOR = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR__NAME = VALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR__DESCRIPTION = VALIDATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR__ID = VALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR__EXPRESSION = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl <em>EClass To Event Entry Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getEClassToEventEntryMap()
	 * @generated
	 */
	int ECLASS_TO_EVENT_ENTRY_MAP = 30;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_EVENT_ENTRY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_EVENT_ENTRY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EClass To Event Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_TO_EVENT_ENTRY_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.AuthenticationImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 31;

	/**
	 * The feature id for the '<em><b>Show Lost Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__SHOW_LOST_PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__REGISTRATION = 1;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__ANONYMOUS = 2;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.impl.WizardImpl
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__NAME = PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__DESCRIPTION = PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__ID = PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Wizard Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__WIZARD_PAGES = PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__DATA_TYPE = PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CATEGORY = PMF_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = PMF_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.SortingDirection <em>Sorting Direction</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.SortingDirection
	 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSortingDirection()
	 * @generated
	 */
	int SORTING_DIRECTION = 33;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataForm <em>Data Form</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form</em>'.
	 * @see org.eclipse.pmf.pim.DataForm
	 * @generated
	 */
	EClass getDataForm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ElementalDataForm <em>Elemental Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemental Data Form</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm
	 * @generated
	 */
	EClass getElementalDataForm();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.ElementalDataForm#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validators</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm#getValidators()
	 * @see #getElementalDataForm()
	 * @generated
	 */
	EReference getElementalDataForm_Validators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.ElementalDataForm#getLocalValidators <em>Local Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Validators</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm#getLocalValidators()
	 * @see #getElementalDataForm()
	 * @generated
	 */
	EReference getElementalDataForm_LocalValidators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.ElementalDataForm#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm#getChildren()
	 * @see #getElementalDataForm()
	 * @generated
	 */
	EReference getElementalDataForm_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.ElementalDataForm#getViewProfiles <em>View Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Profiles</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm#getViewProfiles()
	 * @see #getElementalDataForm()
	 * @generated
	 */
	EReference getElementalDataForm_ViewProfiles();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ElementalDataForm#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.pmf.pim.ElementalDataForm#getLayout()
	 * @see #getElementalDataForm()
	 * @generated
	 */
	EReference getElementalDataForm_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.CompositeDataForm <em>Composite Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Form</em>'.
	 * @see org.eclipse.pmf.pim.CompositeDataForm
	 * @generated
	 */
	EClass getCompositeDataForm();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.CompositeDataForm#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipse.pmf.pim.CompositeDataForm#getElements()
	 * @see #getCompositeDataForm()
	 * @generated
	 */
	EReference getCompositeDataForm_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataFormSelector <em>Data Form Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form Selector</em>'.
	 * @see org.eclipse.pmf.pim.DataFormSelector
	 * @generated
	 */
	EClass getDataFormSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataFormSelector#getUIMode <em>UI Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UI Mode</em>'.
	 * @see org.eclipse.pmf.pim.DataFormSelector#getUIMode()
	 * @see #getDataFormSelector()
	 * @generated
	 */
	EAttribute getDataFormSelector_UIMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field</em>'.
	 * @see org.eclipse.pmf.pim.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.DataElement <em>Data Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see org.eclipse.pmf.pim.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.DataElement#getDataContextType
	 * <em>Data Context Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Data Context Type</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getDataContextType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_DataContextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataElement#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Binding</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getDataBinding()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_DataBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataElement#getResolvedTargetContextType <em>Resolved Target Context Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Target Context Type</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getResolvedTargetContextType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_ResolvedTargetContextType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataElement#getResolvedDataContextType <em>Resolved Data Context Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Data Context Type</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getResolvedDataContextType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_ResolvedDataContextType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataElement#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#isChangeable()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Changeable();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.DataElement#getPropertyChanged
	 * <em>Property Changed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Property Changed</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getPropertyChanged()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_PropertyChanged();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataElement#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.eclipse.pmf.pim.DataElement#getControl()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Control();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection
	 * @generated
	 */
	EClass getDataCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataCollection#isAddNew <em>Add New</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add New</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#isAddNew()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_AddNew();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataCollection#isRemovable <em>Removable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removable</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#isRemovable()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Removable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataCollection#isReorderable <em>Reorderable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorderable</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#isReorderable()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Reorderable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataCollection#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#isEditable()
	 * @see #getDataCollection()
	 * @generated
	 */
	EAttribute getDataCollection_Editable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.DataCollection#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#getColumns()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.DataCollection#getSorters <em>Sorters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorters</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#getSorters()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Sorters();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataCollection#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editor</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#getEditor()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Editor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataCollection#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail</em>'.
	 * @see org.eclipse.pmf.pim.DataCollection#getDetail()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_Detail();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.Application <em>Application</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipse.pmf.pim.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.Application#getMain <em>Main</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see org.eclipse.pmf.pim.Application#getMain()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Main();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.Application#getDataModelManagers
	 * <em>Data Model Managers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Data Model Managers</em>'.
	 * @see org.eclipse.pmf.pim.Application#getDataModelManagers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_DataModelManagers();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see org.eclipse.pmf.pim.Application#getLibraries()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Libraries();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.pmf.pim.Application#getAllViewProfiles
	 * <em>All View Profiles</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '
	 *         <em>All View Profiles</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllViewProfiles()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllViewProfiles();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.pmf.pim.Application#getAllSystemActions
	 * <em>All System Actions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '
	 *         <em>All System Actions</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllSystemActions()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllSystemActions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getAllCommands <em>All Commands</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Commands</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllCommands()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllCommands();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getAllConverters <em>All Converters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Converters</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllConverters()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllConverters();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getAllValidators <em>All Validators</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Validators</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllValidators()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllValidators();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getAllTypes <em>All Types</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Types</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllTypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pmf.pim.Application#getAllImages <em>All Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Images</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAllImages()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AllImages();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.Application#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see org.eclipse.pmf.pim.Application#getAuthentication()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Authentication();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.Application#getMandatoryField <em>Mandatory Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Field</em>'.
	 * @see org.eclipse.pmf.pim.Application#getMandatoryField()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MandatoryField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Application#getWizards <em>Wizards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wizards</em>'.
	 * @see org.eclipse.pmf.pim.Application#getWizards()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Wizards();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.DataComposite <em>Data Composite</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Composite</em>'.
	 * @see org.eclipse.pmf.pim.DataComposite
	 * @generated
	 */
	EClass getDataComposite();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.DataComposite#getItems <em>Items</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Items</em>'.
	 * @see org.eclipse.pmf.pim.DataComposite#getItems()
	 * @see #getDataComposite()
	 * @generated
	 */
	EReference getDataComposite_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Group</em>'.
	 * @see org.eclipse.pmf.pim.DataGroup
	 * @generated
	 */
	EClass getDataGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataGroup#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.pmf.pim.DataGroup#getLayout()
	 * @see #getDataGroup()
	 * @generated
	 */
	EReference getDataGroup_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item</em>'.
	 * @see org.eclipse.pmf.pim.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.DataItem#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.eclipse.pmf.pim.DataItem#isMandatory()
	 * @see #getDataItem()
	 * @generated
	 */
	EAttribute getDataItem_Mandatory();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.eclipse.pmf.pim.DataItem#getLabel()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataItem#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Help</em>'.
	 * @see org.eclipse.pmf.pim.DataItem#getHelp()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Help();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.DataItem#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see org.eclipse.pmf.pim.DataItem#getLayoutData()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_LayoutData();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.DataReference <em>Data Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Reference</em>'.
	 * @see org.eclipse.pmf.pim.DataReference
	 * @generated
	 */
	EClass getDataReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataReference#getDataForm <em>Data Form</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Form</em>'.
	 * @see org.eclipse.pmf.pim.DataReference#getDataForm()
	 * @see #getDataReference()
	 * @generated
	 */
	EReference getDataReference_DataForm();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataReference#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.pmf.pim.DataReference#getDataType()
	 * @see #getDataReference()
	 * @generated
	 */
	EReference getDataReference_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.UIObject <em>UI Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Object</em>'.
	 * @see org.eclipse.pmf.pim.UIObject
	 * @generated
	 */
	EClass getUIObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.UIObject#getViewID <em>View ID</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>View ID</em>'.
	 * @see org.eclipse.pmf.pim.UIObject#getViewID()
	 * @see #getUIObject()
	 * @generated
	 */
	EAttribute getUIObject_ViewID();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.UIObject#isVisible <em>Visible</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.pmf.pim.UIObject#isVisible()
	 * @see #getUIObject()
	 * @generated
	 */
	EAttribute getUIObject_Visible();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.UIObject#isEnabled <em>Enabled</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.pmf.pim.UIObject#isEnabled()
	 * @see #getUIObject()
	 * @generated
	 */
	EAttribute getUIObject_Enabled();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.UIObject#getTriggers <em>Triggers</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Triggers</em>'.
	 * @see org.eclipse.pmf.pim.UIObject#getTriggers()
	 * @see #getUIObject()
	 * @generated
	 */
	EReference getUIObject_Triggers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Command <em>Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.eclipse.pmf.pim.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Action <em>Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.pmf.pim.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.SystemAction <em>System Action</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>System Action</em>'.
	 * @see org.eclipse.pmf.pim.SystemAction
	 * @generated
	 */
	EClass getSystemAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.SystemAction#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commands</em>'.
	 * @see org.eclipse.pmf.pim.SystemAction#getCommands()
	 * @see #getSystemAction()
	 * @generated
	 */
	EReference getSystemAction_Commands();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ApplicationAction <em>Application Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Action</em>'.
	 * @see org.eclipse.pmf.pim.ApplicationAction
	 * @generated
	 */
	EClass getApplicationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataFormFolder <em>Data Form Folder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form Folder</em>'.
	 * @see org.eclipse.pmf.pim.DataFormFolder
	 * @generated
	 */
	EClass getDataFormFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.DataFormFolder#getDataForms <em>Data Forms</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Forms</em>'.
	 * @see org.eclipse.pmf.pim.DataFormFolder#getDataForms()
	 * @see #getDataFormFolder()
	 * @generated
	 */
	EReference getDataFormFolder_DataForms();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.DataFormFolder#getDefaultDataForm
	 * <em>Default Data Form</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Default Data Form</em>'.
	 * @see org.eclipse.pmf.pim.DataFormFolder#getDefaultDataForm()
	 * @see #getDataFormFolder()
	 * @generated
	 */
	EReference getDataFormFolder_DefaultDataForm();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Type To Data Form Folder Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To Data Form Folder Entry Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.pmf.pim.data.DataType"
	 *        valueType="org.eclipse.pmf.pim.DataFormFolder" valueContainment="true"
	 * @generated
	 */
	EClass getTypeToDataFormFolderEntryMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTypeToDataFormFolderEntryMap()
	 * @generated
	 */
	EReference getTypeToDataFormFolderEntryMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTypeToDataFormFolderEntryMap()
	 * @generated
	 */
	EReference getTypeToDataFormFolderEntryMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.PMF <em>PMF</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMF</em>'.
	 * @see org.eclipse.pmf.pim.PMF
	 * @generated
	 */
	EClass getPMF();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.PMF#getModelManagerFactories <em>Model Manager Factories</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Manager Factories</em>'.
	 * @see org.eclipse.pmf.pim.PMF#getModelManagerFactories()
	 * @see #getPMF()
	 * @generated
	 */
	EReference getPMF_ModelManagerFactories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataModelManagerFactory <em>Data Model Manager Factory</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Data Model Manager Factory</em>'.
	 * @see org.eclipse.pmf.pim.DataModelManagerFactory
	 * @generated
	 */
	EClass getDataModelManagerFactory();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.DataConverter <em>Data Converter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Converter</em>'.
	 * @see org.eclipse.pmf.pim.DataConverter
	 * @generated
	 */
	EClass getDataConverter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataConverter#getFromType <em>From Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Type</em>'.
	 * @see org.eclipse.pmf.pim.DataConverter#getFromType()
	 * @see #getDataConverter()
	 * @generated
	 */
	EReference getDataConverter_FromType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.DataConverter#getToType <em>To Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Type</em>'.
	 * @see org.eclipse.pmf.pim.DataConverter#getToType()
	 * @see #getDataConverter()
	 * @generated
	 */
	EReference getDataConverter_ToType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator</em>'.
	 * @see org.eclipse.pmf.pim.Validator
	 * @generated
	 */
	EClass getValidator();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ViewProfile <em>View Profile</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>View Profile</em>'.
	 * @see org.eclipse.pmf.pim.ViewProfile
	 * @generated
	 */
	EClass getViewProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.ViewProfile#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.pmf.pim.ViewProfile#getChildren()
	 * @see #getViewProfile()
	 * @generated
	 */
	EReference getViewProfile_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.PMFObject <em>Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.eclipse.pmf.pim.PMFObject
	 * @generated
	 */
	EClass getPMFObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.PMFObject#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.pmf.pim.PMFObject#getName()
	 * @see #getPMFObject()
	 * @generated
	 */
	EAttribute getPMFObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.PMFObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.pmf.pim.PMFObject#getDescription()
	 * @see #getPMFObject()
	 * @generated
	 */
	EAttribute getPMFObject_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.PMFObject#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.pmf.pim.PMFObject#getId()
	 * @see #getPMFObject()
	 * @generated
	 */
	EAttribute getPMFObject_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Sorter <em>Sorter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorter</em>'.
	 * @see org.eclipse.pmf.pim.Sorter
	 * @generated
	 */
	EClass getSorter();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.pmf.pim.Sorter#getProperty <em>Property</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.pmf.pim.Sorter#getProperty()
	 * @see #getSorter()
	 * @generated
	 */
	EReference getSorter_Property();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.Sorter#getDirection <em>Direction</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.pmf.pim.Sorter#getDirection()
	 * @see #getSorter()
	 * @generated
	 */
	EAttribute getSorter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.Sorter#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.eclipse.pmf.pim.Sorter#getComparator()
	 * @see #getSorter()
	 * @generated
	 */
	EAttribute getSorter_Comparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataInheritance <em>Data Inheritance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Inheritance</em>'.
	 * @see org.eclipse.pmf.pim.DataInheritance
	 * @generated
	 */
	EClass getDataInheritance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.DataAssocication <em>Data Assocication</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Assocication</em>'.
	 * @see org.eclipse.pmf.pim.DataAssocication
	 * @generated
	 */
	EClass getDataAssocication();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Library <em>Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.eclipse.pmf.pim.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Library#getViewProfiles <em>View Profiles</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Profiles</em>'.
	 * @see org.eclipse.pmf.pim.Library#getViewProfiles()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ViewProfiles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Library#getSystemActions <em>System Actions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Actions</em>'.
	 * @see org.eclipse.pmf.pim.Library#getSystemActions()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_SystemActions();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.Library#getCommands <em>Commands</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Commands</em>'.
	 * @see org.eclipse.pmf.pim.Library#getCommands()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Library#getConverters <em>Converters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Converters</em>'.
	 * @see org.eclipse.pmf.pim.Library#getConverters()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Converters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Library#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validators</em>'.
	 * @see org.eclipse.pmf.pim.Library#getValidators()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Validators();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.pmf.pim.Library#getTypes <em>Types</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Types</em>'.
	 * @see org.eclipse.pmf.pim.Library#getTypes()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Types();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.pmf.pim.Library#getDataFormFolders
	 * <em>Data Form Folders</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>Data Form Folders</em>'.
	 * @see org.eclipse.pmf.pim.Library#getDataFormFolders()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_DataFormFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Library#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see org.eclipse.pmf.pim.Library#getImages()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Images();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.pmf.pim.Library#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Events</em>'.
	 * @see org.eclipse.pmf.pim.Library#getEvents()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.RegexValidator <em>Regex Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Validator</em>'.
	 * @see org.eclipse.pmf.pim.RegexValidator
	 * @generated
	 */
	EClass getRegexValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.RegexValidator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.pmf.pim.RegexValidator#getExpression()
	 * @see #getRegexValidator()
	 * @generated
	 */
	EAttribute getRegexValidator_Expression();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EClass To Event Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass To Event Entry Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EClass"
	 *        valueType="org.eclipse.pmf.pim.ui.UIEvent" valueContainment="true" valueRequired="true" valueMany="true"
	 * @generated
	 */
	EClass getEClassToEventEntryMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEClassToEventEntryMap()
	 * @generated
	 */
	EReference getEClassToEventEntryMap_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEClassToEventEntryMap()
	 * @generated
	 */
	EReference getEClassToEventEntryMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see org.eclipse.pmf.pim.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.Authentication#isShowLostPassword <em>Show Lost Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lost Password</em>'.
	 * @see org.eclipse.pmf.pim.Authentication#isShowLostPassword()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ShowLostPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.Authentication#isRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see org.eclipse.pmf.pim.Authentication#isRegistration()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Registration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.Authentication#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.eclipse.pmf.pim.Authentication#isAnonymous()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Anonymous();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see org.eclipse.pmf.pim.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.Wizard#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.pmf.pim.Wizard#getDataType()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.Wizard#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.pmf.pim.Wizard#getCategory()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.Wizard#getWizardPages <em>Wizard Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wizard Pages</em>'.
	 * @see org.eclipse.pmf.pim.Wizard#getWizardPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_WizardPages();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.SortingDirection <em>Sorting Direction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Direction</em>'.
	 * @see org.eclipse.pmf.pim.SortingDirection
	 * @generated
	 */
	EEnum getSortingDirection();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PMFFactory getPMFFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataFormImpl <em>Data Form</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataFormImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataForm()
		 * @generated
		 */
		EClass DATA_FORM = eINSTANCE.getDataForm();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl <em>Elemental Data Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ElementalDataFormImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getElementalDataForm()
		 * @generated
		 */
		EClass ELEMENTAL_DATA_FORM = eINSTANCE.getElementalDataForm();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTAL_DATA_FORM__VALIDATORS = eINSTANCE
				.getElementalDataForm_Validators();

		/**
		 * The meta object literal for the '<em><b>Local Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS = eINSTANCE
				.getElementalDataForm_LocalValidators();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTAL_DATA_FORM__CHILDREN = eINSTANCE
				.getElementalDataForm_Children();

		/**
		 * The meta object literal for the '<em><b>View Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTAL_DATA_FORM__VIEW_PROFILES = eINSTANCE
				.getElementalDataForm_ViewProfiles();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTAL_DATA_FORM__LAYOUT = eINSTANCE
				.getElementalDataForm_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.CompositeDataFormImpl <em>Composite Data Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.CompositeDataFormImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getCompositeDataForm()
		 * @generated
		 */
		EClass COMPOSITE_DATA_FORM = eINSTANCE.getCompositeDataForm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_FORM__ELEMENTS = eINSTANCE
				.getCompositeDataForm_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataFormSelectorImpl <em>Data Form Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataFormSelectorImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataFormSelector()
		 * @generated
		 */
		EClass DATA_FORM_SELECTOR = eINSTANCE.getDataFormSelector();

		/**
		 * The meta object literal for the '<em><b>UI Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM_SELECTOR__UI_MODE = eINSTANCE
				.getDataFormSelector_UIMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataFieldImpl <em>Data Field</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataFieldImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataElementImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Data Context Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__DATA_CONTEXT_TYPE = eINSTANCE
				.getDataElement_DataContextType();

		/**
		 * The meta object literal for the '<em><b>Data Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__DATA_BINDING = eINSTANCE
				.getDataElement_DataBinding();

		/**
		 * The meta object literal for the '
		 * <em><b>Resolved Target Context Type</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE = eINSTANCE
				.getDataElement_ResolvedTargetContextType();

		/**
		 * The meta object literal for the '
		 * <em><b>Resolved Data Context Type</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE = eINSTANCE
				.getDataElement_ResolvedDataContextType();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__CHANGEABLE = eINSTANCE
				.getDataElement_Changeable();

		/**
		 * The meta object literal for the '<em><b>Property Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__PROPERTY_CHANGED = eINSTANCE
				.getDataElement_PropertyChanged();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__CONTROL = eINSTANCE.getDataElement_Control();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataCollectionImpl <em>Data Collection</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataCollectionImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataCollection()
		 * @generated
		 */
		EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

		/**
		 * The meta object literal for the '<em><b>Add New</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__ADD_NEW = eINSTANCE
				.getDataCollection_AddNew();

		/**
		 * The meta object literal for the '<em><b>Removable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__REMOVABLE = eINSTANCE
				.getDataCollection_Removable();

		/**
		 * The meta object literal for the '<em><b>Reorderable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__REORDERABLE = eINSTANCE
				.getDataCollection_Reorderable();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTION__EDITABLE = eINSTANCE
				.getDataCollection_Editable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__COLUMNS = eINSTANCE
				.getDataCollection_Columns();

		/**
		 * The meta object literal for the '<em><b>Sorters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__SORTERS = eINSTANCE
				.getDataCollection_Sorters();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__EDITOR = eINSTANCE
				.getDataCollection_Editor();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__DETAIL = eINSTANCE
				.getDataCollection_Detail();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ApplicationImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MAIN = eINSTANCE.getApplication_Main();

		/**
		 * The meta object literal for the '<em><b>Data Model Managers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DATA_MODEL_MANAGERS = eINSTANCE
				.getApplication_DataModelManagers();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LIBRARIES = eINSTANCE
				.getApplication_Libraries();

		/**
		 * The meta object literal for the '<em><b>All View Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_VIEW_PROFILES = eINSTANCE
				.getApplication_AllViewProfiles();

		/**
		 * The meta object literal for the '<em><b>All System Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_SYSTEM_ACTIONS = eINSTANCE
				.getApplication_AllSystemActions();

		/**
		 * The meta object literal for the '<em><b>All Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_COMMANDS = eINSTANCE
				.getApplication_AllCommands();

		/**
		 * The meta object literal for the '<em><b>All Converters</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_CONVERTERS = eINSTANCE
				.getApplication_AllConverters();

		/**
		 * The meta object literal for the '<em><b>All Validators</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_VALIDATORS = eINSTANCE
				.getApplication_AllValidators();

		/**
		 * The meta object literal for the '<em><b>All Types</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_TYPES = eINSTANCE.getApplication_AllTypes();

		/**
		 * The meta object literal for the '<em><b>All Images</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ALL_IMAGES = eINSTANCE
				.getApplication_AllImages();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__AUTHENTICATION = eINSTANCE
				.getApplication_Authentication();

		/**
		 * The meta object literal for the '<em><b>Mandatory Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MANDATORY_FIELD = eINSTANCE
				.getApplication_MandatoryField();

		/**
		 * The meta object literal for the '<em><b>Wizards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__WIZARDS = eINSTANCE.getApplication_Wizards();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataCompositeImpl <em>Data Composite</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataCompositeImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataComposite()
		 * @generated
		 */
		EClass DATA_COMPOSITE = eINSTANCE.getDataComposite();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COMPOSITE__ITEMS = eINSTANCE.getDataComposite_Items();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataGroupImpl <em>Data Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataGroupImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataGroup()
		 * @generated
		 */
		EClass DATA_GROUP = eINSTANCE.getDataGroup();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GROUP__LAYOUT = eINSTANCE.getDataGroup_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataItemImpl <em>Data Item</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataItemImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM__MANDATORY = eINSTANCE.getDataItem_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__LABEL = eINSTANCE.getDataItem_Label();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__HELP = eINSTANCE.getDataItem_Help();

		/**
		 * The meta object literal for the '<em><b>Layout Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__LAYOUT_DATA = eINSTANCE.getDataItem_LayoutData();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataReferenceImpl <em>Data Reference</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataReferenceImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataReference()
		 * @generated
		 */
		EClass DATA_REFERENCE = eINSTANCE.getDataReference();

		/**
		 * The meta object literal for the '<em><b>Data Form</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REFERENCE__DATA_FORM = eINSTANCE
				.getDataReference_DataForm();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REFERENCE__DATA_TYPE = eINSTANCE
				.getDataReference_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.UIObjectImpl <em>UI Object</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.UIObjectImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getUIObject()
		 * @generated
		 */
		EClass UI_OBJECT = eINSTANCE.getUIObject();

		/**
		 * The meta object literal for the '<em><b>View ID</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_OBJECT__VIEW_ID = eINSTANCE.getUIObject_ViewID();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_OBJECT__VISIBLE = eINSTANCE.getUIObject_Visible();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_OBJECT__ENABLED = eINSTANCE.getUIObject_Enabled();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference UI_OBJECT__TRIGGERS = eINSTANCE.getUIObject_Triggers();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.CommandImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ActionImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.SystemActionImpl <em>System Action</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.SystemActionImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSystemAction()
		 * @generated
		 */
		EClass SYSTEM_ACTION = eINSTANCE.getSystemAction();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ACTION__COMMANDS = eINSTANCE
				.getSystemAction_Commands();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ApplicationActionImpl <em>Application Action</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ApplicationActionImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getApplicationAction()
		 * @generated
		 */
		EClass APPLICATION_ACTION = eINSTANCE.getApplicationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataFormFolderImpl <em>Data Form Folder</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataFormFolderImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataFormFolder()
		 * @generated
		 */
		EClass DATA_FORM_FOLDER = eINSTANCE.getDataFormFolder();

		/**
		 * The meta object literal for the '<em><b>Data Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_FORM_FOLDER__DATA_FORMS = eINSTANCE
				.getDataFormFolder_DataForms();

		/**
		 * The meta object literal for the '<em><b>Default Data Form</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FORM_FOLDER__DEFAULT_DATA_FORM = eINSTANCE
				.getDataFormFolder_DefaultDataForm();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.impl.TypeToDataFormFolderEntryMapImpl
		 * <em>Type To Data Form Folder Entry Map</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.impl.TypeToDataFormFolderEntryMapImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getTypeToDataFormFolderEntryMap()
		 * @generated
		 */
		EClass TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP = eINSTANCE
				.getTypeToDataFormFolderEntryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__KEY = eINSTANCE
				.getTypeToDataFormFolderEntryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__VALUE = eINSTANCE
				.getTypeToDataFormFolderEntryMap_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.pmf.pim.impl.PMFImpl <em>PMF</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.pmf.pim.impl.PMFImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getPMF()
		 * @generated
		 */
		EClass PMF = eINSTANCE.getPMF();

		/**
		 * The meta object literal for the '<em><b>Model Manager Factories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMF__MODEL_MANAGER_FACTORIES = eINSTANCE
				.getPMF_ModelManagerFactories();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataModelManagerFactoryImpl <em>Data Model Manager Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataModelManagerFactoryImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataModelManagerFactory()
		 * @generated
		 */
		EClass DATA_MODEL_MANAGER_FACTORY = eINSTANCE
				.getDataModelManagerFactory();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataConverterImpl <em>Data Converter</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataConverterImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataConverter()
		 * @generated
		 */
		EClass DATA_CONVERTER = eINSTANCE.getDataConverter();

		/**
		 * The meta object literal for the '<em><b>From Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONVERTER__FROM_TYPE = eINSTANCE
				.getDataConverter_FromType();

		/**
		 * The meta object literal for the '<em><b>To Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONVERTER__TO_TYPE = eINSTANCE
				.getDataConverter_ToType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ValidatorImpl <em>Validator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ValidatorImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getValidator()
		 * @generated
		 */
		EClass VALIDATOR = eINSTANCE.getValidator();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.ViewProfileImpl <em>View Profile</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.ViewProfileImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getViewProfile()
		 * @generated
		 */
		EClass VIEW_PROFILE = eINSTANCE.getViewProfile();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PROFILE__CHILDREN = eINSTANCE.getViewProfile_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.PMFObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.PMFObjectImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getPMFObject()
		 * @generated
		 */
		EClass PMF_OBJECT = eINSTANCE.getPMFObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMF_OBJECT__NAME = eINSTANCE.getPMFObject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMF_OBJECT__DESCRIPTION = eINSTANCE
				.getPMFObject_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMF_OBJECT__ID = eINSTANCE.getPMFObject_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.SorterImpl <em>Sorter</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.SorterImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSorter()
		 * @generated
		 */
		EClass SORTER = eINSTANCE.getSorter();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTER__PROPERTY = eINSTANCE.getSorter_Property();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTER__DIRECTION = eINSTANCE.getSorter_Direction();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTER__COMPARATOR = eINSTANCE.getSorter_Comparator();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataInheritanceImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataInheritance()
		 * @generated
		 */
		EClass DATA_INHERITANCE = eINSTANCE.getDataInheritance();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.DataAssocicationImpl <em>Data Assocication</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.DataAssocicationImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getDataAssocication()
		 * @generated
		 */
		EClass DATA_ASSOCICATION = eINSTANCE.getDataAssocication();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.LibraryImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>View Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__VIEW_PROFILES = eINSTANCE.getLibrary_ViewProfiles();

		/**
		 * The meta object literal for the '<em><b>System Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__SYSTEM_ACTIONS = eINSTANCE
				.getLibrary_SystemActions();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__COMMANDS = eINSTANCE.getLibrary_Commands();

		/**
		 * The meta object literal for the '<em><b>Converters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__CONVERTERS = eINSTANCE.getLibrary_Converters();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__VALIDATORS = eINSTANCE.getLibrary_Validators();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TYPES = eINSTANCE.getLibrary_Types();

		/**
		 * The meta object literal for the '<em><b>Data Form Folders</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__DATA_FORM_FOLDERS = eINSTANCE
				.getLibrary_DataFormFolders();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__IMAGES = eINSTANCE.getLibrary_Images();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__EVENTS = eINSTANCE.getLibrary_Events();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.RegexValidatorImpl <em>Regex Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.RegexValidatorImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getRegexValidator()
		 * @generated
		 */
		EClass REGEX_VALIDATOR = eINSTANCE.getRegexValidator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_VALIDATOR__EXPRESSION = eINSTANCE
				.getRegexValidator_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl <em>EClass To Event Entry Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getEClassToEventEntryMap()
		 * @generated
		 */
		EClass ECLASS_TO_EVENT_ENTRY_MAP = eINSTANCE.getEClassToEventEntryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_TO_EVENT_ENTRY_MAP__KEY = eINSTANCE
				.getEClassToEventEntryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_TO_EVENT_ENTRY_MAP__VALUE = eINSTANCE
				.getEClassToEventEntryMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.AuthenticationImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Show Lost Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__SHOW_LOST_PASSWORD = eINSTANCE
				.getAuthentication_ShowLostPassword();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__REGISTRATION = eINSTANCE
				.getAuthentication_Registration();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__ANONYMOUS = eINSTANCE
				.getAuthentication_Anonymous();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.impl.WizardImpl
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__DATA_TYPE = eINSTANCE.getWizard_DataType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__CATEGORY = eINSTANCE.getWizard_Category();

		/**
		 * The meta object literal for the '<em><b>Wizard Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__WIZARD_PAGES = eINSTANCE.getWizard_WizardPages();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.SortingDirection <em>Sorting Direction</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.SortingDirection
		 * @see org.eclipse.pmf.pim.impl.PMFPackageImpl#getSortingDirection()
		 * @generated
		 */
		EEnum SORTING_DIRECTION = eINSTANCE.getSortingDirection();

	}

} // PMFPackage
