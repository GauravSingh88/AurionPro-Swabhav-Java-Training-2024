package com.aurionpro.dip.voilation.model;

public class TaxCalculator {
	private DBLogger dbLogger;

	public TaxCalculator() {
		super();
		
	}
	
	public int calculateTax(int amount , int rate) {
		int tax =0 ;
		try {
			tax =amount/rate;
			System.out.println("tax is : " + tax);
		} catch(Exception e) {
			new DBLogger().log("Divide by zero");
		}
		return tax;
	}
	
	
	
}
