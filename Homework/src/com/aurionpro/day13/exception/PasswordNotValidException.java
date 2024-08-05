package com.aurionpro.day13.exception;

public class PasswordNotValidException extends RuntimeException {
	public PasswordNotValidException(String password) {
		super(" password not valid ");
	}
}
