package application;

import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double depositoOuRetirada = 0;
		char initialDepositPermission;
		String accHolder;
		int accNumber;
						
		System.out.println("Enter account number: ");
		accNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		accHolder = sc.next();
		System.out.println("Is there a initial deposit? (Y/N)");
		initialDepositPermission = sc.next().charAt(0);
		if(initialDepositPermission == 'Y') {
			System.out.println("Enter initial deposit value: ");
			depositoOuRetirada = sc.nextDouble();
		}
		
		Conta conta = new Conta(accNumber, accHolder, depositoOuRetirada);
		
		System.out.println(conta);
		
		System.out.println("Enter a deposit value: ");
		depositoOuRetirada = sc.nextDouble();
		conta.deposito(depositoOuRetirada);
		
		System.out.println(conta);
		
		System.out.println("Enter a withdraw value: ");
		depositoOuRetirada = sc.nextDouble();
		conta.saque(depositoOuRetirada);
		
		System.out.println(conta);
				
		sc.close();
	}

}
