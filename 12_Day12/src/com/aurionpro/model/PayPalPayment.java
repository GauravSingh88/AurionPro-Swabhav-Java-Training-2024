package com.aurionpro.model;

public class PayPalPayment extends Payment {
	@Override
	public void payBill() {
		System.out.println("made payment through Paypal");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem made in Paypal");
		
	}

}
