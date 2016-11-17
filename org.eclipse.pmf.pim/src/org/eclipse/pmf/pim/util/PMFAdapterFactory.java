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
package org.eclipse.pmf.pim.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.Action;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.ApplicationAction;
import org.eclipse.pmf.pim.Authentication;
import org.eclipse.pmf.pim.Command;
import org.eclipse.pmf.pim.CompositeDataForm;
import org.eclipse.pmf.pim.DataAssocication;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataComposite;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataField;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataFormSelector;
import org.eclipse.pmf.pim.DataGroup;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.DataModelManagerFactory;
import org.eclipse.pmf.pim.DataReference;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMF;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.RegexValidator;
import org.eclipse.pmf.pim.Sorter;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.ui.UIEvent;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see org.eclipse.pmf.pim.PMFPackage
 * @generated
 */
public class PMFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static PMFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PMFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PMFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PMFSwitch<Adapter> modelSwitch = new PMFSwitch<Adapter>() {
		@Override
		public Adapter caseDataForm(DataForm object) {
			return createDataFormAdapter();
		}

		@Override
		public Adapter caseElementalDataForm(ElementalDataForm object) {
			return createElementalDataFormAdapter();
		}

		@Override
		public Adapter caseCompositeDataForm(CompositeDataForm object) {
			return createCompositeDataFormAdapter();
		}

		@Override
		public Adapter caseDataFormSelector(DataFormSelector object) {
			return createDataFormSelectorAdapter();
		}

		@Override
		public Adapter caseDataField(DataField object) {
			return createDataFieldAdapter();
		}

		@Override
		public Adapter caseDataElement(DataElement object) {
			return createDataElementAdapter();
		}

		@Override
		public Adapter caseDataCollection(DataCollection object) {
			return createDataCollectionAdapter();
		}

		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseDataComposite(DataComposite object) {
			return createDataCompositeAdapter();
		}

		@Override
		public Adapter caseDataGroup(DataGroup object) {
			return createDataGroupAdapter();
		}

		@Override
		public Adapter caseDataItem(DataItem object) {
			return createDataItemAdapter();
		}

		@Override
		public Adapter caseDataReference(DataReference object) {
			return createDataReferenceAdapter();
		}

		@Override
		public Adapter caseUIObject(UIObject object) {
			return createUIObjectAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseSystemAction(SystemAction object) {
			return createSystemActionAdapter();
		}

		@Override
		public Adapter caseApplicationAction(ApplicationAction object) {
			return createApplicationActionAdapter();
		}

		@Override
		public Adapter caseDataFormFolder(DataFormFolder object) {
			return createDataFormFolderAdapter();
		}

		@Override
		public Adapter caseTypeToDataFormFolderEntryMap(
				Map.Entry<DataType, DataFormFolder> object) {
			return createTypeToDataFormFolderEntryMapAdapter();
		}

		@Override
		public Adapter casePMF(PMF object) {
			return createPMFAdapter();
		}

		@Override
		public Adapter caseDataModelManagerFactory(
				DataModelManagerFactory object) {
			return createDataModelManagerFactoryAdapter();
		}

		@Override
		public Adapter caseDataConverter(DataConverter object) {
			return createDataConverterAdapter();
		}

		@Override
		public Adapter caseValidator(Validator object) {
			return createValidatorAdapter();
		}

		@Override
		public Adapter caseViewProfile(ViewProfile object) {
			return createViewProfileAdapter();
		}

		@Override
		public Adapter casePMFObject(PMFObject object) {
			return createPMFObjectAdapter();
		}

		@Override
		public Adapter caseSorter(Sorter object) {
			return createSorterAdapter();
		}

		@Override
		public Adapter caseDataInheritance(DataInheritance object) {
			return createDataInheritanceAdapter();
		}

		@Override
		public Adapter caseDataAssocication(DataAssocication object) {
			return createDataAssocicationAdapter();
		}

		@Override
		public Adapter caseLibrary(Library object) {
			return createLibraryAdapter();
		}

		@Override
		public Adapter caseRegexValidator(RegexValidator object) {
			return createRegexValidatorAdapter();
		}

		@Override
		public Adapter caseEClassToEventEntryMap(
				Map.Entry<EClass, EList<UIEvent>> object) {
			return createEClassToEventEntryMapAdapter();
		}

		@Override
		public Adapter caseAuthentication(Authentication object) {
			return createAuthenticationAdapter();
		}

		@Override
		public Adapter caseWizard(Wizard object) {
			return createWizardAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataForm <em>Data Form</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataForm
	 * @generated
	 */
	public Adapter createDataFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ElementalDataForm <em>Elemental Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ElementalDataForm
	 * @generated
	 */
	public Adapter createElementalDataFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.CompositeDataForm <em>Composite Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.CompositeDataForm
	 * @generated
	 */
	public Adapter createCompositeDataFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataFormSelector <em>Data Form Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataFormSelector
	 * @generated
	 */
	public Adapter createDataFormSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataField <em>Data Field</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataField
	 * @generated
	 */
	public Adapter createDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataElement <em>Data Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataElement
	 * @generated
	 */
	public Adapter createDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataCollection
	 * @generated
	 */
	public Adapter createDataCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.Application <em>Application</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataComposite <em>Data Composite</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataComposite
	 * @generated
	 */
	public Adapter createDataCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataGroup
	 * @generated
	 */
	public Adapter createDataGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataItem <em>Data Item</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataItem
	 * @generated
	 */
	public Adapter createDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataReference <em>Data Reference</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataReference
	 * @generated
	 */
	public Adapter createDataReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.UIObject <em>UI Object</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.UIObject
	 * @generated
	 */
	public Adapter createUIObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.Command <em>Command</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.Action <em>Action</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.SystemAction <em>System Action</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.SystemAction
	 * @generated
	 */
	public Adapter createSystemActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ApplicationAction <em>Application Action</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ApplicationAction
	 * @generated
	 */
	public Adapter createApplicationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataFormFolder <em>Data Form Folder</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataFormFolder
	 * @generated
	 */
	public Adapter createDataFormFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Type To Data Form Folder Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createTypeToDataFormFolderEntryMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.PMF <em>PMF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.PMF
	 * @generated
	 */
	public Adapter createPMFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataModelManagerFactory <em>Data Model Manager Factory</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataModelManagerFactory
	 * @generated
	 */
	public Adapter createDataModelManagerFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.DataConverter <em>Data Converter</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataConverter
	 * @generated
	 */
	public Adapter createDataConverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.Validator <em>Validator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Validator
	 * @generated
	 */
	public Adapter createValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ViewProfile <em>View Profile</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ViewProfile
	 * @generated
	 */
	public Adapter createViewProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.PMFObject <em>Object</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.PMFObject
	 * @generated
	 */
	public Adapter createPMFObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.Sorter <em>Sorter</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Sorter
	 * @generated
	 */
	public Adapter createSorterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataInheritance <em>Data Inheritance</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataInheritance
	 * @generated
	 */
	public Adapter createDataInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.DataAssocication <em>Data Assocication</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.DataAssocication
	 * @generated
	 */
	public Adapter createDataAssocicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.Library <em>Library</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.RegexValidator <em>Regex Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.RegexValidator
	 * @generated
	 */
	public Adapter createRegexValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EClass To Event Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEClassToEventEntryMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.Wizard
	 * @generated
	 */
	public Adapter createWizardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // PMFAdapterFactory
