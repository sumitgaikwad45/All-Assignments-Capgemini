package OOPSAssignment;
import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
   
    public int getCash() {
    	int totalCash = totalDeposits + creditLimit;
    	return totalCash;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    public int getCash() {
    	int totalCash = totalDeposits + fixedDepositAmount;
    	return totalCash;
    }
}
public class Assignment2Q3 {
	//public int getCash(int cash){
		//   this.cash=cash;
		  // return cash;
	 //  }
	 public int totalCashInBank(ArrayList<Integer> cash){
		 int totals =0;
		 for(int i:cash)
		 {
			 totals+=i;
		 }
		 return totals;
	 }
	   
	public static void main(String[] args) {
		Assignment2Q3 q =new Assignment2Q3();
		CurrentAccount c = new CurrentAccount();
		int ch = c.getCash();
		SavingsAccount s = new SavingsAccount();
		int sh = s.getCash();
		ArrayList<Integer> cash=new ArrayList<>();
		cash.add(ch);
		cash.add(sh);
        int totalAmount =q.totalCashInBank(cash);
       System.out.println("Total Amount in bank "+ totalAmount);
	}

}
