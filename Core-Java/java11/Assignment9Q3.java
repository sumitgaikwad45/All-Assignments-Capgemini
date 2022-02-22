package java11;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment9Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "A quick brown fox jumps over the lazy dog";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (String string : list) {
       	System.out.println(string);	
       }
        String[] arr =list.stream().toArray(size-> new String[size]);
        System.out.println(Arrays.toString(arr));	}

}
