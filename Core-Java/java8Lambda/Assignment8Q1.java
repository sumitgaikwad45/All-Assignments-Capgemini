package java8Lambda;

import java.util.Scanner;

interface arithmatic{
	double AP(int a, int b);
	}

public class Assignment8Q1 {
	  public double addition(int num1,int num2) {
		  arithmatic s = (a, b) -> a+b;
		return s.AP(num1,num2);
	     
	  }
	  public double substraction(int num1,int num2) {
		  arithmatic s = (a, b) -> a-b;
		return s.AP(num1,num2);
	     
	  }
	  public double multiplication(int num1,int num2) {
		  arithmatic s = (a, b) -> a*b;
		return s.AP(num1,num2);
	     
	  }
	  public double division(int num1,int num2) {
		  arithmatic s = (a, b) -> a/b;
		return s.AP(num1,num2);
	     
	  }
	public static void main(String[] args) {
		Assignment8Q1 A =new Assignment8Q1();
		System.out.println(A.addition(13, 5));
		System.out.println(A.substraction(13, 5));
		System.out.println(A.multiplication(13, 5));
		System.out.println(A.division(13, 5));

	}

}
