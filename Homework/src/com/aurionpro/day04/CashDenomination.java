package com.aurionpro.day04;

import java.util.Scanner;

public class CashDenomination {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter cash to be withdrawn: ");
		int cashWithdrawAmount = sc.nextInt();
		
		int orignalAmount = cashWithdrawAmount;
		int notesOfTwoThousand = 0;
		int notesOfFiveHundred = 0;
		int notesOfTwoHundred = 0;
		int notesOfOneHundred = 0;
		
		if (cashWithdrawAmount%100 == 0) {
			if(cashWithdrawAmount <= 50000) {
				notesOfTwoThousand = cashWithdrawAmount/2000;

				cashWithdrawAmount %= 2000;

				notesOfFiveHundred = cashWithdrawAmount/500;

				cashWithdrawAmount %= 500;

				notesOfTwoHundred = cashWithdrawAmount/200;

				cashWithdrawAmount %= 200;

				notesOfOneHundred = cashWithdrawAmount/100;

			} else {
				System.out.println("Amount exceeds withdrwal limit of 50000");
			}
		} else {
			System.out.println("Amount should be in multiples of 100");
		}
		
		System.out.println("The amount : " + orignalAmount + " will be withdrawn as :-");
		System.out.println("Two Thousand : " + notesOfTwoThousand);
		System.out.println("Two Thousand : " + notesOfFiveHundred);
		System.out.println("Two Thousand : " + notesOfTwoHundred);
		System.out.println("Two Thousand : " + notesOfOneHundred);

	}

}
