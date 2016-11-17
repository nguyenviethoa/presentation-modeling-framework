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

import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataReference#getDataForm <em>Data Form</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataReference#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataReference()
 * @model abstract="true"
 * @generated
 */
public interface DataReference extends DataComposite {
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
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataReference_DataForm()
	 * @model
	 * @generated
	 */
	DataForm getDataForm();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataReference#getDataForm <em>Data Form</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Form</em>' reference.
	 * @see #getDataForm()
	 * @generated
	 */
	void setDataForm(DataForm value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataReference_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataReference#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // DataReference
