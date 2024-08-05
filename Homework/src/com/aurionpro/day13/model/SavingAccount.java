package com.aurionpro.day13.model;

import com.aurionpro.day11.model.Account;
import com.aurionpro.day13.exception.InsufficientBalanceException;
import com.aurionpro.day13.exception.MinimumBalanceException;
import com.aurionpro.day13.exception.NegativeAmountException;
public class SavingAccount extends Account {
	
	private double minimumBalance;
	
	public SavingAccount(double minimumBalance, int accountNumber, String name , double balance) {
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
	
	public double debit(double balance, double withdrawAmount, double minimumBalance) {
		double afterWithdraw =  balance - withdrawAmount;
		
		if (withdrawAmount > this.getBalance()) {
			throw new InsufficientBalanceException(this.getBalance());
		}
		if ((this.getBalance()-withdrawAmount) < minimumBalance ) {
			
			throw new MinimumBalanceException(this.getBalance());
		}
		
		if (withdrawAmount < 0) {
			throw new NegativeAmountException();
		}
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


