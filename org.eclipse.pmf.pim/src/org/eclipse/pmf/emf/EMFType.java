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

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.pmf.pim.data.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EMF Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.EMFType#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.EMFType#getGenmodel <em>Genmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFType()
 * @model
 * @generated
 */
public interface EMFType extends DataType {
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
	 * @see #setContent(EClassifier)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFType_Content()
	 * @model
	 * @generated
	 */
	EClassifier getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.emf.EMFType#getContent
	 * <em>Content</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EClassifier value);

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
	 * @see #setGenmodel(GenClassifier)
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFType_Genmodel()
	 * @model
	 * @generated
	 */
	GenClassifier getGenmodel();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.emf.EMFType#getGenmodel
	 * <em>Genmodel</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Genmodel</em>' reference.
	 * @see #getGenmodel()
	 * @generated
	 */
	void setGenmodel(GenClassifier value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateGenmodel(GenClassifier genmodel);

} // EMFType
