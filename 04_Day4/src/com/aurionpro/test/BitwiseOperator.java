package com.aurionpro.test;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		
		
		System.out.println("Enter second number : ");
		int number2 = sc.nextInt();
		
		int bitAnd = number1 & number2;
		System.out.println("value after bit and is : " + bitAnd);
		
		int bitOr = number1 | number2;
		System.out.println("value after bit Or is : " + bitOr);
		
		
		
		
		number1 <<= 1;
		System.out.println("value after one left shift is : " + number1);
		
		number1 >>= 1;
		System.out.println("value after one right shift is : " + number1);
		
		
	}

}
