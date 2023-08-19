package app;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		//generics 
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		//poderia estar chamando um integer aqui, só tem que mudar o scanner lá embaixo
		
		System.out.println("How many values");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) { 
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("First: " + ps.first());

		sc.close();
	}

}
