package com.aurionpro.test;

import java.util.Scanner;

public class CircularArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius :");
		int radius = sc.nextInt();
		double area = 3.14*radius*radius;
		
		System.out.println("Area of circle of radius: " + radius + " is: " + area);

	}

}
