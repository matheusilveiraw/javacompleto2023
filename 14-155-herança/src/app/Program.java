package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccounts;

public class Program {

	public static void main(String[] args) {
		//upcasting -> fazer com que uma subclasse suba para classe anterior, nesse caso, businessaccount para account
		//downcasting -> o oposto do anterior, fazer com que uma classe desça para a próxima, no caso das classes aqui, de account para businessacount 
		
		System.out.println("EXEMPLOS POLIMORFISMO");
		
		Account x = new Account(120, "Alex", 1000.0);
		Account y = new SavingsAccounts(1023, "Maroa", 1000.0, 0.01);
		
		y.withdraw(50);
		x.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		//EXEMPLO DO OVERRIDE NO SAVINGACOUNTS
		System.out.println("EXEMPLOS OVERRIDE");
		Account acc10 = new Account(1001, "Alex", 1000.0);
		acc10.withdraw(200);
		System.out.println(acc10.getBalance());
		
		Account acc11 = new SavingsAccounts(1000, "Maria", 1000.0, 0.01);
		acc11.withdraw(200);
		System.out.println(acc11.getBalance());
		
		Account acc12 = new BusinessAccount(1000, "Jorge", 1000.0, 0.01);
		acc12.withdraw(200);
		System.out.println(acc12.getBalance());
		
		//SÓ PARA PROVAR QUE FUNCIONAR SOBRESCREVER
		
		System.out.println("=====================");
		
		
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
