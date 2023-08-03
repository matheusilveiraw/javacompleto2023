package model.entities;

public class Fatura {
	
	private double basicPayment;
	private double tax;
	
	public Fatura() {}
	
	
	
	public Double getTotalPayment() { 
		return getBasicPayment() - getTax();
	}

	public Fatura(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
