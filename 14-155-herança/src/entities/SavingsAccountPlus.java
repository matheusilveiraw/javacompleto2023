package entities;

public class SavingsAccountPlus extends SavingsAccounts {
	
	public void withdraw(double amount) {
		//da erro pq tem o final lá no SAvingAccounts
		balance -= amount + 20;
	} //REESCREVENDO WITHDRAW 
	
}
