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
 * <em><b>Selector</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.Selector#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends Control {

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(String)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getSelector_Selection()
	 * @model annotation="pmf event='true'"
	 * @generated
	 */
	String getSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Selector#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(String value);
} // Selector
