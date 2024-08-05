package com.aurionpro.homework;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in Kilograms: ");
		int weight = sc.nextInt();

		System.out.println("Enter height in meters: ");
		float height = sc.nextFloat();

		double bmi = weight / Math.pow(height, 2);

		System.out.println("BMI is : " + bmi);

	}

}
