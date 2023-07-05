package application;

import java.util.Scanner;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		//fazer um programa pra ler os valores da largura e altura de um retangulo
		//em seguida mostrar na tela o valor de sua área, perimetro e diagonal
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira o valor da altura e da largura: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("AREA: " + retangulo.area());
		System.out.println("PERIMETRO: " + retangulo.perimetro());
		System.out.println("DIAGONAL: " + retangulo.diagonal());
		
		sc.close();
	}

}
