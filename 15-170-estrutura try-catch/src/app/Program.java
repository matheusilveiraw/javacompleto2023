package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
	
		String[] vect = sc.nextLine().split(" "); //cada elemento do vetor vai ser uma palavra que será formada pelos espaços em brancos da linha lida
		int position = sc.nextInt();
		System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
