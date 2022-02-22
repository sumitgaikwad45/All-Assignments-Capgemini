package Practice;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee{

	private int id;
	private String name;
	private String dept;
	private int salary;

	// constructor
	public Employee(int value, String name,String dept,int salary)
	{
		this.id=value;
		this.name=name;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept= dept;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
}


class myIdComparator implements Comparator<Employee>
{

	public int compare(Employee s1, Employee s2)
	{
		if((s1.getId() - s2.getId())==0)
			return 1;
		return s1.getId()-s2.getId();
	}
}

class myNameComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2)
	{
		if((s1.getName().compareTo(s2.getName())==0))
			return 1;
		return s1.getName().compareTo(s2.getName());
	}
}

class mySalaryComparator implements Comparator<Employee>
{

	public int compare(Employee s1, Employee s2)
	{
		if((s1.getSalary()-s2.getSalary())==0)
			return 1;
		return s1.getSalary()-s2.getSalary();
	}
}

class myDeptComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2)
	{
		if(s1.getDept().compareTo(s2.getDept())==0)
			return 1;
		return s1.getDept().compareTo(s2.getDept());
	}
}

public class Assignment6Q3A2 {


	public static void addEmployees(TreeSet<Employee> set)
	{
		set.add(new Employee(450,"Sam","HR",15555));
		set.add(new Employee(341,"Ronaldo","IT",16000));
		set.add(new Employee(134,"Daniel","Finance",60200));
		set.add(new Employee(590,"George","AC",14000));
		set.add(new Employee(450,"John","HR",52000));
		set.add(new Employee(341,"Emma","Testing",19000));
		set.add(new Employee(134,"Peter","Finance",20000));
		set.add(new Employee(590,"Max","AC",45866));
		set.add(new Employee(450,"Emma","HR",15555));
		set.add(new Employee(341,"Rose","Testing",14582));
	}

	public static void main (String[] args){
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Run Application: a)ID b)Name c)Department d) Salary");
		 
		 char c = sc.next().charAt(0);
		 
		 if(c=='a')
		 {
		   TreeSet<Employee> set = new TreeSet<Employee>(new myIdComparator());
		   addEmployees(set);
            
            	for(Employee ele: set)
	        	{
    			System.out.print(ele.getId()+" "+ele.getName()+" "+ele.getDept()+" "+ele.getSalary());
    			System.out.println();
		        }
            
		 }
		 else if(c=='b')
		 {
		     TreeSet<Employee> set = new TreeSet<Employee>(new myNameComparator());
			 addEmployees(set);
            	for(Employee ele: set)
	        	{
    			System.out.print(ele.getId()+" "+ele.getName()+" "+ele.getDept()+" "+ele.getSalary());
    			System.out.println();
		        }
		 }
		 else if(c=='c')
		 {
		     TreeSet<Employee> set = new TreeSet<Employee>(new myDeptComparator());
			 addEmployees(set);
            
            	for(Employee ele: set)
	        	{
    			System.out.print(ele.getId()+" "+ele.getName()+" "+ele.getDept()+" "+ele.getSalary());
    			System.out.println();
		        }
		 }
		 else if(c=='d')
		 {
		     TreeSet<Employee> set = new TreeSet<Employee>(new mySalaryComparator());
			 addEmployees(set);
            
            	for(Employee ele: set)
	        	{
    			System.out.print(ele.getId()+" "+ele.getName()+" "+ele.getDept()+" "+ele.getSalary());
    			System.out.println();
		        }
		 }
		 else
		 {
		     System.out.println("Invalid Choice");
		 }
	}
}
 






 
