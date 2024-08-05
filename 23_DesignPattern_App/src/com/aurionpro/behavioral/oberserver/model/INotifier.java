package com.aurionpro.behavioral.oberserver.model;

public interface INotifier {
	
	public void notifies(Account account,String operation,double amount);
	public void exceptionNotifier(Account account,Exception e);
}
