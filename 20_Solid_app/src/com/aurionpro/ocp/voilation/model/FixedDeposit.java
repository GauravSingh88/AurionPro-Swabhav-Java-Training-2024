package com.aurionpro.ocp.voilation.model;

public class FixedDeposit {
	
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	public FixedDeposit(int accountNumber, String name, double principle, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	private void printOption() {
		System.out.println("1 = new year, 2 =Diwali , 3 =Holi ,4=Others");
	}
	
	private double getInterestRate(int option) {
		double interestRate = 0;
		switch(option) {
		case 1:
			interestRate = 8.0;
		case 2:
			interestRate = 8.5;
		case 3:
			interestRate = 7.5;
		case 4:
			interestRate = 6.5;
		}
		return interestRate;
	}
	
	private double calculateSimpleInterest(int option) {
		return (principle * duration  * getInterestRate(option) /100);
	}

}
