package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		
		System.out.println("Fim do programa!");

	}
	
	public static void method1() { 
		System.out.println("METHOD1 START");
		method2();
		System.out.println("METHOD1 END");

	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("METHOD2 START");
		
		try {
	
		String[] vect = sc.nextLine().split(" "); //cada elemento do vetor vai ser uma palavra que será formada pelos espaços em brancos da linha lida
		int position = sc.nextInt();
		System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace(); //mostra o erro no console 
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
			
		sc.close();
		System.out.println("METHOD2 END");

	}
	
}
