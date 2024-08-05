package com.aurionpro.behavioral.oberserver.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notifies(Account account,String operation,double amount) {
		// TODO Auto-generated method stub
		System.out.println("Transaciton complete,notification through email");
		System.out.println(operation + " done of amount " + amount + " and now balance is " + account.getBalance());
		System.out.println();
	}

	@Override
	public void exceptionNotifier(Account account,Exception e) {
//		e.printStackTrace();		
		System.out.println("Notification through email");
		System.out.println(e.getMessage());

	}
}