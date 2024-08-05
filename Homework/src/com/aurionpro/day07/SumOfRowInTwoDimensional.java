package com.aurionpro.day07;

import java.util.Scanner;

public class SumOfRowInTwoDimensional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows = sc.nextInt();

		System.out.println("enter coloumns :");
		int coloumn = sc.nextInt();

		int array[][] = new int[rows][coloumn];

		int sum = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println(" enter elements");
				array[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < coloumn; j++) {
				sum += array[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " row is : " + sum);
			System.out.println();
		}

	}

}
