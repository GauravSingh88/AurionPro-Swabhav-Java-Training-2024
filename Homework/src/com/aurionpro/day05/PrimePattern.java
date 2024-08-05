package com.aurionpro.day05;

import java.util.Scanner;

public class PrimePattern {

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int number = 2;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				while (!isPrime(number)) {
					number++;
				}
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}

}
