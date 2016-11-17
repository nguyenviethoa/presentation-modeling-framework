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

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Properties Part</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.PropertiesPart#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.PropertiesPart#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getPropertiesPart()
 * @model
 * @generated
 */
public interface PropertiesPart extends Part {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ui.PropertyTab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getPropertiesPart_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyTab> getTabs();

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
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getPropertiesPart_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.ui.PropertiesPart#getDataType
	 * <em>Data Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // PropertiesPart
