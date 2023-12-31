package entities;

public class SavingsAccounts extends Account{

		private Double interestRate;
		
		public SavingsAccounts () {
			super();
		}
		
		public void updateBalance() {
			balance += balance * interestRate; 
		}
		
		@Override
		public final void withdraw(double amount) { 
			balance -= amount;
		}

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
