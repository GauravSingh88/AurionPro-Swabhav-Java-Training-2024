package com.aurionpro.is.violation.model;

public class Robot implements IWorker{
	
	public void startWork() {
		System.out.println("robot started working");
	}
	
	public void stopWork() {
		System.out.println("robot stopped working");
	}
	
	public void eat() {
		System.out.println("robot is eating");
	}
	
	public void drink() {
		System.out.println("robot is Drinking");
	}

}
