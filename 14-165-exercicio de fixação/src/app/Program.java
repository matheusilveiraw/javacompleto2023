package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
	
		List<Person> personList = new ArrayList<>();
		
		for(int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company [i/c]? ");
			char indiOrComp = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(indiOrComp == 'i') { 
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				personList.add(new Individual(name, anualIncome, healthExpenditure));
			}
			
			if(indiOrComp == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				personList.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0;
		for(Person person : personList) { 
			System.out.println(person.getName() + ": $" + String.format("%.2f", person.finalTax()));
			sum += person.finalTax();
		}
		
		System.out.println("TOTAL TAXES: $" + sum);
		
		sc.close();
	}
}
