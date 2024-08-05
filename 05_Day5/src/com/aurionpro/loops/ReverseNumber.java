package com.aurionpro.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to be reversed : ");

		int number = sc.nextInt();
		int ogNumber = number;
		int sum = 0;
		int digit = 0;
		int revNumber = 0;
		
		while(number>0) {
			revNumber *= 10;
			digit = number % 10;
			revNumber += digit;
			number /=10;
		}
		
		System.out.println(revNumber);
		

	}

}
