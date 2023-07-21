package entities;

public class Company extends Person {

	private Integer numberEmployees;

	public Company(String name, double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double finalTax() {
		if(this.getNumberEmployees() > 10) { 
//			return this.name + " $" + this.getAnualIncome() * 0.14; 
			return this.getAnualIncome() * 0.14;
		}
//		return this.name + " $" + this.getAnualIncome() * 0.16; 
		return this.getAnualIncome() * 0.16;
	}
}