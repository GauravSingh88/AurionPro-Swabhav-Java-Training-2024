package com.aurionpro.model;

public class Reference {
	
	public Reference() {
		System.out.println("Inside Construct");
	}
	
	public static void staticPrint() {
		System.out.println("inside static");
	}

	public void print() {
		System.out.println("inside non static");
	}

	@Override
	public String toString() {
		return "Reference []";
	}
}
