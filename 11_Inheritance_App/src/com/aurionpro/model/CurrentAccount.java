package com.aurionpro.model;

public class CurrentAccount extends Account {
	
	private double overDraftLimit;
	
	public CurrentAccount(double overDraftLimit, int accountNumber, String name , double balance) {
		super(accountNumber, name , balance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ",Balance=" + getBalance()  + "]";
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	

}
