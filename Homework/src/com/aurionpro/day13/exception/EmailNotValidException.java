package com.aurionpro.day13.exception;

public class EmailNotValidException extends RuntimeException {
	public EmailNotValidException(String email) {
		super(" email not valid ");
	}
}