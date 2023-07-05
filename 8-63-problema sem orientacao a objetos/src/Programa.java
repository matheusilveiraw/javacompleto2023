import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		//ler as medidas do lados de dois triangulos, X e Y. calcular a area dos dois triangulos e mostrar a maior 
		//formula para calcular a área dos triangulos: area = raiz²(p (p - a) (p -b) (p - c)) 
		//onde p = (a + b + c)/2
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores dos três lados do triângulo X: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Digite os valores dos três lados do triângulo Y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		//triangulo X 
		double xp = (xa + xb + xc)/2; 
		double xArea = Math.sqrt(xp * (xp - xa) * (xp - xb) * (xp - xc));
		
		System.out.println(xArea);
		
		sc.close();
		
	}

}
