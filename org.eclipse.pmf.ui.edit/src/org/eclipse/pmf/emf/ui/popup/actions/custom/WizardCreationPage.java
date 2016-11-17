package org.eclipse.pmf.emf.ui.popup.actions.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WizardCreationPage extends WizardPage implements org.eclipse.swt.widgets.Listener {
  private final String prefixDataType = "EMF Type ";
  private final String emptyString = "";
  private final boolean defaultSelection = false;
  
  // Wizard name
  private Text text1;
  // List of available EMF types
  private Combo combo1;
  // Category
  private Text text2;
  // Generate a page for the properties of primitives
  private Button button1;
  // Composite
  private Composite container;
  
  private EObject owner;
  private org.eclipse.pmf.pim.Application application;

  public WizardCreationPage(EObject owner) {
    super("New PMF Wizard");
    setTitle("PMF Wizard");
    setDescription("Create a new PMF wizard.");
    this.owner = owner;
  }
  
  public String getWizardName() {
	  return this.text1.getText()!=null ? this.text1.getText() : emptyString;
  }
  
  public org.eclipse.pmf.pim.data.DataType getDataType() {
	  if (this.application != null)
		  return combo1.getSelectionIndex()!=-1 ?  this.application.getAllTypes().get(combo1.getSelectionIndex()): null;
	  return null;
  }
  
  public String getCategory() {
	  return this.text2.getText()!=null ? this.text2.getText() : emptyString;
  }
  
  public boolean isSelected() {
	  return this.button1 != null? this.button1.getSelection(): defaultSelection;
  }
  
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    
    new Label(container, SWT.NONE).setText("Name*:");
    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
    text1.setText("");
    text1.addListener(SWT.CHANGED, this);
    /*
    text1.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) {
      }

      public void keyReleased(KeyEvent e) {
        if (!text1.getText().isEmpty()) {
          setPageComplete(true);
        }
      }
    });
    */
    text1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
    new Label (container, SWT.NONE).setText("Data Type*:");
    combo1 = new Combo(container, SWT.BORDER | SWT.READ_ONLY);
    if (owner instanceof org.eclipse.pmf.pim.Application) {
    	this.application = (org.eclipse.pmf.pim.Application)owner;
    	for (org.eclipse.pmf.pim.data.DataType dataType: this.application.getAllTypes()){
    		combo1.add(prefixDataType + dataType.getName());
    	}
    	if (combo1.getItemCount() > 0)
    		combo1.select(0);
    }
    combo1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
    new Label (container, SWT.NONE).setText("Category:");
    text2 = new Text(container, SWT.BORDER | SWT.SINGLE);
    text2.setText("");
    text2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
    button1 = new Button(container, SWT.CHECK);
    button1.setSelection(true);
    // Alignment of button1 to Right
    button1.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
    new Label (container, SWT.NONE).setText("Generate a page for the properties of primitives.");
    
    // required to avoid an error in the system
    setControl(container);
    setPageComplete(false);
  }
  
  public void handleEvent(Event e) {
	  if (e.widget == text1) {
		  if (!text1.getText().isEmpty() && combo1.getSelectionIndex()!=-1) {
			  setPageComplete(true);
		  } else {
			  setPageComplete(false);
		  }
	  }
  }
}
 
