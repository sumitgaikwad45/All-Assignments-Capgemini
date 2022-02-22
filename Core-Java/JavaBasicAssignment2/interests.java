package assignment;

import java.util.Scanner;

public class interests {

	public static void main(String[] args) {
		System.out.println("Enter principle amount, annual interest rate and term of loan in years  ");
		Scanner r = new Scanner(System.in);
				int p = r.nextInt();
				int q = r.nextInt();
				int n = r.nextInt();
				
		        int compoundInterest;
		        int simpleInterest;
		        simpleInterest= (p*q*n)/100;
		        
		        		System.out.println("Simple Interest is "+simpleInterest);
		        		System.out.println("Enter t");
		        		
		        		int t = r.nextInt();
		        compoundInterest= (p*(1+q)^t)-p;
        		System.out.println(""+compoundInterest);

	}

}


