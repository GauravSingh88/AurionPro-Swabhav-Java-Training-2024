package com.aurionpro.model;

public class CreditCardPayment implements Payment {

	@Override
	public void payBill() {
		System.out.println("made payment through credit card");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem made in credit card");
		
	}

}
