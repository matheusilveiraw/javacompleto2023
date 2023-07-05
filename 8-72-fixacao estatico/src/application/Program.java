package application;

import java.util.Scanner;

import util.Convertor;

public class Program {

	public static void main(String[] args) {
		//faça um programa para ler a cotação do dóldar e depois um valor dólares a ser comprado por uima pessoa em reais
		// informar quantos reais a pessoa vai pagar pelos dólores, considerando que a pessoa vai pagar 6% de iof sobre o valor em dólar
		
		System.out.println("Qual o valor do dolar? ");
		Scanner sc = new Scanner(System.in);
		double valorDolar = sc.nextDouble();
		
		System.out.println("Dólares a serem convertidos: ");
		double dolares = sc.nextDouble();
		
		double dolarConvertido = Convertor.conversaoDolares(dolares, valorDolar);
		
		System.out.println("Valor convertido: " +dolarConvertido);
		
		sc.close();
		
	}

}
