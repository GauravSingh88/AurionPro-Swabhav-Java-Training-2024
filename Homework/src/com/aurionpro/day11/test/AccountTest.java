package com.aurionpro.day11.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.day11.model.Account;
import com.aurionpro.day11.model.CurrentAccount;
import com.aurionpro.day11.model.SavingsAccount;

public class AccountTest {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random =  new Random();	
		
		
		int minimumBalance = 2000;
		int overDraftLimit = 10000;
		int accountNumber = random.nextInt(900000)+100000;
		
		
		
		System.out.println("Welcome to Aurionpro Solutions");
		chooseAccountType();
		int type = scanner.nextInt();
		
		
		accountGenerator(scanner, accountNumber, minimumBalance, overDraftLimit, type);


//		account1.setBalance(account1.credit(account1.getBalance(), 10000)); ;
//		System.out.println(account1.getBalance());
//		account1.setBalance(account1.debit(account1.getBalance(), 20000, account1.getMinimumBalance())); 
//		System.out.println(account1.getBalance());
		
		
		

	}
	

	public static void printOptions() {
		System.out.println("Bank Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		System.out.println("Please choose an option: ");

	}
	
	public static void printOptionsforCurrent() {
		System.out.println("Bank Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Draft Money");
		System.out.println("5. Exit");
		System.out.println("Please choose an option: ");

	}
	
	public static void chooseAccountType() {
		System.out.println("Kindly choose what kind of account are you willing to create :");
		System.out.println("Enter 1 for Savings account.");
		System.out.println("Enter 2 for Current Account.");
	}
	
	public static void savingsAccountGenerator(int type, Scanner scanner, int minimumBalance, int accountNumber) {
		if(type == 1) {
			System.out.println("Enter your first name :");
			String fName = scanner.next();
			System.out.println("Enter your last name : ");
			String lName = scanner.next();
			String name = fName + " " + lName;
			System.out.println("Enter your opening balance : ");
			int balance = scanner.nextInt();
			SavingsAccount account = new SavingsAccount(minimumBalance,accountNumber, name, balance);
			System.out.println("You have successfully created a savings account");
			System.out.println(account);
			bankOptionsForSavings(scanner, account, minimumBalance);
		}
		
		
	}
	
	public static void currentAccountGenerator(int type, Scanner scanner, int overDraftLimit, int accountNumber) {
		if(type == 2) {
			System.out.println("Enter your first name :");
			String fName = scanner.next();
			System.out.println("Enter your last name : ");
			String lName = scanner.next();
			String name = fName + " " + lName;
			System.out.println("Enter your opening balance : ");
			int balance = scanner.nextInt();
			CurrentAccount account = new CurrentAccount(overDraftLimit,accountNumber, name, balance);
			account.setOpeningBalance(account.getBalance());
			account.setOverDraftLimit(account.getOpeningBalance()*3);
			account.setFirstLimit(account.getOverDraftLimit());
			System.out.println("You have successfully created a current account");
			System.out.println(account);
			bankOptionsForCurrent(scanner, account);
		}
	}
	
	public static void accountGenerator(Scanner scanner, int accountNumber, int minimumBalance , int overDraftLimit,int type ) {
		
		
		savingsAccountGenerator(type,scanner, minimumBalance, accountNumber);
		currentAccountGenerator(type,scanner, overDraftLimit, accountNumber);
	}
	
	public static void bankOptionsForSavings(Scanner scanner, SavingsAccount account, int minimumBalance) {
		printOptions();
		int option =scanner.nextInt();
		
		while (option != 4) {
			switch (option) {
			case 1:
				System.out.println("Your current balance is: $" + account.getBalance() );
				printOptions();
				break;
			case 2:
				System.out.println("Please enter amount to depoit");
				double depositAmount = scanner.nextDouble();
				double balance2 = account.credit(account.getBalance(), depositAmount);
				account.setBalance(balance2);
				printOptions();
				break;
			case 3:
				System.out.println("Please enter amount to withdraw");

				double withdrawAmount = scanner.nextDouble();
				double balance1 = account.debit(account.getBalance(), withdrawAmount, minimumBalance);
				account.setBalance(balance1);
				printOptions();
				break;
			default:
				System.out.println("Enter valid option");
				printOptions();
			}
			option = scanner.nextInt();
		
		}
	}
	
	public static void bankOptionsForCurrent(Scanner scanner, CurrentAccount account) {
		printOptionsforCurrent();
		int option =scanner.nextInt();
		
		while (option != 5) {
			switch (option) {
			case 1:
				System.out.println("Your current balance is: $" + account.getBalance() + " and your draft limit is : " + account.getOverDraftLimit() );
				printOptionsforCurrent();
				break;
			case 2:
				System.out.println("Please enter amount to depoit");
				double depositAmount = scanner.nextDouble();
				double balance2 = account.credit( account ,account.getBalance(), depositAmount,account.getOverDraftLimit(),account.getFirstLimit());
				account.setOverDraftLimit(account.getOverDraftLimit());
				account.setBalance(balance2);
				printOptionsforCurrent();
				break;
			case 3:
				System.out.println("Please enter amount to withdraw");

				double withdrawAmount = scanner.nextDouble();
				double balance1 = account.debit(account.getBalance(), withdrawAmount);
				account.setBalance(balance1);
				printOptionsforCurrent();
				break;
			case 4:
				double canBeDraftedAmount = account.getBalance() *3;
				double overDraft1 = account.draft(account.getBalance(), account.getOverDraftLimit(), scanner);
				account.setOverDraftLimit(overDraft1);
				
				
				printOptionsforCurrent();
				break;		
			default:
				System.out.println("Enter valid option");
				printOptionsforCurrent();
			}
			option = scanner.nextInt();
		
		}
	}

}
