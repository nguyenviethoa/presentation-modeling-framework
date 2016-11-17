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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.ui.UIEvent;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Library</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.Library#getViewProfiles <em>View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getSystemActions <em>System Actions</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getConverters <em>Converters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getDataFormFolders <em>Data Form Folders</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getImages <em>Images</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Library#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary()
 * @model annotation="GenModel documentation='This class manages all information about the target application.'"
 * @generated
 */
public interface Library extends PMFObject {
	/**
	 * Returns the value of the '<em><b>View Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ViewProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Profiles</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Profiles</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_ViewProfiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewProfile> getViewProfiles();

	/**
	 * Returns the value of the '<em><b>System Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.SystemAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Actions</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Actions</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_SystemActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemAction> getSystemActions();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Converters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.DataConverter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converters</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Converters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConverter> getConverters();

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Validators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validator> getValidators();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getTypes();

	/**
	 * Returns the value of the '<em><b>Data Form Folders</b></em>' map.
	 * The key is of type {@link org.eclipse.pmf.pim.data.DataType},
	 * and the value is of type {@link org.eclipse.pmf.pim.DataFormFolder},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Form Folders</em>' map isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Form Folders</em>' map.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_DataFormFolders()
	 * @model mapType="org.eclipse.pmf.pim.TypeToDataFormFolderEntryMap<org.eclipse.pmf.pim.data.DataType, org.eclipse.pmf.pim.DataFormFolder>"
	 * @generated
	 */
	EMap<DataType, DataFormFolder> getDataFormFolders();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ui.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EClass},
	 * and the value is of type list of {@link org.eclipse.pmf.pim.ui.UIEvent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' map.
	 * @see org.eclipse.pmf.pim.PMFPackage#getLibrary_Events()
	 * @model mapType="org.eclipse.pmf.pim.EClassToEventEntryMap<org.eclipse.emf.ecore.EClass, org.eclipse.pmf.pim.ui.UIEvent>"
	 * @generated
	 */
	EMap<EClass, EList<UIEvent>> getEvents();

	EList<UIEvent> getUIEvents(EClass type);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataFormFolder getDataFormFolder(DataType dataType);

} // Library
