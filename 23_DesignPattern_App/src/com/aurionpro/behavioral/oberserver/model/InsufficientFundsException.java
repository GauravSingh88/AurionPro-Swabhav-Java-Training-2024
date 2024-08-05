package com.aurionpro.behavioral.oberserver.model;

public class InsufficientFundsException  extends RuntimeException {
	private double balance;

	public InsufficientFundsException(double balance) {
		super();
		this.balance = balance;
	}

	public String getMessage() {
		return "Insufficient funds to withdraw from your Account. Your Account Balance : " + this.balance;
	}
}