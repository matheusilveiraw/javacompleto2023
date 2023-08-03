package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Scanner sc = new Scanner(System.in);
		System.out.println("Car model: ");
		String car = sc.next();
		System.out.println(" -- Enter rental data -- ");
		System.out.print("Pickup (dd/MM/yyyy) hh:ss");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return (dd/MM/yyyy) hh:ss");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Enter price per hour: ");
		double priceHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double priceDay = sc.nextDouble();

		AluguelCarro cr = new AluguelCarro(start, finish, new Veiculo(car));
		
		
		
		
		
		sc.close();

	}

}
