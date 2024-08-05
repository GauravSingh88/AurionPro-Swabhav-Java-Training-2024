package com.aurionpro.creational.factory.model;

import java.util.Scanner;

public class CurrentAccount implements IAccount {
	
	int balance;
	int accountNumber;
	String name;
	int overDraftLimit;

	

	public CurrentAccount(int balance, int accountNumber, String name,int overDraftLimit) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.name = name;
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public int credit(int amount) {
		balance +=amount ;
		return balance;
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

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public int debit(int amount) {
		System.out.println("You have a over draft limit of :" + overDraftLimit);
		System.out.println("How much amount you want to withdraw");
		double draftAmount = amount;
		System.out.println("Enter amount you want to withdraw :");
		double draft = balance +overDraftLimit;
		
		if(balance  != 0) {
		  System.out.println("You still have funds in your account , you can use debit option rather than draft.");
		}
		
		if( draftAmount > overDraftLimit) {
			System.out.println("Your amount exceeds over draft limit");
		}
		
		if(balance == 0 && draftAmount <= overDraftLimit) {
			overDraftLimit -= draftAmount;	
			System.out.println("You have successfully debited :" + draftAmount + " , your remaining draft limit is : " + overDraftLimit);
		}
		
		
		
		return balance;

	}

}
