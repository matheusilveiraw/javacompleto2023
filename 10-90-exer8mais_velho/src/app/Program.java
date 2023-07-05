package app;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos pessoas a ser digitadas?");
		int n = sc.nextInt();
		Pessoa[] vetorPessoas = new Pessoa[n];

		
		for(int i = 0; i < n; i++) {
			System.out.println("Digte os dados da " + (i+1) + "a pessoa: ");
			System.out.printf("- Nome: ");
			String nome = sc.next();
			System.out.printf("- Idade: ");
			int idade = sc.nextInt();
			vetorPessoas[i] = new Pessoa(nome, idade);
		} 
		
		String maisVelho = null;
		int idadeMaisVelho = 0;
				
		for(int i = 0; i < n; i++) {
			if(vetorPessoas[i].getIdade() > idadeMaisVelho) { 
				idadeMaisVelho = vetorPessoas[i].getIdade();
				maisVelho = vetorPessoas[i].getNome();
			}
		}
		
		System.out.println("Pessoas mais velha: " + maisVelho);
		
		sc.close();

	}

}
