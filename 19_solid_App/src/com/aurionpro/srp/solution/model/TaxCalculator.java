package com.aurionpro.srp.solution.model;

public class TaxCalculator {
	
	private Invoices invoice;

	public TaxCalculator(Invoices invoice) {
		super();
		this.invoice = invoice;
	}
	
	public double taxCalculator() {
		return (invoice.getAmount() * invoice.getTax()/100);
	}

}
