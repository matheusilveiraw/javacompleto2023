package app;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccounts;

public class Program {

	public static void main(String[] args) {

//		Account acc1 = new Account(1001, "Alex", 1000.00); //da erro pq account é abstrata, só ver na classe account
//		Account acc2 = new SavingsAccounts(1001, "Alex", 1000.00, 0.01);
//		Account acc3 = new BusinessAccount(1001, "Bob", 1000.00, 500);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccounts(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400));
		list.add(new SavingsAccounts(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		} 
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list) { 
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Update balance for accounbt %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}
}
