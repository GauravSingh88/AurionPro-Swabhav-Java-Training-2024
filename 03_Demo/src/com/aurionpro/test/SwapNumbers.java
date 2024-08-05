package com.aurionpro.test;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int number1 = sc.nextInt();
		System.out.println("Enter second number :");
		int number2 = sc.nextInt();
		System.out.println(" before swapping number 1 is now: " + number1 + " and number 2 is now : " + number2);

		
		int temp = number2;
		number2 = number1;
		number1 = temp;

		 
		System.out.println(" after swapping number 1 is now: " + number1 + " and number 2 is now : " + number2);

	}

}
