package com.aurionpro.test;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle amount :");
		int principle = sc.nextInt();

		System.out.println("Enter Rate of interest :");
		double interest = sc.nextInt();

		System.out.println("Enter number of years :");
		int years = sc.nextInt();

		double simpleInterest = principle * interest * years;
		simpleInterest /= 100;

		System.out.println("Simple interest for principle amount as " + principle + " rupees with rate of interest as "
				+ interest + " percent for " + years + " number of years will be " + simpleInterest);

	}

}
