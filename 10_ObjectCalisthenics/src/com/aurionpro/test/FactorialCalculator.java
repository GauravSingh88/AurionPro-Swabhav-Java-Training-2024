package com.aurionpro.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		
		int factorial = calculateFactorial(number);
		
		if(factorial  == -1 ) {
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println(factorial);

	}

	private static int calculateFactorial(int number) {
		
		if(number == 0)
			return 0;
		if(number < 0)
			return -1;
		
		int factorial = 1;
		for(int i =2 ; i<= number; i++) {
			factorial *= number;
		}
		return factorial;
	}

}
