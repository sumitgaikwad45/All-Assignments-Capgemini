package assignment;
import java.util.Scanner;

public class passingCondition {

	public static void main(String[] args) {
		Scanner r = new Scanner (System.in);
		System.out.println("Enter the marks for first subject :");
		int a = r.nextInt();
		System.out.println("Enter the marks for Second subject :");
		int b = r.nextInt();
		System.out.println("Enter the marks for third subject :");
		int c = r.nextInt();
	  if (a+b+c>60 && (a<60 && b<60 && c<60))
	  {
		  System.out.println("Student is passed");
	  }
	  if((a+b>60 || a+c>60 || b+c>60)&&(a<60 && b<60 && c<60))
	  {
		  System.out.println("Student is promoted");

	  }
	  else if ((a>60 || b>60 || c>60) && (a + b + c)<60 )
	  {
		  System.out.println("Student is failed...!");

	  }
	}

}
