package com.aurionpro.test;

import java.util.Scanner;

public class AdditionOfTwoDimensional {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows for first array :");
		int rows = sc.nextInt();
		
		System.out.println("enter coloumns for first array :");
		int coloumn = sc.nextInt();
		
		int array[][] = new int[rows][coloumn];
		
		
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
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
		
	
		
		for(int i =0 ; i< rows1; i++) {
			for (int j = 0 ; j <coloumn1 ; j++) {
				System.out.println(" enter elements  for second array");
				array1[i][j] = sc.nextInt();
				
				
				}
		}
		
		
		
		int addedArray[][] = new int[rows][coloumn];
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				addedArray[i][j] = array[i][j] + array1[i][j];
				
				
				}
		}
		
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				
				System.out.print(addedArray[i][j]);
				
				
				}
			System.out.println();
		}
		

	}

}
