package com.aurionpro.test;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows = sc.nextInt();
		
		System.out.println("enter coloumns :");
		int coloumn = sc.nextInt();
		
		int array[][] = new int[rows][coloumn];
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				System.out.println(" enter elements");
				array[i][j] = sc.nextInt();
				
				
				}
		}
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				
				System.out.print(array[i][j]);
				
				
				}
			System.out.println();
		}

	}

}
