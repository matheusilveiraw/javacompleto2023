package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.ValueException;

public class Program {

	public static void main(String[] args) throws ValueException {
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
						
			conta.canWithdraw(withdrawAmount, limit);
			System.out.println("Novo saldo: " + conta.getBalance());
			
		} catch(InputMismatchException e) { 
			System.out.println("Erro: " + e.getMessage());
		} catch (ValueException e) { 
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}
