package assignmets;
class InsufficientFundException extends Exception{
	public InsufficientFundException(String message)
	{
		super(message);
	}
}
public class A10Q3 {
	int balance = 20000;
 public void withdraw(int amt) throws InsufficientFundException {
if(amt<balance);
{
	throw new InsufficientFundException("Enter valid amount");
}
 }
}
