import java.text.DecimalFormat;
public class AccountRun {

	public static void main(String[] args)
	{	
		DecimalFormat df = new DecimalFormat("$0.00");
		Account a = new Account();
		
		a.account1_balance = 150.00;
		a.account2_balance = 500.53;
		
		System.out.println("Account1 Balance: " + df.format(a.account1_balance));
		System.out.println("Account2 Balance: " + df.format(a.account2_balance));
		System.out.println();
		a.debit();

	}

}
