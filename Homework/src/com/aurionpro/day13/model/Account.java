package com.aurionpro.day13.model;

import com.aurionpro.day13.exception.InsufficientBalanceException;
import com.aurionpro.day13.exception.NegativeAmountException;

public class Account {
	
	private static int accountNumber;
	private String name;
	private double balance;
	
	public Account (int accountNumber, String name , double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}