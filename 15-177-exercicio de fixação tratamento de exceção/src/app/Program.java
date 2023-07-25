package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		try {
			System.out.println(" -> Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account conta = new Account(number, holder, initBalance, limit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdrawAmount = sc.nextDouble();
						
			System.out.println(conta.canWithdraw(withdrawAmount, limit));
			
		} catch(InputMismatchException e) { 
			System.out.println("Erro: insira os dados de forma correta!");
		} 
		

		
		
		
		sc.close();
	}
}
