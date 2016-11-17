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

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.pmf.pim.data.DataProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EMF Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.EMFProperty#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.EMFProperty#getGenmodel <em>Genmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFProperty()
 * @model
 * @generated
 */
public interface EMFProperty extends DataProperty {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(EStructuralFeature)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFProperty_Content()
	 * @model
	 * @generated
	 */
	EStructuralFeature getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.emf.EMFProperty#getContent
	 * <em>Content</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Genmodel</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodel</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Genmodel</em>' reference.
	 * @see #setGenmodel(GenFeature)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFProperty_Genmodel()
	 * @model
	 * @generated
	 */
	GenFeature getGenmodel();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.emf.EMFProperty#getGenmodel <em>Genmodel</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genmodel</em>' reference.
	 * @see #getGenmodel()
	 * @generated
	 */
	void setGenmodel(GenFeature value);

} // EMFProperty
