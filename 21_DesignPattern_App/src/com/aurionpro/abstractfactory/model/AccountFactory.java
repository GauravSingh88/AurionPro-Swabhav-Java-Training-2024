package com.aurionpro.abstractfactory.model;

public class AccountFactory {
	
	public IAccount getSavingsAccount(int balance, int accountNumber, String name, int minimumbalance) {
		return new SavingsAccount(balance, accountNumber, name, minimumbalance);
	}
	
	public IAccount getCurrentAccount(int balance, int accountNumber, String name, int overDraftLimit) {
		return new CurrentAccount(balance, accountNumber, name, overDraftLimit);
	}

}
