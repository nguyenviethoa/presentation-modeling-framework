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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridLayout#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridLayout()
 * @model
 * @generated
 */
public interface GridLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Columns</em>' attribute.
	 * @see #setNumColumns(int)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridLayout_NumColumns()
	 * @model
	 * @generated
	 */
	int getNumColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridLayout#getNumColumns <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Columns</em>' attribute.
	 * @see #getNumColumns()
	 * @generated
	 */
	void setNumColumns(int value);

	/**
	 * Returns the value of the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Columns Equal Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #setMakeColumnsEqualWidth(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridLayout_MakeColumnsEqualWidth()
	 * @model
	 * @generated
	 */
	boolean isMakeColumnsEqualWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 */
	void setMakeColumnsEqualWidth(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #setHorizontalSpacing(int)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridLayout_HorizontalSpacing()
	 * @model
	 * @generated
	 */
	int getHorizontalSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #getHorizontalSpacing()
	 * @generated
	 */
	void setHorizontalSpacing(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #setVerticalSpacing(int)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridLayout_VerticalSpacing()
	 * @model
	 * @generated
	 */
	int getVerticalSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #getVerticalSpacing()
	 * @generated
	 */
	void setVerticalSpacing(int value);

} // GridLayout
