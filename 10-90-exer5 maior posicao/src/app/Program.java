package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		int [] valores = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: [" + i + "]");
			valores[i] = sc.nextInt(); 
		} 
		
		int maiorValor = 0;
		int posMaiorValor = 0;
		
		for(int i = 0; i < n; i++) {
			if(valores[i] > maiorValor)  {
				maiorValor = valores[i]; 
				posMaiorValor = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %d%nPOSICAO DO MAIOR VALOR = %d", maiorValor, posMaiorValor);
		
		sc.close();
	}

}
