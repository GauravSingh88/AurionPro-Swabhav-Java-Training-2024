package com.aurionpro.test;
import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		int add=num1+num2;
		
		System.out.println("Sum of number1: " +num1 + " and number2: " +num2 + " is:" + add);
		
	}

}
