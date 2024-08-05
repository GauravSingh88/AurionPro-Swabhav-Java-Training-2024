package com.aurionpro.day06;

import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		if (size > 10) {
            System.out.println("size should be within 10.");
            size = 10;
        }

		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt(10);
		}
		
		

		System.out.println();
		
		System.out.println("Initialised array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		for(int j = 0; j < size-1; j++) {
			for (int i = 0; i < size-1; i++) {
				if(array[i+1] < array[i]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				
			}
		}
		
		
		
		System.out.println();
		
		System.out.println("Sorted array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
