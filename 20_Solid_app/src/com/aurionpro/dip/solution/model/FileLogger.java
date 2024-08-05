package com.aurionpro.dip.solution.model;

public class FileLogger implements ILogger {
	
	public void log(String err) {
		System.out.println("File opened :  " + err);
	}

}
