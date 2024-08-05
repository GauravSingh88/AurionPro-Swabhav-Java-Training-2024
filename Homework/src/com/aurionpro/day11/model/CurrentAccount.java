package com.aurionpro.day11.model;

import java.util.Scanner;

public class CurrentAccount extends Account {
	
	private double overDraftLimit;
	private double openingBalance;
	private double firstLimit;
	
	
	public double getFirstLimit() {
		return firstLimit;
	}

	public void setFirstLimit(double firstLimit) {
		this.firstLimit = firstLimit;
	}

	public CurrentAccount(double overDraftLimit, int accountNumber, String name , double balance) {
		super(accountNumber, name , balance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount ["+ " AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ",Balance=" + getBalance()  + "]";
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	
	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

//	public static double credit( double balance, double creditAmount) {
//		balance += creditAmount;
//		System.out.println(creditAmount + " is successfully credited to your account.Your account balance is : " + balance);
//		return balance;
//	}
	
	public static double credit(CurrentAccount account, double balance, double creditAmount, double overDraftLimit, double firstLimit) {
		
		if(firstLimit > overDraftLimit) {
			double split = firstLimit - overDraftLimit;
			if(creditAmount < split) {
				overDraftLimit +=  creditAmount;
				System.out.println("Amount you deposited was settled with your draft limit , which is now  :" + overDraftLimit);
				account.setOverDraftLimit(overDraftLimit);
				
			}
			
			if(creditAmount > split) {
				double toBeAddedAmount =  creditAmount - split;
				overDraftLimit = firstLimit;
				balance +=  toBeAddedAmount;
				System.out.println("Amount you deposited was settled with your draft limit , which is now  :" + overDraftLimit);
				System.out.println("Remaining amount is added to your balance which is : " + balance);
				account.setOverDraftLimit(overDraftLimit);

				
			}
			if(creditAmount == split ) {
				overDraftLimit = firstLimit;
				System.out.println("Amount you deposited was settled with your draft limit , which is now  :" + overDraftLimit);
				account.setOverDraftLimit(overDraftLimit);

			}
			return balance;
		}
		
		if(firstLimit ==  overDraftLimit) {
			balance += creditAmount;
			System.out.println(creditAmount + " is successfully credited to your account.Your account balance is : " + balance);
			
		}
		return balance;
		
	}
	
	public static double debit(double balance, double withdrawAmount) {
		double afterWithdraw =  balance - withdrawAmount;
		if(withdrawAmount > balance) {
			System.out.println("Insufficient balance");
		}
		
		
		if(withdrawAmount < balance || withdrawAmount == balance) {
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + " is debited from your account.Your account balance is : " + balance);

		}
		
		return balance;
	}
	
	
	
	public static double draft(double balance, double overDraftLimit , Scanner scanner) {
		System.out.println("You have a over draft limit of :" + overDraftLimit);
		System.out.println("How much amount you want to withdraw");
		double draftAmount = scanner.nextDouble();
		System.out.println("Enter amount you want to withdraw :");
		double draft = balance +overDraftLimit;
		
		if(balance  != 0) {
		  System.out.println("You still have funds in your account , you can use debit option rather than draft.");
		}
		
		if( draftAmount > overDraftLimit) {
			System.out.println("Your amount exceeds over draft limit");
		}
		
		if(balance == 0 && draftAmount <= overDraftLimit) {
			overDraftLimit -= draftAmount;	
			System.out.println("You have successfully debited :" + draftAmount + " , your remaining draft limit is : " + overDraftLimit);
		}
		
		
		
		return overDraftLimit;
	}
	

}
