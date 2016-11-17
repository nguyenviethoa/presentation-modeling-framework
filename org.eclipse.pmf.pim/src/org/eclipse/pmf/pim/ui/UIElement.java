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
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.UIElement#getForeground <em>Foreground</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.UIElement#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.UIElement#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.UIElement#getToolTip <em>Tool Tip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getUIElement()
 * @model abstract="true"
 * @generated
 */
public interface UIElement extends UIObject {

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' containment reference.
	 * @see #setForeground(Color)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getUIElement_Foreground()
	 * @model containment="true"
	 * @generated
	 */
	Color getForeground();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.UIElement#getForeground <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' containment reference.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(Color value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Color)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getUIElement_Background()
	 * @model containment="true"
	 * @generated
	 */
	Color getBackground();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.UIElement#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Color value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getUIElement_Font()
	 * @model containment="true"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.UIElement#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Tip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Tip</em>' containment reference.
	 * @see #setToolTip(UIElement)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getUIElement_ToolTip()
	 * @model containment="true"
	 * @generated
	 */
	UIElement getToolTip();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.UIElement#getToolTip <em>Tool Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip</em>' containment reference.
	 * @see #getToolTip()
	 * @generated
	 */
	void setToolTip(UIElement value);
} // UIElement
