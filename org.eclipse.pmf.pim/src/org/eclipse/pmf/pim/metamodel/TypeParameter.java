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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type Parameter</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.pmf.pim.metamodel.TypeParameter#getBounds <em>Bounds
 * </em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.TypeParameter#getName <em>Name</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.pmf.pim.metamodel.GenericType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getTypeParameter_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getBounds();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.pmf.pim.metamodel.MetamodelPackage#getTypeParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.metamodel.TypeParameter#getName <em>Name</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TypeParameter
