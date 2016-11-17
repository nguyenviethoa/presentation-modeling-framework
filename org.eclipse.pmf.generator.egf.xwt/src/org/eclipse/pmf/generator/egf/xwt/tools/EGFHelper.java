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

package org.eclipse.pmf.generator.egf.xwt.tools;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.egf.model.pattern.Node.DataLeaf;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.CallHelper;
import org.eclipse.egf.pattern.execution.DefaultPatternContext;
import org.eclipse.egf.pattern.execution.ExecutionContext;
import org.eclipse.egf.pattern.execution.InternalPatternContext;
import org.eclipse.pmf.generator.egf.xwt.Activator;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.data.DataProperty;

public class EGFHelper {
	public static void insertNode(PatternContext ctx, String method, String ns) {
		PatternContext patternContext = ctx;
	
		while (patternContext instanceof DefaultPatternContext) {
			try {
				Field f = DefaultPatternContext.class
						.getDeclaredField("parent");
				f.setAccessible(true);
				
				InternalPatternContext ictx = (InternalPatternContext) patternContext;
				Node.Container node = ictx.getNode();
				StringBuffer data = new StringBuffer();
				
				for (Node childNode : node.getChildren()) {
					if (childNode instanceof DataLeaf) {
						DataLeaf leaf = (DataLeaf) childNode;
						if (method.equals(leaf.getMethod())){
							data.append(leaf.getData());
							data.append(ns);
							leaf.setData(data.toString());
							break;
						}
					}
				}
				PatternContext parent = (PatternContext) f.get(patternContext);
				if (parent != null) {
					patternContext = parent;
				} else {
					break;
				}
				
			}catch (Exception e) {
				break;
			}
		}
	}
	
	
	/**
	 * copy the content (data) of the source node to the target node
	 * @param targetNode
	 * @param sourceNode
	 * @throws ClassNotFoundException 
	 */
	public static void copyNodeContent(Node.Container targetNode, Node.Container sourceNode) throws ClassNotFoundException{
		ClassLoader loader = Activator.class.getClassLoader();
		for (Node child: sourceNode.getChildren()){
			if (child instanceof Node.DataLeaf){
				Node.DataLeaf dataLeaf = (Node.DataLeaf) child;
				DataLeaf newLeaf = new Node.DataLeaf(targetNode, loader.loadClass(dataLeaf.getPatternClass()), dataLeaf.getMethod(), dataLeaf.getData());
				targetNode.getChildren().add(newLeaf);
			}
		}
	}
	
	/**
	 * call the DataFieldInTable pattern for all dataFields, including dataFields in parent DataForm 
	 * @param iCtx PatternContext
	 * @param dataForm 
	 */
	public static void dataFieldInTableOrchestration(InternalPatternContext iCtx, DataForm dataForm, List<DataProperty> columns){
		ExecutionContext ctx_local = new ExecutionContext(iCtx);
		org.eclipse.emf.common.util.EList<org.eclipse.pmf.pim.DataItem> children = ((ElementalDataForm) dataForm).getChildren();
		
		for (org.eclipse.pmf.pim.DataItem dataItem : children) {
			if (dataItem instanceof org.eclipse.pmf.pim.DataField){
				if (columns != null && !columns.isEmpty()){
					if (columns.contains(dataItem.getDataBinding().getPath().getFeature())){
						ctx_local.setValue(PatternContext.INJECTED_CONTEXT, (org.eclipse.pmf.pim.DataField)dataItem);
						CallHelper
								.executeWithContextInjection(
										"platform:/plugin/org.eclipse.pmf.generator.egf.xwt/egf/PMFtoXWT.fcore#_HuGeQSzwEd-f4Zm0u2YWiA",
										ctx_local);
					}
				}
				
				if (columns == null || columns.isEmpty()){
					ctx_local.setValue(PatternContext.INJECTED_CONTEXT, (org.eclipse.pmf.pim.DataField)dataItem);
					CallHelper
							.executeWithContextInjection(
									"platform:/plugin/org.eclipse.pmf.generator.egf.xwt/egf/PMFtoXWT.fcore#_HuGeQSzwEd-f4Zm0u2YWiA",
									ctx_local);
				}
			}
		}	
						
		for (org.eclipse.pmf.pim.DataItem dataItem : children) {
			if (dataItem instanceof org.eclipse.pmf.pim.DataInheritance){	
				org.eclipse.pmf.pim.DataInheritance dataInheritance = (org.eclipse.pmf.pim.DataInheritance) dataItem;
				dataFieldInTableOrchestration(iCtx, dataInheritance.getDataForm(), columns);
			}
		}			
	}
}