package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Triangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of shapes: ");
		int shapeNumbers = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for(int i = 1; i <= shapeNumbers; i++){
			System.out.println("Shape #" + i + " data: ");
			System.out.println("Rectangle, Circle or Triangle [r/c/t] ? ");
			char shapeForm = sc.next().charAt(0);
			System.out.print("Color: black, red or blue? ");
			Color color = Color.valueOf(sc.next());
			
			if(shapeForm == 'r' || shapeForm == 't') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();				
				if (shapeForm == 'r') list.add(new Rectangle(color, width, height)); 
				if (shapeForm == 't') list.add(new Triangle(color, width, height)); 
			} 
						
			if(shapeForm == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			} 
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
