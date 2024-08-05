package com.aurionpro.homework;

import java.util.Scanner;

public class ComparisonOperatorPOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int number2 = sc.nextInt();

		System.out.println("number1 == number2 :  " + (number1 == number2));

		System.out.println("number1 != number2 : " + (number1 != number2));

		System.out.println("number1 < number2 : " + (number1 < number2));

		System.out.println("number1 > number2 : " + (number1 > number2));

		System.out.println("number1 >= number2 : " + (number1 >= number2));

		System.out.println("number1 <= number2 : " + (number1 <= number2));

	}

}
