package collection;

import java.util.HashSet;
class Product{
	String ProName;

	public Product(String proName) {
		this.ProName = proName;
	}
	
}

public class Assignment6Q2 {

	public static void main(String[] args) {
     HashSet<Product> set = new HashSet<Product>();
     
   
       Product N1 = new Product("Ram");
       Product N2 = new Product("Sham");
       Product N3 = new Product("Karan");
       Product N4 = new Product("Arjun");
       Product N5 = new Product("Vikas");
       Product N6 = new Product("Pavan");
       Product N7 = new Product("Manish");     
       Product N8 = new Product("Ganesh");
       Product N9 = new Product("Jitrndra");
       Product N10 = new Product("Raju");
 
  set.add(N1);
  set.add(N2);
  set.add(N3);
  set.add(N4);
  set.add(N5);
  set.add(N6);
  set.add(N7);
  set.add(N8);
  set.add(N9);
  set.add(N10);
  set.add(N1);
  for (Product product : set) {
	  System.out.println(product.ProName);
	
}
  /*Iterator<Product> i=S.iterator();  

  while(i.hasNext())  
  {  
  System.out.println(i.next());  
  } */ 
     
	}

}
