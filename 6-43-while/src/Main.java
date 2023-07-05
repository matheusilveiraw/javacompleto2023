import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorEntrada = sc.nextInt();
		int total = 0;
		
		//fazer um programa que lê nímeros inteiros até que umzero seja lido. ao final mostrar o valor da soma dos números digitados
		
		while(valorEntrada != 0) { 
			System.out.println("Digite um número!");
			total += valorEntrada;
			valorEntrada = sc.nextInt(); //achei feio ter que por duas vezes o scanner, talvez exista um jeito melhor
		}
		
		sc.close();
		System.out.println("saiu do while! o valor total foi: "+total);

	}

}
