package com.aurionpro.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SquareArraySort {

	public static int[] squareSort(int arr[]) {
		int n = arr.length;
		int[] resultArray = new int[n];
		int left = 0;
		int right = n - 1;

		for (int i = n - 1; i >= 0; i--) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				resultArray[i] = arr[left] * arr[left];
				left++;
			} else {
				resultArray[i] = arr[right] * arr[right];
				right--;
			}
		}
		
		return resultArray;

	}

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

		int[] squareArray = squareSort(array);

		System.out.println();
		
		System.out.println("Squared sorted array is :" + Arrays.toString(squareArray));

	}

}
