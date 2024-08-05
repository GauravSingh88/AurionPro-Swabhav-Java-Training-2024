package com.aurionpro.day06;

import java.util.Scanner;
import java.util.Random;

public class ElementPresentOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		boolean isPresent = false;

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int array[] = new int[5];

		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt(10);
		}

		System.out.println();

		System.out.println("Enter number to be checked in array : ");
		int checker = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (checker == array[i]) {
				isPresent = true;
			}
		}

		System.out.println("Initialised array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		if (isPresent == true) {
			System.out.println("ELemet is present in array");
		} else {
			System.out.println("Element is not present in array");
		}

		System.out.println();

	}

}
