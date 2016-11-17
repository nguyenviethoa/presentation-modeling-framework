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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.Authentication#isShowLostPassword <em>Show Lost Password</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Authentication#isRegistration <em>Registration</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Authentication#isAnonymous <em>Anonymous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getAuthentication()
 * @model
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Show Lost Password</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Lost Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Lost Password</em>' attribute.
	 * @see #setShowLostPassword(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getAuthentication_ShowLostPassword()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowLostPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Authentication#isShowLostPassword <em>Show Lost Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lost Password</em>' attribute.
	 * @see #isShowLostPassword()
	 * @generated
	 */
	void setShowLostPassword(boolean value);

	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see #setRegistration(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getAuthentication_Registration()
	 * @model default="true"
	 * @generated
	 */
	boolean isRegistration();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Authentication#isRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #isRegistration()
	 * @generated
	 */
	void setRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getAuthentication_Anonymous()
	 * @model default="true"
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Authentication#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

} // Authentication
