package com.aurionpro.exceptions;

public class AgeNotValidException extends Exception {
	
	private int age;
	
	
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}



	public String getMessage() {
		return " Age not valid , age should be more than 18, u have entered" + age;
	}

}
