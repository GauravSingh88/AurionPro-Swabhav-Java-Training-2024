package com.aurionpro.model;

public class Circle {
	
	
	
	private int radius;
	public Circle() {
		
	}	
	
	public Circle(int radius) {
		this.radius =radius;
	}	
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void initialise(int radius) {
		this.radius =radius;
	}
	
	public void calculateArea() {
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is : "+ area) ;
	}
	
	public void display() {
		System.out.println("Circle details are : radius = " + radius );
	

}
}
