package com.aurionpro.model;

public class SavingsAccount extends Account {
	
	private double minimumBalance;
	
	public SavingsAccount(double minimumBalance, int accountNumber, String name , double balance) {
		super(accountNumber, name , balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minimumBalance=" + minimumBalance + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ",Balance=" + getBalance() + "]";
	}
	
	

}
