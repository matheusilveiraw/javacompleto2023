package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
		this.start = start;
		this.finish = finish;
		this.veiculo = veiculo;
		this.fatura = fatura;
	}


	public LocalDateTime getStart() {
		return start;
	}


	public void setStart(LocalDateTime start) {
		this.start = start;
	}


	public LocalDateTime getFinish() {
		return finish;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Fatura getFatura() {
		return fatura;
	}


	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}


	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
	
	
	
}
