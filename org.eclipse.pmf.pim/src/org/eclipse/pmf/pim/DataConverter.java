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
 * <em><b>IData Converter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataConverter#getFromType <em>From Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataConverter#getToType <em>To Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataConverter()
 * @model
 * @generated
 */
public interface DataConverter extends PMFObject {

	/**
	 * Returns the value of the '<em><b>From Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From Type</em>' reference.
	 * @see #setFromType(DataType)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataConverter_FromType()
	 * @model required="true"
	 * @generated
	 */
	DataType getFromType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataConverter#getFromType <em>From Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Type</em>' reference.
	 * @see #getFromType()
	 * @generated
	 */
	void setFromType(DataType value);

	/**
	 * Returns the value of the '<em><b>To Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To Type</em>' reference.
	 * @see #setToType(DataType)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataConverter_ToType()
	 * @model required="true"
	 * @generated
	 */
	DataType getToType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataConverter#getToType <em>To Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Type</em>' reference.
	 * @see #getToType()
	 * @generated
	 */
	void setToType(DataType value);
} // IDataConverter
