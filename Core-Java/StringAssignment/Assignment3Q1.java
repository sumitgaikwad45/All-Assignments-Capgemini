package StringAssignment;

public class Assignment3Q1 {

	public static void main(String[] args) {
		String str = "Hello";
		int len = str.length();
		String str1 = " How are You";
		String joint = str.concat(str1);
		String meth = "Java String pool refers to collection of Strings which are stored in heap memory";		
		String lower = meth.toLowerCase();
		String upper = meth.toUpperCase();
		String replace = meth.replace("a", "$");
		boolean match = meth.contains("collection");
		String meth1 = "java string pool refers to collection of strings which are stored in heap memory"; 
       
		
		System.out.println("The lenght of string is "+len);
		System.out.println("The Jointed string is "+joint);
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(replace);
		System.out.println(match);
		 if (meth.equals(meth1))
     	{
     	System.out.println("two strings are equal");
     	
     	}
     else
     	System.out.println("two strings are Not equal");

	
	 if (meth==meth1)
  	{
  	System.out.println("two strings are equal");
  	
  	}
  else
  	System.out.println("two strings are Not equal");

}
}
