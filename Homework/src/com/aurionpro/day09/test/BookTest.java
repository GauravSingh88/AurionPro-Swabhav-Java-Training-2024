package com.aurionpro.day09.test;

import java.util.Scanner;

import com.aurionpro.day09.model.Book;

public class BookTest {
	
	public static void sortBooksByPriceDescending(Book[] books) {
        
        int n = books.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (books[i - 1].getPrice() < books[i].getPrice()) {
                    
                    Book temp = books[i - 1];
                    books[i - 1] = books[i];
                    books[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number of books");
		int size = sc.nextInt();
		int size1 = size;
		
		Book books[] = new Book[size];
		
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
		
//		Book sortedBooks[] = new Book[size];
//		double price = 0;
//		
//		for(int i = 0 ;i < size ; i++) {
//			for(int j = 0 ;j < size1 ; j++) {
//				if(price < books[j].getPrice()) {
//					price =  books[j].getPrice();
//					sortedBooks[i] = books[j];
//					
//				}
//			}
//			for(int j = 0 ;j < size1 ; j++) {
//				if(sortedBooks[i].getPrice() == books[j].getPrice()) {
//					price =  books[j].getPrice();
//					sortedBooks[i] = books[j];
//					books.remove(j);
//					
//				}
//			}
//		}
		
        sortBooksByPriceDescending(books);

        for (Book book : books) {
            System.out.println("Book id: " + book.getBookId());
            System.out.println("Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Publication: " + book.getPublication());
            System.out.println();
        }
		
		
		
		
		
		

	}

}
