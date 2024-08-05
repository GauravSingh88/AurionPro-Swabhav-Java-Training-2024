package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.Invoices;
import com.aurionpro.srp.solution.model.PrintInvoice;
import com.aurionpro.srp.solution.model.TaxCalculator;

public class AccountTest {

	public static void main(String[] args) {

		Invoices invoice1 = new Invoices("abc","order1",1000);
		
		TaxCalculator calculateTax = new TaxCalculator(invoice1);
		
		PrintInvoice printInvoice = new PrintInvoice(invoice1, calculateTax);
		
		printInvoice.print();
	}

}
