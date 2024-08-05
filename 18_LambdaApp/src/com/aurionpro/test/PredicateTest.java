package com.aurionpro.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> evenChecker = number -> (number%2==0);
		
		System.out.println(evenChecker.test(5));
		

	}

}
