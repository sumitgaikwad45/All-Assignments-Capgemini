package java8Lambda;

import java.util.Arrays;
import java.util.List;
interface Condition{
	boolean test(Assignment8Q2 v);
}
public class Assignment8Q2 {
	    private int totalPrice;
	    private String status;
	    
         
	public int getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

	public Assignment8Q2(int totalPrice, String status) {
			super();
			this.totalPrice = totalPrice;
			this.status = status;
		}

   
	public static void main(String[] args) {
		List<Assignment8Q2> V =  Arrays.asList(
				new Assignment8Q2(20000,"ACCEPTED"),
				new Assignment8Q2(14000,"COMPLETED"),
				new Assignment8Q2(15000,"COMPLETED"),
				new Assignment8Q2(9500,"ACCEPTED")
				);
		
      printConditionally(V, v->v.totalPrice>10000);
      
      }
	private static void printConditionally(List<Assignment8Q2> V,Condition condition) {
  	  for(Assignment8Q2 v: V)
  		  if(condition.test(v)) {
  			  System.out.println(v.totalPrice+" "+v.status);
  		  }
	}

}
