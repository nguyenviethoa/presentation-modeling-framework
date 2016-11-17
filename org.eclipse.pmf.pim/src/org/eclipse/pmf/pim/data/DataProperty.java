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
package org.eclipse.pmf.pim.data;

import org.eclipse.pmf.pim.PMFObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.data.DataProperty#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataProperty#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataProperty#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.data.DataPackage#getDataProperty()
 * @model
 * @generated
 */
public interface DataProperty extends PMFObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataProperty_Mandatory()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataProperty_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.DataProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataProperty_Many()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Type</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Type</em>' containment reference.
	 * @see #setGenericType(GenericType)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataProperty_GenericType()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getGenericType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.DataProperty#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Type</em>' containment reference.
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(GenericType value);

} // DataProperty
