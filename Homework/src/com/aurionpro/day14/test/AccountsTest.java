package com.aurionpro.day14.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.day09.model.Book;
import com.aurionpro.day14.model.Accounts;

public class AccountsTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Accounts> accounts = new ArrayList<Accounts>();

		theAccountsApp(scanner, accounts);

	}

	private static void theAccountsApp(Scanner scanner, List<Accounts> accounts) {

		System.out.println("How many accounts you want to register : ");
		int numberOfAccounts = scanner.nextInt();

		
		accountDetails(numberOfAccounts, scanner, accounts);
		printingAccounts(accounts);

		findingMaxBalanceAccount(numberOfAccounts, accounts);
		ascendingBalance(  accounts, numberOfAccounts);

	}

	private static void accountDetails(int numberOfAccounts, Scanner scanner, List<Accounts> accounts) {
		System.out.println("----------------------------------------------------");

		for (int i = 0; i < numberOfAccounts; i++) {
			System.out.println("Enter account number : ");
			int accountNumber = scanner.nextInt();

			System.out.println("Enter name of account holder : ");
			String name = scanner.next();

			System.out.println("Enter balance : ");
			double balance = scanner.nextDouble();

			accounts.add(new Accounts(accountNumber, name, balance));
			System.out.println();
			
			System.out.println("Your account is successfully created.");
			System.out.println("Account details are as follows : " + accounts.get(i));
			System.out.println("----------------------------------------------------");
			System.out.println();
		}

	}

	private static void printingAccounts(List<Accounts> accounts) {
		
		System.out.println("Displaying all accounts :");
		for (Accounts account : accounts) {
			System.out.println(account);
		}
		System.out.println("----------------------------------------------------");

	}

	

	private static void findingMaxBalanceAccount(int numberOfAccounts, List<Accounts> accounts) {
		Accounts maxBalanceAccount = null;
		double maxBalance = 0;
		for (int i = 0; i < numberOfAccounts; i++) {
			Accounts checkingAccount = accounts.get(i);
			maxBalanceAccount = balanceChecking(maxBalance, checkingAccount, maxBalanceAccount);
		}
		System.out.println();
		System.out.println("Account with maximum balance is : ");
		System.out.println(maxBalanceAccount);
		System.out.println("----------------------------------------------------");
		System.out.println();
	}
	
	private static Accounts balanceChecking(double maxBalance, Accounts checkingAccount, Accounts maxBalanceAccount) {
		if (maxBalance < checkingAccount.getBalance()) {
			maxBalance = checkingAccount.getBalance();
			maxBalanceAccount = checkingAccount;
		}
		return maxBalanceAccount;
	}
	
	private static void ascendingBalance(List<Accounts> accounts,int numberOfAccounts) {
		 boolean swapped;
	        
	        do {
	            swapped = false;
	            for (int i = 1; i < numberOfAccounts; i++) {
	            	
	                if (accounts.get(i-1).getBalance() > accounts.get(i).getBalance()) {
	                    
	                    Accounts temp = accounts.get(i-1);
	                    accounts.set(i-1, accounts.get(i));
	                    accounts.set(i, temp);
	                    swapped = true;
	                }
	            }
	            numberOfAccounts--;
	        } while (swapped);
	        
	        System.out.println(accounts);
	}
	
	

}
