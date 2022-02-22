package GenericsAssignment;

import java.util.HashSet;

class Employees
{private int id;
private String name;
private int salary;
private String department;
public Employees(int id, String name, int salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
}

public String displayDetails()
{
	
return "id:"+id+"\t"+"name:"+name+"\t"+"Salary:"+salary+"\t"+"Department:"+department;

}
}
public class Assignment5Q1 {

	public static void main(String[] args) {
		HashSet<Employees> e1=new HashSet<>();
		Employees sanket=new Employees(1, "sanket", 50000, "mec") ;
		e1.add(sanket);
		Employees sumit=new Employees(2, "sumit", 50000, "Ece") ;
		e1.add(sumit);
		Employees sujal=new Employees(3, "sujal", 50000, "sci") ;
		e1.add(sujal);

		for (Employees e2: e1) {
			System.out.println(e2.displayDetails());
		}

			}

	}


