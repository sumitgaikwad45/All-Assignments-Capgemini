package assignmentQ1toQ3;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 class BankAccount {

	long accountId; 
	String accountHolderName;
	String accountType;
	double accountBalance;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}


 class BankAccountepositoryImpl implements BankAccountRepository {
	
	List<BankAccount> Account=null;
	//getters and setters
	
	public List<BankAccount> getAccount() {
		return Account;
	}

	public void setAccount(List<BankAccount> account) {
		Account = account;
	}
	//this method checks the account id and returns the account that matches the account
	public BankAccount CheckAccountID(long accountID)
	{
		if(Account!=null)
		{
			for(BankAccount ac: Account)
			{
				if(ac.getAccountId()==accountID)
				{
					return ac;
				}
			}
		}
		return null;
	}
	public double getBalance(long accountId) {
		BankAccount account=CheckAccountID(accountId);
		if(account!=null)
			return account.getAccountBalance();
		return 0;
		
	}
	public double updateBalance(long accountId, double newBalance,String type) 
	{
		BankAccount update= CheckAccountID(accountId);
		if(update!=null)
		{
			if(type.equals("deposit"))
			{
				update.setAccountBalance(update.getAccountBalance()+newBalance);
			}
			else if(type.equals("withdraw"))
			{
				update.setAccountBalance(update.getAccountBalance()-newBalance);
			}
			return update.getAccountBalance();
		}
		
		return 0;			
	}

}


 class BankAccountController {
	private BankAccountServiceImpl bankAccountServiceImpl;
	
	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl) {
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}
	public double withdraw(int accountId, double balance) {
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}
	public double deposit(int accountId, double balance) {
		return bankAccountServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(int accountId) {
		return bankAccountServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, toAccount);
	}
}

 class BankAccountServiceImpl implements BankAccountService {

BankAccountepositoryImpl bankAccountepositoryImpl=null;

	
	public BankAccountServiceImpl(
			BankAccountepositoryImpl bankAccountRepositoryImpl) {
		this.bankAccountepositoryImpl = bankAccountRepositoryImpl;
	}


	public double withdraw(long accountId, double balance) {
		return bankAccountepositoryImpl.updateBalance(accountId, balance, "withdraw");
	}

	public double deposit(long accountId, double balance) {
		return bankAccountepositoryImpl.updateBalance(accountId, balance, "deposit");
	}

	public double getBalance(long accountId) {
		return bankAccountepositoryImpl.getBalance(accountId);
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amount)
	{
		double account1=withdraw(fromAccount, amount);
		System.out.println(account1);
		if(account1!=0){
			double account2=deposit(toAccount, amount);
			if(account2!=0){
				return true;
			}
			deposit(fromAccount, amount);
		}

		return false;
	}

	
}

 interface BankAccountService {
	
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amount);


}

  interface BankAccountRepository {

		public double getBalance(long accountId);
		public double updateBalance(long accountId, double newBalance, String type);
	}


public class AQ3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assignmentQ3.xml");
		BankAccountController B1= (BankAccountController) context.getBean("BankAccountController");
		BankAccountServiceImpl B2= (BankAccountServiceImpl) context.getBean("BankAccountServiceImpl");
		System.out.println(B1.getBalance(123456));
		System.out.println(B1.deposit(123456, 900));
		System.out.println(B1.withdraw(123456, 1000));
		System.out.println("to account balance " + B1.getBalance(456789));
		System.out.println(B1.fundTransfer(123456,456789,15000));
		System.out.println("from account balance " + B1.getBalance(123456));
		System.out.println("to account balance " + B1.getBalance(456789));
		
		System.out.println(B2.fundTransfer(123456,456789,15000));
	}

}
