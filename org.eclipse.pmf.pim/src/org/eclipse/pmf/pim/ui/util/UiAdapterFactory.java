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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see org.eclipse.pmf.pim.ui.UiPackage
 * @generated
 */
public class UiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public UiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
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
	protected UiSwitch<Adapter> modelSwitch = new UiSwitch<Adapter>() {
		@Override
		public Adapter caseText(Text object) {
			return createTextAdapter();
		}

		@Override
		public Adapter caseStackPanel(StackPanel object) {
			return createStackPanelAdapter();
		}

		@Override
		public Adapter caseSeparator(Separator object) {
			return createSeparatorAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseWindow(Window object) {
			return createWindowAdapter();
		}

		@Override
		public Adapter caseButton(Button object) {
			return createButtonAdapter();
		}

		@Override
		public Adapter caseCombo(Combo object) {
			return createComboAdapter();
		}

		@Override
		public Adapter caseGroupBox(GroupBox object) {
			return createGroupBoxAdapter();
		}

		@Override
		public Adapter caseBooleanButton(BooleanButton object) {
			return createBooleanButtonAdapter();
		}

		@Override
		public Adapter caseSelector(Selector object) {
			return createSelectorAdapter();
		}

		@Override
		public Adapter caseControl(Control object) {
			return createControlAdapter();
		}

		@Override
		public Adapter caseListView(ListView object) {
			return createListViewAdapter();
		}

		@Override
		public Adapter caseFinder(Finder object) {
			return createFinderAdapter();
		}

		@Override
		public Adapter caseUIElement(UIElement object) {
			return createUIElementAdapter();
		}

		@Override
		public Adapter caseMenuItem(MenuItem object) {
			return createMenuItemAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseViewPart(ViewPart object) {
			return createViewPartAdapter();
		}

		@Override
		public Adapter caseSashFrom(SashFrom object) {
			return createSashFromAdapter();
		}

		@Override
		public Adapter caseUIEvent(UIEvent object) {
			return createUIEventAdapter();
		}

		@Override
		public Adapter caseColor(Color object) {
			return createColorAdapter();
		}

		@Override
		public Adapter caseFont(Font object) {
			return createFontAdapter();
		}

		@Override
		public Adapter casePart(Part object) {
			return createPartAdapter();
		}

		@Override
		public Adapter casePropertiesPart(PropertiesPart object) {
			return createPropertiesPartAdapter();
		}

		@Override
		public Adapter casePropertyTab(PropertyTab object) {
			return createPropertyTabAdapter();
		}

		@Override
		public Adapter caseTab(Tab object) {
			return createTabAdapter();
		}

		@Override
		public Adapter caseTabSet(TabSet object) {
			return createTabSetAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseRichText(RichText object) {
			return createRichTextAdapter();
		}

		@Override
		public Adapter caseDateTimePicker(DateTimePicker object) {
			return createDateTimePickerAdapter();
		}

		@Override
		public Adapter caseHyperlink(Hyperlink object) {
			return createHyperlinkAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseWizardPage(WizardPage object) {
			return createWizardPageAdapter();
		}

		@Override
		public Adapter caseMessageDialog(MessageDialog object) {
			return createMessageDialogAdapter();
		}

		@Override
		public Adapter caseRadioButton(RadioButton object) {
			return createRadioButtonAdapter();
		}

		@Override
		public Adapter caseLayout(Layout object) {
			return createLayoutAdapter();
		}

		@Override
		public Adapter caseGridLayout(GridLayout object) {
			return createGridLayoutAdapter();
		}

		@Override
		public Adapter caseLayoutData(LayoutData object) {
			return createLayoutDataAdapter();
		}

		@Override
		public Adapter caseGridData(GridData object) {
			return createGridDataAdapter();
		}

		@Override
		public Adapter casePMFObject(PMFObject object) {
			return createPMFObjectAdapter();
		}

		@Override
		public Adapter caseUIObject(UIObject object) {
			return createUIObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Text <em>Text</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.StackPanel <em>Stack Panel</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.StackPanel
	 * @generated
	 */
	public Adapter createStackPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Separator <em>Separator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Separator
	 * @generated
	 */
	public Adapter createSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Label <em>Label</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Image <em>Image</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Window <em>Window</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Button <em>Button</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Combo <em>Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Combo
	 * @generated
	 */
	public Adapter createComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.GroupBox <em>Group Box</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.GroupBox
	 * @generated
	 */
	public Adapter createGroupBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.BooleanButton <em>Boolean Button</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.BooleanButton
	 * @generated
	 */
	public Adapter createBooleanButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Selector <em>Selector</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Control <em>Control</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.ListView <em>List View</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.ListView
	 * @generated
	 */
	public Adapter createListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.Finder <em>Finder</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Finder
	 * @generated
	 */
	public Adapter createFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.UIElement <em>UI Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.UIElement
	 * @generated
	 */
	public Adapter createUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
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
	 * {@link org.eclipse.pmf.pim.ui.Container <em>Container</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.ViewPart <em>View Part</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.ViewPart
	 * @generated
	 */
	public Adapter createViewPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.SashFrom <em>Sash From</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.SashFrom
	 * @generated
	 */
	public Adapter createSashFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.UIEvent <em>UI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.UIEvent
	 * @generated
	 */
	public Adapter createUIEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Color <em>Color</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Font <em>Font</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Part <em>Part</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.PropertiesPart <em>Properties Part</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.PropertiesPart
	 * @generated
	 */
	public Adapter createPropertiesPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.pmf.pim.ui.PropertyTab <em>Property Tab</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.PropertyTab
	 * @generated
	 */
	public Adapter createPropertyTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.TabSet <em>Tab Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.TabSet
	 * @generated
	 */
	public Adapter createTabSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.RichText <em>Rich Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.RichText
	 * @generated
	 */
	public Adapter createRichTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.DateTimePicker <em>Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.DateTimePicker
	 * @generated
	 */
	public Adapter createDateTimePickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Hyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Hyperlink
	 * @generated
	 */
	public Adapter createHyperlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.WizardPage <em>Wizard Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.WizardPage
	 * @generated
	 */
	public Adapter createWizardPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.MessageDialog <em>Message Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.MessageDialog
	 * @generated
	 */
	public Adapter createMessageDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.GridLayout
	 * @generated
	 */
	public Adapter createGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.LayoutData
	 * @generated
	 */
	public Adapter createLayoutDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.pmf.pim.ui.GridData <em>Grid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.pmf.pim.ui.GridData
	 * @generated
	 */
	public Adapter createGridDataAdapter() {
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
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // UiAdapterFactory
