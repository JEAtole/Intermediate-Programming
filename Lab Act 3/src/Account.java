import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {

	double account1_balance;
	double account2_balance;
	
	public void debit() {

		DecimalFormat df = new DecimalFormat("$0.00");

		Scanner u_input = new Scanner(System.in);

		System.out.print("Enter withdrawal amount for account1: ");
		double amount1 = u_input.nextDouble();

		System.out.println();

		System.out.println("Subtracting " + df.format(amount1) + " from Account1 Balance.");

		if (account1_balance > amount1) {
			account1_balance = account1_balance - amount1;
		} else {
			System.out.println("Debit amount exceeded account balance.");
		}

		System.out.println("Account1 Balance: " + df.format(account1_balance));
		System.out.println("Account2 Balance: " + df.format(account2_balance));

		System.out.println();

		System.out.print("Enter withdrawal amount for account2: ");
		double amount2 = u_input.nextDouble();

		System.out.println();

		System.out.println("Subtracting " + df.format(amount2) + " from Account2 Balance.");

		if (account2_balance > amount2) {
			this.account2_balance = this.account2_balance - amount2;
		} else {
			System.out.println("Debit amount exceeded account balance.");
		}

		System.out.println("Account1 Balance: " + df.format(account1_balance));
		System.out.println("Account2 Balance: " + df.format(account2_balance));

	}

}
