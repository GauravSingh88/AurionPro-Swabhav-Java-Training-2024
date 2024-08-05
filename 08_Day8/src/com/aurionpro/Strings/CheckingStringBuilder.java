package com.aurionpro.Strings;

public class CheckingStringBuilder {

	public static void main(String[] args) {

		StringBuilder name1 = new StringBuilder("Gaurav");
		System.out.println(name1.hashCode());

		name1 = name1.append("Singh");
		System.out.println(name1.hashCode());

	}

}
