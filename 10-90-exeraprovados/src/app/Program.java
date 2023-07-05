package app;

import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int n = sc.nextInt();
		Alunos[] vetorAlunos = new Alunos[n];

		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os dados da " + (i+1) + "o aluno: ");
			System.out.printf("- Nome: ");
			String nome = sc.next();
			System.out.printf("- 1a nota: ");
			double nota1 = sc.nextDouble();
			System.out.printf("- 2a nota: ");
			double nota2 = sc.nextDouble();
			vetorAlunos[i] = new Alunos(nome, nota1, nota2);
		} 
		
		System.out.println("Alunos aprovados: ");
				
		for(int i = 0; i < n; i++) {
			if((vetorAlunos[i].getNota1() + vetorAlunos[i].getNota2()) >= 6) { 
				System.out.println(vetorAlunos[i].getNome());
			}
		}
				
		sc.close();

	}

}
