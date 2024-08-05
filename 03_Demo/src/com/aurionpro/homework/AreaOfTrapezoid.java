package com.aurionpro.homework;

import java.util.Scanner;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base1 of trapezoid: ");
		float base1 = sc.nextFloat();

		System.out.println("Enter base2 of trapezoid: ");
		float base2 = sc.nextFloat();

		System.out.println("Enter height of trapezoid: ");
		float height = sc.nextFloat();

		double areaOfTrapezoid = 0.5 * (base1 + base2) * height;

		System.out.println("Area of trapezoid is :" + areaOfTrapezoid);

	}

}
