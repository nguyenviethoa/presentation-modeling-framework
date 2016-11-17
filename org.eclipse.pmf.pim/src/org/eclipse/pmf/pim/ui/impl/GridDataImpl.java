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
import org.eclipse.pmf.pim.ui.GridData;
import org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.VerticalAlignmentGridData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.ui.impl.GridDataImpl#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridDataImpl extends LayoutDataImpl implements GridData {
	/**
	 * The default value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected int horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected int verticalSpan = VERTICAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HorizontalAlignmentGridData HORIZONTAL_ALIGNMENT_EDEFAULT = HorizontalAlignmentGridData.FILL;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected HorizontalAlignmentGridData horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlignmentGridData VERTICAL_ALIGNMENT_EDEFAULT = VerticalAlignmentGridData.FILL;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected VerticalAlignmentGridData verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.GRID_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalSpan() {
		return horizontalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpan(int newHorizontalSpan) {
		int oldHorizontalSpan = horizontalSpan;
		horizontalSpan = newHorizontalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__HORIZONTAL_SPAN, oldHorizontalSpan,
					horizontalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalSpan() {
		return verticalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpan(int newVerticalSpan) {
		int oldVerticalSpan = verticalSpan;
		verticalSpan = newVerticalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__VERTICAL_SPAN, oldVerticalSpan,
					verticalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAlignmentGridData getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(
			HorizontalAlignmentGridData newHorizontalAlignment) {
		HorizontalAlignmentGridData oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT
				: newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__HORIZONTAL_ALIGNMENT,
					oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignmentGridData getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(
			VerticalAlignmentGridData newVerticalAlignment) {
		VerticalAlignmentGridData oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT
				: newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__VERTICAL_ALIGNMENT,
					oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessHorizontalSpace() {
		return grabExcessHorizontalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessHorizontalSpace(
			boolean newGrabExcessHorizontalSpace) {
		boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
		grabExcessHorizontalSpace = newGrabExcessHorizontalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE,
					oldGrabExcessHorizontalSpace, grabExcessHorizontalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessVerticalSpace() {
		return grabExcessVerticalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessVerticalSpace(boolean newGrabExcessVerticalSpace) {
		boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
		grabExcessVerticalSpace = newGrabExcessVerticalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE,
					oldGrabExcessVerticalSpace, grabExcessVerticalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPackage.GRID_DATA__HORIZONTAL_SPAN:
			return getHorizontalSpan();
		case UiPackage.GRID_DATA__VERTICAL_SPAN:
			return getVerticalSpan();
		case UiPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
			return getHorizontalAlignment();
		case UiPackage.GRID_DATA__VERTICAL_ALIGNMENT:
			return getVerticalAlignment();
		case UiPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			return isGrabExcessHorizontalSpace();
		case UiPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			return isGrabExcessVerticalSpace();
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
		case UiPackage.GRID_DATA__HORIZONTAL_SPAN:
			setHorizontalSpan((Integer) newValue);
			return;
		case UiPackage.GRID_DATA__VERTICAL_SPAN:
			setVerticalSpan((Integer) newValue);
			return;
		case UiPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
			setHorizontalAlignment((HorizontalAlignmentGridData) newValue);
			return;
		case UiPackage.GRID_DATA__VERTICAL_ALIGNMENT:
			setVerticalAlignment((VerticalAlignmentGridData) newValue);
			return;
		case UiPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			setGrabExcessHorizontalSpace((Boolean) newValue);
			return;
		case UiPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			setGrabExcessVerticalSpace((Boolean) newValue);
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
		case UiPackage.GRID_DATA__HORIZONTAL_SPAN:
			setHorizontalSpan(HORIZONTAL_SPAN_EDEFAULT);
			return;
		case UiPackage.GRID_DATA__VERTICAL_SPAN:
			setVerticalSpan(VERTICAL_SPAN_EDEFAULT);
			return;
		case UiPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
			setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
			return;
		case UiPackage.GRID_DATA__VERTICAL_ALIGNMENT:
			setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
			return;
		case UiPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			setGrabExcessHorizontalSpace(GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT);
			return;
		case UiPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			setGrabExcessVerticalSpace(GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT);
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
		case UiPackage.GRID_DATA__HORIZONTAL_SPAN:
			return horizontalSpan != HORIZONTAL_SPAN_EDEFAULT;
		case UiPackage.GRID_DATA__VERTICAL_SPAN:
			return verticalSpan != VERTICAL_SPAN_EDEFAULT;
		case UiPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
			return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
		case UiPackage.GRID_DATA__VERTICAL_ALIGNMENT:
			return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
		case UiPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			return grabExcessHorizontalSpace != GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;
		case UiPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			return grabExcessVerticalSpace != GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;
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
		result.append(" (horizontalSpan: ");
		result.append(horizontalSpan);
		result.append(", verticalSpan: ");
		result.append(verticalSpan);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", grabExcessHorizontalSpace: ");
		result.append(grabExcessHorizontalSpace);
		result.append(", grabExcessVerticalSpace: ");
		result.append(grabExcessVerticalSpace);
		result.append(')');
		return result.toString();
	}

} //GridDataImpl
