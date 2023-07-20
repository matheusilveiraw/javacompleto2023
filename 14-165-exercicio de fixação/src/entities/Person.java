package entities;

public abstract class Person {

		protected String name; 
		private double anualIncome;
		
		public Person() {
			super();
		}
		
		public Person(String name, double anualIncome) {
			super();
			this.name = name;
			this.anualIncome = anualIncome;
		}
		
		public String finalTax() { 
			return "$" + anualIncome;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAnualIncome() {
			return anualIncome;
		}
		public void setAnualIncome(double anualIncome) {
			this.anualIncome = anualIncome;
		}
}
