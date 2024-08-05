package com.aurionpro.test;

import java.util.function.BiFunction;

public class AdditionUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> addition = (Integer number1, Integer number2) -> number1+number2;
		System.out.println(addition.apply(5, 7));

	}
	
	

}
