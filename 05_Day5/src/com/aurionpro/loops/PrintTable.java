package com.aurionpro.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to be checked : ");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		
		
		
			for(int i =  1; i <= 10 ; i++) {
				int product = number * i;
				System.out.println(product);
			}
			
			
		
	}

}
