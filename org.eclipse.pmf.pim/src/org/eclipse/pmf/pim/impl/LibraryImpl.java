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
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.ui.UIEvent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Library</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getViewProfiles <em>View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getSystemActions <em>System Actions</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getConverters <em>Converters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getDataFormFolders <em>Data Form Folders</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.LibraryImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends PMFObjectImpl implements Library {
	/**
	 * The cached value of the '{@link #getViewProfiles() <em>View Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getViewProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewProfile> viewProfiles;

	/**
	 * The cached value of the '{@link #getSystemActions() <em>System Actions</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getSystemActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAction> systemActions;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getConverters() <em>Converters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConverters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConverter> converters;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> validators;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> types;

	/**
	 * The cached value of the '{@link #getDataFormFolders() <em>Data Form Folders</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataFormFolders()
	 * @generated
	 * @ordered
	 */
	protected EMap<DataType, DataFormFolder> dataFormFolders;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<EClass, EList<UIEvent>> events;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewProfile> getViewProfiles() {
		if (viewProfiles == null) {
			viewProfiles = new EObjectContainmentEList<ViewProfile>(
					ViewProfile.class, this, PMFPackage.LIBRARY__VIEW_PROFILES);
		}
		return viewProfiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAction> getSystemActions() {
		if (systemActions == null) {
			systemActions = new EObjectContainmentEList<SystemAction>(
					SystemAction.class, this,
					PMFPackage.LIBRARY__SYSTEM_ACTIONS);
		}
		return systemActions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class,
					this, PMFPackage.LIBRARY__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConverter> getConverters() {
		if (converters == null) {
			converters = new EObjectContainmentEList<DataConverter>(
					DataConverter.class, this, PMFPackage.LIBRARY__CONVERTERS);
		}
		return converters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList<Validator>(
					Validator.class, this, PMFPackage.LIBRARY__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<DataType>(DataType.class, this,
					PMFPackage.LIBRARY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<DataType, DataFormFolder> getDataFormFolders() {
		if (dataFormFolders == null) {
			dataFormFolders = new EcoreEMap<DataType, DataFormFolder>(
					PMFPackage.Literals.TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP,
					TypeToDataFormFolderEntryMapImpl.class, this,
					PMFPackage.LIBRARY__DATA_FORM_FOLDERS);
		}
		return dataFormFolders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this,
					PMFPackage.LIBRARY__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EClass, EList<UIEvent>> getEvents() {
		if (events == null) {
			events = new EcoreEMap<EClass, EList<UIEvent>>(
					PMFPackage.Literals.ECLASS_TO_EVENT_ENTRY_MAP,
					EClassToEventEntryMapImpl.class, this,
					PMFPackage.LIBRARY__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DataFormFolder getDataFormFolder(DataType dataType) {
		return getDataFormFolders().get(dataType);
	}

	/**
	 * Return all events for a give UI Type. This list includes events defined
	 * in the supertypes. It should merge the events defined in sub-library.
	 */
	public EList<UIEvent> getUIEvents(EClass uiType) {

		/* add events for the uiType */
		EMap<EClass, EList<UIEvent>> events = getEvents();
		Iterator<Entry<EClass, EList<UIEvent>>> iterator = events.entrySet()
				.iterator();
		EList<UIEvent> uiEvents = new BasicEList<UIEvent>();

		while (iterator.hasNext()) {
			Map.Entry<EClass, EList<UIEvent>> mapEntry = (Map.Entry<EClass, EList<UIEvent>>) iterator
					.next();
			EClass key = mapEntry.getKey();
			EList<UIEvent> typeToEvents = mapEntry.getValue();

			if (key.getName().equals(uiType.getName())) {
				uiEvents.addAll(typeToEvents);
			}
		}

		/* add events defined in the supertypes */
		if ((uiType.getESuperTypes() != null)
				&& (!uiType.getESuperTypes().isEmpty())) {
			for (EClass superEClass : uiType.getESuperTypes()) {
				uiEvents.addAll(getUIEvents(superEClass));
			}
		}

		/* merge the events defined in sub-library*/
		if (this instanceof Application) {
			Application app = (Application) this;
			if ((app.getLibraries() != null) && (!app.getLibraries().isEmpty())) {
				for (Library lib : app.getLibraries()) {
					for (UIEvent childEvent : lib.getUIEvents(uiType)) {
						if (!uiEvents.contains(childEvent)) {
							uiEvents.add(childEvent);
						}
					}
				}
			}
		}
		return uiEvents;
		// TODO
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.LIBRARY__VIEW_PROFILES:
			return ((InternalEList<?>) getViewProfiles()).basicRemove(otherEnd,
					msgs);
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
			return ((InternalEList<?>) getSystemActions()).basicRemove(
					otherEnd, msgs);
		case PMFPackage.LIBRARY__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd,
					msgs);
		case PMFPackage.LIBRARY__CONVERTERS:
			return ((InternalEList<?>) getConverters()).basicRemove(otherEnd,
					msgs);
		case PMFPackage.LIBRARY__VALIDATORS:
			return ((InternalEList<?>) getValidators()).basicRemove(otherEnd,
					msgs);
		case PMFPackage.LIBRARY__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
			return ((InternalEList<?>) getDataFormFolders()).basicRemove(
					otherEnd, msgs);
		case PMFPackage.LIBRARY__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		case PMFPackage.LIBRARY__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case PMFPackage.LIBRARY__VIEW_PROFILES:
			return getViewProfiles();
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
			return getSystemActions();
		case PMFPackage.LIBRARY__COMMANDS:
			return getCommands();
		case PMFPackage.LIBRARY__CONVERTERS:
			return getConverters();
		case PMFPackage.LIBRARY__VALIDATORS:
			return getValidators();
		case PMFPackage.LIBRARY__TYPES:
			return getTypes();
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
			if (coreType)
				return getDataFormFolders();
			else
				return getDataFormFolders().map();
		case PMFPackage.LIBRARY__IMAGES:
			return getImages();
		case PMFPackage.LIBRARY__EVENTS:
			if (coreType)
				return getEvents();
			else
				return getEvents().map();
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
		case PMFPackage.LIBRARY__VIEW_PROFILES:
			getViewProfiles().clear();
			getViewProfiles().addAll(
					(Collection<? extends ViewProfile>) newValue);
			return;
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
			getSystemActions().clear();
			getSystemActions().addAll(
					(Collection<? extends SystemAction>) newValue);
			return;
		case PMFPackage.LIBRARY__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case PMFPackage.LIBRARY__CONVERTERS:
			getConverters().clear();
			getConverters().addAll(
					(Collection<? extends DataConverter>) newValue);
			return;
		case PMFPackage.LIBRARY__VALIDATORS:
			getValidators().clear();
			getValidators().addAll((Collection<? extends Validator>) newValue);
			return;
		case PMFPackage.LIBRARY__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
			((EStructuralFeature.Setting) getDataFormFolders()).set(newValue);
			return;
		case PMFPackage.LIBRARY__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
			return;
		case PMFPackage.LIBRARY__EVENTS:
			((EStructuralFeature.Setting) getEvents()).set(newValue);
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
		case PMFPackage.LIBRARY__VIEW_PROFILES:
			getViewProfiles().clear();
			return;
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
			getSystemActions().clear();
			return;
		case PMFPackage.LIBRARY__COMMANDS:
			getCommands().clear();
			return;
		case PMFPackage.LIBRARY__CONVERTERS:
			getConverters().clear();
			return;
		case PMFPackage.LIBRARY__VALIDATORS:
			getValidators().clear();
			return;
		case PMFPackage.LIBRARY__TYPES:
			getTypes().clear();
			return;
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
			getDataFormFolders().clear();
			return;
		case PMFPackage.LIBRARY__IMAGES:
			getImages().clear();
			return;
		case PMFPackage.LIBRARY__EVENTS:
			getEvents().clear();
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
		case PMFPackage.LIBRARY__VIEW_PROFILES:
			return viewProfiles != null && !viewProfiles.isEmpty();
		case PMFPackage.LIBRARY__SYSTEM_ACTIONS:
			return systemActions != null && !systemActions.isEmpty();
		case PMFPackage.LIBRARY__COMMANDS:
			return commands != null && !commands.isEmpty();
		case PMFPackage.LIBRARY__CONVERTERS:
			return converters != null && !converters.isEmpty();
		case PMFPackage.LIBRARY__VALIDATORS:
			return validators != null && !validators.isEmpty();
		case PMFPackage.LIBRARY__TYPES:
			return types != null && !types.isEmpty();
		case PMFPackage.LIBRARY__DATA_FORM_FOLDERS:
			return dataFormFolders != null && !dataFormFolders.isEmpty();
		case PMFPackage.LIBRARY__IMAGES:
			return images != null && !images.isEmpty();
		case PMFPackage.LIBRARY__EVENTS:
			return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LibraryImpl
