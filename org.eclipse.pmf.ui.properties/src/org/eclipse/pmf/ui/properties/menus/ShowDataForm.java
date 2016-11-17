package org.eclipse.pmf.ui.properties.menus;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xwt.Tracking;
import org.eclipse.xwt.XWT;
import org.eclipse.xwt.internal.utils.LoggerManager;
import org.eclipse.xwt.jface.XWTDialog;

public class ShowDataForm implements IObjectActionDelegate {
	static final String[] FILE_EXTENSIONS = new String[] { "genmodel", "ecore" };
	static final String[] FILE_SUFIXES = new String[] { "*.genmodel", "*.ecore" };
	protected DataForm dataForm;
	protected EMFType dataType;

	private Shell shell;
	protected Application application;

	protected Composite parent;

	/**
	 * Constructor for Action1.
	 */
	public ShowDataForm() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		XWT.addTracking(Tracking.DATABINDING);

		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		try {
			DataFormFolder dataFormFolder = application
					.getDataFormFolder(dataType);
			Class aClass = classLoader
					.loadClass("org.eclipse.pmf.ui.properties.views."
							+ dataType.getName()
							+ dataFormFolder.getDefaultDataForm() + "View");
			Display display = Display.getCurrent();
			Shell shell = new Shell(display);
			shell.setText("Edit in Dialog");

			XWTDialog dialog = new XWTDialog(shell, "Dialog", dataForm, aClass);
			dialog.open();

		} catch (Exception e) {
			LoggerManager.log(e);
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection.isEmpty()) {
			return;
		}
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();

			if (element instanceof EMFType) {
				dataType = (EMFType) element;
			} else if (element instanceof DataForm) {
				DataForm dataForm = (DataForm) element;
				dataType = (EMFType) dataForm.getDataContextType();
			}
		}
	}

}
