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
package org.eclipse.pmf.pim.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.ui.BooleanButton;
import org.eclipse.pmf.pim.ui.Button;
import org.eclipse.pmf.pim.ui.Color;
import org.eclipse.pmf.pim.ui.Combo;
import org.eclipse.pmf.pim.ui.Container;
import org.eclipse.pmf.pim.ui.Control;
import org.eclipse.pmf.pim.ui.DateTimePicker;
import org.eclipse.pmf.pim.ui.Finder;
import org.eclipse.pmf.pim.ui.Font;
import org.eclipse.pmf.pim.ui.GridData;
import org.eclipse.pmf.pim.ui.GridLayout;
import org.eclipse.pmf.pim.ui.GroupBox;
import org.eclipse.pmf.pim.ui.Hyperlink;
import org.eclipse.pmf.pim.ui.Image;
import org.eclipse.pmf.pim.ui.Label;
import org.eclipse.pmf.pim.ui.Layout;
import org.eclipse.pmf.pim.ui.LayoutData;
import org.eclipse.pmf.pim.ui.ListView;
import org.eclipse.pmf.pim.ui.MenuItem;
import org.eclipse.pmf.pim.ui.MessageDialog;
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
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.pmf.pim.ui.ViewPart;
import org.eclipse.pmf.pim.ui.Window;
import org.eclipse.pmf.pim.ui.WizardPage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.ui.UiPackage
 * @generated
 */
