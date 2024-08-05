package com.aurionpro.Strings;

public class CheckinStringBuffer {

	public static void main(String[] args) {

		StringBuffer name1 = new StringBuffer("Gaurav");
		System.out.println(name1.hashCode());

		name1 = name1.append("Singh");
		System.out.println(name1.hashCode());

	}

}
