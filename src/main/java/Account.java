/**
 * @author 2058146 Arun Sharma
 *
 */

public class Account {
	
	private double balance;

	public Account(double intialBalance) {

		if (intialBalance >0) {
			
			this.balance = intialBalance;
			
		} else {
			
			this.balance=0;
		}
	}
	
	public void deposit (double amount) {
		
		if(amount>0) {
			
			balance += amount;
			
		}
		
	}
	
	public void withdraw (double amount) {
		
		if (amount>0 && amount <= balance) {
			
			balance -= amount;
			
		}
		
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	
	public void applyInterest() {
		
		System.out.println("Applying interest...");

		double interestRate = 0.06; //6% annual interest
		balance += balance *interestRate;
		
	}
	

}
