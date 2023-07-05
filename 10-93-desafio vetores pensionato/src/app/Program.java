package app;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		Pessoa[] vetorPessoas = new Pessoa[9];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.next();
			System.out.printf("Quarto  [1-10]: ");
			int quarto = sc.nextInt();
			vetorPessoas[(quarto - 1)] = new Pessoa(nome, email);
		}
		
		
		for(int i = 0; i < vetorPessoas.length; i++) {
			if(vetorPessoas[i] != null) {
				System.out.printf("%d. %s, %s %n",(i+1), vetorPessoas[i].getNome(), vetorPessoas[i].getEmail());
			}
		}

		sc.close();

	}

}
