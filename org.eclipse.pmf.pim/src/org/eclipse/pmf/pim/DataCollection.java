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
import org.eclipse.pmf.pim.data.DataProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Collection</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#isAddNew <em>Add New</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#isRemovable <em>Removable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#isReorderable <em>Reorderable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#getSorters <em>Sorters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.DataCollection#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection()
 * @model
 * @generated
 */
public interface DataCollection extends DataComposite {
	/**
	 * Returns the value of the '<em><b>Add New</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add New</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add New</em>' attribute.
	 * @see #setAddNew(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_AddNew()
	 * @model default="true"
	 * @generated
	 */
	boolean isAddNew();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#isAddNew <em>Add New</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add New</em>' attribute.
	 * @see #isAddNew()
	 * @generated
	 */
	void setAddNew(boolean value);

	/**
	 * Returns the value of the '<em><b>Removable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Removable</em>' attribute.
	 * @see #setRemovable(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Removable()
	 * @model
	 * @generated
	 */
	boolean isRemovable();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#isRemovable <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removable</em>' attribute.
	 * @see #isRemovable()
	 * @generated
	 */
	void setRemovable(boolean value);

	/**
	 * Returns the value of the '<em><b>Reorderable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorderable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorderable</em>' attribute.
	 * @see #setReorderable(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Reorderable()
	 * @model default="true"
	 * @generated
	 */
	boolean isReorderable();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#isReorderable <em>Reorderable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Reorderable</em>' attribute.
	 * @see #isReorderable()
	 * @generated
	 */
	void setReorderable(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Columns()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getColumns();

	/**
	 * Returns the value of the '<em><b>Sorters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Sorter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorters</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorters</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Sorters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sorter> getSorters();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Editor</em>' reference.
	 * @see #setEditor(DataForm)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Editor()
	 * @model
	 * @generated
	 */
	DataForm getEditor();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#getEditor <em>Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(DataForm value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Detail</em>' reference.
	 * @see #setDetail(DataForm)
	 * @see org.eclipse.pmf.pim.PMFPackage#getDataCollection_Detail()
	 * @model
	 * @generated
	 */
	DataForm getDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.DataCollection#getDetail <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(DataForm value);

} // DataCollection
