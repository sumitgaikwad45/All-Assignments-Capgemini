package GenericsAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment5Q2 {

	public static void main(String[] args) {
		HashMap<Integer, Double> h1=new HashMap<>();
		h1.put(1, 10.0);
		h1.put(2, 20.0);
		h1.put(3, 30.0);
		h1.put(4, 40.0);
		h1.put(5, 50.0);
		h1.put(6, 60.0);
		h1.put(7, 70.0);
		h1.put(8, 80.0);
		h1.put(9, 90.0);
		h1.put(10, 100.0);
		System.out.println(h1);
		for(Map.Entry m:h1.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}
	}


