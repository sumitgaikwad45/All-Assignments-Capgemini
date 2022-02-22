package OOPSAssignment;


abstract class MobilePhone {
	abstract void Id();
	//abstract void name();
}
class Samsung extends MobilePhone{
 public void Id() {
	 int id = 1234;
	 System.out.println("Id of phone model is "+id);
	 
 }
 //public void name() {
//	 String name = "SamsungGalexyJ10";
	// System.out.println("Phone model name is "+ name);
	
	
 //}
 /*public void feature() {
	 System.out.println("I am best for official use...!");
 }
}*/
abstract class Asus{
	public int id()
	{
		int id = 223;
		System.out.println("Id of phone model is ");
		return id;
	}}
	/*public void name() {
		 String name = "AsusROG5";
		 System.out.println("Phone model name is "+ name);
		
}
	public void feature() {
		 System.out.println("I am best for Professional Gaming...!");
	 }/*/
public class Assignment2Q4 {

	public static void main(String[] args) {
		MobilePhone J = new Samsung();
		 J.Id();
		


	}

}
}
