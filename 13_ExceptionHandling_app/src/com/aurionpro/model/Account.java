package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;

public class Account {
	
	private int accountNumber ;
	private String Name;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", Name=" + Name + ", balance=" + balance + "]";
	}
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
	}
	
	public static double credit( double balance, double creditAmount) {
		balance += creditAmount;
		System.out.println(creditAmount + " is successfully credited to your account.Your account balance is : " + balance);
		return balance;
	}
	
	public static double debit(double balance, double withdrawAmount){
		
		if(withdrawAmount > balance) {
			throw new InsufficientBalanceException(balance);
		}
		
		
		if(withdrawAmount < balance) {
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + " is debited from your account.Your account balance is : " + balance);

		}
		
		return balance;
	}

}
