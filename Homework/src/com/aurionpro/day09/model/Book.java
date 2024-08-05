package com.aurionpro.day09.model;

public class Book {
	
	private int bookId;
	private String name;
	private String author;
	private double price;
	private String publication;
	
	public Book() {
		
	}
	
	public Book(int bookId, String name, String author, double price, String publication) {
		this.bookId= bookId;
		this.name= name;
		this.author = author;
		this.price =price;
		this.publication =publication;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price =price;
	}
	
	public String getPublication() {
		return this.publication;
	}
	
	public void setPublication(String publication) {
		this.publication = publication;
	}

}
