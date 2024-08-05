package com.aurionpro.test;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

//		HashSet<String> string1 = new HashSet<String>();
//		HashSet<String> string2 = new HashSet<String>();
//
//		string1.add("Hello");
//		string1.add("World");
//		
//		string2.add("Java");
//		string2.add("World");
//		
//		System.out.println(string1);
//		System.out.println(string2);
//		
//		System.out.println(string1.addAll(string2));
//		System.out.println(string1.clone());
//		System.out.println(string1.contains(string2));
//		System.out.println(string1.hashCode());
//		System.out.println(string1.isEmpty());
//		System.out.println(string1.remove("Hello"));
//		System.out.println(string1.size());
//		System.out.println(string1.toString());
//		System.out.println(string1.toArray());
		
		
//		LinkedHashSet<String> string1 = new LinkedHashSet<String>();
//		LinkedHashSet<String> string2 = new LinkedHashSet<String>();
//
//		string1.add("Hello");
//		string1.add("World");
//		
//		string2.add("Java");
//		string2.add("World");
//		
//		System.out.println(string1);
//		System.out.println(string2);
//		
//		System.out.println(string1.addAll(string2));
//		System.out.println(string1.clone());
//		System.out.println(string1.contains(string2));
//		System.out.println(string1.hashCode());
//		System.out.println(string1.isEmpty());
//		System.out.println(string1.remove("Hello"));
//		System.out.println(string1.size());
//		System.out.println(string1.toString());
//		System.out.println(string1.toArray());
		
		TreeSet<String> string1 = new TreeSet<String>();
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		TreeSet<String> string2 = new TreeSet<String>();
		
		numbers.add(1);
		numbers.add(2);
		
		
		string1.add("Hello");
		string1.add("World");
		
		string2.add("Java");
		string2.add("World");
		
		System.out.println(string1);
		System.out.println(string2);
		
		System.out.println(string1.addAll(string2));
		System.out.println(string1.clone());
		System.out.println(string1.hashCode());
		System.out.println(string1.isEmpty());
		System.out.println(string1.remove("Hello"));
		System.out.println(string1.size());
		System.out.println(string1.toString());
		System.out.println(string1.toArray());



	}

}
