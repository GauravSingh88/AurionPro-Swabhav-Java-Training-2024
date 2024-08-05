package com.aurionpro.day21.prototype.test;

import com.aurionpro.day21.prototype.model.*;

public class BookTest {
	
    public static void main(String[] args) {
   
        Book originalBook = new Book("Book1", "Gaurav Singh", 2023);

       
        Book clonedBook = (Book) originalBook.clone();
        
        clonedBook.setTitle("Book2");
        clonedBook.setYear(2024);

       
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);
    }

}
