package entities;

public class Aluno {
	public double nota1;
	public double nota2;
	public double nota3;

	public void avaliacaoFinal() { 
		double somaNotas = nota1 + nota2 + nota3;
		
		if(somaNotas >= 60) { 
			System.out.println("Nota final: " + somaNotas + " PASSOU!");
		} else { 
			System.out.println("Nota final: " + somaNotas + " FALHOU! Faltaram " + (60 - somaNotas) + " pontos!");
			
		}
	}	
}
