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
 * A representation of the model object '<em><b>Date Time Picker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.DateTimePicker#isDateOnly <em>Date Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getDateTimePicker()
 * @model
 * @generated
 */
public interface DateTimePicker extends Control {

	/**
	 * Returns the value of the '<em><b>Date Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Only</em>' attribute.
	 * @see #setDateOnly(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getDateTimePicker_DateOnly()
	 * @model
	 * @generated
	 */
	boolean isDateOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.DateTimePicker#isDateOnly <em>Date Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Only</em>' attribute.
	 * @see #isDateOnly()
	 * @generated
	 */
	void setDateOnly(boolean value);
} // DateTimePicker
