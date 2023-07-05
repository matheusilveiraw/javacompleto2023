package application;

import java.util.Locale;
import java.util.Scanner;
		
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		product product = new product(); //instanciando product
		
		System.out.println("Enter product data: ");
		System.out.println("- Name: ");
		String name = sc.nextLine();
		System.out.println("- Price: ");
		double price = sc.nextDouble();
		System.out.println("- Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer"); //chamando o setname do product
		System.out.println("Update name: " + product.getName()); //chamando  oget name criado lá no product
		
		product.setPrice(2);
		System.out.println("Update price: " + product.getPrice()); 
		
				
		System.out.println(product); //chama o to string automaticamente
		
		System.out.println("Entre com o número de produtos para ser add ao estoque: ");
		quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println(product);
		
		System.out.println("Entre com o número de produtos para remover do estoque: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println(product);

		sc.close();
	}

}
