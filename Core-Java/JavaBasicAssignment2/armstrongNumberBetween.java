package assignment;

public class armstrongNumberBetween {

	public static void main(String[] args) {
		
		for(int i=101; i<999; i++)
		{
			int a;
			int rem;
			int value = 0;
			a=i;
			
			while (a>0)
			{
				rem= a%10;
				value= value + (rem*rem*rem);
				a=a/10;
				
			}
		    if(i==value)
		    {
		    	System.out.println(value);
		    }
		}
		}

}
