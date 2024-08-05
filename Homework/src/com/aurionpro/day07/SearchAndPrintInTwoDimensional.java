package com.aurionpro.day07;

import java.util.Scanner;

public class SearchAndPrintInTwoDimensional {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows = sc.nextInt();
		
		System.out.println("enter coloumns :");
		int coloumn = sc.nextInt();
		
		int array[][] = new int[rows][coloumn];
		
		System.out.println("enter number to be checked");
		int checker =sc.nextInt();
		int count= 0;
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				System.out.println(" enter elements");
				array[i][j] = sc.nextInt();
				
				
				}
		}
		
		for(int i =0 ; i< rows; i++) {
			for (int j = 0 ; j <coloumn ; j++) {
				
				if(array[i][j]== checker) {
					count++;
					System.out.println("Number is present at : " + (i+1) + "," + (j+1) + " index");
				}
				
				
				}
		}
		
		
		if(count == 0) {
			System.out.println("number is not present");
		} else {
			System.out.println("number is present");
		}
		

	}

}
