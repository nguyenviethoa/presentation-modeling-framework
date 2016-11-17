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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>View Folder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataFormFolder#getDataForms <em>Data Forms</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataFormFolder#getDefaultDataForm <em>Default Data Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataFormFolder()
 * @model
 * @generated
 */
public interface DataFormFolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Forms</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.DataForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Forms</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Forms</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataFormFolder_DataForms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataForm> getDataForms();

	/**
	 * Returns the value of the '<em><b>Default Data Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Data Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Data Form</em>' reference.
	 * @see #setDefaultDataForm(DataForm)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataFormFolder_DefaultDataForm()
	 * @model
	 * @generated
	 */
	DataForm getDefaultDataForm();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataFormFolder#getDefaultDataForm <em>Default Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Default Data Form</em>' reference.
	 * @see #getDefaultDataForm()
	 * @generated
	 */
	void setDefaultDataForm(DataForm value);

} // ViewFolder
