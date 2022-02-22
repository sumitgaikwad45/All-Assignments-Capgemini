package collection;
import java.util.*;
import collection.Contacts.Gender;
class Contacts{
	//long PhoneNumber;
	String Name;
	String Email;
	 Gender Sgender;
	 enum Gender{
		 MALE, FEMALE
	 }
	Long PhoneNumber;

		
	public Contacts( String name, String email, Gender Sgender) {
		super();
		//PhoneNumber = phoneNumber;
		this.Name = name;
		this.Email = email;
		this.Sgender = Sgender;
	}
	public Long number(Long number) {
		this. PhoneNumber=number;
		return PhoneNumber;
	}
	
	
}

public class Assignment6Q1 {

	public static void main(String[] args) {
		//Contacts obj = new Contacts();
		Gender M = Gender.MALE;
		Gender F = Gender.FEMALE;
		TreeMap<Long,Contacts>S=new TreeMap<>();
	   Contacts C1 = new Contacts("Sanket","sanket123@gmail.com",M);
	   Contacts C2 = new Contacts("Aniket","aniket123@gmail.com",M);
	   Contacts C3 = new Contacts("Yash","yash123@gmail.com",M);
	   Contacts C4 = new Contacts("Rutuja","rutuja123@gmail.com",F);
	   
   S.put(C1.number(9822456785L), C1);
   S.put(C2.number(9722456784L), C2);
   S.put(C3.number(9622456783L), C3);
   S.put(C4.number(9522456782L), C4);
   
   for(Map.Entry<Long, Contacts> entry: S.descendingMap().entrySet()){    
      Long key = entry.getKey();
      //System.out.println(key);
      Contacts b = entry.getValue();
      //System.out.println(b.Name+" "+b.Email+" "+b.Gender);
      //System.out.println("-----------------------------------------------------------");
      System.out.println(key+" Details "+b.Name+" "+b.Email+" "+b.Sgender);

	}

}
}
