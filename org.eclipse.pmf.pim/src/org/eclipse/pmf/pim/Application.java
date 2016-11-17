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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.Container;
import org.eclipse.pmf.pim.ui.Image;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.Application#getMain <em>Main</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getDataModelManagers <em>Data Model Managers</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllViewProfiles <em>All View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllSystemActions <em>All System Actions</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllCommands <em>All Commands</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllConverters <em>All Converters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllValidators <em>All Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllTypes <em>All Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAllImages <em>All Images</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getMandatoryField <em>Mandatory Field</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.Application#getWizards <em>Wizards</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getApplication()
 * @model annotation="GenModel documentation='This class manages all information about the target application.'"
 * @generated
 */
public interface Application extends Library {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(Container)
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_Main()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Container getMain();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Application#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Container value);

	/**
	 * Returns the value of the '<em><b>Data Model Managers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.DataModelManager}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Data Model Managers</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model Managers</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_DataModelManagers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataModelManager> getDataModelManagers();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_Libraries()
	 * @model
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>All View Profiles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ViewProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All View Profiles</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All View Profiles</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllViewProfiles()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	EList<ViewProfile> getAllViewProfiles();

	/**
	 * Returns the value of the '<em><b>All System Actions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.SystemAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All System Actions</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All System Actions</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllSystemActions()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	EList<SystemAction> getAllSystemActions();

	/**
	 * Returns the value of the '<em><b>All Commands</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Command}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All Commands</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllCommands()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Command> getAllCommands();

	/**
	 * Returns the value of the '<em><b>All Converters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.DataConverter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Converters</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Converters</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllConverters()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	EList<DataConverter> getAllConverters();

	/**
	 * Returns the value of the '<em><b>All Validators</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Validator}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Validators</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All Validators</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllValidators()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Validator> getAllValidators();

	/**
	 * Returns the value of the '<em><b>All Types</b></em>' reference list. The
	 * list contents are of type {@link org.eclipse.pmf.pim.data.DataType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All Types</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllTypes()
	 * @model changeable="false"
	 * @generated
	 */
	EList<DataType> getAllTypes();

	/**
	 * Returns the value of the '<em><b>All Images</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.ui.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Images</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Images</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllImages()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	EList<Image> getAllImages();

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_Authentication()
	 * @model containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Application#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Mandatory Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Field</em>' reference.
	 * @see #setMandatoryField(Validator)
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_MandatoryField()
	 * @model required="true"
	 * @generated
	 */
	Validator getMandatoryField();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.Application#getMandatoryField <em>Mandatory Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Field</em>' reference.
	 * @see #getMandatoryField()
	 * @generated
	 */
	void setMandatoryField(Validator value);

	/**
	 * Returns the value of the '<em><b>Wizards</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.Wizard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wizards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wizards</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_Wizards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wizard> getWizards();

	/**
	 * Returns the value of the '<em><b>All Data Form Folders</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;org.eclipse.pmf.pim.data.DataType, org.eclipse.pmf.pim.DataFormFolder>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Data Form Folders</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Data Form Folders</em>' reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getApplication_AllDataFormFolders()
	 */
	EMap<DataType, DataFormFolder> getAllDataFormFolders();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void importModel(Resource resource);

	/**
	 * @param diagnostics
	 * @param context
	 * @return
	 * @generated NOT
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Application
