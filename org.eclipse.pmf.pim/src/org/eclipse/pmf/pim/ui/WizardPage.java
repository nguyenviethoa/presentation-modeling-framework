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

import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBindingPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.WizardPage#getBindingPath <em>Binding Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getWizardPage()
 * @model
 * @generated
 */
public interface WizardPage extends Page {

	/**
	 * Returns the value of the '<em><b>Binding Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Path</em>' containment reference.
	 * @see #setBindingPath(DataBindingPath)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getWizardPage_BindingPath()
	 * @model containment="true"
	 * @generated
	 */
	DataBindingPath getBindingPath();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.WizardPage#getBindingPath <em>Binding Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Path</em>' containment reference.
	 * @see #getBindingPath()
	 * @generated
	 */
	void setBindingPath(DataBindingPath value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DataType getDataContextType();

} // WizardPage
