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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Check Box Button</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.pmf.pim.ui.CheckBoxButton#isSelected <em>Selected
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.pmf.pim.ui.UiPackage#getCheckBoxButton()
 * @model
 * @generated
 */
public interface CheckBoxButton extends Button {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getCheckBoxButton_Selected()
	 * @model default="false"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.pmf.pim.ui.CheckBoxButton#isSelected
	 * <em>Selected</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // CheckBoxButton
