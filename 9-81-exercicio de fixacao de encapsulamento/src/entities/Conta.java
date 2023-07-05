package entities;

public class Conta {
	private String accHolder;
	private int accNumber;
	private double totalValue;
	
	public void deposito(double value) {
		this.totalValue += value;
	}
	
	public void saque(double value) {
		this.totalValue -= value + 5;
	}
	
	
	public Conta(int accNumber, String accHolder, double initialDeposit) {
		super();
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		deposito(initialDeposit);//melhor assim para o caso de alguma regra de negócio for alterada
	}
	
	public String toString() { //bem melhor para impressão comparado ao qeu eu tinha feito
		return "Holder: " + accHolder + ", Acc: "+ accNumber + ",  Balance: R$" + String.format("%.2f", totalValue);
	}

	//-------------------

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getTotalValue() {
		return totalValue;
	}
}
