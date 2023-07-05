package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		int [] valores = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ");
			valores[i] = sc.nextInt(); 
		} 
		
		for(int i = 0; i < n; i++) {
			if(valores[i] % 2 == 0) { 
				System.out.printf("%d ", valores[i]);
			}
		}
		
		sc.close();
	}

}
