package com.aurionpro.abstractfactory.test;

import java.util.Scanner;

import com.aurionpro.abstractfactory.model.CurrentAccountFactory;
import com.aurionpro.abstractfactory.model.IAccountFactory;
import com.aurionpro.abstractfactory.model.SavingsAccountFactory;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Enter opening balance");
		int balance = scanner.nextInt();
		System.out.println("ENter name");
		String name = scanner.next();
		System.out.println("Enter which type of account you want to create");
		String accountType = scanner.next();
		
		
		
		if(accountType.equalsIgnoreCase("Savings")) {
			
			IAccountFactory savingsFactory = new SavingsAccountFactory();
			IAccount savings = (IAccount) savingsFactory.createAccount(balance,111,name,2000);
//			IAccount account = accountFactory.getSavingsAccount(balance, 1111, name,2000);
			System.out.println("if you want to credit choose 1 , for debit choose 2");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter amount to credit");
				int amount = scanner.nextInt();
				int newBalance = savings.credit(amount);
				System.out.println("your updated balance is :" + newBalance);
			case 2:
				System.out.println("enter amount to credit");
				int amount1 = scanner.nextInt();
				int newBalance1 = savings.debit(amount1);
				System.out.println("your updated balance is :" + newBalance1);
			}
			
		}
		
		if(accountType.equalsIgnoreCase("Current")) {
			IAccountFactory currentFactory = new CurrentAccountFactory();
			IAccount current = (IAccount) currentFactory.createAccount(balance,111,name,2000);
			System.out.println("if you want to credit choose 1 , for debit choose 2");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter amount to credit");
				int amount = scanner.nextInt();
				int newBalance = current.credit(amount);
				System.out.println("your updated balance is :" + newBalance);
			case 2:
				System.out.println("enter amount to credit");
				int amount1 = scanner.nextInt();
				int newBalance1 = current.debit(amount1);
				System.out.println("your updated balance is :" + newBalance1);
			}
		}
	}

}
