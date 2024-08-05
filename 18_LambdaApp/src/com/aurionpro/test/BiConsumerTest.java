package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer,Integer> addition = (Integer number1, Integer number2) -> {
			System.out.println(number1+number2);
		};

			
		addition.accept(3, 4);
	}

}
