package com.aurionpro.day09.model;

public class Box {
	private int length;
	private int depth;
	private int width;
	
	public Box(){
		this.length =10;
		this.width =10;
		this.depth =10;
	}
	
	public Box(int length, int depth){
		this();
		this.length =length;
		this.depth =depth;
	}
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", depth=" + depth + ", width=" + width + "]";
	}

	public Box(int length, int width, int depth){
		this.length =10;
		this.width =10;
		this.depth =10;
	}
}
