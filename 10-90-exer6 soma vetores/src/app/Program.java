package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		int [] vetorA = new int[n];
		int [] vetorB = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite os valores do Vetor A: ");
			vetorA[i] = sc.nextInt(); 
		} 
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite os valores do Vetor B: ");
			vetorB[i] = sc.nextInt(); 
		} 
		
		System.out.println("Resultado: ");
		
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) + ". " + vetorA[i] + " + " + vetorB[i] + " = " + (vetorA[i] + vetorB[i]));
		}
				
		sc.close();

	}

}
