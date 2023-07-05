package app;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int n = sc.nextInt();
		Pessoa[] vetorPessoas = new Pessoa[n];

		
		for(int i = 0; i < n; i++) {
			System.out.println("Digte os dados da " + (i+1) + "a pessoa: ");
			System.out.printf("- Genero: ");
			char gen = sc.next().charAt(0);
			System.out.printf("- Altura: ");
			double altura = sc.nextDouble();
			vetorPessoas[i] = new Pessoa(altura, gen);
		} 
		
		System.out.println(" RESULTADOS:  ");
		
		double menorAltura = 0f;
		double maiorAltura = 0f;
		double somaAlturaF = 0f;
		double somaAlturaM = 0f;
		int qntM = 0;
		int qntF = 0;

		for(int i = 0; i < n; i++) {
			switch (vetorPessoas[i].getGenero()) {
				case 'M':
					somaAlturaM += vetorPessoas[i].getAltura();
					qntM += 1;
				break;
				case 'F':
					somaAlturaF += vetorPessoas[i].getAltura();
					qntF += 1;
				break;
			}
			
			if(vetorPessoas[i].getAltura() > maiorAltura) { 
				maiorAltura = vetorPessoas[i].getAltura();
			}
			
			if(menorAltura == 0) {
				menorAltura = vetorPessoas[i].getAltura();
			} else if (vetorPessoas[i].getAltura() < menorAltura) { 
				menorAltura = vetorPessoas[i].getAltura();
			}
		}
		
		System.out.println(n);

						
		System.out.printf("Menor Altura: %.2f%n", menorAltura);
		System.out.printf("Maior Altura: %.2f%n", maiorAltura);
		System.out.printf("Média da altura genero feminino: %.2f%n", (somaAlturaF/qntF));
		System.out.printf("Média da altura genero masculino: %.2f%n", (somaAlturaM/qntM));
		System.out.println("Quantidade de pessoas genero masculino: " + qntM);


		sc.close();


	}

}
