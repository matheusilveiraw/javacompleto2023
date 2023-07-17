package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		List <Product> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { 
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported [C/U/I]? ");
			char productType = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(productType == 'i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			if(productType == 'u') { 
				System.out.print("Manufacture date (DD/MM/YYYY): ");
//				sc.nextLine();
//				String data = sc.nextLine();
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				

				list.add(new UsedProduct(name, price, date));
			}
			
			if(productType == 'c') { 
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product prod : list) { 
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
