package com.aurionpro.loops;

import java.util.Scanner;


public class NumberPerfectOrNot {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to be reversed : ");

		int number = sc.nextInt();
		int divisor = 0;
		int i =1;
		
		while (i <= number/2) {
			if(number% i == 0) {
				divisor += i ;
			}
			i++;
//			System.out.println(divisor);
		}
		
		if( divisor == number && number != 0) {
			System.out.println( number + " is a perfect number");
		} else {
			System.out.println("not a perfect number");
		}

	}

}
