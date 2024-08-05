package com.aurionpro.abstractfactory.model;

public interface IAccountFactory {
	
	IAccount createAccount(int balance, int accountNumber, String name, int varies);

}
