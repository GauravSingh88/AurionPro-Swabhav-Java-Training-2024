package com.aurionpro.dip.voilation.test;

import com.aurionpro.dip.voilation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaxCalculator t1=  new TaxCalculator();	
		t1.calculateTax(100, 10);
		
		TaxCalculator t2=  new TaxCalculator();	
		t2.calculateTax(2000, 0);
		

	}

}
