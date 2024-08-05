package com.aurionpro.homework;

import java.util.Scanner;

public class ArithemeticOperatorPOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int number2 = sc.nextInt();

		int sum = number1 + number2;
		System.out.println("Sum of both numbers is : " + sum);

		int difference = number1 - number2;
		System.out.println("difference of both numbers is : " + difference);

		int multiplication = number1 * number2;
		System.out.println("multiplication of both numbers is : " + multiplication);

		int division = number1 / number2;
		System.out.println("division of both numbers is : " + division);

		float modulus = number1 % number2;
		System.out.println("modulus of both numbers is : " + modulus);

		int increment = number1++;
		System.out.println("increment of number1 is : " + increment);

		int decrement = number1--;
		System.out.println("decrement number1 is : " + decrement);

	}

}
