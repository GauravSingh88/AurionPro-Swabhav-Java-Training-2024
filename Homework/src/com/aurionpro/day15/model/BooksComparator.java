package com.aurionpro.day15.model;

import java.util.Comparator;

public class BooksComparator implements Comparator<Books> {
	

	
	
	public static class TitleComparator implements Comparator<Books> {
		@Override
		public int compare(Books book1, Books book2) {
			// TODO Auto-generated method stub
			return book1.getTitle().compareTo(book2.getTitle());
		}
	}
	
	public static class AuthorComparator implements Comparator<Books> {
		@Override
		public int compare(Books book1, Books book2) {
			// TODO Auto-generated method stub
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
	}
	
	public static class PriceComparator implements Comparator<Books> {
		@Override
		public int compare(Books book1, Books book2) {
			// TODO Auto-generated method stub
			if(book1.getPrice() > book2.getPrice())
				return 1;
			if(book2.getPrice() > book1.getPrice())
				return -1;
			return 0;
		}
	}
	
	public static class PublicationYearComparator implements Comparator<Books> {
		@Override
		public int compare(Books book1, Books book2) {
			// TODO Auto-generated method stub
			if(book1.getPublicationYear() > book2.getPublicationYear())
				return 1;
			if(book2.getPublicationYear() > book1.getPublicationYear())
				return -1;
			return 0;
		}
	}

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	 

	

}
