package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Empregado> listaEmpregados = new ArrayList<>();
		System.out.println("Quantos empregados vão ser registrados?");
		int n = sc.nextInt();
	
		for(int i = 0; i < n; i++) {
			System.out.println("Empregado #" + (i+1));
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();
			
			Empregado empregado = new Empregado(id, name, salario);
			
			listaEmpregados.add(empregado);
		}
		
		System.out.println("Qual empregado quer auemntar o salário? Inserir ID!");
		int idSalary = sc.nextInt();
		Integer pos = position(listaEmpregados, idSalary);
		
		if(pos == null) {
			System.out.println("Não encontrou o ID!");
		} else { 
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			listaEmpregados.get(pos).aumentaSalario(porcentagem);
		}
		
		System.out.println("Lista de empregados: ")
		;
		
		for (Empregado x : listaEmpregados) {
			System.out.println(x);
		}
		
		sc.close();
	}

	public static Integer position(List<Empregado> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
