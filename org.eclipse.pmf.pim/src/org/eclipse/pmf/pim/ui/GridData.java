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
 * A representation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData()
 * @model
 * @generated
 */
public interface GridData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Horizontal Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Span</em>' attribute.
	 * @see #setHorizontalSpan(int)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_HorizontalSpan()
	 * @model default="1"
	 * @generated
	 */
	int getHorizontalSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalSpan <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Span</em>' attribute.
	 * @see #getHorizontalSpan()
	 * @generated
	 */
	void setHorizontalSpan(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Span</em>' attribute.
	 * @see #setVerticalSpan(int)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_VerticalSpan()
	 * @model default="1"
	 * @generated
	 */
	int getVerticalSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#getVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Span</em>' attribute.
	 * @see #getVerticalSpan()
	 * @generated
	 */
	void setVerticalSpan(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData
	 * @see #setHorizontalAlignment(HorizontalAlignmentGridData)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_HorizontalAlignment()
	 * @model
	 * @generated
	 */
	HorizontalAlignmentGridData getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(HorizontalAlignmentGridData value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.pmf.pim.ui.VerticalAlignmentGridData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.VerticalAlignmentGridData
	 * @see #setVerticalAlignment(VerticalAlignmentGridData)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_VerticalAlignment()
	 * @model
	 * @generated
	 */
	VerticalAlignmentGridData getVerticalAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.pmf.pim.ui.VerticalAlignmentGridData
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(VerticalAlignmentGridData value);

	/**
	 * Returns the value of the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Excess Horizontal Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_GrabExcessHorizontalSpace()
	 * @model
	 * @generated
	 */
	boolean isGrabExcessHorizontalSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 */
	void setGrabExcessHorizontalSpace(boolean value);

	/**
	 * Returns the value of the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Excess Vertical Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @see org.eclipse.pmf.pim.ui.UiPackage#getGridData_GrabExcessVerticalSpace()
	 * @model
	 * @generated
	 */
	boolean isGrabExcessVerticalSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.ui.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 */
	void setGrabExcessVerticalSpace(boolean value);

} // GridData
