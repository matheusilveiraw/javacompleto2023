package model.entities;

import model.exception.ValueException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public void canWithdraw(Double withdrawAmount, Double limit) throws ValueException {
		if(withdrawAmount < limit)  {
			if(this.balance > withdrawAmount) {
//				System.out.println("New balance: " + (this.balance - withdrawAmount)); //parece errado dar o systout aqui 
				this.balance -= withdrawAmount;
			} else { 
				throw new ValueException("Not enough balance!");
			}
		} else { 
			throw new ValueException("The amount exceeds withdraw limit!");
		} 
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
}
