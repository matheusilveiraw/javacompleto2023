package application;

import java.util.Locale;
import java.util.Scanner;
		
import entities.product;

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
		
		product product = new product(name, price, quantity);
				
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
