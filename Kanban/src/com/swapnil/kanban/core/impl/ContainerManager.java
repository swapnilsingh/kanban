/**
 * 
 */
package com.swapnil.kanban.core.impl;

import com.swapnil.kanban.core.interfaces.Container;
import com.swapnil.kanban.core.interfaces.Visitor;

/**
 * @author "Swapnil Singh"
 *
 */
public class ContainerManager implements Visitor {
	
	private Container previousContainer;
	private Container currentContainer;

	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Visitor#visit(com.swapnil.kanban.core.interfaces.Container)
	 */
	@Override
	public void visit(Container container) {
		// TODO Auto-generated method stub

	}

}
