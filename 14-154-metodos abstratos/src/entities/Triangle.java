package entities;

import entities.enums.Color;

public class Triangle extends Rectangle {
		
	public Triangle(Color color, double height, double width) {
		super(color, height, width);
	}

	@Override
	public double area() {
		return super.area() / 2;
	}
}
