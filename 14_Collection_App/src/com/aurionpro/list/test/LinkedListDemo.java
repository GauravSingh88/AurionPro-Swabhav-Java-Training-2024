package com.aurionpro.list.test;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(1);
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers);
		System.out.println(numbers.peek());
		System.out.println(numbers.clone());
		System.out.println(numbers.getFirst());
		System.out.println(numbers.getLast());
		System.out.println(numbers.element());
		System.out.println(numbers.toString());
		System.out.println(numbers.toArray());

	}

}
