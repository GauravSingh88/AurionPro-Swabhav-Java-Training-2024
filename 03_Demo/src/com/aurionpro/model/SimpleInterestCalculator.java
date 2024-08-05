package com.aurionpro.model;


public class SimpleInterestCalculator {
	
	public static void main(String[] args) {

		

		int principle = Integer.parseInt(args[0]);
		System.out.println("Enter Principle amount :" + principle);


		
		double interest = Integer.parseInt(args[1]);
		System.out.println("Enter Rate of interest :" + interest);

		
		int years = Integer.parseInt(args[2]);
		System.out.println("Enter number of years :" + years);

		double simpleInterest = principle * interest * years;
		simpleInterest /= 100;

		System.out.println("Simple interest for principle amount as " + principle + " rupees with rate of interest as "
				+ interest + " percent for " + years + " number of years will be " + simpleInterest);

	}

}
