package entities;

public class BusinessAccount extends Account { //extends define que tudo que tem em accoumt eui consigo usar aqui
	
	private double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) { //criado um construtor que usa os argumentos de account
		super(number, holder, balance); //é pra isso que serve o super, pra usar os argumentos da superclasse (classe que é herdada)
		this.loanLimit = loanLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); //basicamente usa o código que tá pronto lá no account
		balance -= 2; //e aqui reduz mais dois ainda
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
