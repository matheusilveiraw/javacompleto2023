package entities;

public class Individual extends Person {

	private Double healthExpenditure;

	public Individual(String name, double anualIncome, double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public double getHealExpenditure() {
		return healthExpenditure;
	}

	public void setHealExpenditure(double healExpenditure) {
		this.healthExpenditure = healExpenditure;
	}
	
	@Override
	public Double finalTax() {
		if(this.getAnualIncome() < 20000) { 
			if(this.healthExpenditure > 0) { 
				return this.getAnualIncome() * 0.15 - this.healthExpenditure * 0.5; 
			} else {
				return this.getAnualIncome() * 0.15; 
			}
		}
	
		if(this.healthExpenditure > 0) { 
			return this.getAnualIncome() * 0.25 - this.healthExpenditure * 0.5; 
		} else {
			return this.getAnualIncome() * 0.25; 
		}
	}
}
