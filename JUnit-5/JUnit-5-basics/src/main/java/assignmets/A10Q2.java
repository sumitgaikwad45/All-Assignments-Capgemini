package assignmets;

import java.util.Arrays;

public class A10Q2 {
	public String findMinMax(int arr[]) {
		   int max = arr[0];
		   int min = arr[0];
		   for(int i=0; i<arr.length; i=i+1)
		   {
			   if (arr[i]>max)
				   max = arr[i];
			   else if(arr[i]<min)
				   min = arr[i];
		   }
		   int arr2[]= {min,max};
		   String s = Arrays.toString(arr2);
		  return s;
		  
	  }
}
