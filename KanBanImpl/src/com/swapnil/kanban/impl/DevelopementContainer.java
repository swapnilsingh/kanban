/**
 * 
 */
package com.swapnil.kanban.impl;

import com.swapnil.kanban.core.interfaces.Container;
import com.swapnil.kanban.core.interfaces.InHouseContainer;

/**
 * @author "Swapnil Singh"
 *
 */
public class DevelopementContainer implements InHouseContainer {

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
	 * @see com.swapnil.kanban.core.interfaces.InHouseContainer#attachContainer(com.swapnil.kanban.core.interfaces.Container)
	 */
	@Override
	public void attachContainer(Container container) {
		// TODO Auto-generated method stub

	}

}
