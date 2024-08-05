package com.aurionpro.test;

public class MethodDebugger {
	
	public static void method1() {
		System.out.println("method 1 was called");
	}
	public static void method2() {
		System.out.println("method 2 was called");
		method1();
	}
	public static void method3() {
		System.out.println("method 3 was called");
		method2();
	}
	public static void method4() {
		System.out.println("method 4 was called");
		method3();
	}
	public static void method5() {
		System.out.println("method 5 was called");
		method4();
	}
	

	public static void main(String[] args) {
		
		

		method5();

	}

}
