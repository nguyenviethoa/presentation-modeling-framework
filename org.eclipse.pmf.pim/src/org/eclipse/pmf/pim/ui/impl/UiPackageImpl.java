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

import static org.eclipse.pmf.pim.ui.UiPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.impl.DataPackageImpl;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.databinding.impl.DatabindingPackageImpl;
import org.eclipse.pmf.pim.datainput.DatainputPackage;
import org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl;
import org.eclipse.pmf.pim.impl.PMFPackageImpl;
import org.eclipse.pmf.pim.interactive.InteractivePackage;
import org.eclipse.pmf.pim.interactive.impl.InteractivePackageImpl;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.transformation.impl.TransformationPackageImpl;
import org.eclipse.pmf.pim.ui.BooleanButton;
import org.eclipse.pmf.pim.ui.Button;
import org.eclipse.pmf.pim.ui.Color;
import org.eclipse.pmf.pim.ui.Combo;
import org.eclipse.pmf.pim.ui.Control;
import org.eclipse.pmf.pim.ui.DateTimePicker;
import org.eclipse.pmf.pim.ui.DialogMessageType;
import org.eclipse.pmf.pim.ui.Finder;
import org.eclipse.pmf.pim.ui.Font;
import org.eclipse.pmf.pim.ui.FontStyle;
import org.eclipse.pmf.pim.ui.GridData;
import org.eclipse.pmf.pim.ui.GridLayout;
import org.eclipse.pmf.pim.ui.GroupBox;
import org.eclipse.pmf.pim.ui.HorizontalAlignmentGridData;
import org.eclipse.pmf.pim.ui.Hyperlink;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.ui.Label;
import org.eclipse.pmf.pim.ui.Layout;
import org.eclipse.pmf.pim.ui.LayoutData;
import org.eclipse.pmf.pim.ui.ListView;
import org.eclipse.pmf.pim.ui.MenuItem;
import org.eclipse.pmf.pim.ui.MessageDialog;
import org.eclipse.pmf.pim.ui.Orientation;
import org.eclipse.pmf.pim.ui.Page;
import org.eclipse.pmf.pim.ui.Part;
import org.eclipse.pmf.pim.ui.PropertiesPart;
import org.eclipse.pmf.pim.ui.PropertyTab;
import org.eclipse.pmf.pim.ui.RadioButton;
import org.eclipse.pmf.pim.ui.RichText;
import org.eclipse.pmf.pim.ui.SashFrom;
import org.eclipse.pmf.pim.ui.Selector;
import org.eclipse.pmf.pim.ui.Separator;
import org.eclipse.pmf.pim.ui.StackPanel;
import org.eclipse.pmf.pim.ui.Tab;
import org.eclipse.pmf.pim.ui.TabSet;
import org.eclipse.pmf.pim.ui.Table;
import org.eclipse.pmf.pim.ui.Text;
import org.eclipse.pmf.pim.ui.UIElement;
import org.eclipse.pmf.pim.ui.UIEvent;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.VerticalAlignmentGridData;
import org.eclipse.pmf.pim.ui.ViewPart;
import org.eclipse.pmf.pim.ui.Window;
import org.eclipse.pmf.pim.ui.WizardPage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackPanelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupBoxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sashFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEventEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesPartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dialogMessageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horizontalAlignmentGridDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignmentGridDataEEnum = null;

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
	 * @see org.eclipse.pmf.pim.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * This method is used to initialize {@link UiPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited)
			return (UiPackage) EPackage.Registry.INSTANCE
					.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new UiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PMFPackageImpl thePMFPackage = (PMFPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) instanceof PMFPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI) : PMFPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
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
		theUiPackage.createPackageContents();
		thePMFPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theInteractivePackage.createPackageContents();
		theDatainputPackage.createPackageContents();
		theDatabindingPackage.createPackageContents();
		theTransformationPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		thePMFPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theInteractivePackage.initializePackageContents();
		theDatainputPackage.initializePackageContents();
		theDatabindingPackage.initializePackageContents();
		theTransformationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Modify() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackPanel() {
		return stackPanelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparator_Orientation() {
		return (EAttribute) separatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Text() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Image() {
		return (EReference) labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Title() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Open() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Close() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Text() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Selection() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Image() {
		return (EReference) buttonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombo() {
		return comboEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupBox() {
		return groupBoxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupBox_Title() {
		return (EReference) groupBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupBox_Collapsible() {
		return (EAttribute) groupBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupBox_Collapse() {
		return (EAttribute) groupBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupBox_Expand() {
		return (EAttribute) groupBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanButton() {
		return booleanButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanButton_Selected() {
		return (EAttribute) booleanButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelector_Selection() {
		return (EAttribute) selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListView() {
		return listViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinder() {
		return finderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIElement() {
		return uiElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIElement_Foreground() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIElement_Background() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIElement_Font() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIElement_ToolTip() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItem() {
		return menuItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Children() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPart() {
		return viewPartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPart_DataInput() {
		return (EReference) viewPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPart_DataForm() {
		return (EReference) viewPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSashFrom() {
		return sashFromEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSashFrom_Orientation() {
		return (EAttribute) sashFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIEvent() {
		return uiEventEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Red() {
		return (EAttribute) colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Blue() {
		return (EAttribute) colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Green() {
		return (EAttribute) colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Opacity() {
		return (EAttribute) colorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Size() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Name() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Style() {
		return (EAttribute) fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesPart() {
		return propertiesPartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesPart_Tabs() {
		return (EReference) propertiesPartEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesPart_DataType() {
		return (EReference) propertiesPartEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyTab() {
		return propertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyTab_Content() {
		return (EReference) propertyTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabSet() {
		return tabSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichText() {
		return richTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimePicker() {
		return dateTimePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimePicker_DateOnly() {
		return (EAttribute) dateTimePickerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperlink() {
		return hyperlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperlink_Url() {
		return (EAttribute) hyperlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TransactionEdition() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Content() {
		return (EReference) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardPage() {
		return wizardPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardPage_BindingPath() {
		return (EReference) wizardPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDialog() {
		return messageDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDialog_Message() {
		return (EAttribute) messageDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDialog_MessageType() {
		return (EAttribute) messageDialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioButton_Selected() {
		return (EAttribute) radioButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridLayout() {
		return gridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridLayout_NumColumns() {
		return (EAttribute) gridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridLayout_MakeColumnsEqualWidth() {
		return (EAttribute) gridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridLayout_HorizontalSpacing() {
		return (EAttribute) gridLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridLayout_VerticalSpacing() {
		return (EAttribute) gridLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutData() {
		return layoutDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridData() {
		return gridDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_HorizontalSpan() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_VerticalSpan() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_HorizontalAlignment() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_VerticalAlignment() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_GrabExcessHorizontalSpace() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridData_GrabExcessVerticalSpace() {
		return (EAttribute) gridDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDialogMessageType() {
		return dialogMessageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHorizontalAlignmentGridData() {
		return horizontalAlignmentGridDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalAlignmentGridData() {
		return verticalAlignmentGridDataEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory) getEFactoryInstance();
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
		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);
		createEAttribute(textEClass, TEXT__MODIFY);

		stackPanelEClass = createEClass(STACK_PANEL);

		separatorEClass = createEClass(SEPARATOR);
		createEAttribute(separatorEClass, SEPARATOR__ORIENTATION);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__TEXT);
		createEReference(labelEClass, LABEL__IMAGE);

		imageEClass = createEClass(IMAGE);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__TITLE);
		createEAttribute(windowEClass, WINDOW__OPEN);
		createEAttribute(windowEClass, WINDOW__CLOSE);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__TEXT);
		createEAttribute(buttonEClass, BUTTON__SELECTION);
		createEReference(buttonEClass, BUTTON__IMAGE);

		comboEClass = createEClass(COMBO);

		groupBoxEClass = createEClass(GROUP_BOX);
		createEReference(groupBoxEClass, GROUP_BOX__TITLE);
		createEAttribute(groupBoxEClass, GROUP_BOX__COLLAPSIBLE);
		createEAttribute(groupBoxEClass, GROUP_BOX__COLLAPSE);
		createEAttribute(groupBoxEClass, GROUP_BOX__EXPAND);

		booleanButtonEClass = createEClass(BOOLEAN_BUTTON);
		createEAttribute(booleanButtonEClass, BOOLEAN_BUTTON__SELECTED);

		selectorEClass = createEClass(SELECTOR);
		createEAttribute(selectorEClass, SELECTOR__SELECTION);

		controlEClass = createEClass(CONTROL);

		listViewEClass = createEClass(LIST_VIEW);

		finderEClass = createEClass(FINDER);

		uiElementEClass = createEClass(UI_ELEMENT);
		createEReference(uiElementEClass, UI_ELEMENT__FOREGROUND);
		createEReference(uiElementEClass, UI_ELEMENT__BACKGROUND);
		createEReference(uiElementEClass, UI_ELEMENT__FONT);
		createEReference(uiElementEClass, UI_ELEMENT__TOOL_TIP);

		menuItemEClass = createEClass(MENU_ITEM);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CHILDREN);

		viewPartEClass = createEClass(VIEW_PART);
		createEReference(viewPartEClass, VIEW_PART__DATA_INPUT);
		createEReference(viewPartEClass, VIEW_PART__DATA_FORM);

		sashFromEClass = createEClass(SASH_FROM);
		createEAttribute(sashFromEClass, SASH_FROM__ORIENTATION);

		uiEventEClass = createEClass(UI_EVENT);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__RED);
		createEAttribute(colorEClass, COLOR__BLUE);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__OPACITY);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__SIZE);
		createEAttribute(fontEClass, FONT__NAME);
		createEAttribute(fontEClass, FONT__STYLE);

		partEClass = createEClass(PART);

		propertiesPartEClass = createEClass(PROPERTIES_PART);
		createEReference(propertiesPartEClass, PROPERTIES_PART__TABS);
		createEReference(propertiesPartEClass, PROPERTIES_PART__DATA_TYPE);

		propertyTabEClass = createEClass(PROPERTY_TAB);
		createEReference(propertyTabEClass, PROPERTY_TAB__CONTENT);

		tabEClass = createEClass(TAB);

		tabSetEClass = createEClass(TAB_SET);

		tableEClass = createEClass(TABLE);

		richTextEClass = createEClass(RICH_TEXT);

		dateTimePickerEClass = createEClass(DATE_TIME_PICKER);
		createEAttribute(dateTimePickerEClass, DATE_TIME_PICKER__DATE_ONLY);

		hyperlinkEClass = createEClass(HYPERLINK);
		createEAttribute(hyperlinkEClass, HYPERLINK__URL);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TRANSACTION_EDITION);
		createEReference(pageEClass, PAGE__CONTENT);

		wizardPageEClass = createEClass(WIZARD_PAGE);
		createEReference(wizardPageEClass, WIZARD_PAGE__BINDING_PATH);

		messageDialogEClass = createEClass(MESSAGE_DIALOG);
		createEAttribute(messageDialogEClass, MESSAGE_DIALOG__MESSAGE);
		createEAttribute(messageDialogEClass, MESSAGE_DIALOG__MESSAGE_TYPE);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__SELECTED);

		layoutEClass = createEClass(LAYOUT);

		gridLayoutEClass = createEClass(GRID_LAYOUT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__NUM_COLUMNS);
		createEAttribute(gridLayoutEClass,
				GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__HORIZONTAL_SPACING);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__VERTICAL_SPACING);

		layoutDataEClass = createEClass(LAYOUT_DATA);

		gridDataEClass = createEClass(GRID_DATA);
		createEAttribute(gridDataEClass, GRID_DATA__HORIZONTAL_SPAN);
		createEAttribute(gridDataEClass, GRID_DATA__VERTICAL_SPAN);
		createEAttribute(gridDataEClass, GRID_DATA__HORIZONTAL_ALIGNMENT);
		createEAttribute(gridDataEClass, GRID_DATA__VERTICAL_ALIGNMENT);
		createEAttribute(gridDataEClass,
				GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE);
		createEAttribute(gridDataEClass, GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE);

		// Create enums
		orientationEEnum = createEEnum(ORIENTATION);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		dialogMessageTypeEEnum = createEEnum(DIALOG_MESSAGE_TYPE);
		horizontalAlignmentGridDataEEnum = createEEnum(HORIZONTAL_ALIGNMENT_GRID_DATA);
		verticalAlignmentGridDataEEnum = createEEnum(VERTICAL_ALIGNMENT_GRID_DATA);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		PMFPackage thePMFPackage = (PMFPackage) EPackage.Registry.INSTANCE
				.getEPackage(PMFPackage.eNS_URI);
		DatainputPackage theDatainputPackage = (DatainputPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatainputPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataPackage.eNS_URI);
		DatabindingPackage theDatabindingPackage = (DatabindingPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatabindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textEClass.getESuperTypes().add(this.getControl());
		stackPanelEClass.getESuperTypes().add(this.getContainer());
		separatorEClass.getESuperTypes().add(this.getControl());
		labelEClass.getESuperTypes().add(this.getControl());
		imageEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		windowEClass.getESuperTypes().add(this.getPage());
		buttonEClass.getESuperTypes().add(this.getControl());
		comboEClass.getESuperTypes().add(this.getControl());
		groupBoxEClass.getESuperTypes().add(this.getContainer());
		booleanButtonEClass.getESuperTypes().add(this.getButton());
		selectorEClass.getESuperTypes().add(this.getControl());
		controlEClass.getESuperTypes().add(this.getUIElement());
		listViewEClass.getESuperTypes().add(this.getUIElement());
		finderEClass.getESuperTypes().add(this.getWindow());
		uiElementEClass.getESuperTypes().add(thePMFPackage.getUIObject());
		menuItemEClass.getESuperTypes().add(this.getControl());
		containerEClass.getESuperTypes().add(this.getUIElement());
		viewPartEClass.getESuperTypes().add(this.getUIElement());
		sashFromEClass.getESuperTypes().add(this.getContainer());
		uiEventEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		partEClass.getESuperTypes().add(this.getUIElement());
		propertiesPartEClass.getESuperTypes().add(this.getPart());
		propertyTabEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		tabEClass.getESuperTypes().add(thePMFPackage.getPMFObject());
		tabSetEClass.getESuperTypes().add(this.getContainer());
		tableEClass.getESuperTypes().add(this.getUIElement());
		richTextEClass.getESuperTypes().add(this.getText());
		dateTimePickerEClass.getESuperTypes().add(this.getControl());
		hyperlinkEClass.getESuperTypes().add(this.getLabel());
		pageEClass.getESuperTypes().add(this.getPart());
		wizardPageEClass.getESuperTypes().add(this.getPage());
		messageDialogEClass.getESuperTypes().add(this.getUIElement());
		radioButtonEClass.getESuperTypes().add(this.getButton());
		layoutEClass.getESuperTypes().add(thePMFPackage.getUIObject());
		gridLayoutEClass.getESuperTypes().add(this.getLayout());
		layoutDataEClass.getESuperTypes().add(thePMFPackage.getUIObject());
		gridDataEClass.getESuperTypes().add(this.getLayoutData());

		// Initialize classes and features; add operations and parameters
		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null,
				0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Modify(), ecorePackage.getEString(), "modify",
				null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stackPanelEClass, StackPanel.class, "StackPanel",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeparator_Orientation(), this.getOrientation(),
				"orientation", null, 0, 1, Separator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Text(), theEcorePackage.getEString(), "text",
				null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLabel_Image(), this.getImage(), null, "image", null,
				0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Title(), theEcorePackage.getEString(),
				"title", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getWindow_Open(), ecorePackage.getEString(), "open",
				null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getWindow_Close(), ecorePackage.getEString(), "close",
				null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Text(), theEcorePackage.getEString(), "text",
				null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getButton_Selection(), ecorePackage.getEString(),
				"selection", null, 0, 1, Button.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getButton_Image(), this.getImage(), null, "image", null,
				0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(comboEClass, Combo.class, "Combo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupBoxEClass, GroupBox.class, "GroupBox", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupBox_Title(), thePMFPackage.getUIObject(), null,
				"title", null, 0, 1, GroupBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBox_Collapsible(),
				theEcorePackage.getEBoolean(), "collapsible", null, 0, 1,
				GroupBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBox_Collapse(), ecorePackage.getEString(),
				"collapse", null, 0, 1, GroupBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBox_Expand(), ecorePackage.getEString(),
				"expand", null, 0, 1, GroupBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanButtonEClass, BooleanButton.class, "BooleanButton",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanButton_Selected(),
				theEcorePackage.getEBoolean(), "selected", "false", 0, 1,
				BooleanButton.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelector_Selection(), ecorePackage.getEString(),
				"selection", null, 0, 1, Selector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listViewEClass, ListView.class, "ListView", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finderEClass, Finder.class, "Finder", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiElementEClass, UIElement.class, "UIElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIElement_Foreground(), this.getColor(), null,
				"foreground", null, 0, 1, UIElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_Background(), this.getColor(), null,
				"background", null, 0, 1, UIElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_Font(), this.getFont(), null, "font", null,
				0, 1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIElement_ToolTip(), this.getUIElement(), null,
				"toolTip", null, 0, 1, UIElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, org.eclipse.pmf.pim.ui.Container.class,
				"Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Children(), thePMFPackage.getUIObject(),
				null, "children", null, 0, -1,
				org.eclipse.pmf.pim.ui.Container.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPartEClass, ViewPart.class, "ViewPart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPart_DataInput(),
				theDatainputPackage.getDataInput(), null, "dataInput", null, 1,
				1, ViewPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getViewPart_DataForm(), thePMFPackage.getDataForm(),
				null, "dataForm", null, 1, 1, ViewPart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sashFromEClass, SashFrom.class, "SashFrom", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSashFrom_Orientation(), this.getOrientation(),
				"orientation", null, 0, 1, SashFrom.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(uiEventEClass, UIEvent.class, "UIEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Red(), theEcorePackage.getEInt(), "Red", null,
				0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Blue(), theEcorePackage.getEInt(), "Blue",
				null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getColor_Green(), theEcorePackage.getEInt(), "Green",
				null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getColor_Opacity(), theEcorePackage.getEInt(),
				"opacity", null, 0, 1, Color.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Size(), theEcorePackage.getEInt(), "size", null,
				0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Name(), ecorePackage.getEString(), "name", null,
				0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Style(), this.getFontStyle(), "style", null, 0,
				1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertiesPartEClass, PropertiesPart.class,
				"PropertiesPart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesPart_Tabs(), this.getPropertyTab(), null,
				"tabs", null, 0, -1, PropertiesPart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertiesPart_DataType(),
				theDataPackage.getDataType(), null, "dataType", null, 1, 1,
				PropertiesPart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTabEClass, PropertyTab.class, "PropertyTab",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyTab_Content(), thePMFPackage.getDataForm(),
				null, "content", null, 0, 1, PropertyTab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabSetEClass, TabSet.class, "TabSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richTextEClass, RichText.class, "RichText", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTimePickerEClass, DateTimePicker.class,
				"DateTimePicker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimePicker_DateOnly(),
				ecorePackage.getEBoolean(), "dateOnly", null, 0, 1,
				DateTimePicker.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hyperlinkEClass, Hyperlink.class, "Hyperlink", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHyperlink_Url(), theEcorePackage.getEString(), "url",
				null, 0, 1, Hyperlink.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_TransactionEdition(),
				ecorePackage.getEBoolean(), "transactionEdition", "true", 0, 1,
				Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Content(), thePMFPackage.getDataForm(), null,
				"content", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wizardPageEClass, WizardPage.class, "WizardPage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizardPage_BindingPath(),
				theDatabindingPackage.getDataBindingPath(), null,
				"bindingPath", null, 0, 1, WizardPage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wizardPageEClass, theDataPackage.getDataType(),
				"getDataContextType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageDialogEClass, MessageDialog.class, "MessageDialog",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDialog_Message(), ecorePackage.getEString(),
				"message", null, 0, 1, MessageDialog.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDialog_MessageType(),
				this.getDialogMessageType(), "messageType", null, 0, 1,
				MessageDialog.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Selected(), ecorePackage.getEBoolean(),
				"selected", null, 0, 1, RadioButton.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridLayoutEClass, GridLayout.class, "GridLayout",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridLayout_NumColumns(), ecorePackage.getEInt(),
				"numColumns", null, 0, 1, GridLayout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MakeColumnsEqualWidth(),
				ecorePackage.getEBoolean(), "makeColumnsEqualWidth", null, 0,
				1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGridLayout_HorizontalSpacing(),
				ecorePackage.getEInt(), "horizontalSpacing", null, 0, 1,
				GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_VerticalSpacing(), ecorePackage.getEInt(),
				"verticalSpacing", null, 0, 1, GridLayout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(layoutDataEClass, LayoutData.class, "LayoutData",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridDataEClass, GridData.class, "GridData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridData_HorizontalSpan(), ecorePackage.getEInt(),
				"horizontalSpan", "1", 0, 1, GridData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_VerticalSpan(), ecorePackage.getEInt(),
				"verticalSpan", "1", 0, 1, GridData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_HorizontalAlignment(),
				this.getHorizontalAlignmentGridData(), "horizontalAlignment",
				null, 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGridData_VerticalAlignment(),
				this.getVerticalAlignmentGridData(), "verticalAlignment", null,
				0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGridData_GrabExcessHorizontalSpace(),
				ecorePackage.getEBoolean(), "grabExcessHorizontalSpace", null,
				0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGridData_GrabExcessVerticalSpace(),
				ecorePackage.getEBoolean(), "grabExcessVerticalSpace", null, 0,
				1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);
		addEEnumLiteral(fontStyleEEnum, FontStyle.BOLD);

		initEEnum(dialogMessageTypeEEnum, DialogMessageType.class,
				"DialogMessageType");
		addEEnumLiteral(dialogMessageTypeEEnum, DialogMessageType.INFOMATION);
		addEEnumLiteral(dialogMessageTypeEEnum, DialogMessageType.ERROR);
		addEEnumLiteral(dialogMessageTypeEEnum, DialogMessageType.WARNING);
		addEEnumLiteral(dialogMessageTypeEEnum, DialogMessageType.QUESTION);

		initEEnum(horizontalAlignmentGridDataEEnum,
				HorizontalAlignmentGridData.class,
				"HorizontalAlignmentGridData");
		addEEnumLiteral(horizontalAlignmentGridDataEEnum,
				HorizontalAlignmentGridData.FILL);
		addEEnumLiteral(horizontalAlignmentGridDataEEnum,
				HorizontalAlignmentGridData.CENTER);
		addEEnumLiteral(horizontalAlignmentGridDataEEnum,
				HorizontalAlignmentGridData.LEFT);
		addEEnumLiteral(horizontalAlignmentGridDataEEnum,
				HorizontalAlignmentGridData.RIGHT);

		initEEnum(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.class, "VerticalAlignmentGridData");
		addEEnumLiteral(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.FILL);
		addEEnumLiteral(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.BOTTOM);
		addEEnumLiteral(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.TOP);
		addEEnumLiteral(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.CENTER);
		addEEnumLiteral(verticalAlignmentGridDataEEnum,
				VerticalAlignmentGridData.END);

		// Create annotations
		// pmf
		createPmfAnnotations();
		// UIType
		createUITypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>pmf</b>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void createPmfAnnotations() {
		String source = "pmf";
		addAnnotation(getText_Modify(), source,
				new String[] { "event", "true" });
		addAnnotation(getWindow_Open(), source,
				new String[] { "event", "true" });
		addAnnotation(getWindow_Close(), source,
				new String[] { "event", "true" });
		addAnnotation(getButton_Selection(), source, new String[] { "event",
				"true" });
		addAnnotation(getGroupBox_Collapse(), source, new String[] { "event",
				"true" });
		addAnnotation(getGroupBox_Expand(), source, new String[] { "event",
				"true" });
		addAnnotation(getSelector_Selection(), source, new String[] { "event",
				"true" });
	}

	/**
	 * Initializes the annotations for <b>UIType</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUITypeAnnotations() {
		String source = "UIType";
		addAnnotation(uiElementEClass, source, new String[] {});
	}

} // UiPackageImpl
