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
package org.eclipse.pmf.pim.interactive;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.data.Property;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>UI Predicate</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.interactive.UIPredicate#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.interactive.UIPredicate#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getUIPredicate()
 * @model
 * @generated
 */
public interface UIPredicate extends LogicPredicate {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UIObject)
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getUIPredicate_Source()
	 * @model
	 * @generated
	 */
	UIObject getSource();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.interactive.UIPredicate#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UIObject value);

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
	 * @see #setProperty(Property)
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getUIPredicate_Property()
	 * @model
	 * @generated
	 */
	EStructuralFeature getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.interactive.UIPredicate#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(EStructuralFeature value);
} // UIPredicate
