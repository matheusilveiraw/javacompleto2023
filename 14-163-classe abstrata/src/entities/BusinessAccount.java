package entities;

public final class BusinessAccount extends Account {

	private double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2;
	}
	
	public double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) { 
			balance += amount - 10.0;
		}
	}
	
	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	};
}
