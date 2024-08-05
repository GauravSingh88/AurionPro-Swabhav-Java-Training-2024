package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		SavingsAccount account1 = new SavingsAccount(1000, 3827487, "Gaurav", 827394);
		CurrentAccount account2 = new CurrentAccount(500000, 234234, "Industries", 232348);
		
		System.out.println(account1);
		System.out.println(account2);

	}

}
