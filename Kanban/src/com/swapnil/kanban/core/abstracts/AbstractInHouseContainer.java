/**
 * 
 */
package com.swapnil.kanban.core.abstracts;

import java.util.List;

import com.swapnil.kanban.core.interfaces.Containable;
import com.swapnil.kanban.core.interfaces.InHouseContainer;

/**
 * @author "Swapnil Singh"
 *
 */
public abstract class AbstractInHouseContainer implements InHouseContainer {
	
	private List<Containable> inProgress;
	private List<Containable> compleated;
	private int capacity;

	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Container#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return inProgress.size()>0?false:true;
	}

	/* (non-Javadoc)
	 * @see com.swapnil.kanban.core.interfaces.Container#isFull()
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
