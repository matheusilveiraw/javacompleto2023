package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] valores = new int[n];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor: ");
			valores[i] = sc.nextInt();
		}
		
		for(int i = 0; i < valores.length; i++) if(0 > valores[i]) System.out.println(valores[i]);
		
		sc.close();
	}
}

