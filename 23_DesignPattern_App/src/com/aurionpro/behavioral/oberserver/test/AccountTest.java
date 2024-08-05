package com.aurionpro.behavioral.oberserver.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.behavioral.oberserver.model.Account;
import com.aurionpro.behavioral.oberserver.model.EmailNotifier;
import com.aurionpro.behavioral.oberserver.model.INotifier;
import com.aurionpro.behavioral.oberserver.model.SMSNotifier;
import com.aurionpro.behavioral.oberserver.model.WhatsappNotifier;

public class AccountTest {
	
	public static void main(String[] args) {
		 List<INotifier> notifiers= new ArrayList<INotifier>();
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 
		
		Account account = new Account(111,"Gaurav",9999, notifiers);
		INotifier sms = new SMSNotifier();
		account.registerNotifier(sms);
		INotifier email = new EmailNotifier();
		account.registerNotifier(email);
		INotifier whatsapp = new WhatsappNotifier();
		account.registerNotifier(whatsapp);
		
		
		
	
		account.depositAmount(500);
		account.withdrawAmount(1000);
		account.withdrawAmount(20000);

		
		
	}

}
