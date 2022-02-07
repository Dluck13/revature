package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map has a key(name) and a value(number)
		
		Map<String, Integer> phoneBook= new HashMap<String, Integer>();
		//Create
		phoneBook.put("John", 1234);
		phoneBook.put("Will", 1235);
		phoneBook.put("Sara", 1236);
		
		//Read
		System.out.println("The phone number for John is " + phoneBook.get("John"));
		//take all keys in phoneBook and put inside allKeys
		Set<String> allKeys = phoneBook.keySet();
		Iterator<String> itr = allKeys.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			Integer number = phoneBook.get(name);
			System.out.println("Key "+ name+ " value"+ number);
			//A set maintains a random order
		}
		
		//delete entry
		phoneBook.remove("John");
		System.out.println(phoneBook);
		
		//Update
		phoneBook.replace("Will", 5555);
		System.out.println(phoneBook);
		
		
		
		

	}

}
