package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		System.out.println(new Date());
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		System.out.println(" ~  Enter client data  ~  ");
		System.out.printf("- Nome: ");
		String name = sc.next();
		System.out.printf("- Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.printf("- Birthdate: ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);
		
		System.out.println(" ~  Enter order data  ~  ");
		System.out.print("- Status: ");
		sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(sc.next()); //tem que ser assim pq o enum manda um valor numerico se pah, n adianta jogar uma string 
		System.out.print("- How many items to this order? ");
		int quantity = sc.nextInt();
				
		Order order = new Order(new Date(), status, client);
		//passar o momento e instanciar o order
		
		for(int i = 1; i <= quantity; i++) { 
			System.out.println(" ~  Enter #" + i + "item data  ~  ");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantityProduct = sc.nextInt();
			
			//instanciar o produto 
			//instanciar o orderitem com o produto 
		}
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(birthDate);
		System.out.println(quantity);
	}
}
