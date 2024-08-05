package com.aurionpro.day06;

import java.util.Scanner;

public class MaximumElementOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int array[] = new int[5];
		System.out.println(" Enter array elements");

		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " value : ");
			array[i] = sc.nextInt();
		}

		System.out.println("Initialised array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		
		int maxElement = 0 ;

		for (int i = 0; i < size; i++) {
			if(array[i] > maxElement) {
				maxElement = array[i];
			}
		}

		System.out.println("Maximum element of array is : " + maxElement);
	}

}
