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
package org.eclipse.pmf.pim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Form Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataFormSelector#getUIMode <em>UI Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataFormSelector()
 * @model
 * @generated
 */
public interface DataFormSelector extends CompositeDataForm {
	/**
	 * Returns the value of the '<em><b>UI Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Mode</em>' attribute.
	 * @see #setUIMode(String)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataFormSelector_UIMode()
	 * @model
	 * @generated
	 */
	String getUIMode();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataFormSelector#getUIMode <em>UI Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI Mode</em>' attribute.
	 * @see #getUIMode()
	 * @generated
	 */
	void setUIMode(String value);

} // DataFormSelector
