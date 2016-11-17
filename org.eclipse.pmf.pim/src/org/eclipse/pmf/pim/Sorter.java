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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.data.DataProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Sorter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.Sorter#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Sorter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Sorter#getComparator <em>Comparator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getSorter()
 * @model
 * @generated
 */
public interface Sorter extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DataProperty)
	 * @see org.eclipse.pmf.pim.PMFPackage#getSorter_Property()
	 * @model required="true"
	 * @generated
	 */
	DataProperty getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Sorter#getProperty
	 * <em>Property</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pmf.pim.SortingDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.pmf.pim.SortingDirection
	 * @see #setDirection(SortingDirection)
	 * @see org.eclipse.pmf.pim.PMFPackage#getSorter_Direction()
	 * @model
	 * @generated
	 */
	SortingDirection getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Sorter#getDirection
	 * <em>Direction</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.pmf.pim.SortingDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SortingDirection value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see #setComparator(String)
	 * @see org.eclipse.pmf.pim.PMFPackage#getSorter_Comparator()
	 * @model
	 * @generated
	 */
	String getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Sorter#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(String value);

} // Sorter
