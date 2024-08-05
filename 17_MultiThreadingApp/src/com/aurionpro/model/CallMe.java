package com.aurionpro.model;

public class CallMe {
	
	public synchronized void call(String message) {
		
		System.out.print("[ " + message);
		
		try {
			Thread.sleep(00);
		} catch(InterruptedException exception) {
			exception.printStackTrace();
			
		}
		
		System.out.println(" ]");
		
	}

}
