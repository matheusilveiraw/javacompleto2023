package entities;

public class UsedProduct extends Product {
	
	private String data;

	public UsedProduct(String name, Double price, String data) {
		super(name, price);
		this.data = data;
	}
	
	public String priceTag() {
		return super.getName() + " (used)  - $" + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + data + ")";
	}
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
