package com.aurionpro.exceptions;

public class InsufficientBalanceException extends RuntimeException{
	
	private double balance;

	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}
	

	public String getMessage() {
		return "Insufficient balance, the following withdrawl amount cannot be debited, your balance is " + balance;
	}

}
