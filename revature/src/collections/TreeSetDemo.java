package collections;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
//sorted data in treeset
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//any object added to a tree-set must implement the comparable interface
		
		//create
		Set<String> allNames = new TreeSet<String>();
		allNames.add("Will");
		allNames.add("Mary");		
		allNames.add("Bill");
		allNames.add("Chris");
		
		System.out.println(allNames);
		
		//read
		Iterator<String> itr = allNames.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
			
		
		
		//update 
		allNames.clear();
		System.out.println(allNames);
		
		
	}

}
