package com.aurionpro.model;

public class CircularArea {

	public static void main(String[] args) {

		System.out.println("Enter radius: ");
		int radius = Integer.parseInt(args[0]);
		
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is : " + area);

	}

}
