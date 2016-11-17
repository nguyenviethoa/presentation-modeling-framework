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

import org.eclipse.pmf.pim.DataForm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.Page#isTransactionEdition <em>Transaction Edition</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.Page#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends Part {
	/**
	 * Returns the value of the '<em><b>Transaction Edition</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Edition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Edition</em>' attribute.
	 * @see #setTransactionEdition(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getPage_TransactionEdition()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransactionEdition();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Page#isTransactionEdition <em>Transaction Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Edition</em>' attribute.
	 * @see #isTransactionEdition()
	 * @generated
	 */
	void setTransactionEdition(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(DataForm)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getPage_Content()
	 * @model
	 * @generated
	 */
	DataForm getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.Page#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(DataForm value);

} // Page
