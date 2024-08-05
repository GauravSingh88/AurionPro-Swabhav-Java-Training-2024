package com.aurionpro.test;

import com.aurionpro.model.IAddition;

public class AdditionTest {
	
	public static void main(String[] args) {
		
		IAddition addition = (number1,number2) -> number1+number2;
		
		System.out.println(addition.addition(5, 7));
	}

}
