package application;

import java.util.Scanner;
import entities.empregado;

public class Program {

	public static void main(String[] args) {
		//fazer um programa pra ler os dados de um funcionário (nome, salário bruto e imposto)
		//em seguida mostrar os dados do funcionario (nome e salário liquido)
		//em seguida aumentar o salario do empregado em cima de uma porcentagem (somente o salário bruto é afetado pela porcentagem) e mostrar bovamente os dados do empregado
		
		Scanner sc = new Scanner(System.in);
		
		empregado empregado = new empregado();
		
		System.out.println("Digite o nome, o salário bruto e o imposto. ");
		empregado.nome = sc.next();
		empregado.salarioBruto = sc.nextDouble();
		empregado.imposto = sc.nextDouble();
		
		System.out.println(empregado.nome + ", $" + empregado.calcularSalarioLiquido());
		
		System.out.println("Porcentagem do aumento: ");
		double porcentagemAumento = sc.nextDouble();
		
		System.out.println("Dados atualizados: " + empregado.nome + ", $" + empregado.aumentarSalario(porcentagemAumento));
		
		
		sc.close();

	}

}
