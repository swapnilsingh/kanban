/**
 * 
 */
package com.swapnil.kanban.impl;

import java.util.LinkedList;
import java.util.List;

import com.swapnil.kanban.core.interfaces.Containable;
import com.swapnil.kanban.core.interfaces.DeliverableContainer;
import com.swapnil.kanban.core.interfaces.Visitable;
import com.swapnil.kanban.core.interfaces.Visitor;

/**
 * @author "Swapnil Singh"
 *
 */
public class TesterContainer implements DeliverableContainer, Visitable {
	
	private List<Containable> delievrContainer = new LinkedList<Containable>();
		

	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Container#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Container#isFull()
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Visitable#accept(com.swapnil.kanban.core.interfaces.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		((TestingManager) visitor).setPreviousContainer(this.delievrContainer);
	}
	
}
