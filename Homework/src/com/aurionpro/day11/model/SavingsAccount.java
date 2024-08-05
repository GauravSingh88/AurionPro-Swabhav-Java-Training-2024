package com.aurionpro.day11.model;

public class SavingsAccount extends Account {
	
	private double minimumBalance;
	
	public SavingsAccount(double minimumBalance, int accountNumber, String name , double balance) {
		super(accountNumber, name , balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public static double credit( double balance, double creditAmount) {
		balance += creditAmount;
		System.out.println(creditAmount + " is successfully credited to your account.Your account balance is : " + balance);
		return balance;
	}
	
	public static double debit(double balance, double withdrawAmount, double minimumBalance) {
		double afterWithdraw =  balance - withdrawAmount;
		if(afterWithdraw < minimumBalance) {
			System.out.println("You need to maintain minimum balance");
		}
		if(withdrawAmount > balance) {
			System.out.println("Insufficient balance");
		}
		
		
		if(withdrawAmount < balance && afterWithdraw >= minimumBalance) {
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + " is debited from your account.Your account balance is : " + balance);

		}
		
		return balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minimumBalance=" + minimumBalance + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ",Balance=" + getBalance() + "]";
	}
}
