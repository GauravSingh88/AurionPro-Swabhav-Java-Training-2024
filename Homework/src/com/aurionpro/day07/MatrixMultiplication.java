package com.aurionpro.day07;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for first array :");
		int rows = sc.nextInt();

		System.out.println("enter coloumns for first array :");
		int coloumn = sc.nextInt();

		int array[][] = new int[rows][coloumn];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println(" enter elements for first array ");
				array[i][j] = sc.nextInt();

			}
		}

		System.out.println();

		System.out.println("Enter rows for second array :");
		int rows1 = sc.nextInt();

		System.out.println("enter coloumns for second array :");
		int coloumn1 = sc.nextInt();

		int array1[][] = new int[rows1][coloumn1];

		int multipliedMatrix[][] = new int[rows][coloumn1];

		if (rows == coloumn1 && rows1 == coloumn) {
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < coloumn1; j++) {
					System.out.println(" enter elements  for second array");
					array1[i][j] = sc.nextInt();

				}
			}

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < coloumn1; j++) {
                    multipliedMatrix[i][j] = 0;
                    for (int k = 0; k < coloumn; k++) {
                        multipliedMatrix[i][j] += array[i][k] * array1[k][j];
                    }
                }
            }

            System.out.println("Resultant Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < coloumn1; j++) {
                    System.out.print(multipliedMatrix[i][j] + " ");
                }
                System.out.println();
            }

		} else {
			System.out.println("Number of coloumns of first matrix should match the number of rows of second matrix");
		}

	}

}