public class UiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public UiSwitch() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UiPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseControl(text);
			if (result == null)
				result = caseUIElement(text);
			if (result == null)
				result = caseUIObject(text);
			if (result == null)
				result = casePMFObject(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.STACK_PANEL: {
			StackPanel stackPanel = (StackPanel) theEObject;
			T result = caseStackPanel(stackPanel);
			if (result == null)
				result = caseContainer(stackPanel);
			if (result == null)
				result = caseUIElement(stackPanel);
			if (result == null)
				result = caseUIObject(stackPanel);
			if (result == null)
				result = casePMFObject(stackPanel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.SEPARATOR: {
			Separator separator = (Separator) theEObject;
			T result = caseSeparator(separator);
			if (result == null)
				result = caseControl(separator);
			if (result == null)
				result = caseUIElement(separator);
			if (result == null)
				result = caseUIObject(separator);
			if (result == null)
				result = casePMFObject(separator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = caseControl(label);
			if (result == null)
				result = caseUIElement(label);
			if (result == null)
				result = caseUIObject(label);
			if (result == null)
				result = casePMFObject(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = casePMFObject(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.WINDOW: {
			Window window = (Window) theEObject;
			T result = caseWindow(window);
			if (result == null)
				result = casePage(window);
			if (result == null)
				result = casePart(window);
			if (result == null)
				result = caseUIElement(window);
			if (result == null)
				result = caseUIObject(window);
			if (result == null)
				result = casePMFObject(window);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseControl(button);
			if (result == null)
				result = caseUIElement(button);
			if (result == null)
				result = caseUIObject(button);
			if (result == null)
				result = casePMFObject(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.COMBO: {
			Combo combo = (Combo) theEObject;
			T result = caseCombo(combo);
			if (result == null)
				result = caseControl(combo);
			if (result == null)
				result = caseUIElement(combo);
			if (result == null)
				result = caseUIObject(combo);
			if (result == null)
				result = casePMFObject(combo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.GROUP_BOX: {
			GroupBox groupBox = (GroupBox) theEObject;
			T result = caseGroupBox(groupBox);
			if (result == null)
				result = caseContainer(groupBox);
			if (result == null)
				result = caseUIElement(groupBox);
			if (result == null)
				result = caseUIObject(groupBox);
			if (result == null)
				result = casePMFObject(groupBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.BOOLEAN_BUTTON: {
			BooleanButton booleanButton = (BooleanButton) theEObject;
			T result = caseBooleanButton(booleanButton);
			if (result == null)
				result = caseButton(booleanButton);
			if (result == null)
				result = caseControl(booleanButton);
			if (result == null)
				result = caseUIElement(booleanButton);
			if (result == null)
				result = caseUIObject(booleanButton);
			if (result == null)
				result = casePMFObject(booleanButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.SELECTOR: {
			Selector selector = (Selector) theEObject;
			T result = caseSelector(selector);
			if (result == null)
				result = caseControl(selector);
			if (result == null)
				result = caseUIElement(selector);
			if (result == null)
				result = caseUIObject(selector);
			if (result == null)
				result = casePMFObject(selector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.CONTROL: {
			Control control = (Control) theEObject;
			T result = caseControl(control);
			if (result == null)
				result = caseUIElement(control);
			if (result == null)
				result = caseUIObject(control);
			if (result == null)
				result = casePMFObject(control);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.LIST_VIEW: {
			ListView listView = (ListView) theEObject;
			T result = caseListView(listView);
			if (result == null)
				result = caseUIElement(listView);
			if (result == null)
				result = caseUIObject(listView);
			if (result == null)
				result = casePMFObject(listView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.FINDER: {
			Finder finder = (Finder) theEObject;
			T result = caseFinder(finder);
			if (result == null)
				result = caseWindow(finder);
			if (result == null)
				result = casePage(finder);
			if (result == null)
				result = casePart(finder);
			if (result == null)
				result = caseUIElement(finder);
			if (result == null)
				result = caseUIObject(finder);
			if (result == null)
				result = casePMFObject(finder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.UI_ELEMENT: {
			UIElement uiElement = (UIElement) theEObject;
			T result = caseUIElement(uiElement);
			if (result == null)
				result = caseUIObject(uiElement);
			if (result == null)
				result = casePMFObject(uiElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.MENU_ITEM: {
			MenuItem menuItem = (MenuItem) theEObject;
			T result = caseMenuItem(menuItem);
			if (result == null)
				result = caseControl(menuItem);
			if (result == null)
				result = caseUIElement(menuItem);
			if (result == null)
				result = caseUIObject(menuItem);
			if (result == null)
				result = casePMFObject(menuItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseUIElement(container);
			if (result == null)
				result = caseUIObject(container);
			if (result == null)
				result = casePMFObject(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.VIEW_PART: {
			ViewPart viewPart = (ViewPart) theEObject;
			T result = caseViewPart(viewPart);
			if (result == null)
				result = caseUIElement(viewPart);
			if (result == null)
				result = caseUIObject(viewPart);
			if (result == null)
				result = casePMFObject(viewPart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.SASH_FROM: {
			SashFrom sashFrom = (SashFrom) theEObject;
			T result = caseSashFrom(sashFrom);
			if (result == null)
				result = caseContainer(sashFrom);
			if (result == null)
				result = caseUIElement(sashFrom);
			if (result == null)
				result = caseUIObject(sashFrom);
			if (result == null)
				result = casePMFObject(sashFrom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.UI_EVENT: {
			UIEvent uiEvent = (UIEvent) theEObject;
			T result = caseUIEvent(uiEvent);
			if (result == null)
				result = casePMFObject(uiEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.COLOR: {
			Color color = (Color) theEObject;
			T result = caseColor(color);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.FONT: {
			Font font = (Font) theEObject;
			T result = caseFont(font);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.PART: {
			Part part = (Part) theEObject;
			T result = casePart(part);
			if (result == null)
				result = caseUIElement(part);
			if (result == null)
				result = caseUIObject(part);
			if (result == null)
				result = casePMFObject(part);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.PROPERTIES_PART: {
			PropertiesPart propertiesPart = (PropertiesPart) theEObject;
			T result = casePropertiesPart(propertiesPart);
			if (result == null)
				result = casePart(propertiesPart);
			if (result == null)
				result = caseUIElement(propertiesPart);
			if (result == null)
				result = caseUIObject(propertiesPart);
			if (result == null)
				result = casePMFObject(propertiesPart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.PROPERTY_TAB: {
			PropertyTab propertyTab = (PropertyTab) theEObject;
			T result = casePropertyTab(propertyTab);
			if (result == null)
				result = casePMFObject(propertyTab);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.TAB: {
			Tab tab = (Tab) theEObject;
			T result = caseTab(tab);
			if (result == null)
				result = casePMFObject(tab);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.TAB_SET: {
			TabSet tabSet = (TabSet) theEObject;
			T result = caseTabSet(tabSet);
			if (result == null)
				result = caseContainer(tabSet);
			if (result == null)
				result = caseUIElement(tabSet);
			if (result == null)
				result = caseUIObject(tabSet);
			if (result == null)
				result = casePMFObject(tabSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = caseUIElement(table);
			if (result == null)
				result = caseUIObject(table);
			if (result == null)
				result = casePMFObject(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.RICH_TEXT: {
			RichText richText = (RichText) theEObject;
			T result = caseRichText(richText);
			if (result == null)
				result = caseText(richText);
			if (result == null)
				result = caseControl(richText);
			if (result == null)
				result = caseUIElement(richText);
			if (result == null)
				result = caseUIObject(richText);
			if (result == null)
				result = casePMFObject(richText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.DATE_TIME_PICKER: {
			DateTimePicker dateTimePicker = (DateTimePicker) theEObject;
			T result = caseDateTimePicker(dateTimePicker);
			if (result == null)
				result = caseControl(dateTimePicker);
			if (result == null)
				result = caseUIElement(dateTimePicker);
			if (result == null)
				result = caseUIObject(dateTimePicker);
			if (result == null)
				result = casePMFObject(dateTimePicker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.HYPERLINK: {
			Hyperlink hyperlink = (Hyperlink) theEObject;
			T result = caseHyperlink(hyperlink);
			if (result == null)
				result = caseLabel(hyperlink);
			if (result == null)
				result = caseControl(hyperlink);
			if (result == null)
				result = caseUIElement(hyperlink);
			if (result == null)
				result = caseUIObject(hyperlink);
			if (result == null)
				result = casePMFObject(hyperlink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = casePart(page);
			if (result == null)
				result = caseUIElement(page);
			if (result == null)
				result = caseUIObject(page);
			if (result == null)
				result = casePMFObject(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.WIZARD_PAGE: {
			WizardPage wizardPage = (WizardPage) theEObject;
			T result = caseWizardPage(wizardPage);
			if (result == null)
				result = casePage(wizardPage);
			if (result == null)
				result = casePart(wizardPage);
			if (result == null)
				result = caseUIElement(wizardPage);
			if (result == null)
				result = caseUIObject(wizardPage);
			if (result == null)
				result = casePMFObject(wizardPage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.MESSAGE_DIALOG: {
			MessageDialog messageDialog = (MessageDialog) theEObject;
			T result = caseMessageDialog(messageDialog);
			if (result == null)
				result = caseUIElement(messageDialog);
			if (result == null)
				result = caseUIObject(messageDialog);
			if (result == null)
				result = casePMFObject(messageDialog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.RADIO_BUTTON: {
			RadioButton radioButton = (RadioButton) theEObject;
			T result = caseRadioButton(radioButton);
			if (result == null)
				result = caseButton(radioButton);
			if (result == null)
				result = caseControl(radioButton);
			if (result == null)
				result = caseUIElement(radioButton);
			if (result == null)
				result = caseUIObject(radioButton);
			if (result == null)
				result = casePMFObject(radioButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.LAYOUT: {
			Layout layout = (Layout) theEObject;
			T result = caseLayout(layout);
			if (result == null)
				result = caseUIObject(layout);
			if (result == null)
				result = casePMFObject(layout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.GRID_LAYOUT: {
			GridLayout gridLayout = (GridLayout) theEObject;
			T result = caseGridLayout(gridLayout);
			if (result == null)
				result = caseLayout(gridLayout);
			if (result == null)
				result = caseUIObject(gridLayout);
			if (result == null)
				result = casePMFObject(gridLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.LAYOUT_DATA: {
			LayoutData layoutData = (LayoutData) theEObject;
			T result = caseLayoutData(layoutData);
			if (result == null)
				result = caseUIObject(layoutData);
			if (result == null)
				result = casePMFObject(layoutData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UiPackage.GRID_DATA: {
			GridData gridData = (GridData) theEObject;
			T result = caseGridData(gridData);
			if (result == null)
				result = caseLayoutData(gridData);
			if (result == null)
				result = caseUIObject(gridData);
			if (result == null)
				result = casePMFObject(gridData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Text</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Panel</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackPanel(StackPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separator</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparator(Separator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombo(Combo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Box</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBox(GroupBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Button</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanButton(BooleanButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelector(Selector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List View</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListView(ListView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finder</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinder(Finder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElement(UIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Object</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIObject(UIObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Part</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPart(ViewPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sash From</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sash From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSashFrom(SashFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIEvent(UIEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Font</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Part</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Part</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesPart(PropertiesPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Tab</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyTab(PropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabSet(TabSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichText(RichText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimePicker(DateTimePicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyperlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyperlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperlink(Hyperlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizardPage(WizardPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDialog(MessageDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLayout(GridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutData(LayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridData(GridData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMFObject(PMFObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // UiSwitch
