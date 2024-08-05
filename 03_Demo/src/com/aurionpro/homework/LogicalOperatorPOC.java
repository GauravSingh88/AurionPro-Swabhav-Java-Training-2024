package com.aurionpro.homework;

import java.util.Scanner;

public class LogicalOperatorPOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int number2 = sc.nextInt();

		if (number1 > 0 && number2 > 0) {
			System.out.println("Both are positive");
		}

		if (number1 > 0 || number2 > 0) {
			System.out.println("Atleast one of the number is positive");
		}

		boolean value = true;

		System.out.println("value of !value : " + !value);

	}

}
