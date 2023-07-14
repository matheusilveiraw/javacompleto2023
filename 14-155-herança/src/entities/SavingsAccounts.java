package entities;

public class SavingsAccounts extends Account{

		private Double interestRate;
		
		public SavingsAccounts () {
			super();
		}
		
		public void updateBalance() {
			balance += balance * interestRate; 
		}
		
		@Override //só pra dizer que ofi sobrescrito 
		public final void withdraw(double amount) { 
			//o final impede de ser reescrevido
			balance -= amount;
		} //REESCREVENDO WITHDRAW 

		public SavingsAccounts(Integer number, String holder, Double balance, Double interestRate) {
			super(number, holder, balance);
			this.interestRate = interestRate;
		}

		public Double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(Double interestRate) {
			this.interestRate = interestRate;
		}
		
		
}
