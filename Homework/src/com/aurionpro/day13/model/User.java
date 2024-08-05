package com.aurionpro.day13.model;

import com.aurionpro.day13.exception.EmailNotValidException;
import com.aurionpro.day13.exception.PasswordNotValidException;

public class User {
	private String email;
	private String password;

	public User(String email, String password) throws EmailNotValidException, PasswordNotValidException {
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailNotValidException {
		if (!isValidEmail(email)) {
			throw new EmailNotValidException(email);
		}
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordNotValidException {
		if (!isValidPassword(password)) {
			throw new PasswordNotValidException(password);
		}
		this.password = password;
	}

	private boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		return email.matches(emailRegex);
	}

	private boolean isValidPassword(String password) {
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		return password.matches(passwordRegex);
	}

	@Override
	public String toString() {
		return "User{" + "email='" + email + '\'' + ", password='" + password + '\'' + '}';
	}
}
