package com.aurionpro.model;


public class SwapNumbers {
	public static void main(String[] args) {
		
		
		int number1 = Integer.parseInt(args[0]);
		System.out.println("Enter first number :" + number1);
		
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Enter second number :" + number2);
		System.out.println(" before swapping number 1 is now: " + number1 + " and number 2 is now : " + number2);

		
		int temp = number2;
		number2 = number1;
		number1 = temp;

		 
		System.out.println(" after swapping number 1 is now: " + number1 + " and number 2 is now : " + number2);

	
	}
}
