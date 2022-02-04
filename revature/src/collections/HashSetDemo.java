package collections;

import java.util.HashSet;
import java.util.Set;



public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// features
		// not indexed
		// no duplicate values
		// does not maintain order

		Set myHashSet = new HashSet();

		String str1 = "hello";
		String str2 = "Welcome";

		// Integer number = new Integer(10);
		Integer number = 10;

		// create
		myHashSet.add(str1);
		myHashSet.add(str2);
		myHashSet.add(number);
		
		//read
		System.out.println(myHashSet);
		
		//update
		
		//delete

	}

}
