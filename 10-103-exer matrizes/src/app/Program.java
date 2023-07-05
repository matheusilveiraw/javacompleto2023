package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { 
				mat[i][j] = sc.nextInt();
			}
		}		
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { 
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}		
		
		System.out.println("Número a ser encontrado na matriz: ");
		int encontrar = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { 
				if(mat[i][j] == encontrar) { 
					System.out.printf("Position %d, %d%n", i, j);
					if(j != 0) System.out.println("Esquerda: " + mat[i][j-1]);
					if(!((j+1) >= m)) System.out.println("Direita: " + mat[i][j+1]);
					if(i != 0)  System.out.println("Acima: " + mat[i-1][j]);
					if(!((i+1) >= n))  System.out.println("Abaixo: " + mat[i+1][j]);
				}
			}
		}		
		
		sc.close();

	}

}
