package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		double [] valores = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ");
			valores[i] = sc.nextDouble(); 
		} 
		
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			soma += valores[i];
		}
		
		System.out.println("MEDIA DO VETOR: " + soma/n);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		
		for(int i = 0; i < n; i++) {
			if(valores[i] < (soma/n)) {
				System.out.println(valores[i]);
			}
		}
		
		sc.close();

	}

}
