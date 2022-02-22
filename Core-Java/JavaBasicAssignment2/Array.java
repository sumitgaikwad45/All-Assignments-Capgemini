package assignment;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int arr[]= { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<arr.length;i++)
		{ if(arr[i]==n)
		{  a=a+1;
			break;
		}
		}
		if(a==1)
		{
			System.out.println("number is present ");
		}
		else
		{
			System.out.println("number is not present ");
		}
	}

}
