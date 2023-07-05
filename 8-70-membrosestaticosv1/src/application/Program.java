package application;

import java.util.Scanner;
import util.Calculator;

public class Program {
	
//	public static final double PI = 3.14159; //o final é pra dizer que é constante pro java, tá em maiusculo por padrão de digitar para constantes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
//		double c = circumference(radius);
//		
//		double v = volume(radius);
		
//		double c = calc.circumference(radius);
//		
//		double v = calc.volume(radius);
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);

		sc.close();
	}
	
//	public static double circumference(double radius) {
//		return 2 * PI * radius;
//	}
//	
//	public static double volume(double radius) {
//		return 4 * PI * radius * radius * radius / 3;
//	}
}
