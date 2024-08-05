package com.aurionpro.behavioral.oberserver.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	public Account(int accountNumber, String name, double balance, List<INotifier> notifiers) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = notifiers;
		
		notifiers =  new ArrayList<INotifier>();
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
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void depositAmount(double amount) {
		balance += amount;
		this.setBalance(balance);
		String operation = "deposit";
		callNotifiers(operation,amount);			

		
	}
	
	public void withdrawAmount(double amount) {
		
		if(amount >this.getBalance() ) {
			InsufficientFundsException e = new InsufficientFundsException(this.getBalance());
	        callExceptionNotifiers(e);				
		} else {
			balance -= amount;
			this.setBalance(balance);
			String operation = "withraw";
			callNotifiers(operation,amount);			
		}
		
	}
	
	public void callNotifiers(String operation ,double amount) {
		for(int i = 0 ; i< notifiers.size() ; i++) {
			notifiers.get(i).notifies(this,operation, amount);
		}
		
	}
	public void callExceptionNotifiers(Exception e) {
		for(int i = 0 ; i< notifiers.size() ; i++) {
			notifiers.get(i).exceptionNotifier(this,e);
		}
		
	}
	
	public void registerNotifier(INotifier notifies) {
		 this.notifiers.add(notifies);
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}
	
	
	
	

}
