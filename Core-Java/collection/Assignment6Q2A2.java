package collection;
import java.util.HashSet;

class CarBrands {   
String name;  
public CarBrands( String name) {  
    this.name = name;  
 
}  
}  
public class Assignment6Q2A2 {

	public static void main(String[] args) {
    HashSet<CarBrands> set=new HashSet<CarBrands>();  
    //Creating Brands  
    CarBrands b1=new CarBrands("Audie");  
    CarBrands b2=new CarBrands("Maruti");  
    CarBrands b3=new CarBrands("Suzuki");
    CarBrands b4=new CarBrands("Hyundai");
    CarBrands b5=new CarBrands("Ferari");
    CarBrands b6=new CarBrands("Tata");
    CarBrands b7=new CarBrands("Mahindra");
    CarBrands b8=new CarBrands("Force");
    CarBrands b9=new CarBrands("Lamborgini");
    CarBrands b10=new CarBrands("Hero");
    
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    set.add(b4);  
    set.add(b5);  
    set.add(b6);  
    set.add(b7);  
    set.add(b8);  
    set.add(b9);  
    set.add(b10);
    set.add(b1);  
    //Traversing HashSet  
    for(CarBrands b:set){  
    System.out.println( b.name);  
    }  


	}

}


