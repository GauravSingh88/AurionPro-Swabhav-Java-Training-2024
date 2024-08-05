package com.aurionpro.is.solution.model;

public class Labour implements IWorkable,ILunchInterface {
	
	public void startWork() {
		System.out.println("Labour started working");
	}
	public void stopWork() {
		System.out.println("Labour stopped working");
	}
	
	public void eat() {
		System.out.println("Labour is eating");
	}
	
	public void drink() {
		System.out.println("Labour is Drinking");
	}
}
