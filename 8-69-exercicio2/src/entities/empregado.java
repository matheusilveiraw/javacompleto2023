package entities;

public class empregado {
	public String nome;
	public double salarioBruto;
	public double imposto; 
	
	public double calcularSalarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public double aumentarSalario(double porcentagemAumento) {
		return this.calcularSalarioLiquido() + (this.salarioBruto * (porcentagemAumento/100));
	}
	
}
