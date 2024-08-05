package com.aurionpro.test;

import java.util.Scanner;

public class ArrayTest {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int array[] = new int[5];
		System.out.println(" Enter array elements");
		
		for (int i = 0 ; i <  size ; i++) {
			System.out.println("Enter next value : ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Initialised array is : ");
		for (int i = 0 ; i <  size ; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
