package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(23,2343,223,22,344);
//		Stream<Integer> numberStream = numbers.stream();
////		numberStream.forEach((number) -> System.out.println(number));
//		System.out.println();
//		List<Integer> filteredNumbers= numbers.stream().filter((number) -> (number%2!=0))
//		.filter((number) -> (number>25)).collect(Collectors.toList());
//		
//		filteredNumbers.forEach((number)-> System.out.println(number));
		
		List<Integer> squaredNumbers = numbers.stream().map((number)->number*number).collect(Collectors.toList());
		
		System.out.println(squaredNumbers);
		 
		
		int sum = numbers.stream().reduce(0, (number1,number2) -> number1+number2);
		System.out.println(sum);
		
		numbers.stream().sorted().forEach((number)->System.out.println(number));
		
		numbers.stream().sorted(Comparator.reverseOrder()).forEach((number)->System.out.println(number));
		
		Optional<Integer> maxNumber = numbers.stream().max((number1,number2) -> number1-number2);
		System.out.println(maxNumber.get());
		
		Optional<Integer> minNumber = numbers.stream().min((number1,number2) -> number1-number2);
		System.out.println(minNumber.get());

	}

}