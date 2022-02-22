package assignment;
import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		System.out.println("Enter CTC");	
		Scanner s=new Scanner(System.in);
		long CTC =s.nextLong();
		long tax;
		if(CTC<=180000)
		{
			System.out.println("no need to pay any tax");
		}
		else if((CTC>180000)&&(CTC<=300000))
		{tax=(CTC/100)*10;
			System.out.println("Taxble amount"+tax);
		}
		else if((CTC>300000)&&(CTC<=500000))
		{tax=(CTC/100)*20;
			System.out.println("Taxble amount"+tax);
		}
		else if((CTC>500000)&&(CTC<1000000))
		{tax=(CTC/100)*30;
			System.out.println("Taxble amount"+tax);
		}
		else
		{
			System.out.println("enter amount is out of reach amount ");
		}
			}

		
	}


