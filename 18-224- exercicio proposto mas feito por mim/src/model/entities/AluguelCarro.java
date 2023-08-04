package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

	private String carro; 
	private LocalDateTime retirada;
	private LocalDateTime retorno;
	private double valorHora;
	private double valorDia;
	
	
	public AluguelCarro(String carro, LocalDateTime retirada, LocalDateTime retorno, double valorHora,
			double valorDia) {
		this.carro = carro;
		this.retirada = retirada;
		this.retorno = retorno;
		this.valorHora = valorHora;
		this.valorDia = valorDia;
	}
	
	
	
}
