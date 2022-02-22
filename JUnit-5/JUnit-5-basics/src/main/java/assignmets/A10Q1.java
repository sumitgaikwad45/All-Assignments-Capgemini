package assignmets;

public class A10Q1 {
  public int[] findMinMax(int arr[]) {
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
	  return arr2;
	  
  }
}
