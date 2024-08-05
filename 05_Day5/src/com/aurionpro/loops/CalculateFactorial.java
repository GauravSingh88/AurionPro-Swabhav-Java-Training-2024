package com.aurionpro.loops;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number to be checked : ");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int product =1;
		
		if(number > 0) {
			for(int i =  number; i >0 ; i--) {
				product *= i;
			}
			
			System.out.println("factorial of number is : " + product);
		} else { 
			System.out.println("Enter a number greater than 0");
		}
		
		
	}

}
