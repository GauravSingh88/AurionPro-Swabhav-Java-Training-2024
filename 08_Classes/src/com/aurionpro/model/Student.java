package com.aurionpro.model;

public class Student {
	
	private int rollNo;
	private String name;
	private int age;
	private int percentage;
	
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int age, int percentage) {
		this.rollNo = roll;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		
		
	}
	
	public void setRollNO(int roll) {
		this.rollNo = roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getPercentage() {
		return this.percentage;
	}
	
	
	public String checkGrade() {
		String grade = "";
		if(percentage> 75) {
			grade = "A";
		} else if(percentage > 60 && percentage <= 75) {
			grade = "B";
		} else if(percentage > 50 && percentage <= 60) {
			grade = "C";
		} else if(percentage > 40 && percentage <=50) {
			grade = "D";
		} else if(percentage < 40) {
			grade = "F";
		}
		return grade;
	}
	
	public void display() {
		System.out.println("Name of Student is :" + this.name);
		System.out.println("Age of Student is :" + this.age);
		System.out.println("Roll no of Student is :" + this.rollNo);
		System.out.println("Percentage of Student is :" + this.percentage);

	}

}
