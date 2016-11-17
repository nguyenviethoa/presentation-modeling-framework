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
package org.eclipse.pmf.pim.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.ui.GridLayout;
import org.eclipse.pmf.pim.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridLayoutImpl#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutImpl extends LayoutImpl implements GridLayout {
	/**
	 * The default value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected int numColumns = NUM_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected boolean makeColumnsEqualWidth = MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_SPACING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected int horizontalSpacing = HORIZONTAL_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPACING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected int verticalSpacing = VERTICAL_SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.GRID_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumColumns() {
		return numColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumColumns(int newNumColumns) {
		int oldNumColumns = numColumns;
		numColumns = newNumColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_LAYOUT__NUM_COLUMNS, oldNumColumns,
					numColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMakeColumnsEqualWidth() {
		return makeColumnsEqualWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeColumnsEqualWidth(boolean newMakeColumnsEqualWidth) {
		boolean oldMakeColumnsEqualWidth = makeColumnsEqualWidth;
		makeColumnsEqualWidth = newMakeColumnsEqualWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH,
					oldMakeColumnsEqualWidth, makeColumnsEqualWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalSpacing() {
		return horizontalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpacing(int newHorizontalSpacing) {
		int oldHorizontalSpacing = horizontalSpacing;
		horizontalSpacing = newHorizontalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_LAYOUT__HORIZONTAL_SPACING,
					oldHorizontalSpacing, horizontalSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalSpacing() {
		return verticalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpacing(int newVerticalSpacing) {
		int oldVerticalSpacing = verticalSpacing;
		verticalSpacing = newVerticalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_LAYOUT__VERTICAL_SPACING,
					oldVerticalSpacing, verticalSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPackage.GRID_LAYOUT__NUM_COLUMNS:
			return getNumColumns();
		case UiPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
			return isMakeColumnsEqualWidth();
		case UiPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
			return getHorizontalSpacing();
		case UiPackage.GRID_LAYOUT__VERTICAL_SPACING:
			return getVerticalSpacing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UiPackage.GRID_LAYOUT__NUM_COLUMNS:
			setNumColumns((Integer) newValue);
			return;
		case UiPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
			setMakeColumnsEqualWidth((Boolean) newValue);
			return;
		case UiPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
			setHorizontalSpacing((Integer) newValue);
			return;
		case UiPackage.GRID_LAYOUT__VERTICAL_SPACING:
			setVerticalSpacing((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UiPackage.GRID_LAYOUT__NUM_COLUMNS:
			setNumColumns(NUM_COLUMNS_EDEFAULT);
			return;
		case UiPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
			setMakeColumnsEqualWidth(MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT);
			return;
		case UiPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
			setHorizontalSpacing(HORIZONTAL_SPACING_EDEFAULT);
			return;
		case UiPackage.GRID_LAYOUT__VERTICAL_SPACING:
			setVerticalSpacing(VERTICAL_SPACING_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UiPackage.GRID_LAYOUT__NUM_COLUMNS:
			return numColumns != NUM_COLUMNS_EDEFAULT;
		case UiPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
			return makeColumnsEqualWidth != MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;
		case UiPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
			return horizontalSpacing != HORIZONTAL_SPACING_EDEFAULT;
		case UiPackage.GRID_LAYOUT__VERTICAL_SPACING:
			return verticalSpacing != VERTICAL_SPACING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numColumns: ");
		result.append(numColumns);
		result.append(", makeColumnsEqualWidth: ");
		result.append(makeColumnsEqualWidth);
		result.append(", horizontalSpacing: ");
		result.append(horizontalSpacing);
		result.append(", verticalSpacing: ");
		result.append(verticalSpacing);
		result.append(')');
		return result.toString();
	}

} //GridLayoutImpl
