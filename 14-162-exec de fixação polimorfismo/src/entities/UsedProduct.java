package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private LocalDate manuData;

	public UsedProduct(String name, Double price, LocalDate manuData) {
		super(name, price);
		this.manuData = manuData;
	}
	
	public String priceTag() {
		return super.getName() + " (used) - $" + String.format("%.2f", super.getPrice()) + " (Manufacture date: " +  manuData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
	

	public LocalDate getData() {
		return manuData;
	}

	public void setData(LocalDate manuData) {
		this.manuData = manuData;
	}
	
}
