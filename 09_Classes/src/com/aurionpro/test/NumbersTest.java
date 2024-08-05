package com.aurionpro.test;

import com.aurionpro.model.Numbers;

public class NumbersTest {

	public static void main(String[] args) {
		
		Numbers number1 = new Numbers(10);
		Numbers number2 = new Numbers(20);
		
		System.out.println("Before swapping :");
		System.out.println("number 1 : " + number1.getValue() + " number2 : " +  number2.getValue());
		
		swap(number1,number2);
		
		System.out.println("After swapping :");
		System.out.println("number 1 : " + number1.getValue() + " number2 : " +  number2.getValue());

	}

	private static void swap(Numbers number1, Numbers number2) {
		int temp = number1.getValue();
		number1.setValue(number2.getValue());
		number2.setValue(temp);
		
	}

}
