package com.aurionpro.dip.solution.test;

import com.aurionpro.dip.solution.model.DBLogger;
import com.aurionpro.dip.solution.model.FileLogger;
import com.aurionpro.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t3=  new TaxCalculator(new FileLogger());	
		t3.calculateTax(2000, 0);
		
		TaxCalculator t1=  new TaxCalculator(new DBLogger());	
		t1.calculateTax(10000, 0);
		
		TaxCalculator t2=  new TaxCalculator(new FileLogger());	
		t2.calculateTax(2000, 0);
		
		
		

	}

}
