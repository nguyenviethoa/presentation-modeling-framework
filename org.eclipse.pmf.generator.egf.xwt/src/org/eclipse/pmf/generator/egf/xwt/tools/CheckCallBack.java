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

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.egf.model.pattern.Node.DataLeaf;
import org.eclipse.egf.model.pattern.PatternContext;

public class CheckCallBack {
	public static boolean checkCallBack(Node.Container node, PatternContext ctx) {
		// Container node = itemCtx.getNode();
		for (Node childNode : node.getChildren()) {
			if (childNode instanceof Node.Container)
				return checkCallBack((Node.Container) childNode, ctx);
			else {
				if (childNode instanceof DataLeaf) {
					DataLeaf leaf = (DataLeaf) childNode;

					String data = leaf.getData();
					if ((data != null && data.length() != 0)
							&& (!data.contains("Label"))) {
						return true;

					}
				}
			}
		}
		return false;
	}
}
// if (model instanceof PMFObject){
// List<PMFObject> pmfObjects = new ArrayList<PMFObject>();
//
// for (Object ob : ((PMFObject) model).eContents().toArray()){
// if (ob instanceof PMFObject){
// pmfObjects.add((PMFObject) ob);
// }
// }
// Collections.sort(pmfObjects, new Comparator<PMFObject>(){
//
// public int compare(PMFObject o1, PMFObject o2)
// {
// return new Integer(o1.getLayoutOrder()).compareTo(new
// Integer(o2.getLayoutOrder()));
// }
// });
// return pmfObjects.toArray();
// }