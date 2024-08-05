package com.aurionpro.day07;

import java.util.Scanner;

public class PeakElementInArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		int peakArray[] = new int[size];
		
		
		int sum= 0;
		
		for(int i =0 ; i< size; i++) {
			System.out.println("Enter elements of array : ");
			array[i] = sc.nextInt();
		}
		
        for (int i = 0; i < size; i++) {
            if (i == 0 && array[i] > array[i + 1]) {
                peakArray[i] = array[i];
            } else if (i == size - 1 && array[i] > array[i - 1]) {
                peakArray[i] = array[i];
            } else if (i > 0 && i < size - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                peakArray[i] = array[i];
            }
        }
        
        System.out.println("Peak elements in the array:");
        for (int i = 0; i < size; i++) {
            if (peakArray[i] != 0) {
                System.out.print(peakArray[i] + " ");
            }
        }
		
		

	}

}
