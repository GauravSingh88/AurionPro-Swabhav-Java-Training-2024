package com.aurionpro.abstractfactory.model;

public class SavingsAccount implements IAccount {
	
	int balance;
	int accountNumber;
	String name;
	int minimumBalance;

	

	public SavingsAccount(int balance, int accountNumber, String name,int minimumBalance) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.name = name;
		this.minimumBalance =minimumBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
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

	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public int credit(int amount) {
		balance +=amount ;
		return balance;
	}

	@Override
	public int debit(int amount) {
		int minimumAccountBalance = getMinimumBalance();
		int checking = balance -  amount;
		if(checking  < 0)
			System.out.println("Insufficient Balance");
		if(checking > 0 && checking < minimumAccountBalance )
			System.out.println("You should maintain minimum balance which is 2000 .");
		if(checking>= minimumAccountBalance ) {
			balance -= amount;
		}
		return balance;
	}

}
