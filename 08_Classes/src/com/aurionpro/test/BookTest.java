package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Book books[] = new Book[5];
		
		for(int i= 0 ; i< books.length ; i++) {
			System.out.println("Enter book id : ");
			int bookId = sc.nextInt();
			
			System.out.println("Enter book name : ");
			String name =  sc.next();
			

			
			System.out.println("Enter book author name : ");
			String authorName =  sc.next();
//			sc.next();

			
			
			System.out.println("Enter book publication : ");
			String publication = sc.next();
//			sc.next();
			
					
			System.out.println("Enter book price : ");
			double price = sc.nextDouble();
			
			books[i]=new Book(bookId, name , authorName ,price ,publication);
		}
		
		for(int i= 0 ; i< books.length ; i++) {
			System.out.println("Book id : " + books[i].getBookId());
			System.out.println("Name : " + books[i].getName());
			System.out.println("Author : " + books[i].getAuthor());
			System.out.println("Price : " + books[i].getPrice());
			System.out.println("Publication :" + books[i].getPublication());
			System.out.println();
			
		}

		
		
		
		
		
		
		
		

	}

}
