package assignment;
import java.util.Scanner;

public class StudentABC {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int total=0,z=0,x=0,y=0;
		int a[]=new int [3];
		System.out.println("Enter marks of 1st student");
		for(int i=0;i<3;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int [3];
		System.out.println("Enter marks of 2nd student");
		for(int i=0;i<3;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int [3];
		System.out.println("Enter marks of 3rd student");
		for(int i=0;i<3;i++)
		{
			c[i]=s.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			 total=total+a[i]+b[i]+c[i];	 
		}
		System.out.println("total marks of all students in all subjects:"+total);
		System.out.println("average marks of all studets in all subjects:"+total/3);	
		for(int i=0;i<1;i++)
		{
			 z=a[i]+b[i]+c[i];	 
		}
		System.out.println("Total marks scored by students in subject A:"+" "+z);
		System.out.println("Average marks scored by students in subject A:"+" "+z/3);

		for(int i=1;i<2;i++)
		{
			 x=x+a[i]+b[i]+c[i];	 
		}
		System.out.println("Total marks scored by students in subject B:"+" "+x);
		System.out.println("Average marks scored by students in subject: B"+" "+x/3);

		for(int i=2;i<3;i++)
		{
			 y=y+a[i]+b[i]+c[i];	 
		}
		System.out.println("Total marks scored by students in subject C:"+" "+y);
		System.out.println("Average marks scored by students in subject C:"+" "+y/3);

	}

}
