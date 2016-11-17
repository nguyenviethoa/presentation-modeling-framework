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
 * <em><b>Set Action</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.interactive.SetAction#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.interactive.SetAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.interactive.SetAction#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getSetAction()
 * @model
 * @generated
 */
public interface SetAction extends TriggerAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getSetAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.interactive.SetAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UIObject)
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getSetAction_Target()
	 * @model
	 * @generated
	 */
	UIObject getTarget();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.interactive.SetAction#getTarget
	 * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UIObject value);

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
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getSetAction_Property()
	 * @model
	 * @generated
	 */
	EStructuralFeature getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.interactive.SetAction#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(EStructuralFeature value);

} // SetAction
