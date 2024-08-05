package com.aurionpro.test;

import com.aurionpro.model.ITest;
import com.aurionpro.model.Reference;

public class RefernceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITest test1 = Reference::new;
		display(test1);
		display(() -> new Reference());
		ITest test2 = Reference::staticPrint;
		Reference reference = new Reference();
		display(test2);

		ITest test3 = reference::print;
		display(test3);

		
		
		

	}
	
	private static void display(ITest test) {
		test.test();
	}

}
