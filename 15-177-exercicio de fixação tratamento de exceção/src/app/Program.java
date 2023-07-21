package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" -> Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		double initBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		sc.close();
	}
}
