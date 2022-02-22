package stringbuilderbuffer;

public class AssignmentQ {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("StringBuffer");
		StringBuffer s1=new StringBuffer(" is a peer class of String");
		s.append(s1);
			System.out.println(s);
			StringBuffer S1= new StringBuffer("It is used to   at the specified index position");
			S1.insert(14 ,"insert text");
			System.out.println(S1);
			StringBuffer S2=new StringBuffer("This method returns the reversed object on which it was called");
	        S2.reverse();
			System.out.println(S2);



		


	}

}
