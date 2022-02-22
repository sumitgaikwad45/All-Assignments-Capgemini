package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment9Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		var path = "F:\\StudentList.txt";
	      try {
	    	  //Files.writeString(Path.of(path), " Writing hello from code", StandardOpenOption.APPEND);
			String s = Files.readString(Path.of(path)); // this methods are only applicable for String type
			//System.out.println(s);
			 List<String> list =s.lines().collect(Collectors.toList());
			 for (String string : list) {
				 if (string.isBlank()==true) {
					 
				 }
				 else {
					 count ++;
					 System.out.println(count+")"+ string);
				 }
				
			}
			 System.out.println("Total no of students = "+ count);
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
