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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessageType <em>Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getMessageDialog()
 * @model
 * @generated
 */
public interface MessageDialog extends UIElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getMessageDialog_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pmf.pim.ui.DialogMessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.DialogMessageType
	 * @see #setMessageType(DialogMessageType)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getMessageDialog_MessageType()
	 * @model
	 * @generated
	 */
	DialogMessageType getMessageType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.MessageDialog#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.DialogMessageType
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(DialogMessageType value);

} // MessageDialog
