package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Jayesh","Nimesh","Mark","Ramesh","Mahesh"};
		
		List<String> names1 = Arrays.asList(names);
		
		System.out.println("Sorted first three");
		
		names1.stream().sorted().limit(3).forEach((name) -> System.out.println(name));
		
		System.out.println();
		System.out.println("Sorted with 'a'");
		
		names1.stream().filter(name -> name.contains("a")).sorted().limit(3).forEach((name) -> System.out.println(name));
		
		System.out.println();
		System.out.println("Sorted in descending order :");
		
		names1.stream().sorted(Comparator.reverseOrder()).forEach((name) -> System.out.println(name));
		
		System.out.println();
		System.out.println("first three character of all name :");
		
		names1.stream().forEach((name) -> System.out.println(name.substring(0, 3)));
		
		System.out.println();
		System.out.println("Name should have 4 or less than 4 characters :");
		
		names1.stream().filter(name -> name.length()<= 4).forEach((name) -> System.out.println(name));


	}

}
