/******************************************************************************* 
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Soyatec - initial API and implementation 
 *******************************************************************************/ 

package org.eclipse.pmf.validation.constraints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataAssocication;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataType;


/**
 * @author Chris McGee
 */
public class NoCircularReference
	extends AbstractModelConstraint {

	/**
	 * number of verticals
	 * 
	 * @generated NOT
	 */
	private int V;

	/**
	 * preorder number counter
	 * 
	 * @generated NOT
	 */

	private int preCount;

	/**
	 * low number of v
	 * 
	 * @generated NOT
	 */
	private int[] low;

	/**
	 * to check if v is visited
	 * 
	 * @generated NOT
	 */
	private boolean[] visited;

	/**
	 * to store the graph like a adjacent list, associated with the information
	 * about reference type between two nodes (Inheritance, Association,
	 * Collection)
	 * 
	 * @generated NOT
	 */
	private Set<Integer>[] graph;

	/**
	 * a mapping between index and name of dataforms
	 * 
	 * @generated NOT
	 */
	private Map<Integer, String> dataForms = new HashMap<Integer, String>();

	/**
	 * list of strongly connected components
	 * 
	 * @generated NOT
	 */
	private List<List<Integer>> sccComp;

	private Stack<Integer> stack;
	
	
	@Override
	public IStatus validate(IValidationContext ctx) {
		
		Application eObj = (Application) ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		initGraph(eObj);
		List<List<Integer>> scComponents = getSCComponents(graph);
		StringBuffer stringBuffer = new StringBuffer();

		for (List<Integer> list : scComponents) {
			ArrayList<Integer> l = (ArrayList<Integer>) list;
			if (l.size() > 1) {
				stringBuffer.append("[");
				for (int i : l) {

					String dataForm = dataForms.get(i);
					stringBuffer.append(dataForm + " ");
					if (i < l.size())
						stringBuffer.append(",");
				}
				stringBuffer.append("] ");

			}

		}

		if (eType == EMFEventType.NULL) {
				
		if (sccComp.size() > 0) { 
			return ctx.createFailureStatus("Cycle referenced dataforms: "
					+ stringBuffer.toString());
		}
		// In the case of live mode.
		} else {
			if (sccComp.size() > 0) { 
				return ctx.createFailureStatus("Cycle referenced dataforms: "
						+ stringBuffer.toString());
			}
		}

		return ctx.createSuccessStatus();
	}

	/**
	 * MAIN function to get all strongly connected components
	 * 
	 * @param graph
	 * @return
	 * @generated NOT
	 */
	public List<List<Integer>> getSCComponents(Set<Integer>[] graph) {

		V = graph.length;
		this.graph = graph;
		low = new int[V];
		visited = new boolean[V];
		stack = new Stack<Integer>();
		sccComp = new ArrayList<List<Integer>>();

		for (int v = 0; v < V; v++) {
			if (!visited[v])
				dfs(v);
		}

		StringBuffer stringBuffer = new StringBuffer();
		for (Object list : sccComp.toArray()) {
			@SuppressWarnings("unchecked")
			ArrayList<Integer> l = (ArrayList<Integer>) list;
			if (l.size() > 1) {
				for (Object i : l.toArray()) {
					String dataForm = dataForms.get(i);
					stringBuffer.append(dataForm + " ");
				}
				stringBuffer.append(";");
			}
		}

		return sccComp;
	}

	/**
	 * function dfs
	 * @generated NOT
	 * @param v
	 */
	public void dfs(int v) {
		low[v] = preCount++;
		visited[v] = true;
		stack.push(v);
		int min = low[v];
		for (int w : graph[v]) {
			if (!visited[w])
				dfs(w);
			if (low[w] < min)
				min = low[w];
		}
		if (min < low[v]) {
			low[v] = min;
			return;
		}
		List<Integer> component = new ArrayList<Integer>();
		int w;
		do {
			w = stack.pop();
			component.add(w);
			low[w] = V;
		} while (w != v);
		sccComp.add(component);
	}

	/**
	 * init the adjacent list of dataforms
	 * @param application
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public void initGraph(Application application) {
		int index = 0;
		for (Entry<DataType, DataFormFolder> dataFormFolder : application
				.getDataFormFolders()) {
			for (DataForm dataForm : dataFormFolder.getValue().getDataForms()) {
				dataForms.put(index, dataForm.getName());
				index++;
			}
		}
		graph = new Set[index];
		for (int i = 0; i < index; i++)
			graph[i] = new HashSet<Integer>();

		for (Entry<DataType, DataFormFolder> dataFormFolder : application
				.getDataFormFolders()) {
			for (DataForm dataForm : dataFormFolder.getValue().getDataForms()) {

				int dataFormIndex = getDataFormIndex(dataForm);

				List<DataItem> dataItems = ((ElementalDataForm) dataForm).getChildren();
				if (dataItems != null && !dataItems.isEmpty())
					for (DataItem dataItem : dataItems) {
						// circularContext.clear();

						switch (dataItem.eClass().getClassifierID()) {
						case (PMFPackage.DATA_COLLECTION):

							DataCollection dataCollection = (DataCollection) dataItem;
							if (dataCollection.getDetail() != null) {
								int dataCollectionIndex = getDataFormIndex(dataCollection
										.getDetail());
								graph[dataFormIndex].add(dataCollectionIndex);
							}
							break;
						case (PMFPackage.DATA_ASSOCICATION):
							DataAssocication dataAssociation = (DataAssocication) dataItem;

							if (dataAssociation.getDataForm() != null) {
								int dataAssociationIndex = getDataFormIndex(dataAssociation
										.getDataForm());
								graph[dataFormIndex].add(dataAssociationIndex);
							}
							break;

						case (PMFPackage.DATA_INHERITANCE):
							DataInheritance dataInheritance = (DataInheritance) dataItem;
							if (dataInheritance.getDataForm() != null) {
								int dataInheritanceIndex = getDataFormIndex(dataInheritance
										.getDataForm());
								graph[dataFormIndex].add(dataInheritanceIndex);
							}
							break;
						}

					}

			}
		}
	}

	/**
	 * @param dataForm
	 * @return
	 * generated NOT
	 */
	public Integer getDataFormIndex(DataForm dataForm) {
		int index = 0;
		for (int formIndex : dataForms.keySet()) {
			if (dataForms.get(formIndex).equals(dataForm.getName())) {
				index = formIndex;
				break;
			}

		}
		return index;
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
//	@Override
//	public IStatus validate(IValidationContext ctx) {
//		EObject eObj = ctx.getTarget();
//		EMFEventType eType = ctx.getEventType();
//		
//		// In the case of batch mode.
//		if (eType == EMFEventType.NULL) {
//			String name = null;
//			if (eObj instanceof PMFObject) {
//				name = ((PMFObject)eObj).getName();
//			} 
//			
//			if (name == null || name.length() == 0) {
//				return ctx.createFailureStatus(eObj.eClass().getName());
//			}
//		// In the case of live mode.
//		} else {
//			Object newValue = ctx.getFeatureNewValue();
//			
//			if (newValue == null
//				|| ((String)newValue).length() == 0) {
//				return ctx.createFailureStatus(eObj.eClass().getName());
//			}
//		}
//		
//		return ctx.createSuccessStatus();
//	}

}
