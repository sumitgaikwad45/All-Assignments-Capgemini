package GenericsAssignment;


public class Assignment5Q3 {
	public static <T> void swap(T[]a, int i, int j){
		  T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;	}
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4};
		swap(a, 2, 1);
		for (Integer integer : a) {
			System.out.println(integer);
	}
	}
	}

