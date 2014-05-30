/**
 * 
 */
package com.swapnil.kanban.engine;

import java.util.LinkedList;
import java.util.List;

import src.com.swapnil.kanban.core.interfaces.Container;

import com.swapnil.kanban.impl.DevelopementContainer;
import com.swapnil.kanban.impl.TesterContainer;
import com.swapnil.kanban.impl.TestingManager;
/**
 * @author "Swapnil Singh"
 *
 */
public class KanBanRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Container> containers =  new LinkedList<Container>();
		
		TesterContainer testerContainer = new TesterContainer();
		TestingManager testingManager =  new TestingManager(testerContainer);
		testingManager.setPreviousContainer(new DevelopementContainer());
		testerContainer.accept(testingManager);
		
		containers.add(testerContainer);
	}

}
