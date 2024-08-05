package com.aurionpro.day06;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println(" Enter array elements");
		
		for (int i = 0 ; i <  size ; i++) {
			System.out.println("Enter " + (i+1) + " value : ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Initialised array is : ");
		for (int i = 0 ; i <  size ; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0 ; i <  size ; i++) {
			sum += array[i];
		}
		
		System.out.println("Sum of the array elements is : " + sum);
		

	}

}
