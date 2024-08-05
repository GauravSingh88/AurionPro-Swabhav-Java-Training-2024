package com.aurionpro.day04;

import java.util.Scanner;

public class RideCalculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int age;
		int rideCharge = 0;
		int photosCharge = 0;
		String wantPhotos;
		
		System.out.println("Welcome to fair , Check whether you can go on ride or not");
		System.out.println("Enter height in cm : ");
		int height = sc.nextInt();
		
		if(height > 120) {
			 System.out.println("You can go with ride ahead .");
			 System.out.println("Please enter your age for bill calculation : ");
			 age = sc.nextInt();
			 
			 if (age < 12 ) {
				 rideCharge = 5;
			 }
			 if (age >= 12 && age <= 18 ) {
				 rideCharge = 7;
			 }
			 if (age > 18 && age < 45) {
				 rideCharge = 12;
			 }
			 if (age <= 55 && age >= 45 ) {
				 rideCharge = 0;
			 }
			 
			 sc.nextLine();
			 
			 
			 System.out.println("Will you be needing photos for just 3$ :");
			 
			 wantPhotos = sc.nextLine();
			 
			 if ("Yes".equalsIgnoreCase(wantPhotos)) {
				 photosCharge = 3;
			 } else {
				 photosCharge = 0;
			 }
			 
			 int totalBill = rideCharge + photosCharge;
				
			 System.out.println("Your total bill is : " + totalBill + "$");
		} else {
			System.out.println("Sorry you cant go on ride.");
		}
		
		
		
		sc.close();

	}

}
