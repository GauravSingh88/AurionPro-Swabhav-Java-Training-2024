package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter your account number : ");
		int accountNumber = scanner.nextInt();
		
		System.out.println("Enter your opening balance : ");
		double balance = scanner.nextDouble();
		Account account = new Account(accountNumber, name , balance);
		
		try {
			account.debit(account.getBalance(), 50000);
		} catch(InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		}

	}

}
