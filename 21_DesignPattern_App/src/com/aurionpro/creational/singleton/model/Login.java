package com.aurionpro.creational.singleton.model;

public class Login {
	
	private static Login login;
	
	public Login() {
		System.out.println("Login created.");
	}
	
	public void status() {
		System.out.println("login successfully");
	}
	
	public static Login getLogin() {
		if(login== null)
		login = new Login();
		return login;
	}
}
