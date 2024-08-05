package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> names= new ArrayList<String>();
		
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,5); 
		names.add("Gaurav");
		names.add("Singh");
//		names.add(5);
		
		ArrayList something = new ArrayList();
		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(numbers);
		names.add(2, "Nothing");
		System.out.println(names);
		names.add(1, "Something");
		System.out.println(names);
		something.addAll(names);
		something.addAll(numbers);
		System.out.println(something);
		System.out.println(something.equals("Gaurav"));

		

	}

}
