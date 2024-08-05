package com.aurionpro.loops;

import java.util.Scanner;

public class CheckArmstrongOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to be checked : ");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int ogNumber = number;
		int sum = 0;
		int digit = 0;
		int power = 0;
		
		while (number > 0) {
			power ++;
			number /= 10;
			
		}
		
		number = ogNumber;

		while (number > 0) {

			digit = number % 10;

			digit = (int)Math.pow(digit, power);

			sum += digit;
			number /= 10;

		}

		if (sum == ogNumber) {
			System.out.println(ogNumber + " is an Armstrong number");
		} else {
			System.out.println(ogNumber +  " is not an Armstrong number");

		}

	}

}
