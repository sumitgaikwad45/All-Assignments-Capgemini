package java8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment8Q6 {
    public static List<String> convertToUpperCase(List<String> list, UnaryOperator<String> operator) {  
    	/*for(String i:list) {
    		i.replaceAll(i,i.toUpperCase());
    	}*/
		return list;		
    }  
    public static void main(String[] args) {
    	List<String> L1=new ArrayList<>();
    	L1.add("Sumit");
    	L1.add("Karan");
    	L1.add("rutuja");
    	//convertToUpperCase(L1, (i)->i.replaceAll(i, i.toUpperCase()));
    	L1.replaceAll(new replace());
    	System.out.println(L1);
    }
}
class replace implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
}
