package com.aurionpro.homework;

import java.util.Scanner;

public class MinutesToHoursCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter minutes : ");
		int minutes = sc.nextInt();

		int hours = minutes / 60;
		int minutesLeft = minutes % 60;

		System.out.println("Hours : " + hours);
		System.out.println("Minutes : " + minutesLeft);
		System.out.println("Total : " + hours + " hours " + minutesLeft + " minutes");

	}

}
