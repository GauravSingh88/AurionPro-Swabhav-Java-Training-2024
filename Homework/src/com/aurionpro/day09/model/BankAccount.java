package com.aurionpro.day09.model;

public class BankAccount {
	
	private int balance;
	private int accountNumber;
	private String name;
	private AccountType accountType;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int balance, int account, String name , AccountType accountType) {
		this.balance= balance;
		this.accountNumber = account;
		this.name = name;
		this.accountType = accountType;
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
	
	public AccountType getAccountType() {
		return this.accountType;
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
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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
