package com.aurionpro.loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to be check : ");

		int number = sc.nextInt();
		int i =2;
		int sum =0 ;
		
		
		while ( i < number/2) {
			if ( number%i == 0) {
				sum += i;
			} 
			i++;
		}
		
		if(sum== 0) {
		System.out.println("Prime");
		} else {
			System.out.println("not prime");
		}
			
	}
	

}
