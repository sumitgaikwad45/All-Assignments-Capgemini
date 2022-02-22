package assignment;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		int n;
		int rem;
		int value = 0;
		int c;
		System.out.println("Enter the Number");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		c=n;
		while (n>0)
		{
			rem= n%10;
			value= (rem*rem*rem) + value;
			n = n/10;
			
		}
		if (c==value)
		{
			System.out.println("Given Number is Armstrong Number...!");
		}
		else
			{
			System.out.println("Sorry, Given Number is not Armstrong Number.");
			}
        }
}