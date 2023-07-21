package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException { //parseexcepetion = permitindo que o metodo main pode lançar esse tipo de exceção, caso ela aconteça
		//solução ruim - lógica de validação no programa principal
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) { //o after testa se o primeiro valor é dps do segundo valor
			System.out.println("Error in reservation: check-out date must be after check-in date");
		} else { 
			Reservation reservation = new Reservation(number, checkIn, checkOut); 
			System.out.println("Reservation: " + reservation); //vai usar o to string
			
			System.out.println();
			System.out.print("Enter date to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date(); //cria uma data com a data de agora
			if(checkIn.before(now) || checkOut.before(now)) { //checa se os valores são antes
				System.out.println("Error ir reservation: reservation dates for updates must be future dates");
			} else if(!checkOut.after(checkIn)) { 
				System.out.println("Error in reservation: check-out date must be after check-in date");
			} else { 
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		sc.close();

	}

}
