package collection;

import java.util.*;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	String department;
	int salary;

	public Employee(int id, String name, String department, int salary) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee z) {
		if (id > z.id) {
			return 1;
		} else if (id < z.id) {
			return -1;
		} else {
			return 0;
		}

	}
}

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	String department;
	int salary;

	public Employee1(int id, String name, String department, int salary) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee1 y) {
		// TODO Auto-generated method stub
		if (name.compareTo(y.name) > 0) {
			return 1;
		} else if (name.compareTo(y.name) < 0) {
			return -1;
		} else {
			return 0;
		}

	}

}

class Employee2 implements Comparable<Employee2> {
	int id;
	String name;
	String department;
	int salary;

	public Employee2(int id, String name, String department, int salary) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee2 x) {
		// TODO Auto-generated method stub
		if (department.compareTo(x.department) > 0) {
			return 1;
		} else if (department.compareTo(x.department) < 0) {
			return -1;
		} else {
			return 0;
		}

	}

}

class Employee3 implements Comparable<Employee3> {
	int id;
	String name;
	String department;
	int salary;

	public Employee3(int id, String name, String department, int salary) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee3 w) {
		if (salary > w.salary) {
			return 1;
		} else if (salary < w.salary) {
			return -1;
		} else {
			return 0;
		}

	}
}

public class Assignment6Q3 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment6Q3 q = new Assignment6Q3();
		q.select();
	}

	private void select() {
		// TODO Auto-generated method stub

		System.out.println("select the option");
		System.out.println("1)id" + "\n" + "2)name" + "\n" + "3)department" + "\n" + "4)salary");
		int a = s.nextInt();
		if (a == 1) {
			TreeSet<Employee> t1 = new TreeSet<Employee>();

			Employee e1 = new Employee(10, "sanket", "Mec", 55);
			Employee e2 = new Employee(15, "Sumit", "ece", 85);
			Employee e3 = new Employee(12, "Shri", "cse", 75);
			Employee e4 = new Employee(11, "Yash", "eee", 95);
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			one(t1);
		} else if (a == 2) {
			TreeSet<Employee1> t2 = new TreeSet<Employee1>();

			Employee1 e1 = new Employee1(10, "sanket", "Mec", 55);
			Employee1 e2 = new Employee1(15, "Sumit", "ece", 85);
			Employee1 e3 = new Employee1(12, "Shri", "cse", 75);
			Employee1 e4 = new Employee1(11, "Yash", "eee", 95);
			t2.add(e1);
			t2.add(e2);
			t2.add(e3);
			t2.add(e4);
			two(t2);

		} else if (a == 3) {
			TreeSet<Employee2> t3 = new TreeSet<Employee2>();

			Employee2 e1 = new Employee2(10, "sanket", "Mec", 55);
			Employee2 e2 = new Employee2(15, "Sumit", "ece", 85);
			Employee2 e3 = new Employee2(12, "Shri", "cse", 75);
			Employee2 e4 = new Employee2(11, "Yash", "eee", 95);
			t3.add(e1);
			t3.add(e2);
			t3.add(e3);
			t3.add(e4);
			three(t3);
		} else if (a == 4) {
			TreeSet<Employee3> t4 = new TreeSet<Employee3>();

			Employee3 e1 = new Employee3(10, "sanket", "Mec", 55);
			Employee3 e2 = new Employee3(15, "Sumit", "ece", 85);
			Employee3 e3 = new Employee3(12, "Shri", "cse", 75);
			Employee3 e4 = new Employee3(11, "Yash", "eee", 95);
			t4.add(e1);
			t4.add(e2);
			t4.add(e3);
			t4.add(e4);
			four(t4);
		} else {
			System.out.println("invalid choice");
		}
	}

	private void one(TreeSet<Employee> t1) {
		for (Employee z : t1) {
			System.out.println(z.id + " " + z.name + " " + z.department + " " + z.salary);
		}
	}

	private void two(TreeSet<Employee1> t2) {
		for (Employee1 y : t2) {
			System.out.println(y.id + " " + y.name + " " + y.department + " " + y.salary);
		}
	}

	private void three(TreeSet<Employee2> t1) {
		for (Employee2 x : t1) {
			System.out.println(x.id + " " + x.name + " " + x.department + " " + x.salary);
		}
	}

	private void four(TreeSet<Employee3> t1) {
		for (Employee3 w : t1) {
			System.out.println(w.id + " " + w.name + " " + w.department + " " + w.salary);
		}
	}

}