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
package org.eclipse.pmf.pim.databinding;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.data.DataProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Binding Path</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBindingPath#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingPath()
 * @model
 * @generated
 */
public interface DataBindingPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(DataProperty)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingPath_Feature()
	 * @model required="true"
	 * @generated
	 */
	DataProperty getFeature();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.databinding.DataBindingPath#getFeature
	 * <em>Feature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(DataProperty value);

} // DataBindingPath
