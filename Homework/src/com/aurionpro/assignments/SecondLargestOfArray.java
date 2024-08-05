package com.aurionpro.assignments;

import java.util.Scanner;

public class SecondLargestOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of an array: ");
        int length = sc.nextInt();

        if (length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arrayOfNumbers = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arrayOfNumbers[i] = sc.nextInt();
        }

        System.out.print("Array is ");
        for (int i = 0; i < length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();

        int largest = arrayOfNumbers[0];
        int secondLargest = -1; 

        for (int i = 1; i < length; i++) {
            if (arrayOfNumbers[i] > largest) {
                secondLargest = largest;
                largest = arrayOfNumbers[i];
            } else if (arrayOfNumbers[i] > secondLargest && arrayOfNumbers[i] < largest) {
                secondLargest = arrayOfNumbers[i];
            }
        }

        if (secondLargest == -1) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("Second largest element from Array is " + secondLargest);
        }
    }
}



