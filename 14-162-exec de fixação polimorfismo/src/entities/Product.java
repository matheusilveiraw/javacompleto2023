package entities;

public class Product {
	private String name; 
	protected Double price;
	
	public Product() { } 
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Double totalProduct() {
		return price;
	}
	
	public String priceTag() {
		return this.getName() + " - $" + String.format("%.2f", this.totalProduct());
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String priceTag(Double price) {
		return this.name + "- $"+ this.price;
	}
}
