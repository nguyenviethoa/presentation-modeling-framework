package org.eclipse.pmf.emf.ui.popup.actions.custom;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class CreateWizardCommand extends CommandWrapper implements
		CommandActionDelegate {
	private EObject owner;
	private java.lang.Object value;
	
	public CreateWizardCommand(Command command, EObject owner, java.lang.Object value){
		super(command);
		this.owner = owner;
		this.value = value;
	}
	
	public Object getImage() {
		// TODO Auto-generated method stub
		return ((CommandActionDelegate)super.command).getImage();
	}

	public String getText() {
		// TODO Auto-generated method stub
		return ((CommandActionDelegate)super.command).getText();
	}

	public String getToolTipText() {
		// TODO Auto-generated method stub
		return ((CommandActionDelegate)super.command).getToolTipText();
	}
	
	// Work flow:
	// 1. Open a WizardCreationWizard
	// 2. After configuring parameters (including Name and Data Type), define Wizard (i.e. this.value) and create WizardPages under it
	public void execute() {
		IWorkbench wb = PlatformUI.getWorkbench();
		WizardCreationWizard wizardCreationWizard = new WizardCreationWizard(this.owner);
		WizardDialog dialog = new WizardDialog(wb.getActiveWorkbenchWindow().getShell(), wizardCreationWizard);
		dialog.open();
		
		if ((this.value instanceof org.eclipse.pmf.pim.Wizard) && (this.owner instanceof org.eclipse.pmf.pim.Application)) {
			org.eclipse.pmf.pim.data.DataType wizardDataType = wizardCreationWizard.getDataType();
			
			((org.eclipse.pmf.pim.Wizard) this.value).setName(wizardCreationWizard.getWizardName());
			((org.eclipse.pmf.pim.Wizard) this.value).setDataType(wizardDataType);
			((org.eclipse.pmf.pim.Wizard) this.value).setCategory(wizardCreationWizard.getWizardCategory());
			
			if (wizardDataType != null) {
				if (wizardCreationWizard.isPrimitiveConsidered()) {
					for (org.eclipse.pmf.pim.data.DataProperty dataProperty: wizardDataType.getProperties()) {
						if (!((org.eclipse.pmf.pim.Application) this.owner).getAllTypes().contains(dataProperty.getType()) || (((org.eclipse.pmf.pim.Application) this.owner).getAllTypes().contains(dataProperty.getType()) && dataProperty.getType().isEnum())) {
							org.eclipse.pmf.pim.ui.WizardPage wizardPage = UiFactory.eINSTANCE.createWizardPage();
							wizardPage.setName(wizardDataType.getName());
							((org.eclipse.pmf.pim.Wizard) this.value).getWizardPages().add(wizardPage);
							break;
						}
					}
				}
				for (org.eclipse.pmf.pim.data.DataProperty dataProperty: wizardDataType.getProperties()) {
					org.eclipse.pmf.pim.ui.WizardPage wizardPage = UiFactory.eINSTANCE.createWizardPage();
					wizardPage.setName(dataProperty.getName());
					if (((org.eclipse.pmf.pim.Application) this.owner).getAllTypes().contains(dataProperty.getType()) && !dataProperty.getType().isEnum()) {
						org.eclipse.pmf.pim.databinding.DataBindingPath dataBindingPath = org.eclipse.pmf.pim.databinding.DatabindingFactory.eINSTANCE.createDataBindingPath();
						dataBindingPath.setFeature(dataProperty);
						wizardPage.setBindingPath(dataBindingPath);
						((org.eclipse.pmf.pim.Wizard) this.value).getWizardPages().add(wizardPage);
					}
				}
			}
							
		}
		
		if (wizardCreationWizard.isFinish())
			super.execute();
	}
}
