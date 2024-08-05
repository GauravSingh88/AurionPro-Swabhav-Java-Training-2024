package com.aurionpro.srp.voilation.test;

import com.aurionpro.srp.voilations.model.Invoices;

public class InvoicesTest {
	
	public static void main(String[] args) {
		Invoices invoice1 = new Invoices("abc","order1",1000);
		
		
		invoice1.print();
	}

}
