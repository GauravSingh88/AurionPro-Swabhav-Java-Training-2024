package com.aurionpro.day14.model;

public class Accounts {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public Accounts(int accountNumber, String name, double balance) {
		super();
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
