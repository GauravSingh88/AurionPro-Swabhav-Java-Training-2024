package com.aurionpro.day15.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.day15.model.Books;
import com.aurionpro.day15.model.BooksComparator;

public class BooksTest {

	public static void main(String[] args) {

		List<Books> books = new ArrayList<Books>();
		
		books.add(new Books("Book1","Author1",900,1932));
		books.add(new Books("Book4","Author4",400,1923));
		books.add(new Books("Book7","Author1",700,1954));
		books.add(new Books("Book3","Author3",200,1943));
		books.add(new Books("Book6","Author2",800,1934));
		books.add(new Books("Book8","Author3",100,1987));
		books.add(new Books("Book2","Author2",500,1967));
		
		System.out.println("Before Sorting");
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by title" + "");
		Collections.sort(books, new BooksComparator.TitleComparator());
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by Author" + "");
		Collections.sort(books, new BooksComparator.AuthorComparator());
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by price" + "");
		Collections.sort(books, new BooksComparator.PriceComparator());
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("After sorting by publication year" + "");
		Collections.sort(books, new BooksComparator.PublicationYearComparator());
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("After sorting by custom" + "");
		Collections.sort(books, new BooksComparator.AuthorComparator().thenComparing( new BooksComparator.TitleComparator().thenComparing(new BooksComparator.PriceComparator())));
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("After sorting by custom2" + "");
		Collections.sort(books, new BooksComparator.PublicationYearComparator().thenComparing( new BooksComparator.PriceComparator().thenComparing(new BooksComparator.AuthorComparator())));
		for(Books book:books ) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------------");
		
		

	}

}
