package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Test{}

public class Assignment7Q1 {
@Test	
public void helloMethod(){
	System.out.println("Hello Java...!");
}
@Test
public static void print() {
	System.out.println("10");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Assignment7Q1 H = new Assignment7Q1();
     H.helloMethod();
     print();
	}

}
