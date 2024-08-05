package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {
	
	private static void takeRowElements(int matrix[][],int row, Scanner sc){
		
		for(int col =0 ; col< 3; col++) {
			matrix[row][col] = sc.nextInt();
		}
	}
	
	private static void createRows(int matrix[][],Scanner sc) {
		for( int row =0 ; row<3; row++) {
			takeRowElements(matrix, row, sc);
		}
	}
	
	private static void printRowElements(int matrix[][],int row){
		for(int col =0 ; col< 3; col++) {
			System.out.print(matrix[row][col]+ "\t");
		}
		System.out.println();
	}
	
	private static void printMatrix(int matrix[][]) {
		for(int row = 0 ; row < 3 ; row++) {
			printRowElements(matrix, row);
		}
	}
	
	public static void main(String[] args) {
			
		Scanner sc =new Scanner(System.in);
		int matrix[][] =  new int[3][3];
		
		System.out.println("Enter elements of matrix : ");
		
		createRows(matrix,sc);
		
		System.out.println("Matrix is : ");
		printMatrix(matrix);
		

	}

}
