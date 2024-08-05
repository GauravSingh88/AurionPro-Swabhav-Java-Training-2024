package com.aurionpro.day13.exception;


public class MinimumBalanceException extends RuntimeException {
	private double balance;

	public MinimumBalanceException(double balance) {
		super();
		this.balance = balance;
	}
public String getMinimumBalanceException() {
	return "Amount exceeding minimum Balance criteria please maintain the balance, Deposit the money as soon as possible.";
}
}