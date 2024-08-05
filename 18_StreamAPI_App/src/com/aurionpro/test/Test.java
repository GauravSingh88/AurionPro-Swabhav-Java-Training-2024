package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
	
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(23,2343,223,22,344);
		Stream<Integer> numberStream = numbers.stream();
//		numberStream.forEach((number) -> System.out.println(number));
		System.out.println();
		List<Integer> filteredNumbers= numbers.stream().filter((number) -> (number%2!=0))
		.filter((number) -> (number>25)).collect(Collectors.toList());
		
		filteredNumbers.forEach((number)-> System.out.println(number));
	}

}
