import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //esse valor vai dizer o número de elementos que cabem no meu vetor
		double [] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		System.out.printf("Average height: %.2f%n", sum/n);
		
		sc.close();
	}
}
