package com.aurionpro.test;

import com.aurionpro.model.CallMe;
import com.aurionpro.model.Caller;

public class CallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallMe target = new CallMe();
		
		Caller caller1 = new Caller("Hello", target);
		Caller caller2 = new Caller("Aurion", target);
		Caller caller3 = new Caller("Pro", target);
		
		
		try {
			caller1.getThread().join();
			caller2.getThread().join();

			caller3.getThread().join();

			
		} catch(InterruptedException exception) {
			System.out.println(exception);
		}

	}

}
