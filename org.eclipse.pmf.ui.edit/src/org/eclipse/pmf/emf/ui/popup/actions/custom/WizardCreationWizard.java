package org.eclipse.pmf.emf.ui.popup.actions.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.Wizard;

public class WizardCreationWizard extends Wizard {
  protected WizardCreationPage page;
  
  protected boolean isFinish;
  protected String wizardName;
  protected org.eclipse.pmf.pim.data.DataType wizardDataType;
  protected String category;
  protected boolean isSelected;

  public WizardCreationWizard(EObject owner) {
    super();
    setNeedsProgressMonitor(true);
    this.page = new WizardCreationPage(owner);
    this.isFinish = false;
    this.wizardName = "";
    this.wizardDataType = null;
  }

  @Override
  public String getWindowTitle() {
    return "PMF Wizard Creation";
  }

  @Override
  public void addPages() {
    addPage(page);
  }

  @Override
  public boolean performFinish() {
	  this.isFinish = true;
	  this.wizardName = this.page.getWizardName();
	  this.wizardDataType = this.page.getDataType();
	  this.category = this.page.getCategory();
	  this.isSelected = this.page.isSelected();
	  return true;
  }
  
  public boolean isFinish() {
	  return this.isFinish;
  }
  
  public String getWizardName() {
	  return this.wizardName;
  }
  
  public org.eclipse.pmf.pim.data.DataType getDataType() {
	  return this.wizardDataType;
  }
  
  public String getWizardCategory() {
	  return this.category;
  }
  
  public boolean isPrimitiveConsidered() {
	  return this.isSelected;
  }
}
 
