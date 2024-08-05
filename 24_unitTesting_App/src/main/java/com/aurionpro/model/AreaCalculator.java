package com.aurionpro.model;

public class AreaCalculator {
	
	public double calculateAreaOfCircle(double radius) {
		return 3.14*radius*radius;
	}
	
	public double calculateAreaOfRectangle(double length,double breadth) {
		return length*breadth;
	}
	
	public double calculateAreaOfTriangle(double base,double height) {
		return 0.5*base*height;
	}
}
