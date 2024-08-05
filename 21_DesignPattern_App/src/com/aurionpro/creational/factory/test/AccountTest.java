package com.aurionpro.creational.factory.test;

import java.util.Scanner;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.CurrentAccount;
import com.aurionpro.creational.factory.model.IAccount;
import com.aurionpro.creational.factory.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Enter opening balance");
		int balance = scanner.nextInt();
		System.out.println("ENter name");
		String name = scanner.next();
		System.out.println("Enter which type of account you want to create");
		String accountType = scanner.next();
		
		AccountFactory accountFactory = new AccountFactory();
		
		if(accountType.equalsIgnoreCase("Savings")) {
			IAccount account = accountFactory.getSavingsAccount(balance, 1111, name,2000);
			System.out.println("if you want to credit choose 1 , for debit choose 2");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter amount to credit");
				int amount = scanner.nextInt();
				int newBalance = account.credit(amount);
				System.out.println("your updated balance is :" + newBalance);
			case 2:
				System.out.println("enter amount to credit");
				int amount1 = scanner.nextInt();
				int newBalance1 = account.debit(amount1);
				System.out.println("your updated balance is :" + newBalance1);
			}
			
		}
		
		if(accountType.equalsIgnoreCase("Current")) {
			IAccount account = accountFactory.getCurrentAccount(balance, 1111, name,2000);
			System.out.println("if you want to credit choose 1 , for debit choose 2");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter amount to credit");
				int amount = scanner.nextInt();
				int newBalance = account.credit(amount);
				System.out.println("your updated balance is :" + newBalance);
			case 2:
				System.out.println("enter amount to credit");
				int amount1 = scanner.nextInt();
				int newBalance1 = account.debit(amount1);
				System.out.println("your updated balance is :" + newBalance1);
			}
		}
	}

}
