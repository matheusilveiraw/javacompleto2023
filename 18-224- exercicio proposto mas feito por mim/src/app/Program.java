package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Modelo do carro: ");
		String carro = sc.nextLine();
		System.out.print("Retirada: (dd/MM/yyyy hh:mm) ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno: (dd/MM/yyyy hh:mm) ");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		System.out.println("Valor por dia: ");
		double valorDia = sc.nextDouble();
		
		AluguelCarro carroAlugado = new AluguelCarro(carro, retirada, retorno, valorHora, valorDia);
		
		//---------------
		//LOCAÇÃO ATÉ 12H = COBRA POR HORA
		//SE ULTRAPASSAR 12H, cobra por dio 
		System.out.println("FATURA: ");
		
	}

}
