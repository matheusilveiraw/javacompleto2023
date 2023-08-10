package entities;

import java.time.LocalDate;

import services.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		contract.getInstalments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
		contract.getInstalments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));

	}

}
