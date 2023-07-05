import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fazer um programa para ler uma temperatura em celsius e mostrar o equivalente em fahreneit, perguntar sim ou não a partir da segunda vez
		
		Scanner sc = new Scanner(System.in);
		
		char resp = 'Y';
		
		do { 
			System.out.println("Digite um valor em Celsius: ");
			double celsius = sc.nextDouble();
			double f = (9 * celsius)/5 + 32;
			
			System.out.println("O valor transformado em Fahreneit é: " + f);
			
			System.out.println("Outra vez? [Y/N]");
			
			resp = sc.next().charAt(0);
			
		} while(resp != 'N');
		
		sc.close();
		
	}

}
