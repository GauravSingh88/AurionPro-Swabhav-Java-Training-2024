package com.aurionpro.abstractfactory.model;

public class SavingsAccountFactory implements IAccountFactory {


	@Override
	public IAccount createAccount(int balance, int accountNumber, String name, int varies) {
		// TODO Auto-generated method stub
		return new SavingsAccount(balance, accountNumber,name,varies);
	}

}
