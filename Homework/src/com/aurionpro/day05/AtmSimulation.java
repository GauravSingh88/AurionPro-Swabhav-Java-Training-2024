package com.aurionpro.day05;

import java.util.Scanner;

public class AtmSimulation {

	public static void printOptions() {
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		System.out.println("Please choose an option: ");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Money Multiply bank !!!");
		System.out.println();

		System.out.println("Enter your balance : ");

		int balance = sc.nextInt();

		printOptions();

		int option = sc.nextInt();

		System.out.println();

		while (option != 4) {
			switch (option) {
			case 1:
				System.out.println("Your current balance is: $" + balance);
				printOptions();
				break;
			case 2:
				System.out.println("Please enter amount to depoit");
				int depositAmount = sc.nextInt();
				balance += depositAmount;
				System.out.println("You have deposited $" + depositAmount + ". Your new balance is $" + balance);
				printOptions();
				break;
			case 3:
				System.out.println("Please enter amount to depoit");
				int withdrawAmount = sc.nextInt();
				if (balance > withdrawAmount) {
					balance -= withdrawAmount;

					System.out.println("You have withdrawn $" + withdrawAmount + ". Your new balance is $" + balance);
					printOptions();
				} else {
					System.out.println("insufficient balance");
					printOptions();
				}

				break;
			default:
				System.out.println("Enter valid option");
			}
			option = sc.nextInt();
		}

		System.out.println("Thank you for banking with us");

	}

}
