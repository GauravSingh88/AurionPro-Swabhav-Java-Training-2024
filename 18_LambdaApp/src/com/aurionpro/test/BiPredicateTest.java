package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> biggerNumber = (Integer number1,Integer number2) -> (number1>number2);
		if(biggerNumber.test(9, 7)) System.out.println("number 1 is bigger");
		if(!biggerNumber.test(9, 7)) System.out.println("number 2 is bigger");


	}

}
