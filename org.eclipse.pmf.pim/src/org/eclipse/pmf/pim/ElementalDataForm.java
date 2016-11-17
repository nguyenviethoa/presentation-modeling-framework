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

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.pim.ui.Layout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemental Data Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ElementalDataForm#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ElementalDataForm#getLocalValidators <em>Local Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ElementalDataForm#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ElementalDataForm#getViewProfiles <em>View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ElementalDataForm#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm()
 * @model
 * @generated
 */
public interface ElementalDataForm extends DataForm {
	/**
	 * Returns the value of the '<em><b>Validators</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm_Validators()
	 * @model
	 * @generated
	 */
	EList<Validator> getValidators();

	/**
	 * Returns the value of the '<em><b>Local Validators</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Validators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Validators</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm_LocalValidators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validator> getLocalValidators();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItem> getChildren();

	/**
	 * Returns the value of the '<em><b>View Profiles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ViewProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Profiles</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm_ViewProfiles()
	 * @model
	 * @generated
	 */
	EList<ViewProfile> getViewProfiles();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see org.eclipse.pmf.pim.PMFPackage#getElementalDataForm_Layout()
	 * @model containment="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ElementalDataForm#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // ElementalDataForm
