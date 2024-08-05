package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.Login;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login1 = Login.getLogin();
		System.out.println(login1.hashCode());
		
		Login login2 = Login.getLogin();
		System.out.println(login2.hashCode());

	}

}
