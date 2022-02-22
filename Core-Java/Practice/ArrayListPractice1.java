package Practice;

import java.util.*;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Sumit");
		names.add("Sanket");
		names.add("Shri");
		names.add("Yash");
		System.out.println(names); // Printing arrayList Object
		System.out.println("---------------------------------------------------------");
		Iterator<String> itr = names.iterator();  // getting iterator		
        while (itr.hasNext()) {      // check if iterator has the elements
        	System.out.println(itr.next()); // printing the elements and move to next
        }
		System.out.println("---------------------------------------------------------");

        for(String lable:names) {
        	System.out.println(lable); // traversing list through for-each loop
        }
		System.out.println("---------------------------------------------------------");
        System.out.println("returning element "+names.get(2)); // it will return second element as index starts from 0
        names.set(1, "Aniket"); // changing element 
        for(String lable:names) {
        	System.out.println(lable); // traversing list through for-each loop
        }
	}

} 
