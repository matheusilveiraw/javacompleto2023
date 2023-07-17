package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;
	
	public OutsourcedEmployee() { 
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public double payment() { 
		return super.payment() + additionalCharge * 1.1;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	} 
}
