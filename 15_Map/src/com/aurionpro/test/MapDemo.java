package com.aurionpro.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> string1 = new HashMap<String, Integer>();
		
		
		string1.put("A", 1);
		string1.put("B", 345);
		string1.put("c", 3432);
		string1.put("&", 34);
		
//		System.out.println(string1);
		
//		Map<String, Integer> string1 = new LinkedHashMap<String, Integer>();
//		
//		
//		string1.put("A", 1);
//		string1.put("B", 345);
//		string1.put("c", 3432);
//		string1.put("&", 34);
//		
//		System.out.println(string1);
		
//		Map<String, Integer> string1 = new TreeMap<String, Integer>();
//		
//		
//		string1.put("A", 1);
//		string1.put("B", 345);
//		string1.put("c", 3432);
//		string1.put("&", 34);
//		
//		System.out.println(string1);
		
		
		Set<Entry<String,Integer>> entries = string1.entrySet();
		
		for(Entry<String,Integer > entry: entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}


		
		
		
		

	}

}
