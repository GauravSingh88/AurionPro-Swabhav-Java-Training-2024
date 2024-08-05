package com.aurionpro.homework;

import java.util.Scanner;

public class AssignmentOperatorPOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = sc.nextInt();

		number += 5;
		System.out.println("value of += 5 with previous number is " + number);

		number -= 5;
		System.out.println("value of -= 5 with previous number is " + number);

		number *= 5;
		System.out.println("value of *= 5 with previous number is " + number);

		number /= 5;
		System.out.println("value of /= 5 with previous number is " + number);

		number %= 23;
		System.out.println("value of %= 5 with previous number is " + number);

		number &= 5;
		System.out.println("value of &= 5 with previous number is " + number);

		number |= 5;
		System.out.println("value of |= 5 with previous number is " + number);

		number ^= 5;
		System.out.println("value of ^= 5 with previous number is " + number);

		number <<= 5;
		System.out.println("value of <<= 5 with previous number is " + number);

		number >>= 5;
		System.out.println("value of >>= with previous number is " + number);

	}

}
