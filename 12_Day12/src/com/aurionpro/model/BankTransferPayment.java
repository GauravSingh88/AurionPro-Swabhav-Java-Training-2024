package com.aurionpro.model;

public class BankTransferPayment extends Payment {
	
	

	@Override
	public void payBill() {
		System.out.println("made payment through Bank Transfer");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem made in Bank Transfer");
	}
	
	
}