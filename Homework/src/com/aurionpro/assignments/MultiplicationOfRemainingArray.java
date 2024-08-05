package com.aurionpro.assignments;

import java.util.Scanner;

public class MultiplicationOfRemainingArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		int size = scanner.nextInt();
		int numbers[] = new int[size];
		int multipliedArray[] = new int[size];

		System.out.println("Enter the numbers");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i = 1; i <= size; i++) {
			int value = 1;
			for (int j = 0; j < size; j++) {
				value *= numbers[j];
			}
			System.out.println(value);
			value /= numbers[i - 1];
			multipliedArray[i - 1] = value;
			value = 1;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(multipliedArray[i] + "\t");
		}

	}

}
