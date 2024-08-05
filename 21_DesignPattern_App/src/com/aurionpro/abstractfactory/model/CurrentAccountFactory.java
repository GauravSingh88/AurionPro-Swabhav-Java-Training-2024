package com.aurionpro.abstractfactory.model;

public class CurrentAccountFactory implements IAccountFactory {



	@Override
	public IAccount createAccount(int balance, int accountNumber, String name, int varies) {
		// TODO Auto-generated method stub
		return new CurrentAccount(balance, accountNumber,name,varies);

	}

}
