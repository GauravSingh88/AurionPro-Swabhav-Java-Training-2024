package com.aurionpro.srp.solution.model;

public class PrintInvoice {
	
	private Invoices invoice;
	private TaxCalculator taxCalculator;
	
	
	public PrintInvoice(Invoices invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}


	public void print() {
		System.out.println("id : " + invoice.getId());
		System.out.println("descirption : " + invoice.getDescription());
		System.out.println("amount : " + invoice.getAmount());
		System.out.println("tax : " + taxCalculator.taxCalculator());
		System.out.println("total amount : " + (invoice.getAmount() + taxCalculator.taxCalculator()));
	}

}
