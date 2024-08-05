package com.aurionpro.loops;

import java.util.Scanner;

class CalculateSumOfdigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		int digit = 0;
		
		while (number > 0) {
			
			digit = number%10;
			sum += digit;
			number /= 10;
			
		}
		
		System.out.println(sum);

	}

}
