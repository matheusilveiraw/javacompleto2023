package entities;

public class product {
	public String name;
	public double price;
	public int quantity; 
	
	public product() { //posos fazer vários construtores só preciso selecionar o certo no programa principal
		
	}
	
	public product(String name, double price, int quantity) { //para obrigar o usuario a dar valor para os atributos no momento da instanciação
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public product(String name, double price) { //para obrigar o usuario a dar valor para os atributos no momento da instanciação
		this.name = name;
		this.price = price;
	}
	
	
	public double totalValueInStock() {
		return price * quantity; 
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { //sobrescrevendo o toString
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $" + String.format("%.2f", totalValueInStock());
	}
	
}
