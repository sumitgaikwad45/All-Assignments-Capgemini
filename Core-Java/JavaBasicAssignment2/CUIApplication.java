package assignment;
import java.util.Scanner;
public class CUIApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		String user = "Sumit";
		String pass = "pass";
		System.out.println("Enter Credentials");
		for (int i = 1; i <= 3; i++) {
			System.out.println("user_id:");
			String u = s.nextLine();
			System.out.println("password");
			String p = s.nextLine();
			if ((user.equals(u)) == true && pass.equals(p) == true) {
				System.out.println("Welcome" + user);
				break;
			}
			
			a++;
		}
		if (a == 3)
		{
    System.out.println("Contact Admin");
		}

	}

}
