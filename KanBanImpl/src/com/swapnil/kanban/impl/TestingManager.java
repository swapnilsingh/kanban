/**
 * 
 */
package com.swapnil.kanban.impl;

import com.swapnil.kanban.core.interfaces.Container;
import com.swapnil.kanban.core.interfaces.Visitor;
import com.swapnil.kanban.core.abstracts.AbstractContainerManager;;

/**
 * @author "Swapnil Singh"
 *
 */
public class TestingManager extends AbstractContainerManager implements Visitor {
	
	private Container previousContainer;

	/**
	 * 
	 */
	public TestingManager(Container currentContainer) {
		super.currentContainer = currentContainer;
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the previousContainer
	 */
	public Container getPreviousContainer() {
		return previousContainer;
	}


	/**
	 * @param previousContainer the previousContainer to set
	 */
	public void setPreviousContainer(Container previousContainer) {
		this.previousContainer = previousContainer;
	}


	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Visitor#visit(com.swapnil.kanban.core.interfaces.Container)
	 */
	@Override
	public void visit(Container container) {
		// TODO Auto-generated method stub

	}

}
