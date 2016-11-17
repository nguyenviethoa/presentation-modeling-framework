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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.pmf.pim.ui.BooleanButton;
import org.eclipse.pmf.pim.ui.Button;
import org.eclipse.pmf.pim.ui.Color;
import org.eclipse.pmf.pim.ui.Combo;
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
import org.eclipse.pmf.pim.ui.UIEvent;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.VerticalAlignmentGridData;
import org.eclipse.pmf.pim.ui.ViewPart;
import org.eclipse.pmf.pim.ui.Window;
import org.eclipse.pmf.pim.ui.WizardPage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class UiFactoryImpl extends EFactoryImpl implements UiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static UiFactory init() {
		try {
			UiFactory theUiFactory = (UiFactory) EPackage.Registry.INSTANCE
					.getEFactory(UiPackage.eNS_URI);
			if (theUiFactory != null) {
				return theUiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public UiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UiPackage.TEXT:
			return createText();
		case UiPackage.STACK_PANEL:
			return createStackPanel();
		case UiPackage.SEPARATOR:
			return createSeparator();
		case UiPackage.LABEL:
			return createLabel();
		case UiPackage.IMAGE:
			return createImage();
		case UiPackage.WINDOW:
			return createWindow();
		case UiPackage.BUTTON:
			return createButton();
		case UiPackage.COMBO:
			return createCombo();
		case UiPackage.GROUP_BOX:
			return createGroupBox();
		case UiPackage.BOOLEAN_BUTTON:
			return createBooleanButton();
		case UiPackage.SELECTOR:
			return createSelector();
		case UiPackage.LIST_VIEW:
			return createListView();
		case UiPackage.FINDER:
			return createFinder();
		case UiPackage.MENU_ITEM:
			return createMenuItem();
		case UiPackage.CONTAINER:
			return createContainer();
		case UiPackage.VIEW_PART:
			return createViewPart();
		case UiPackage.SASH_FROM:
			return createSashFrom();
		case UiPackage.UI_EVENT:
			return createUIEvent();
		case UiPackage.COLOR:
			return createColor();
		case UiPackage.FONT:
			return createFont();
		case UiPackage.PART:
			return createPart();
		case UiPackage.PROPERTIES_PART:
			return createPropertiesPart();
		case UiPackage.PROPERTY_TAB:
			return createPropertyTab();
		case UiPackage.TAB:
			return createTab();
		case UiPackage.TAB_SET:
			return createTabSet();
		case UiPackage.TABLE:
			return createTable();
		case UiPackage.RICH_TEXT:
			return createRichText();
		case UiPackage.DATE_TIME_PICKER:
			return createDateTimePicker();
		case UiPackage.HYPERLINK:
			return createHyperlink();
		case UiPackage.PAGE:
			return createPage();
		case UiPackage.WIZARD_PAGE:
			return createWizardPage();
		case UiPackage.MESSAGE_DIALOG:
			return createMessageDialog();
		case UiPackage.RADIO_BUTTON:
			return createRadioButton();
		case UiPackage.GRID_LAYOUT:
			return createGridLayout();
		case UiPackage.GRID_DATA:
			return createGridData();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UiPackage.ORIENTATION:
			return createOrientationFromString(eDataType, initialValue);
		case UiPackage.FONT_STYLE:
			return createFontStyleFromString(eDataType, initialValue);
		case UiPackage.DIALOG_MESSAGE_TYPE:
			return createDialogMessageTypeFromString(eDataType, initialValue);
		case UiPackage.HORIZONTAL_ALIGNMENT_GRID_DATA:
			return createHorizontalAlignmentGridDataFromString(eDataType,
					initialValue);
		case UiPackage.VERTICAL_ALIGNMENT_GRID_DATA:
			return createVerticalAlignmentGridDataFromString(eDataType,
					initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UiPackage.ORIENTATION:
			return convertOrientationToString(eDataType, instanceValue);
		case UiPackage.FONT_STYLE:
			return convertFontStyleToString(eDataType, instanceValue);
		case UiPackage.DIALOG_MESSAGE_TYPE:
			return convertDialogMessageTypeToString(eDataType, instanceValue);
		case UiPackage.HORIZONTAL_ALIGNMENT_GRID_DATA:
			return convertHorizontalAlignmentGridDataToString(eDataType,
					instanceValue);
		case UiPackage.VERTICAL_ALIGNMENT_GRID_DATA:
			return convertVerticalAlignmentGridDataToString(eDataType,
					instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StackPanel createStackPanel() {
		StackPanelImpl stackPanel = new StackPanelImpl();
		return stackPanel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combo createCombo() {
		ComboImpl combo = new ComboImpl();
		return combo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GroupBox createGroupBox() {
		GroupBoxImpl groupBox = new GroupBoxImpl();
		return groupBox;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanButton createBooleanButton() {
		BooleanButtonImpl booleanButton = new BooleanButtonImpl();
		return booleanButton;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Selector createSelector() {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ListView createListView() {
		ListViewImpl listView = new ListViewImpl();
		return listView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Finder createFinder() {
		FinderImpl finder = new FinderImpl();
		return finder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.pmf.pim.ui.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPart createViewPart() {
		ViewPartImpl viewPart = new ViewPartImpl();
		return viewPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SashFrom createSashFrom() {
		SashFromImpl sashFrom = new SashFromImpl();
		return sashFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIEvent createUIEvent() {
		UIEventImpl uiEvent = new UIEventImpl();
		return uiEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesPart createPropertiesPart() {
		PropertiesPartImpl propertiesPart = new PropertiesPartImpl();
		return propertiesPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab createPropertyTab() {
		PropertyTabImpl propertyTab = new PropertyTabImpl();
		return propertyTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabSet createTabSet() {
		TabSetImpl tabSet = new TabSetImpl();
		return tabSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichText createRichText() {
		RichTextImpl richText = new RichTextImpl();
		return richText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePicker createDateTimePicker() {
		DateTimePickerImpl dateTimePicker = new DateTimePickerImpl();
		return dateTimePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hyperlink createHyperlink() {
		HyperlinkImpl hyperlink = new HyperlinkImpl();
		return hyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPage createWizardPage() {
		WizardPageImpl wizardPage = new WizardPageImpl();
		return wizardPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDialog createMessageDialog() {
		MessageDialogImpl messageDialog = new MessageDialogImpl();
		return messageDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLayout createGridLayout() {
		GridLayoutImpl gridLayout = new GridLayoutImpl();
		return gridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridData createGridData() {
		GridDataImpl gridData = new GridDataImpl();
		return gridData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType,
			String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType,
			String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogMessageType createDialogMessageTypeFromString(
			EDataType eDataType, String initialValue) {
		DialogMessageType result = DialogMessageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialogMessageTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAlignmentGridData createHorizontalAlignmentGridDataFromString(
			EDataType eDataType, String initialValue) {
		HorizontalAlignmentGridData result = HorizontalAlignmentGridData
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalAlignmentGridDataToString(
			EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignmentGridData createVerticalAlignmentGridDataFromString(
			EDataType eDataType, String initialValue) {
		VerticalAlignmentGridData result = VerticalAlignmentGridData
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignmentGridDataToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiPackage getUiPackage() {
		return (UiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiPackage getPackage() {
		return UiPackage.eINSTANCE;
	}

} // UiFactoryImpl
