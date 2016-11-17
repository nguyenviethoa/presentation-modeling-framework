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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Text</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.Text#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.Text#getModify <em>Modify</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Control {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Modify</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Modify</em>' attribute.
	 * @see #setModify(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getText_Modify()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getModify();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Text#getModify
	 * <em>Modify</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Modify</em>' attribute.
	 * @see #getModify()
	 * @generated
	 */
	void setModify(String value);
} // Text
