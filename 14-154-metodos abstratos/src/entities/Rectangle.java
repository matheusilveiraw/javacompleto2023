package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	
	protected Double height;
	protected Double width;
	
	public Rectangle() { super(); } 

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
}
