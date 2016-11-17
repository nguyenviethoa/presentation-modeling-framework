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
 * <em><b>Window</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.Window#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.Window#getOpen <em>Open</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.Window#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends Page {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getWindow_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Window#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getWindow_Open()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getOpen();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Window#getOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(String value);

	/**
	 * Returns the value of the '<em><b>Close</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Close</em>' attribute.
	 * @see #setClose(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getWindow_Close()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getClose();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Window#getClose <em>Close</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close</em>' attribute.
	 * @see #getClose()
	 * @generated
	 */
	void setClose(String value);

} // Window
