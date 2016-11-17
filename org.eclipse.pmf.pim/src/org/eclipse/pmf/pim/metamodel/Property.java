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
package org.eclipse.pmf.pim.metamodel;

import org.eclipse.pmf.pim.PMFObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Property</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Property#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Property#isMany <em>Many</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.Property#getGenericType <em>Generic
 * Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getProperty()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Property extends PMFObject {
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
	 * @see #setType(Type)
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.metamodel.Property#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getProperty_Many()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Type</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generic Type</em>' containment reference.
	 * @see #setGenericType(GenericType)
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getProperty_GenericType()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getGenericType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.metamodel.Property#getGenericType
	 * <em>Generic Type</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generic Type</em>' containment
	 *            reference.
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(GenericType value);

} // Property
