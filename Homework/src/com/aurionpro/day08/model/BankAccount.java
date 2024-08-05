package com.aurionpro.day08.model;

public class BankAccount {
	
	private int balance;
	private int accountNumber;
	private String name;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int balance, int account, String name) {
		this.balance= balance;
		this.accountNumber = account;
		this.name = name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setAccountNumber(int account) {
		this.accountNumber =account;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int deposit(int deposit) {
		this.balance += deposit;
		return this.balance;
	}
	
	public int withdrwal(int withdraw) {
		this.balance -= withdraw;
		return this.balance;
	}

}
