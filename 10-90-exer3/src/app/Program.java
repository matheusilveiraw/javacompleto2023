package app;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Pessoa[] vetorPessoas = new Pessoa[n];
		
		for(int i = 0; i < vetorPessoas.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.printf("Nome: ");
			String nome = sc.next();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			vetorPessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAlturas = 0;
		double maiores16 = 0;
		String nomes = "";
		
		
		for(int i = 0; i < vetorPessoas.length; i++) {
			somaAlturas += vetorPessoas[i].getAltura();
			nomes += vetorPessoas[i].getName() + "%n";
			if(vetorPessoas[i].getIdade() < 16) maiores16 += 1;
		}
		
		
		System.out.println("Altura media: " + somaAlturas/vetorPessoas.length);
		System.out.println("Pessoas com menos de 16 anos: " + (maiores16/vetorPessoas.length) * 100 + "%");
		System.out.printf(nomes);

		sc.close();
	}

}
