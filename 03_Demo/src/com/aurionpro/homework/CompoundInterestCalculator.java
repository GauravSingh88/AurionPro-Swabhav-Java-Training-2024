package com.aurionpro.homework;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle amount: ");
		float principleAmount = sc.nextFloat();

		System.out.println("Enter rate of interest: ");
		float rateOfInterest = sc.nextFloat() / 100;

		System.out.println("Enter number of times coumpounded: ");
		float timesCompounded = sc.nextFloat();

		System.out.println("Enter time of the money: ");
		float time = sc.nextFloat();

		double compoundInterest = (principleAmount
				* (Math.pow((1 + (rateOfInterest / timesCompounded)), timesCompounded * time))) - principleAmount;

		System.out.println("Compound interest is : " + compoundInterest);

	}

}
