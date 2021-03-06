package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Features of list, 
		 * indexed, 
		 * allows duplicate values,
		 * maintains the order
		 */
		// Not recommended way of creating array list object
		//ArrayList myList = new ArrayList();
		
		//recommended
		List myList = new ArrayList();
		//List myVector = new Vector();
		
		
		String str1 = "hello";
		String str2 = "Welcome";
	
		//Integer number = new Integer(10);
		Integer number = 10;
		int newNumber = 13;
		
		
		//create
		myList.add(str1);
		myList.add(str2);
		myList.add(number);
		myList.add(newNumber);
		
		//read
		System.out.println(myList);
		System.out.println(myList.get(0));
		
		//update
		
		myList.set(2, number);
		System.out.println(myList);
		
	
		
		//delete
		
		myList.remove(2);
		
		System.out.println(myList);
	}

}
