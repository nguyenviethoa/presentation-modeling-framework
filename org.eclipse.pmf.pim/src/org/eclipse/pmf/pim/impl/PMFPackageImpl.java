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

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.RegexValidator;
import org.eclipse.pmf.pim.Sorter;
import org.eclipse.pmf.pim.SortingDirection;
import org.eclipse.pmf.pim.SystemAction;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.Wizard;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.impl.DataPackageImpl;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl;
import org.eclipse.pmf.pim.datainput.DatainputPackage;
import org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.impl.UiPackageImpl;
import org.eclipse.pmf.pim.util.PMFValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PMFPackageImpl extends EPackageImpl implements PMFPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementalDataFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDataFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormSelectorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCollectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormFolderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeToDataFormFolderEntryMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelManagerFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConverterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewProfileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmfObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAssocicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regexValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassToEventEntryMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortingDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.pmf.pim.PMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PMFPackageImpl() {
		super(eNS_URI, PMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link PMFPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PMFPackage init() {
		if (isInited)
			return (PMFPackage) EPackage.Registry.INSTANCE
					.getEPackage(PMFPackage.eNS_URI);

		// Obtain or create and register package
		PMFPackageImpl thePMFPackage = (PMFPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PMFPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PMFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataPackageImpl theDataPackage = (DataPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		InteractivePackageImpl theInteractivePackage = (InteractivePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InteractivePackage.eNS_URI) instanceof InteractivePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InteractivePackage.eNS_URI)
				: InteractivePackage.eINSTANCE);
		DatainputPackageImpl theDatainputPackage = (DatainputPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI) instanceof DatainputPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI)
				: DatainputPackage.eINSTANCE);
		DatabindingPackageImpl theDatabindingPackage = (DatabindingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI) instanceof DatabindingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI)
				: DatabindingPackage.eINSTANCE);
		TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI)
				: TransformationPackage.eINSTANCE);

		// Create package meta-data objects
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theDatabindingPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thePMFPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return PMFValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		thePMFPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PMFPackage.eNS_URI, thePMFPackage);
		return thePMFPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataForm() {
		return dataFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementalDataForm() {
		return elementalDataFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementalDataForm_Validators() {
		return (EReference) elementalDataFormEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementalDataForm_LocalValidators() {
		return (EReference) elementalDataFormEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementalDataForm_Children() {
		return (EReference) elementalDataFormEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementalDataForm_ViewProfiles() {
		return (EReference) elementalDataFormEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementalDataForm_Layout() {
		return (EReference) elementalDataFormEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDataForm() {
		return compositeDataFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDataForm_Elements() {
		return (EReference) compositeDataFormEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormSelector() {
		return dataFormSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormSelector_UIMode() {
		return (EAttribute) dataFormSelectorEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataField() {
		return dataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_DataContextType() {
		return (EReference) dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_DataBinding() {
		return (EReference) dataElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_ResolvedTargetContextType() {
		return (EReference) dataElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_ResolvedDataContextType() {
		return (EReference) dataElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Changeable() {
		return (EAttribute) dataElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_PropertyChanged() {
		return (EAttribute) dataElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Control() {
		return (EReference) dataElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCollection() {
		return dataCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCollection_AddNew() {
		return (EAttribute) dataCollectionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCollection_Removable() {
		return (EAttribute) dataCollectionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCollection_Reorderable() {
		return (EAttribute) dataCollectionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCollection_Editable() {
		return (EAttribute) dataCollectionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollection_Columns() {
		return (EReference) dataCollectionEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollection_Sorters() {
		return (EReference) dataCollectionEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollection_Editor() {
		return (EReference) dataCollectionEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollection_Detail() {
		return (EReference) dataCollectionEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Main() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_DataModelManagers() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Libraries() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllViewProfiles() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllSystemActions() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllCommands() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllConverters() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllValidators() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllTypes() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_AllImages() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Authentication() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_MandatoryField() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Wizards() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComposite() {
		return dataCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComposite_Items() {
		return (EReference) dataCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataGroup() {
		return dataGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataGroup_Layout() {
		return (EReference) dataGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataItem() {
		return dataItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItem_Mandatory() {
		return (EAttribute) dataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_Label() {
		return (EReference) dataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_Help() {
		return (EReference) dataItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataItem_LayoutData() {
		return (EReference) dataItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReference() {
		return dataReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReference_DataForm() {
		return (EReference) dataReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReference_DataType() {
		return (EReference) dataReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIObject() {
		return uiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIObject_ViewID() {
		return (EAttribute) uiObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIObject_Visible() {
		return (EAttribute) uiObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIObject_Enabled() {
		return (EAttribute) uiObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIObject_Triggers() {
		return (EReference) uiObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAction() {
		return systemActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAction_Commands() {
		return (EReference) systemActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAction() {
		return applicationActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormFolder() {
		return dataFormFolderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFormFolder_DataForms() {
		return (EReference) dataFormFolderEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFormFolder_DefaultDataForm() {
		return (EReference) dataFormFolderEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeToDataFormFolderEntryMap() {
		return typeToDataFormFolderEntryMapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToDataFormFolderEntryMap_Key() {
		return (EReference) typeToDataFormFolderEntryMapEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToDataFormFolderEntryMap_Value() {
		return (EReference) typeToDataFormFolderEntryMapEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMF() {
		return pmfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMF_ModelManagerFactories() {
		return (EReference) pmfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModelManagerFactory() {
		return dataModelManagerFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConverter() {
		return dataConverterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConverter_FromType() {
		return (EReference) dataConverterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConverter_ToType() {
		return (EReference) dataConverterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidator() {
		return validatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewProfile() {
		return viewProfileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewProfile_Children() {
		return (EReference) viewProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMFObject() {
		return pmfObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMFObject_Name() {
		return (EAttribute) pmfObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMFObject_Description() {
		return (EAttribute) pmfObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMFObject_Id() {
		return (EAttribute) pmfObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSorter() {
		return sorterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSorter_Property() {
		return (EReference) sorterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSorter_Direction() {
		return (EAttribute) sorterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSorter_Comparator() {
		return (EAttribute) sorterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInheritance() {
		return dataInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAssocication() {
		return dataAssocicationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_ViewProfiles() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_SystemActions() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Commands() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Converters() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Validators() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Types() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_DataFormFolders() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Images() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Events() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegexValidator() {
		return regexValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegexValidator_Expression() {
		return (EAttribute) regexValidatorEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassToEventEntryMap() {
		return eClassToEventEntryMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassToEventEntryMap_Key() {
		return (EReference) eClassToEventEntryMapEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassToEventEntryMap_Value() {
		return (EReference) eClassToEventEntryMapEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_ShowLostPassword() {
		return (EAttribute) authenticationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Registration() {
		return (EAttribute) authenticationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Anonymous() {
		return (EAttribute) authenticationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_DataType() {
		return (EReference) wizardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizard_Category() {
		return (EAttribute) wizardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_WizardPages() {
		return (EReference) wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortingDirection() {
		return sortingDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PMFFactory getPMFFactory() {
		return (PMFFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dataFormEClass = createEClass(DATA_FORM);

		elementalDataFormEClass = createEClass(ELEMENTAL_DATA_FORM);
		createEReference(elementalDataFormEClass,
				ELEMENTAL_DATA_FORM__VALIDATORS);
		createEReference(elementalDataFormEClass,
				ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS);
		createEReference(elementalDataFormEClass, ELEMENTAL_DATA_FORM__CHILDREN);
		createEReference(elementalDataFormEClass,
				ELEMENTAL_DATA_FORM__VIEW_PROFILES);
		createEReference(elementalDataFormEClass, ELEMENTAL_DATA_FORM__LAYOUT);

		compositeDataFormEClass = createEClass(COMPOSITE_DATA_FORM);
		createEReference(compositeDataFormEClass, COMPOSITE_DATA_FORM__ELEMENTS);

		dataFormSelectorEClass = createEClass(DATA_FORM_SELECTOR);
		createEAttribute(dataFormSelectorEClass, DATA_FORM_SELECTOR__UI_MODE);

		dataFieldEClass = createEClass(DATA_FIELD);

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__DATA_CONTEXT_TYPE);
		createEReference(dataElementEClass, DATA_ELEMENT__DATA_BINDING);
		createEReference(dataElementEClass,
				DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE);
		createEReference(dataElementEClass,
				DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__CHANGEABLE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__PROPERTY_CHANGED);
		createEReference(dataElementEClass, DATA_ELEMENT__CONTROL);

		dataCollectionEClass = createEClass(DATA_COLLECTION);
		createEAttribute(dataCollectionEClass, DATA_COLLECTION__ADD_NEW);
		createEAttribute(dataCollectionEClass, DATA_COLLECTION__REMOVABLE);
		createEAttribute(dataCollectionEClass, DATA_COLLECTION__REORDERABLE);
		createEAttribute(dataCollectionEClass, DATA_COLLECTION__EDITABLE);
		createEReference(dataCollectionEClass, DATA_COLLECTION__COLUMNS);
		createEReference(dataCollectionEClass, DATA_COLLECTION__SORTERS);
		createEReference(dataCollectionEClass, DATA_COLLECTION__EDITOR);
		createEReference(dataCollectionEClass, DATA_COLLECTION__DETAIL);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__MAIN);
		createEReference(applicationEClass, APPLICATION__DATA_MODEL_MANAGERS);
		createEReference(applicationEClass, APPLICATION__LIBRARIES);
		createEReference(applicationEClass, APPLICATION__ALL_VIEW_PROFILES);
		createEReference(applicationEClass, APPLICATION__ALL_SYSTEM_ACTIONS);
		createEReference(applicationEClass, APPLICATION__ALL_COMMANDS);
		createEReference(applicationEClass, APPLICATION__ALL_CONVERTERS);
		createEReference(applicationEClass, APPLICATION__ALL_VALIDATORS);
		createEReference(applicationEClass, APPLICATION__ALL_TYPES);
		createEReference(applicationEClass, APPLICATION__ALL_IMAGES);
		createEReference(applicationEClass, APPLICATION__AUTHENTICATION);
		createEReference(applicationEClass, APPLICATION__MANDATORY_FIELD);
		createEReference(applicationEClass, APPLICATION__WIZARDS);

		dataCompositeEClass = createEClass(DATA_COMPOSITE);
		createEReference(dataCompositeEClass, DATA_COMPOSITE__ITEMS);

		dataGroupEClass = createEClass(DATA_GROUP);
		createEReference(dataGroupEClass, DATA_GROUP__LAYOUT);

		dataItemEClass = createEClass(DATA_ITEM);
		createEAttribute(dataItemEClass, DATA_ITEM__MANDATORY);
		createEReference(dataItemEClass, DATA_ITEM__LABEL);
		createEReference(dataItemEClass, DATA_ITEM__HELP);
		createEReference(dataItemEClass, DATA_ITEM__LAYOUT_DATA);

		dataReferenceEClass = createEClass(DATA_REFERENCE);
		createEReference(dataReferenceEClass, DATA_REFERENCE__DATA_FORM);
		createEReference(dataReferenceEClass, DATA_REFERENCE__DATA_TYPE);

		uiObjectEClass = createEClass(UI_OBJECT);
		createEAttribute(uiObjectEClass, UI_OBJECT__VIEW_ID);
		createEAttribute(uiObjectEClass, UI_OBJECT__VISIBLE);
		createEAttribute(uiObjectEClass, UI_OBJECT__ENABLED);
		createEReference(uiObjectEClass, UI_OBJECT__TRIGGERS);

		commandEClass = createEClass(COMMAND);

		actionEClass = createEClass(ACTION);

		systemActionEClass = createEClass(SYSTEM_ACTION);
		createEReference(systemActionEClass, SYSTEM_ACTION__COMMANDS);

		applicationActionEClass = createEClass(APPLICATION_ACTION);

		dataFormFolderEClass = createEClass(DATA_FORM_FOLDER);
		createEReference(dataFormFolderEClass, DATA_FORM_FOLDER__DATA_FORMS);
		createEReference(dataFormFolderEClass,
				DATA_FORM_FOLDER__DEFAULT_DATA_FORM);

		typeToDataFormFolderEntryMapEClass = createEClass(TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP);
		createEReference(typeToDataFormFolderEntryMapEClass,
				TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__KEY);
		createEReference(typeToDataFormFolderEntryMapEClass,
				TYPE_TO_DATA_FORM_FOLDER_ENTRY_MAP__VALUE);

		pmfEClass = createEClass(PMF);
		createEReference(pmfEClass, PMF__MODEL_MANAGER_FACTORIES);

		dataModelManagerFactoryEClass = createEClass(DATA_MODEL_MANAGER_FACTORY);

		dataConverterEClass = createEClass(DATA_CONVERTER);
		createEReference(dataConverterEClass, DATA_CONVERTER__FROM_TYPE);
		createEReference(dataConverterEClass, DATA_CONVERTER__TO_TYPE);

		validatorEClass = createEClass(VALIDATOR);

		viewProfileEClass = createEClass(VIEW_PROFILE);
		createEReference(viewProfileEClass, VIEW_PROFILE__CHILDREN);

		pmfObjectEClass = createEClass(PMF_OBJECT);
		createEAttribute(pmfObjectEClass, PMF_OBJECT__NAME);
		createEAttribute(pmfObjectEClass, PMF_OBJECT__DESCRIPTION);
		createEAttribute(pmfObjectEClass, PMF_OBJECT__ID);

		sorterEClass = createEClass(SORTER);
		createEReference(sorterEClass, SORTER__PROPERTY);
		createEAttribute(sorterEClass, SORTER__DIRECTION);
		createEAttribute(sorterEClass, SORTER__COMPARATOR);

		dataInheritanceEClass = createEClass(DATA_INHERITANCE);

		dataAssocicationEClass = createEClass(DATA_ASSOCICATION);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__VIEW_PROFILES);
		createEReference(libraryEClass, LIBRARY__SYSTEM_ACTIONS);
		createEReference(libraryEClass, LIBRARY__COMMANDS);
		createEReference(libraryEClass, LIBRARY__CONVERTERS);
		createEReference(libraryEClass, LIBRARY__VALIDATORS);
		createEReference(libraryEClass, LIBRARY__TYPES);
		createEReference(libraryEClass, LIBRARY__DATA_FORM_FOLDERS);
		createEReference(libraryEClass, LIBRARY__IMAGES);
		createEReference(libraryEClass, LIBRARY__EVENTS);

		regexValidatorEClass = createEClass(REGEX_VALIDATOR);
		createEAttribute(regexValidatorEClass, REGEX_VALIDATOR__EXPRESSION);

		eClassToEventEntryMapEClass = createEClass(ECLASS_TO_EVENT_ENTRY_MAP);
		createEReference(eClassToEventEntryMapEClass,
				ECLASS_TO_EVENT_ENTRY_MAP__KEY);
		createEReference(eClassToEventEntryMapEClass,
				ECLASS_TO_EVENT_ENTRY_MAP__VALUE);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass,
				AUTHENTICATION__SHOW_LOST_PASSWORD);
		createEAttribute(authenticationEClass, AUTHENTICATION__REGISTRATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__ANONYMOUS);

		wizardEClass = createEClass(WIZARD);
		createEReference(wizardEClass, WIZARD__WIZARD_PAGES);
		createEReference(wizardEClass, WIZARD__DATA_TYPE);
		createEAttribute(wizardEClass, WIZARD__CATEGORY);

		// Create enums
		sortingDirectionEEnum = createEEnum(SORTING_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage) EPackage.Registry.INSTANCE
				.getEPackage(UiPackage.eNS_URI);
		InteractivePackage theInteractivePackage = (InteractivePackage) EPackage.Registry.INSTANCE
				.getEPackage(InteractivePackage.eNS_URI);
		DatainputPackage theDatainputPackage = (DatainputPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI);
		DatabindingPackage theDatabindingPackage = (DatabindingPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI);
		TransformationPackage theTransformationPackage = (TransformationPackage) EPackage.Registry.INSTANCE
				.getEPackage(TransformationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataPackage);
		getESubpackages().add(theUiPackage);
		getESubpackages().add(theInteractivePackage);
		getESubpackages().add(theDatainputPackage);
		getESubpackages().add(theDatabindingPackage);
		getESubpackages().add(theTransformationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataFormEClass.getESuperTypes().add(this.getDataElement());
		elementalDataFormEClass.getESuperTypes().add(this.getDataForm());
		compositeDataFormEClass.getESuperTypes().add(this.getDataForm());
		dataFormSelectorEClass.getESuperTypes()
				.add(this.getCompositeDataForm());
		dataFieldEClass.getESuperTypes().add(this.getDataItem());
		dataElementEClass.getESuperTypes().add(this.getUIObject());
		dataCollectionEClass.getESuperTypes().add(this.getDataComposite());
		applicationEClass.getESuperTypes().add(this.getLibrary());
		dataCompositeEClass.getESuperTypes().add(this.getDataItem());
		dataGroupEClass.getESuperTypes().add(this.getDataComposite());
		dataItemEClass.getESuperTypes().add(this.getDataElement());
		dataReferenceEClass.getESuperTypes().add(this.getDataComposite());
		uiObjectEClass.getESuperTypes().add(this.getPMFObject());
		commandEClass.getESuperTypes().add(this.getPMFObject());
		actionEClass.getESuperTypes().add(this.getPMFObject());
		systemActionEClass.getESuperTypes().add(this.getAction());
		applicationActionEClass.getESuperTypes().add(this.getAction());
		dataConverterEClass.getESuperTypes().add(this.getPMFObject());
		validatorEClass.getESuperTypes().add(this.getPMFObject());
		dataInheritanceEClass.getESuperTypes().add(this.getDataReference());
		dataAssocicationEClass.getESuperTypes().add(this.getDataReference());
		libraryEClass.getESuperTypes().add(this.getPMFObject());
		regexValidatorEClass.getESuperTypes().add(this.getValidator());
		wizardEClass.getESuperTypes().add(this.getPMFObject());

		// Initialize classes and features; add operations and parameters
		initEClass(dataFormEClass, DataForm.class, "DataForm", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementalDataFormEClass, ElementalDataForm.class,
				"ElementalDataForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementalDataForm_Validators(), this.getValidator(),
				null, "validators", null, 0, -1, ElementalDataForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getElementalDataForm_LocalValidators(),
				this.getValidator(), null, "localValidators", null, 0, -1,
				ElementalDataForm.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementalDataForm_Children(), this.getDataItem(),
				null, "children", null, 0, -1, ElementalDataForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getElementalDataForm_ViewProfiles(),
				this.getViewProfile(), null, "viewProfiles", null, 0, -1,
				ElementalDataForm.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementalDataForm_Layout(), theUiPackage.getLayout(),
				null, "layout", null, 0, 1, ElementalDataForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(compositeDataFormEClass, CompositeDataForm.class,
				"CompositeDataForm", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDataForm_Elements(),
				this.getElementalDataForm(), null, "elements", null, 0, -1,
				CompositeDataForm.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFormSelectorEClass, DataFormSelector.class,
				"DataFormSelector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFormSelector_UIMode(), ecorePackage.getEString(),
				"UIMode", null, 0, 1, DataFormSelector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataFieldEClass, DataField.class, "DataField", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataElementEClass, DataElement.class, "DataElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataElement_DataContextType(),
				theDataPackage.getDataType(), null, "dataContextType", null, 0,
				1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataElement_DataBinding(),
				theDatabindingPackage.getDataBinding(), null, "dataBinding",
				null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataElement_ResolvedTargetContextType(),
				theDataPackage.getDataType(), null,
				"resolvedTargetContextType", null, 0, 1, DataElement.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDataElement_ResolvedDataContextType(),
				theDataPackage.getDataType(), null, "resolvedDataContextType",
				null, 0, 1, DataElement.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataElement_Changeable(), ecorePackage.getEBoolean(),
				"changeable", "true", 0, 1, DataElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataElement_PropertyChanged(),
				ecorePackage.getEString(), "propertyChanged", null, 0, 1,
				DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataElement_Control(), theUiPackage.getUIElement(),
				null, "control", null, 0, 1, DataElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dataElementEClass, theDataPackage.getDataType(),
				"findBindingContextType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataCollectionEClass, DataCollection.class,
				"DataCollection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCollection_AddNew(), ecorePackage.getEBoolean(),
				"addNew", "true", 0, 1, DataCollection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCollection_Removable(),
				theEcorePackage.getEBoolean(), "removable", null, 0, 1,
				DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDataCollection_Reorderable(),
				theEcorePackage.getEBoolean(), "reorderable", "true", 0, 1,
				DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDataCollection_Editable(),
				ecorePackage.getEBoolean(), "editable", null, 0, 1,
				DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDataCollection_Columns(),
				theDataPackage.getDataProperty(), null, "columns", null, 0, -1,
				DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollection_Sorters(), this.getSorter(), null,
				"sorters", null, 0, -1, DataCollection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollection_Editor(), this.getDataForm(), null,
				"editor", null, 0, 1, DataCollection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollection_Detail(), this.getDataForm(), null,
				"detail", null, 0, 1, DataCollection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Main(), theUiPackage.getContainer(),
				null, "main", null, 1, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_DataModelManagers(),
				theDataPackage.getDataModelManager(), null,
				"dataModelManagers", null, 0, -1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_Libraries(), this.getLibrary(), null,
				"libraries", null, 0, -1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_AllViewProfiles(), this.getViewProfile(),
				null, "allViewProfiles", null, 0, -1, Application.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_AllSystemActions(),
				this.getSystemAction(), null, "allSystemActions", null, 0, -1,
				Application.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_AllCommands(), this.getCommand(), null,
				"allCommands", null, 0, -1, Application.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_AllConverters(), this.getDataConverter(),
				null, "allConverters", null, 0, -1, Application.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_AllValidators(), this.getValidator(),
				null, "allValidators", null, 0, -1, Application.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_AllTypes(), theDataPackage.getDataType(),
				null, "allTypes", null, 0, -1, Application.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_AllImages(), theUiPackage.getImage(),
				null, "allImages", null, 0, -1, Application.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_Authentication(),
				this.getAuthentication(), null, "authentication", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_MandatoryField(), this.getValidator(),
				null, "mandatoryField", null, 1, 1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApplication_Wizards(), this.getWizard(), null,
				"wizards", null, 0, -1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(applicationEClass, null, "importModel",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEResource(), "resource", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(dataCompositeEClass, DataComposite.class, "DataComposite",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataComposite_Items(), this.getDataItem(), null,
				"items", null, 0, -1, DataComposite.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGroupEClass, DataGroup.class, "DataGroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataGroup_Layout(), theUiPackage.getLayout(), null,
				"layout", null, 0, 1, DataGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemEClass, DataItem.class, "DataItem", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataItem_Mandatory(), theEcorePackage.getEBoolean(),
				"mandatory", null, 0, 1, DataItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_Label(), theUiPackage.getControl(), null,
				"label", null, 0, 1, DataItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_Help(), theUiPackage.getControl(), null,
				"help", null, 0, 1, DataItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItem_LayoutData(), theUiPackage.getLayoutData(),
				null, "layoutData", null, 0, 1, DataItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReferenceEClass, DataReference.class, "DataReference",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataReference_DataForm(), this.getDataForm(), null,
				"dataForm", null, 0, 1, DataReference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataReference_DataType(),
				theDataPackage.getDataType(), null, "dataType", null, 0, 1,
				DataReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiObjectEClass, UIObject.class, "UIObject", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIObject_ViewID(), theEcorePackage.getEString(),
				"viewID", null, 0, 1, UIObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIObject_Visible(), ecorePackage.getEBoolean(),
				"visible", "true", 0, 1, UIObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIObject_Enabled(), ecorePackage.getEBoolean(),
				"enabled", "true", 0, 1, UIObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUIObject_Triggers(),
				theInteractivePackage.getTrigger(), null, "triggers", null, 0,
				-1, UIObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemActionEClass, SystemAction.class, "SystemAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemAction_Commands(), this.getCommand(), null,
				"commands", null, 0, 1, SystemAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationActionEClass, ApplicationAction.class,
				"ApplicationAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFormFolderEClass, DataFormFolder.class,
				"DataFormFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFormFolder_DataForms(), this.getDataForm(), null,
				"dataForms", null, 0, -1, DataFormFolder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFormFolder_DefaultDataForm(), this.getDataForm(),
				null, "defaultDataForm", null, 0, 1, DataFormFolder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeToDataFormFolderEntryMapEClass, Map.Entry.class,
				"TypeToDataFormFolderEntryMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeToDataFormFolderEntryMap_Key(),
				theDataPackage.getDataType(), null, "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTypeToDataFormFolderEntryMap_Value(),
				this.getDataFormFolder(), null, "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pmfEClass, org.eclipse.pmf.pim.PMF.class, "PMF",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPMF_ModelManagerFactories(),
				this.getDataModelManagerFactory(), null,
				"modelManagerFactories", null, 0, -1,
				org.eclipse.pmf.pim.PMF.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(pmfEClass, theDataPackage.getDataModelManager(),
				"getDataModelManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "dataType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(dataModelManagerFactoryEClass,
				DataModelManagerFactory.class, "DataModelManagerFactory",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataModelManagerFactoryEClass,
				theDataPackage.getDataModelManager(), "createDataModelManager",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataModelManagerFactoryEClass,
				ecorePackage.getEBoolean(), "isTargetFor", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "dataType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(dataConverterEClass, DataConverter.class, "DataConverter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataConverter_FromType(),
				theDataPackage.getDataType(), null, "fromType", null, 1, 1,
				DataConverter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConverter_ToType(), theDataPackage.getDataType(),
				null, "toType", null, 1, 1, DataConverter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewProfileEClass, ViewProfile.class, "ViewProfile",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewProfile_Children(), this.getViewProfile(), null,
				"children", null, 0, -1, ViewProfile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pmfObjectEClass, PMFObject.class, "PMFObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPMFObject_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, PMFObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPMFObject_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, PMFObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMFObject_Id(), ecorePackage.getEString(), "id",
				null, 0, 1, PMFObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sorterEClass, Sorter.class, "Sorter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorter_Property(), theDataPackage.getDataProperty(),
				null, "property", null, 1, 1, Sorter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSorter_Direction(), this.getSortingDirection(),
				"direction", null, 0, 1, Sorter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSorter_Comparator(), ecorePackage.getEString(),
				"comparator", null, 0, 1, Sorter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataInheritanceEClass, DataInheritance.class,
				"DataInheritance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAssocicationEClass, DataAssocication.class,
				"DataAssocication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_ViewProfiles(), this.getViewProfile(), null,
				"viewProfiles", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_SystemActions(), this.getSystemAction(),
				null, "systemActions", null, 0, -1, Library.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLibrary_Commands(), this.getCommand(), null,
				"commands", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Converters(), this.getDataConverter(), null,
				"converters", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Validators(), this.getValidator(), null,
				"validators", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Types(), theDataPackage.getDataType(), null,
				"types", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_DataFormFolders(),
				this.getTypeToDataFormFolderEntryMap(), null,
				"dataFormFolders", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Images(), theUiPackage.getImage(), null,
				"images", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Events(), this.getEClassToEventEntryMap(),
				null, "events", null, 0, -1, Library.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(libraryEClass, this.getDataFormFolder(),
				"getDataFormFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataType(), "dataType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(regexValidatorEClass, RegexValidator.class,
				"RegexValidator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegexValidator_Expression(),
				ecorePackage.getEString(), "expression", null, 0, 1,
				RegexValidator.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eClassToEventEntryMapEClass, Map.Entry.class,
				"EClassToEventEntryMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassToEventEntryMap_Key(),
				ecorePackage.getEClass(), null, "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClassToEventEntryMap_Value(),
				theUiPackage.getUIEvent(), null, "value", null, 1, -1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class,
				"Authentication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_ShowLostPassword(),
				theEcorePackage.getEBoolean(), "showLostPassword", "true", 0,
				1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAuthentication_Registration(),
				theEcorePackage.getEBoolean(), "registration", "true", 0, 1,
				Authentication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAuthentication_Anonymous(),
				theEcorePackage.getEBoolean(), "anonymous", "true", 0, 1,
				Authentication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizard_WizardPages(), theUiPackage.getWizardPage(),
				null, "wizardPages", null, 1, -1, Wizard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_DataType(), theDataPackage.getDataType(),
				null, "dataType", null, 1, 1, Wizard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWizard_Category(), ecorePackage.getEString(),
				"category", null, 0, 1, Wizard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sortingDirectionEEnum, SortingDirection.class,
				"SortingDirection");
		addEEnumLiteral(sortingDirectionEEnum, SortingDirection.ASCENDING);
		addEEnumLiteral(sortingDirectionEEnum, SortingDirection.DESCENDING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// pmf
		createPmfAnnotations();
		// GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(dataElementEClass, source, new String[] { "constraints",
				"TypeMismatch" });
	}

	/**
	 * Initializes the annotations for <b>pmf</b>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void createPmfAnnotations() {
		String source = "pmf";
		addAnnotation(getDataElement_PropertyChanged(), source, new String[] {
				"event", "true" });
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "GenModel";
		addAnnotation(
				applicationEClass,
				source,
				new String[] { "documentation",
						"This class manages all information about the target application." });
		addAnnotation(
				libraryEClass,
				source,
				new String[] { "documentation",
						"This class manages all information about the target application." });
	}

} // PMFPackageImpl
