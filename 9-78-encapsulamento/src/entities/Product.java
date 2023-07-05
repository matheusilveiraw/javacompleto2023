package entities;

public class Product {
	String name;
	private double price;
	private int quantity; 
	
//	public Product() { //posos fazer vários construtores só preciso selecionar o certo no programa principal
//		
//	}
//	
//	public Product(String name, double price, int quantity) { //para obrigar o usuario a dar valor para os atributos no momento da instanciação
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//	}
//	
	public Product(String name, double price) { //para obrigar o usuario a dar valor para os atributos no momento da instanciação
		this.name = name;
		this.price = price;
	} 
	
	public Product(String name, double price, int quantity) { //clicar com o btn esquerdo do mouse -> source -> gerar construtor, e ele vai tá gerando automaticamente
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
	//gets e sets após construtores
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public double getPrice() {
//		return price;
//	}
//	
//	public double getQuantity() {
//		return quantity;
//	}
	
	
	public double totalValueInStock() { //source -> gerar setters e getters e xablau
		return price * quantity; 
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
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
