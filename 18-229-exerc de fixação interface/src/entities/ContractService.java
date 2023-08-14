package entities;

import java.time.LocalDate;

import services.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
//		contract.getInstalments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04)); //instaciações manuais
//		contract.getInstalments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) { 
			LocalDate dueDate = contract.getDate().plusMonths(i); //adc months
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}

}
