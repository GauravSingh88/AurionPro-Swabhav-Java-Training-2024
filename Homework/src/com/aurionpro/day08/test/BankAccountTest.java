package com.aurionpro.day08.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.day08.model.BankAccount;;

public class BankAccountTest {
	
	
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
		Random rnd = new Random();
		
		BankAccount account1 = new BankAccount();

		System.out.println("Welcome to Money Multiply bank !!!");
		System.out.println();
		
//		sc.nextLine();
		
		System.out.println("Enter name of account holder :");
		String name = sc.nextLine();
		account1.setName(name);
		
		System.out.println("Enter account number :");
		int accountNumber = sc.nextInt();
		account1.setAccountNumber(accountNumber);
		
		int balance1 = rnd.nextInt(50000);
		account1.setBalance(balance1);
		
		System.out.println("Your Account details are as follows :-");
		System.out.println("Name : " + account1.getName());
		System.out.println("Account Number : " + account1.getAccountNumber());
		System.out.println("Balance : " + account1.getBalance());
		
		
		System.out.println();

		

		printOptions();
		
		System.out.println("Choose option");


		int option = sc.nextInt();

		System.out.println();

		while (option != 4) {
			switch (option) {
			case 1:
				System.out.println("Your current balance is: $" + account1.getBalance());
				printOptions();
				break;
			case 2:
				System.out.println("Please enter amount to depoit");
				int depositAmount = sc.nextInt();
				int balance = account1.getBalance();
//				balance += depositAmount;
				account1.deposit(depositAmount);
				System.out.println("You have deposited $" + depositAmount + ". Your new balance is $" + account1.getBalance());
//				account1.setBalance(balance);
				printOptions();
				break;
			case 3:
				System.out.println("Please enter amount to withdraw");
				int withdrawAmount = sc.nextInt();
				int balance2 = account1.getBalance();
				if (balance2 > withdrawAmount) {
					if(withdrawAmount > 0) {
//						balance2 -= withdrawAmount;
						account1.withdrwal(withdrawAmount);

						System.out.println("You have withdrawn $" + withdrawAmount + ". Your new balance is $" + account1.getBalance());
//						account1.setBalance(balance2);
						printOptions();
					} else {
						System.out.println("Please enter a positive amount");
						printOptions();
					}
					
					
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
