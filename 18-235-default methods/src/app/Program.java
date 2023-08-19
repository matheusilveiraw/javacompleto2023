package app;

import java.util.Locale;
import java.util.Scanner;

import entities.InterestService;
import entities.UsInterestService;

public class Program {

	public static void main(String[] args) {
		//default methods tbm chamado de defender methods
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new UsInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
		
	}

}
