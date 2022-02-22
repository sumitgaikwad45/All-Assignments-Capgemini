package ExceptionHandling;

import java.util.Scanner;

public class Assignment4Q1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a= sc.nextInt();
			System.out.println("Enter the Second number");
			int b= sc.nextInt();
	        try 
	        {
	        	System.out.println("Results after deviding first number by second number is "+ a/b);
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        System.out.println("Devision is Completed..!");
		

	}

}
