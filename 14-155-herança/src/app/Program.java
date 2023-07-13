package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccounts;

public class Program {

	public static void main(String[] args) {
		//upcasting -> fazer com que uma subclasse suba para classe anterior, nesse caso, businessaccount para account
		//downcasting -> o oposto do anterior, fazer com que uma classe desça para a próxima, no caso das classes aqui, de account para businessacount 
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING 
		
		Account acc1 = bacc; //EXEMPLO DE UPCASTING 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccounts(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		
		//vai verificar se o acc3 (que é um saving account é um business account)
		if(acc3 instanceof BusinessAccount) { 
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("LOAN1");
		}
		
		if(acc3 instanceof SavingsAccounts) { 
			SavingsAccounts acc5 = (SavingsAccounts)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; 
		//essa linha aqui ela é errada pq o meu acc3 é um savingsaccount e o savingaccount e o
		//businessaccount herdam de account, mas eles são coisas distintas (da erro só na execução)
	}
	

}
