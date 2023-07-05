package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] valores = new int[n];
		int soma = 0; 
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor: ");
			valores[i] = sc.nextInt();
		}
		
		System.out.printf("Valores: ");
				
		for(int i = 0; i < valores.length; i++) { 
			System.out.printf(valores[i] + " ");
			soma += valores[i];
		}

		System.out.printf("%nSoma: " + soma + "%nMedia: " + soma/valores.length);
				
		sc.close();
	}

}
