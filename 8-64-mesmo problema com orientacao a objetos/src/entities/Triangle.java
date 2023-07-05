package entities;

public class Triangle {

	public double a;
	public double b;
	public double c; 
	
	public double area() {
		//public para ser usada em outros lugares
		//double pq vai retornar um double 
		//area nome da função 
		//entre parenteses parametros
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p * c));
	}
}
