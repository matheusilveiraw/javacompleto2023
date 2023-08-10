package model.entities;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay; 
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(AluguelCarro aluguelCarro) { 
		
		double minutes = Duration.between(aluguelCarro.getStart(), aluguelCarro.getFinish()).toMinutes();
		double hours = minutes / 60;
		
		double basicPayment;
		if(hours <= 12) { 
			basicPayment = pricePerHour * Math.ceil(hours);
		} else { 
			basicPayment = pricePerHour * Math.ceil(hours/24);
		} 
		
		double tax = taxService.tax(basicPayment);
		
		aluguelCarro.setFatura(new Fatura(basicPayment, tax));
		
	}
	
}
