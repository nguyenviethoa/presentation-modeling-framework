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

import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.datainput.DataInput;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>View Part</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.ViewPart#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.ViewPart#getDataForm <em>Data Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getViewPart()
 * @model
 * @generated
 */
public interface ViewPart extends UIElement {
	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input</em>' containment reference.
	 * @see #setDataInput(DataInput)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getViewPart_DataInput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataInput getDataInput();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.ViewPart#getDataInput <em>Data Input</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Input</em>' containment reference.
	 * @see #getDataInput()
	 * @generated
	 */
	void setDataInput(DataInput value);

	/**
	 * Returns the value of the '<em><b>Data Form</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Form</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Form</em>' reference.
	 * @see #setDataForm(DataForm)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getViewPart_DataForm()
	 * @model required="true"
	 * @generated
	 */
	DataForm getDataForm();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.ViewPart#getDataForm <em>Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Form</em>' reference.
	 * @see #getDataForm()
	 * @generated
	 */
	void setDataForm(DataForm value);

} // ViewPart
