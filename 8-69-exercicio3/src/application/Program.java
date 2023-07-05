package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		//fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos t^res trimestres do ano 
		//primeiro trimestre vale 30, segundo e trceiro 35
		//ao final mostrar qual a nota final do aluno no ano 
		//dizer se ele pasou ou falhou 
		//caso não tenha passado, minimo para ser aprovado 60% da nota
		
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.println("Digite as notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		aluno.avaliacaoFinal();
		
		sc.close();

	}

}
