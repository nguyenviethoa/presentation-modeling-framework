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

import org.eclipse.pmf.pim.UIObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Group Box</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.GroupBox#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GroupBox#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GroupBox#getCollapse <em>Collapse</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GroupBox#getExpand <em>Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getGroupBox()
 * @model
 * @generated
 */
public interface GroupBox extends Container {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(UIObject)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGroupBox_Title()
	 * @model containment="true"
	 * @generated
	 */
	UIObject getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GroupBox#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(UIObject value);

	/**
	 * Returns the value of the '<em><b>Collapsible</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsible</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Collapsible</em>' attribute.
	 * @see #setCollapsible(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGroupBox_Collapsible()
	 * @model
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GroupBox#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapse</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapse</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Collapse</em>' attribute.
	 * @see #setCollapse(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGroupBox_Collapse()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getCollapse();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GroupBox#getCollapse <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapse</em>' attribute.
	 * @see #getCollapse()
	 * @generated
	 */
	void setCollapse(String value);

	/**
	 * Returns the value of the '<em><b>Expand</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expand</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expand</em>' attribute.
	 * @see #setExpand(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGroupBox_Expand()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getExpand();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GroupBox#getExpand
	 * <em>Expand</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expand</em>' attribute.
	 * @see #getExpand()
	 * @generated
	 */
	void setExpand(String value);

} // GroupBox
