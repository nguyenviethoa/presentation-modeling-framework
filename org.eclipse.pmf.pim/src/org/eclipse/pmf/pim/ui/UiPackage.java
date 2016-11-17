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
package org.eclipse.pmf.pim.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.pmf.pim.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = org.eclipse.pmf.pim.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl <em>UI Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.UIElementImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getUIElement()
	 * @generated
	 */
	int UI_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__NAME = PMFPackage.UI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__DESCRIPTION = PMFPackage.UI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ID = PMFPackage.UI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__VIEW_ID = PMFPackage.UI_OBJECT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__VISIBLE = PMFPackage.UI_OBJECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ENABLED = PMFPackage.UI_OBJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__TRIGGERS = PMFPackage.UI_OBJECT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__FOREGROUND = PMFPackage.UI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__BACKGROUND = PMFPackage.UI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__FONT = PMFPackage.UI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__TOOL_TIP = PMFPackage.UI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_FEATURE_COUNT = PMFPackage.UI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ControlImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>Control</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.TextImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__MODIFY = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ContainerImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.StackPanelImpl <em>Stack Panel</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.StackPanelImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getStackPanel()
	 * @generated
	 */
	int STACK_PANEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__VIEW_ID = CONTAINER__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__VISIBLE = CONTAINER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__TRIGGERS = CONTAINER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__FOREGROUND = CONTAINER__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__BACKGROUND = CONTAINER__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__FONT = CONTAINER__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__TOOL_TIP = CONTAINER__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The number of structural features of the '<em>Stack Panel</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PANEL_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.SeparatorImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__ORIENTATION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Separator</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.LabelImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__IMAGE = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ImageImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Image</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.WindowImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ButtonImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl <em>Group Box</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.GroupBoxImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGroupBox()
	 * @generated
	 */
	int GROUP_BOX = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.BooleanButtonImpl <em>Boolean Button</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.BooleanButtonImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getBooleanButton()
	 * @generated
	 */
	int BOOLEAN_BUTTON = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.SelectorImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ListViewImpl <em>List View</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ListViewImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getListView()
	 * @generated
	 */
	int LIST_VIEW = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.FinderImpl <em>Finder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.FinderImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFinder()
	 * @generated
	 */
	int FINDER = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ViewPartImpl <em>View Part</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ViewPartImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getViewPart()
	 * @generated
	 */
	int VIEW_PART = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.SashFromImpl <em>Sash From</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.SashFromImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSashFrom()
	 * @generated
	 */
	int SASH_FROM = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.UIEventImpl <em>UI Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.UIEventImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getUIEvent()
	 * @generated
	 */
	int UI_EVENT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ColorImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.FontImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.PartImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPart()
	 * @generated
	 */
	int PART = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>Part</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.PageImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = PART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VIEW_ID = PART__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VISIBLE = PART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ENABLED = PART__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TRIGGERS = PART__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FOREGROUND = PART__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BACKGROUND = PART__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FONT = PART__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOL_TIP = PART__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Transaction Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TRANSACTION_EDITION = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENT = PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__DESCRIPTION = PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = PAGE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__VIEW_ID = PAGE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__VISIBLE = PAGE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__ENABLED = PAGE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TRIGGERS = PAGE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__FOREGROUND = PAGE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BACKGROUND = PAGE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__FONT = PAGE__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TOOL_TIP = PAGE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Transaction Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TRANSACTION_EDITION = PAGE__TRANSACTION_EDITION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CONTENT = PAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__TITLE = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__OPEN = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Close</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW__CLOSE = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Window</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = PAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON__SELECTION = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.ComboImpl <em>Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.ComboImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getCombo()
	 * @generated
	 */
	int COMBO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__VIEW_ID = CONTAINER__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__VISIBLE = CONTAINER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__TRIGGERS = CONTAINER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__FOREGROUND = CONTAINER__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__BACKGROUND = CONTAINER__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__FONT = CONTAINER__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__TOOL_TIP = CONTAINER__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__TITLE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__COLLAPSIBLE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collapse</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__COLLAPSE = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expand</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX__EXPAND = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group Box</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__DESCRIPTION = BUTTON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__VIEW_ID = BUTTON__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__VISIBLE = BUTTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__TRIGGERS = BUTTON__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__FOREGROUND = BUTTON__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__BACKGROUND = BUTTON__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__FONT = BUTTON__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__TOOL_TIP = BUTTON__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__SELECTION = BUTTON__SELECTION;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__IMAGE = BUTTON__IMAGE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON__SELECTED = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Button</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR__SELECTION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>List View</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__NAME = WINDOW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__DESCRIPTION = WINDOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__ID = WINDOW__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__VIEW_ID = WINDOW__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__VISIBLE = WINDOW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__ENABLED = WINDOW__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__TRIGGERS = WINDOW__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__FOREGROUND = WINDOW__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__BACKGROUND = WINDOW__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__FONT = WINDOW__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__TOOL_TIP = WINDOW__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Transaction Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__TRANSACTION_EDITION = WINDOW__TRANSACTION_EDITION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__CONTENT = WINDOW__CONTENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__TITLE = WINDOW__TITLE;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__OPEN = WINDOW__OPEN;

	/**
	 * The feature id for the '<em><b>Close</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER__CLOSE = WINDOW__CLOSE;

	/**
	 * The number of structural features of the '<em>Finder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINDER_FEATURE_COUNT = WINDOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.MenuItemImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__DATA_INPUT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Form</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART__DATA_FORM = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Part</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_PART_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__VIEW_ID = CONTAINER__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__VISIBLE = CONTAINER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__TRIGGERS = CONTAINER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__FOREGROUND = CONTAINER__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__BACKGROUND = CONTAINER__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__FONT = CONTAINER__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__TOOL_TIP = CONTAINER__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM__ORIENTATION = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sash From</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SASH_FROM_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>UI Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 0;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 2;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLOR__OPACITY = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FONT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FONT__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Font</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.PropertiesPartImpl <em>Properties Part</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.PropertiesPartImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPropertiesPart()
	 * @generated
	 */
	int PROPERTIES_PART = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__DESCRIPTION = PART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__VIEW_ID = PART__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__VISIBLE = PART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__ENABLED = PART__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__TRIGGERS = PART__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__FOREGROUND = PART__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__BACKGROUND = PART__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__FONT = PART__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__TOOL_TIP = PART__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__TABS = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART__DATA_TYPE = PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Properties Part</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_PART_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.PropertyTabImpl <em>Property Tab</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.PropertyTabImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPropertyTab()
	 * @generated
	 */
	int PROPERTY_TAB = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__CONTENT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Tab</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.TabImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = PMFPackage.PMF_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DESCRIPTION = PMFPackage.PMF_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ID = PMFPackage.PMF_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = PMFPackage.PMF_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.TabSetImpl <em>Tab Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.TabSetImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTabSet()
	 * @generated
	 */
	int TAB_SET = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__VIEW_ID = CONTAINER__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__VISIBLE = CONTAINER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__ENABLED = CONTAINER__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__TRIGGERS = CONTAINER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__FOREGROUND = CONTAINER__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__BACKGROUND = CONTAINER__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__FONT = CONTAINER__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__TOOL_TIP = CONTAINER__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The number of structural features of the '<em>Tab Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.TableImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.RichTextImpl <em>Rich Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.RichTextImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getRichText()
	 * @generated
	 */
	int RICH_TEXT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__NAME = TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__DESCRIPTION = TEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ID = TEXT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__VIEW_ID = TEXT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__VISIBLE = TEXT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ENABLED = TEXT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TRIGGERS = TEXT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FOREGROUND = TEXT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BACKGROUND = TEXT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FONT = TEXT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TOOL_TIP = TEXT__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT = TEXT__TEXT;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__MODIFY = TEXT__MODIFY;

	/**
	 * The number of structural features of the '<em>Rich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.DateTimePickerImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getDateTimePicker()
	 * @generated
	 */
	int DATE_TIME_PICKER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__VIEW_ID = CONTROL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__VISIBLE = CONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__ENABLED = CONTROL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__TRIGGERS = CONTROL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__FOREGROUND = CONTROL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__BACKGROUND = CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__FONT = CONTROL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__TOOL_TIP = CONTROL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Date Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__DATE_ONLY = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.HyperlinkImpl <em>Hyperlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.HyperlinkImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getHyperlink()
	 * @generated
	 */
	int HYPERLINK = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__NAME = LABEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__DESCRIPTION = LABEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__ID = LABEL__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__VIEW_ID = LABEL__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__VISIBLE = LABEL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__ENABLED = LABEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__TRIGGERS = LABEL__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__FOREGROUND = LABEL__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__BACKGROUND = LABEL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__FONT = LABEL__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__TOOL_TIP = LABEL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__TEXT = LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__IMAGE = LABEL__IMAGE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK__URL = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hyperlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.WizardPageImpl <em>Wizard Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.WizardPageImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getWizardPage()
	 * @generated
	 */
	int WIZARD_PAGE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__DESCRIPTION = PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__ID = PAGE__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__VIEW_ID = PAGE__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__VISIBLE = PAGE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__ENABLED = PAGE__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TRIGGERS = PAGE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__FOREGROUND = PAGE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__BACKGROUND = PAGE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__FONT = PAGE__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TOOL_TIP = PAGE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Transaction Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TRANSACTION_EDITION = PAGE__TRANSACTION_EDITION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CONTENT = PAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Binding Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__BINDING_PATH = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wizard Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.MessageDialogImpl <em>Message Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.MessageDialogImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getMessageDialog()
	 * @generated
	 */
	int MESSAGE_DIALOG = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__VIEW_ID = UI_ELEMENT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__VISIBLE = UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__ENABLED = UI_ELEMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__TRIGGERS = UI_ELEMENT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__FOREGROUND = UI_ELEMENT__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__BACKGROUND = UI_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__FONT = UI_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__TOOL_TIP = UI_ELEMENT__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__MESSAGE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG__MESSAGE_TYPE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DIALOG_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.RadioButtonImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__DESCRIPTION = BUTTON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VIEW_ID = BUTTON__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VISIBLE = BUTTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ENABLED = BUTTON__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TRIGGERS = BUTTON__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__FOREGROUND = BUTTON__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUND = BUTTON__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__FONT = BUTTON__FONT;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TOOL_TIP = BUTTON__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SELECTION = BUTTON__SELECTION;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__IMAGE = BUTTON__IMAGE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SELECTED = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.LayoutImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = PMFPackage.UI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__DESCRIPTION = PMFPackage.UI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ID = PMFPackage.UI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VIEW_ID = PMFPackage.UI_OBJECT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VISIBLE = PMFPackage.UI_OBJECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ENABLED = PMFPackage.UI_OBJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TRIGGERS = PMFPackage.UI_OBJECT__TRIGGERS;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = PMFPackage.UI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.GridLayoutImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGridLayout()
	 * @generated
	 */
	int GRID_LAYOUT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__DESCRIPTION = LAYOUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__ID = LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__VIEW_ID = LAYOUT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__VISIBLE = LAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__ENABLED = LAYOUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__TRIGGERS = LAYOUT__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NUM_COLUMNS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__HORIZONTAL_SPACING = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__VERTICAL_SPACING = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.LayoutDataImpl <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.LayoutDataImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLayoutData()
	 * @generated
	 */
	int LAYOUT_DATA = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__NAME = PMFPackage.UI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__DESCRIPTION = PMFPackage.UI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__ID = PMFPackage.UI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__VIEW_ID = PMFPackage.UI_OBJECT__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__VISIBLE = PMFPackage.UI_OBJECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__ENABLED = PMFPackage.UI_OBJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__TRIGGERS = PMFPackage.UI_OBJECT__TRIGGERS;

	/**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_FEATURE_COUNT = PMFPackage.UI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl <em>Grid Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.impl.GridDataImpl
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGridData()
	 * @generated
	 */
	int GRID_DATA = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__NAME = LAYOUT_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__DESCRIPTION = LAYOUT_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__ID = LAYOUT_DATA__ID;

	/**
	 * The feature id for the '<em><b>View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VIEW_ID = LAYOUT_DATA__VIEW_ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VISIBLE = LAYOUT_DATA__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__ENABLED = LAYOUT_DATA__ENABLED;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__TRIGGERS = LAYOUT_DATA__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__HORIZONTAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VERTICAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__HORIZONTAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__VERTICAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Grid Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.Orientation
	 * <em>Orientation</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.ui.Orientation
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.FontStyle
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.DialogMessageType <em>Dialog Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.DialogMessageType
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getDialogMessageType()
	 * @generated
	 */
	int DIALOG_MESSAGE_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData <em>Horizontal Alignment Grid Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getHorizontalAlignmentGridData()
	 * @generated
	 */
	int HORIZONTAL_ALIGNMENT_GRID_DATA = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.ui.VerticalAlignmentGridData <em>Vertical Alignment Grid Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pmf.pim.ui.VerticalAlignmentGridData
	 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getVerticalAlignmentGridData()
	 * @generated
	 */
	int VERTICAL_ALIGNMENT_GRID_DATA = 43;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Text <em>Text</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.pmf.pim.ui.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Text#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.pmf.pim.ui.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Text#getModify <em>Modify</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Modify</em>'.
	 * @see org.eclipse.pmf.pim.ui.Text#getModify()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Modify();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.StackPanel <em>Stack Panel</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stack Panel</em>'.
	 * @see org.eclipse.pmf.pim.ui.StackPanel
	 * @generated
	 */
	EClass getStackPanel();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.Separator <em>Separator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see org.eclipse.pmf.pim.ui.Separator
	 * @generated
	 */
	EClass getSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.Separator#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.pmf.pim.ui.Separator#getOrientation()
	 * @see #getSeparator()
	 * @generated
	 */
	EAttribute getSeparator_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Label <em>Label</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.pmf.pim.ui.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Label#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.pmf.pim.ui.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.Label#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.eclipse.pmf.pim.ui.Label#getImage()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Image <em>Image</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.pmf.pim.ui.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Window <em>Window</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see org.eclipse.pmf.pim.ui.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Window#getTitle <em>Title</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.pmf.pim.ui.Window#getTitle()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Title();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Window#getOpen <em>Open</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see org.eclipse.pmf.pim.ui.Window#getOpen()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Open();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Window#getClose <em>Close</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Close</em>'.
	 * @see org.eclipse.pmf.pim.ui.Window#getClose()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Close();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Button <em>Button</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.pmf.pim.ui.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Button#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.pmf.pim.ui.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.Button#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.pmf.pim.ui.Button#getSelection()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Selection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.Button#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.eclipse.pmf.pim.ui.Button#getImage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Combo <em>Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo</em>'.
	 * @see org.eclipse.pmf.pim.ui.Combo
	 * @generated
	 */
	EClass getCombo();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.GroupBox <em>Group Box</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Group Box</em>'.
	 * @see org.eclipse.pmf.pim.ui.GroupBox
	 * @generated
	 */
	EClass getGroupBox();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.ui.GroupBox#getTitle <em>Title</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.eclipse.pmf.pim.ui.GroupBox#getTitle()
	 * @see #getGroupBox()
	 * @generated
	 */
	EReference getGroupBox_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GroupBox#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see org.eclipse.pmf.pim.ui.GroupBox#isCollapsible()
	 * @see #getGroupBox()
	 * @generated
	 */
	EAttribute getGroupBox_Collapsible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GroupBox#getCollapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapse</em>'.
	 * @see org.eclipse.pmf.pim.ui.GroupBox#getCollapse()
	 * @see #getGroupBox()
	 * @generated
	 */
	EAttribute getGroupBox_Collapse();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.GroupBox#getExpand <em>Expand</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expand</em>'.
	 * @see org.eclipse.pmf.pim.ui.GroupBox#getExpand()
	 * @see #getGroupBox()
	 * @generated
	 */
	EAttribute getGroupBox_Expand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.BooleanButton <em>Boolean Button</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Button</em>'.
	 * @see org.eclipse.pmf.pim.ui.BooleanButton
	 * @generated
	 */
	EClass getBooleanButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.BooleanButton#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.eclipse.pmf.pim.ui.BooleanButton#isSelected()
	 * @see #getBooleanButton()
	 * @generated
	 */
	EAttribute getBooleanButton_Selected();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.Selector <em>Selector</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see org.eclipse.pmf.pim.ui.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.Selector#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.pmf.pim.ui.Selector#getSelection()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Selection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Control <em>Control</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.eclipse.pmf.pim.ui.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.ListView <em>List View</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List View</em>'.
	 * @see org.eclipse.pmf.pim.ui.ListView
	 * @generated
	 */
	EClass getListView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Finder <em>Finder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finder</em>'.
	 * @see org.eclipse.pmf.pim.ui.Finder
	 * @generated
	 */
	EClass getFinder();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.UIElement <em>UI Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UI Element</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIElement
	 * @generated
	 */
	EClass getUIElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ui.UIElement#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIElement#getForeground()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Foreground();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ui.UIElement#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIElement#getBackground()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Background();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.pmf.pim.ui.UIElement#getFont <em>Font</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIElement#getFont()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ui.UIElement#getToolTip <em>Tool Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool Tip</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIElement#getToolTip()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_ToolTip();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see org.eclipse.pmf.pim.ui.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.Container <em>Container</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.pmf.pim.ui.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.ui.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.pmf.pim.ui.Container#getChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Children();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.ViewPart <em>View Part</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>View Part</em>'.
	 * @see org.eclipse.pmf.pim.ui.ViewPart
	 * @generated
	 */
	EClass getViewPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ui.ViewPart#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Input</em>'.
	 * @see org.eclipse.pmf.pim.ui.ViewPart#getDataInput()
	 * @see #getViewPart()
	 * @generated
	 */
	EReference getViewPart_DataInput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.ViewPart#getDataForm <em>Data Form</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Form</em>'.
	 * @see org.eclipse.pmf.pim.ui.ViewPart#getDataForm()
	 * @see #getViewPart()
	 * @generated
	 */
	EReference getViewPart_DataForm();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.SashFrom <em>Sash From</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sash From</em>'.
	 * @see org.eclipse.pmf.pim.ui.SashFrom
	 * @generated
	 */
	EClass getSashFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.SashFrom#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.pmf.pim.ui.SashFrom#getOrientation()
	 * @see #getSashFrom()
	 * @generated
	 */
	EAttribute getSashFrom_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.UIEvent <em>UI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Event</em>'.
	 * @see org.eclipse.pmf.pim.ui.UIEvent
	 * @generated
	 */
	EClass getUIEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Color <em>Color</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.eclipse.pmf.pim.ui.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Color#getRed <em>Red</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.pmf.pim.ui.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Color#getBlue <em>Blue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.pmf.pim.ui.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Color#getGreen <em>Green</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.pmf.pim.ui.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Color#getOpacity <em>Opacity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.eclipse.pmf.pim.ui.Color#getOpacity()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Opacity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Font <em>Font</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.eclipse.pmf.pim.ui.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Font#getSize <em>Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.pmf.pim.ui.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Font#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.pmf.pim.ui.Font#getName()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.pmf.pim.ui.Font#getStyle <em>Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.pmf.pim.ui.Font#getStyle()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Part <em>Part</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.eclipse.pmf.pim.ui.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.PropertiesPart <em>Properties Part</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Part</em>'.
	 * @see org.eclipse.pmf.pim.ui.PropertiesPart
	 * @generated
	 */
	EClass getPropertiesPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pmf.pim.ui.PropertiesPart#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.eclipse.pmf.pim.ui.PropertiesPart#getTabs()
	 * @see #getPropertiesPart()
	 * @generated
	 */
	EReference getPropertiesPart_Tabs();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.PropertiesPart#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.pmf.pim.ui.PropertiesPart#getDataType()
	 * @see #getPropertiesPart()
	 * @generated
	 */
	EReference getPropertiesPart_DataType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.pmf.pim.ui.PropertyTab <em>Property Tab</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Tab</em>'.
	 * @see org.eclipse.pmf.pim.ui.PropertyTab
	 * @generated
	 */
	EClass getPropertyTab();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.PropertyTab#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.eclipse.pmf.pim.ui.PropertyTab#getContent()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EReference getPropertyTab_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see org.eclipse.pmf.pim.ui.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.TabSet <em>Tab Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Set</em>'.
	 * @see org.eclipse.pmf.pim.ui.TabSet
	 * @generated
	 */
	EClass getTabSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.pmf.pim.ui.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.RichText <em>Rich Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text</em>'.
	 * @see org.eclipse.pmf.pim.ui.RichText
	 * @generated
	 */
	EClass getRichText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.DateTimePicker <em>Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Picker</em>'.
	 * @see org.eclipse.pmf.pim.ui.DateTimePicker
	 * @generated
	 */
	EClass getDateTimePicker();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.DateTimePicker#isDateOnly <em>Date Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Only</em>'.
	 * @see org.eclipse.pmf.pim.ui.DateTimePicker#isDateOnly()
	 * @see #getDateTimePicker()
	 * @generated
	 */
	EAttribute getDateTimePicker_DateOnly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Hyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyperlink</em>'.
	 * @see org.eclipse.pmf.pim.ui.Hyperlink
	 * @generated
	 */
	EClass getHyperlink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.Hyperlink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.pmf.pim.ui.Hyperlink#getUrl()
	 * @see #getHyperlink()
	 * @generated
	 */
	EAttribute getHyperlink_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.eclipse.pmf.pim.ui.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.Page#isTransactionEdition <em>Transaction Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Edition</em>'.
	 * @see org.eclipse.pmf.pim.ui.Page#isTransactionEdition()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TransactionEdition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pmf.pim.ui.Page#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.eclipse.pmf.pim.ui.Page#getContent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.WizardPage <em>Wizard Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Page</em>'.
	 * @see org.eclipse.pmf.pim.ui.WizardPage
	 * @generated
	 */
	EClass getWizardPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.pmf.pim.ui.WizardPage#getBindingPath <em>Binding Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Path</em>'.
	 * @see org.eclipse.pmf.pim.ui.WizardPage#getBindingPath()
	 * @see #getWizardPage()
	 * @generated
	 */
	EReference getWizardPage_BindingPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.MessageDialog <em>Message Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Dialog</em>'.
	 * @see org.eclipse.pmf.pim.ui.MessageDialog
	 * @generated
	 */
	EClass getMessageDialog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.pmf.pim.ui.MessageDialog#getMessage()
	 * @see #getMessageDialog()
	 * @generated
	 */
	EAttribute getMessageDialog_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.eclipse.pmf.pim.ui.MessageDialog#getMessageType()
	 * @see #getMessageDialog()
	 * @generated
	 */
	EAttribute getMessageDialog_MessageType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see org.eclipse.pmf.pim.ui.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.RadioButton#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.eclipse.pmf.pim.ui.RadioButton#isSelected()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Selected();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.pmf.pim.ui.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridLayout
	 * @generated
	 */
	EClass getGridLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridLayout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridLayout#getNumColumns()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_NumColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Columns Equal Width</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridLayout#isMakeColumnsEqualWidth()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_MakeColumnsEqualWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Spacing</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridLayout#getHorizontalSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_HorizontalSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Spacing</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridLayout#getVerticalSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_VerticalSpacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see org.eclipse.pmf.pim.ui.LayoutData
	 * @generated
	 */
	EClass getLayoutData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.ui.GridData <em>Grid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Data</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData
	 * @generated
	 */
	EClass getGridData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#getHorizontalSpan()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_HorizontalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#getVerticalSpan()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_VerticalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#getHorizontalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#getVerticalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#isGrabExcessHorizontalSpace()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_GrabExcessHorizontalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see org.eclipse.pmf.pim.ui.GridData#isGrabExcessVerticalSpace()
	 * @see #getGridData()
	 * @generated
	 */
	EAttribute getGridData_GrabExcessVerticalSpace();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.pmf.pim.ui.Orientation <em>Orientation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see org.eclipse.pmf.pim.ui.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.pmf.pim.ui.FontStyle <em>Font Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see org.eclipse.pmf.pim.ui.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.ui.DialogMessageType <em>Dialog Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dialog Message Type</em>'.
	 * @see org.eclipse.pmf.pim.ui.DialogMessageType
	 * @generated
	 */
	EEnum getDialogMessageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData <em>Horizontal Alignment Grid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Horizontal Alignment Grid Data</em>'.
	 * @see org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData
	 * @generated
	 */
	EEnum getHorizontalAlignmentGridData();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pmf.pim.ui.VerticalAlignmentGridData <em>Vertical Alignment Grid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Alignment Grid Data</em>'.
	 * @see org.eclipse.pmf.pim.ui.VerticalAlignmentGridData
	 * @generated
	 */
	EEnum getVerticalAlignmentGridData();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.TextImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '<em><b>Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__MODIFY = eINSTANCE.getText_Modify();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.StackPanelImpl <em>Stack Panel</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.StackPanelImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getStackPanel()
		 * @generated
		 */
		EClass STACK_PANEL = eINSTANCE.getStackPanel();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.SeparatorImpl <em>Separator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.SeparatorImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSeparator()
		 * @generated
		 */
		EClass SEPARATOR = eINSTANCE.getSeparator();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATOR__ORIENTATION = eINSTANCE
				.getSeparator_Orientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.LabelImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__IMAGE = eINSTANCE.getLabel_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ImageImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.WindowImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TITLE = eINSTANCE.getWindow_Title();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__OPEN = eINSTANCE.getWindow_Open();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CLOSE = eINSTANCE.getWindow_Close();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ButtonImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__SELECTION = eINSTANCE.getButton_Selection();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__IMAGE = eINSTANCE.getButton_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ComboImpl <em>Combo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ComboImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getCombo()
		 * @generated
		 */
		EClass COMBO = eINSTANCE.getCombo();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.GroupBoxImpl <em>Group Box</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.GroupBoxImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGroupBox()
		 * @generated
		 */
		EClass GROUP_BOX = eINSTANCE.getGroupBox();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BOX__TITLE = eINSTANCE.getGroupBox_Title();

		/**
		 * The meta object literal for the '<em><b>Collapsible</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BOX__COLLAPSIBLE = eINSTANCE.getGroupBox_Collapsible();

		/**
		 * The meta object literal for the '<em><b>Collapse</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BOX__COLLAPSE = eINSTANCE.getGroupBox_Collapse();

		/**
		 * The meta object literal for the '<em><b>Expand</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_BOX__EXPAND = eINSTANCE.getGroupBox_Expand();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.BooleanButtonImpl <em>Boolean Button</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.BooleanButtonImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getBooleanButton()
		 * @generated
		 */
		EClass BOOLEAN_BUTTON = eINSTANCE.getBooleanButton();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BUTTON__SELECTED = eINSTANCE
				.getBooleanButton_Selected();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.SelectorImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__SELECTION = eINSTANCE.getSelector_Selection();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ControlImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ListViewImpl <em>List View</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ListViewImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getListView()
		 * @generated
		 */
		EClass LIST_VIEW = eINSTANCE.getListView();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.FinderImpl <em>Finder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.FinderImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFinder()
		 * @generated
		 */
		EClass FINDER = eINSTANCE.getFinder();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.UIElementImpl <em>UI Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.UIElementImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getUIElement()
		 * @generated
		 */
		EClass UI_ELEMENT = eINSTANCE.getUIElement();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__FOREGROUND = eINSTANCE.getUIElement_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__BACKGROUND = eINSTANCE.getUIElement_Background();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__FONT = eINSTANCE.getUIElement_Font();

		/**
		 * The meta object literal for the '<em><b>Tool Tip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT__TOOL_TIP = eINSTANCE.getUIElement_ToolTip();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.MenuItemImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ContainerImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CHILDREN = eINSTANCE.getContainer_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ViewPartImpl <em>View Part</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ViewPartImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getViewPart()
		 * @generated
		 */
		EClass VIEW_PART = eINSTANCE.getViewPart();

		/**
		 * The meta object literal for the '<em><b>Data Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PART__DATA_INPUT = eINSTANCE.getViewPart_DataInput();

		/**
		 * The meta object literal for the '<em><b>Data Form</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PART__DATA_FORM = eINSTANCE.getViewPart_DataForm();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.SashFromImpl <em>Sash From</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.SashFromImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getSashFrom()
		 * @generated
		 */
		EClass SASH_FROM = eINSTANCE.getSashFrom();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SASH_FROM__ORIENTATION = eINSTANCE.getSashFrom_Orientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.UIEventImpl <em>UI Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.UIEventImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getUIEvent()
		 * @generated
		 */
		EClass UI_EVENT = eINSTANCE.getUIEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.ColorImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__OPACITY = eINSTANCE.getColor_Opacity();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.FontImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__NAME = eINSTANCE.getFont_Name();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__STYLE = eINSTANCE.getFont_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.PartImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.PropertiesPartImpl <em>Properties Part</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.PropertiesPartImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPropertiesPart()
		 * @generated
		 */
		EClass PROPERTIES_PART = eINSTANCE.getPropertiesPart();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_PART__TABS = eINSTANCE.getPropertiesPart_Tabs();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_PART__DATA_TYPE = eINSTANCE
				.getPropertiesPart_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.PropertyTabImpl <em>Property Tab</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.PropertyTabImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPropertyTab()
		 * @generated
		 */
		EClass PROPERTY_TAB = eINSTANCE.getPropertyTab();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TAB__CONTENT = eINSTANCE.getPropertyTab_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.TabImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.TabSetImpl <em>Tab Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.TabSetImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTabSet()
		 * @generated
		 */
		EClass TAB_SET = eINSTANCE.getTabSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.TableImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.RichTextImpl <em>Rich Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.RichTextImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getRichText()
		 * @generated
		 */
		EClass RICH_TEXT = eINSTANCE.getRichText();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.DateTimePickerImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getDateTimePicker()
		 * @generated
		 */
		EClass DATE_TIME_PICKER = eINSTANCE.getDateTimePicker();

		/**
		 * The meta object literal for the '<em><b>Date Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PICKER__DATE_ONLY = eINSTANCE
				.getDateTimePicker_DateOnly();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.HyperlinkImpl <em>Hyperlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.HyperlinkImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getHyperlink()
		 * @generated
		 */
		EClass HYPERLINK = eINSTANCE.getHyperlink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERLINK__URL = eINSTANCE.getHyperlink_Url();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.PageImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Transaction Edition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TRANSACTION_EDITION = eINSTANCE
				.getPage_TransactionEdition();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTENT = eINSTANCE.getPage_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.WizardPageImpl <em>Wizard Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.WizardPageImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getWizardPage()
		 * @generated
		 */
		EClass WIZARD_PAGE = eINSTANCE.getWizardPage();

		/**
		 * The meta object literal for the '<em><b>Binding Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_PAGE__BINDING_PATH = eINSTANCE
				.getWizardPage_BindingPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.MessageDialogImpl <em>Message Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.MessageDialogImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getMessageDialog()
		 * @generated
		 */
		EClass MESSAGE_DIALOG = eINSTANCE.getMessageDialog();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DIALOG__MESSAGE = eINSTANCE
				.getMessageDialog_Message();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DIALOG__MESSAGE_TYPE = eINSTANCE
				.getMessageDialog_MessageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.RadioButtonImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__SELECTED = eINSTANCE.getRadioButton_Selected();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.LayoutImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.GridLayoutImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGridLayout()
		 * @generated
		 */
		EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

		/**
		 * The meta object literal for the '<em><b>Num Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_LAYOUT__NUM_COLUMNS = eINSTANCE
				.getGridLayout_NumColumns();

		/**
		 * The meta object literal for the '<em><b>Make Columns Equal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = eINSTANCE
				.getGridLayout_MakeColumnsEqualWidth();

		/**
		 * The meta object literal for the '<em><b>Horizontal Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_LAYOUT__HORIZONTAL_SPACING = eINSTANCE
				.getGridLayout_HorizontalSpacing();

		/**
		 * The meta object literal for the '<em><b>Vertical Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_LAYOUT__VERTICAL_SPACING = eINSTANCE
				.getGridLayout_VerticalSpacing();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.LayoutDataImpl <em>Layout Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.LayoutDataImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getLayoutData()
		 * @generated
		 */
		EClass LAYOUT_DATA = eINSTANCE.getLayoutData();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl <em>Grid Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.impl.GridDataImpl
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getGridData()
		 * @generated
		 */
		EClass GRID_DATA = eINSTANCE.getGridData();

		/**
		 * The meta object literal for the '<em><b>Horizontal Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__HORIZONTAL_SPAN = eINSTANCE
				.getGridData_HorizontalSpan();

		/**
		 * The meta object literal for the '<em><b>Vertical Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__VERTICAL_SPAN = eINSTANCE
				.getGridData_VerticalSpan();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__HORIZONTAL_ALIGNMENT = eINSTANCE
				.getGridData_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__VERTICAL_ALIGNMENT = eINSTANCE
				.getGridData_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = eINSTANCE
				.getGridData_GrabExcessHorizontalSpace();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Vertical Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = eINSTANCE
				.getGridData_GrabExcessVerticalSpace();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.Orientation
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.FontStyle
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.DialogMessageType <em>Dialog Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.DialogMessageType
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getDialogMessageType()
		 * @generated
		 */
		EEnum DIALOG_MESSAGE_TYPE = eINSTANCE.getDialogMessageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData <em>Horizontal Alignment Grid Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getHorizontalAlignmentGridData()
		 * @generated
		 */
		EEnum HORIZONTAL_ALIGNMENT_GRID_DATA = eINSTANCE
				.getHorizontalAlignmentGridData();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.ui.VerticalAlignmentGridData <em>Vertical Alignment Grid Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pmf.pim.ui.VerticalAlignmentGridData
		 * @see org.eclipse.pmf.pim.ui.impl.UiPackageImpl#getVerticalAlignmentGridData()
		 * @generated
		 */
		EEnum VERTICAL_ALIGNMENT_GRID_DATA = eINSTANCE
				.getVerticalAlignmentGridData();

	}

} // UiPackage
