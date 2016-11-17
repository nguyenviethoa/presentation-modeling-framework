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
package org.eclipse.pmf.pim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.Sorter;
import org.eclipse.pmf.pim.data.DataProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Collection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#isAddNew <em>Add New</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#isRemovable <em>Removable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#isReorderable <em>Reorderable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#getSorters <em>Sorters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataCollectionImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataCollectionImpl extends DataCompositeImpl implements
		DataCollection {
	/**
	 * The default value of the '{@link #isAddNew() <em>Add New</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAddNew()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_NEW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAddNew() <em>Add New</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAddNew()
	 * @generated
	 * @ordered
	 */
	protected boolean addNew = ADD_NEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRemovable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRemovable()
	 * @generated
	 * @ordered
	 */
	protected boolean removable = REMOVABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReorderable() <em>Reorderable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReorderable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REORDERABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReorderable() <em>Reorderable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReorderable()
	 * @generated
	 * @ordered
	 */
	protected boolean reorderable = REORDERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> columns;

	/**
	 * The cached value of the '{@link #getSorters() <em>Sorters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSorters()
	 * @generated
	 * @ordered
	 */
	protected EList<Sorter> sorters;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected DataForm editor;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected DataForm detail;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddNew() {
		return addNew;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNew(boolean newAddNew) {
		boolean oldAddNew = addNew;
		addNew = newAddNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__ADD_NEW, oldAddNew, addNew));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemovable() {
		return removable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovable(boolean newRemovable) {
		boolean oldRemovable = removable;
		removable = newRemovable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__REMOVABLE, oldRemovable,
					removable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReorderable() {
		return reorderable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReorderable(boolean newReorderable) {
		boolean oldReorderable = reorderable;
		reorderable = newReorderable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__REORDERABLE, oldReorderable,
					reorderable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<DataProperty>(
					DataProperty.class, this,
					PMFPackage.DATA_COLLECTION__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sorter> getSorters() {
		if (sorters == null) {
			sorters = new EObjectContainmentEList<Sorter>(Sorter.class, this,
					PMFPackage.DATA_COLLECTION__SORTERS);
		}
		return sorters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm getEditor() {
		if (editor != null && editor.eIsProxy()) {
			InternalEObject oldEditor = (InternalEObject) editor;
			editor = (DataForm) eResolveProxy(oldEditor);
			if (editor != oldEditor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_COLLECTION__EDITOR, oldEditor,
							editor));
			}
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm basicGetEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(DataForm newEditor) {
		DataForm oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__EDITOR, oldEditor, editor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm getDetail() {
		if (detail != null && detail.eIsProxy()) {
			InternalEObject oldDetail = (InternalEObject) detail;
			detail = (DataForm) eResolveProxy(oldDetail);
			if (detail != oldDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_COLLECTION__DETAIL, oldDetail,
							detail));
			}
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm basicGetDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(DataForm newDetail) {
		DataForm oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_COLLECTION__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.DATA_COLLECTION__SORTERS:
			return ((InternalEList<?>) getSorters())
					.basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.DATA_COLLECTION__ADD_NEW:
			return isAddNew();
		case PMFPackage.DATA_COLLECTION__REMOVABLE:
			return isRemovable();
		case PMFPackage.DATA_COLLECTION__REORDERABLE:
			return isReorderable();
		case PMFPackage.DATA_COLLECTION__EDITABLE:
			return isEditable();
		case PMFPackage.DATA_COLLECTION__COLUMNS:
			return getColumns();
		case PMFPackage.DATA_COLLECTION__SORTERS:
			return getSorters();
		case PMFPackage.DATA_COLLECTION__EDITOR:
			if (resolve)
				return getEditor();
			return basicGetEditor();
		case PMFPackage.DATA_COLLECTION__DETAIL:
			if (resolve)
				return getDetail();
			return basicGetDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PMFPackage.DATA_COLLECTION__ADD_NEW:
			setAddNew((Boolean) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__REMOVABLE:
			setRemovable((Boolean) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__REORDERABLE:
			setReorderable((Boolean) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__EDITABLE:
			setEditable((Boolean) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends DataProperty>) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__SORTERS:
			getSorters().clear();
			getSorters().addAll((Collection<? extends Sorter>) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__EDITOR:
			setEditor((DataForm) newValue);
			return;
		case PMFPackage.DATA_COLLECTION__DETAIL:
			setDetail((DataForm) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PMFPackage.DATA_COLLECTION__ADD_NEW:
			setAddNew(ADD_NEW_EDEFAULT);
			return;
		case PMFPackage.DATA_COLLECTION__REMOVABLE:
			setRemovable(REMOVABLE_EDEFAULT);
			return;
		case PMFPackage.DATA_COLLECTION__REORDERABLE:
			setReorderable(REORDERABLE_EDEFAULT);
			return;
		case PMFPackage.DATA_COLLECTION__EDITABLE:
			setEditable(EDITABLE_EDEFAULT);
			return;
		case PMFPackage.DATA_COLLECTION__COLUMNS:
			getColumns().clear();
			return;
		case PMFPackage.DATA_COLLECTION__SORTERS:
			getSorters().clear();
			return;
		case PMFPackage.DATA_COLLECTION__EDITOR:
			setEditor((DataForm) null);
			return;
		case PMFPackage.DATA_COLLECTION__DETAIL:
			setDetail((DataForm) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PMFPackage.DATA_COLLECTION__ADD_NEW:
			return addNew != ADD_NEW_EDEFAULT;
		case PMFPackage.DATA_COLLECTION__REMOVABLE:
			return removable != REMOVABLE_EDEFAULT;
		case PMFPackage.DATA_COLLECTION__REORDERABLE:
			return reorderable != REORDERABLE_EDEFAULT;
		case PMFPackage.DATA_COLLECTION__EDITABLE:
			return editable != EDITABLE_EDEFAULT;
		case PMFPackage.DATA_COLLECTION__COLUMNS:
			return columns != null && !columns.isEmpty();
		case PMFPackage.DATA_COLLECTION__SORTERS:
			return sorters != null && !sorters.isEmpty();
		case PMFPackage.DATA_COLLECTION__EDITOR:
			return editor != null;
		case PMFPackage.DATA_COLLECTION__DETAIL:
			return detail != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (addNew: ");
		result.append(addNew);
		result.append(", removable: ");
		result.append(removable);
		result.append(", reorderable: ");
		result.append(reorderable);
		result.append(", editable: ");
		result.append(editable);
		result.append(')');
		return result.toString();
	}

} // DataCollectionImpl
