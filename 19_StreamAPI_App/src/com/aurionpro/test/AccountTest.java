package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1 = new Account(23423,"Gaurav",109900);
		Account account2 = new Account(23434,"something",24434);
		Account account3 = new Account(23489,"nothing",1232);
		
		 List<Account> accounts = new ArrayList<Account>();
	     accounts.add(account1);
	     accounts.add(account2);
	     accounts.add(account3);
	     
	     System.out.println("Printing name with greater or equal to 6 characters");
	     accounts.stream().filter(account -> account.getName().length()>= 6).forEach((account) -> System.out.println(account));
	     
//	     System.out.println();
//	     System.out.println("Account with minimum balance");
//	     
//	 		
		
	     
	     System.out.println();
	     System.out.println("Sum of all balance");
	     
	     Optional<Double> totalBalance = accounts.stream()
	    		 .map((account) -> account.getBalance())
	    		 .reduce((balance1,balance2) -> balance1+balance2);
	     
	     System.out.println(totalBalance.get());
	     
	}

}
