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
package org.eclipse.pmf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EClass To Data Type Map Entry</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.pmf.emf.EClassToDataTypeMapEntry#getValue <em>Value
 * </em>}</li>
 * <li>{@link org.eclipse.pmf.emf.EClassToDataTypeMapEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.pmf.emf.PEMFPackage#getEClassToDataTypeMapEntry()
 * @model
 * @generated
 */
public interface EClassToDataTypeMapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DataType)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEClassToDataTypeMapEntry_Value()
	 * @model containment="true"
	 * @generated
	 */
	DataType getValue();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.emf.EClassToDataTypeMapEntry#getValue
	 * <em>Value</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataType value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(EClass)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEClassToDataTypeMapEntry_Key()
	 * @model
	 * @generated
	 */
	EClass getKey();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.emf.EClassToDataTypeMapEntry#getKey <em>Key</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(EClass value);

} // EClassToDataTypeMapEntry
