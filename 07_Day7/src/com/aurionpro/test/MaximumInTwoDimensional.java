package com.aurionpro.test;

import java.util.Scanner;

public class MaximumInTwoDimensional {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows = sc.nextInt();
		
		System.out.println("enter coloumns :");
		int coloumn = sc.nextInt();
		
		int array[][] = new int[rows][coloumn];
		
		
		int maxElement= 0;
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				System.out.println(" enter elements");
				array[i][j] = sc.nextInt();
				
				
				}
		}
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				if(maxElement < array[i][j]) {
					maxElement = array[i][j];
				}
				
				
				}
		}
		
		System.out.println("Maximum Element is : " + maxElement);
	}

}
