package com.aurionpro.model;

public class Box {

	private int height;
	private int width;
	private int depth; 
	
	public Box() {
		
	}
	
	public Box(int height , int width , int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public void setHeight( int height) {
		this.height = height;
	}
	
	public void setWidth( int width) {
		this.width = width;
	}
	
	public void setDepth( int depth) {
		this.depth = depth;
	}
	
	public void initialise(int height , int width , int depth) {
		this.height = height;
		this.width =width;
		this.depth = depth;
	}
	
	public int calculateArea() {
		int area = width * height * depth;
		return area;
	}
	
	public void display() {
		System.out.println("box 1 details :- height : " + height + ", width : " + width + ", depth : " + depth );
	}
}
