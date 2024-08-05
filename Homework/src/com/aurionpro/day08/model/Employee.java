package com.aurionpro.day08.model;

public class Employee {
	
	private int employeeId;
	private int salary;
	private String name;
	
	
	public Employee() {
		
	}
	
	public Employee(int e , int s , String n) {
		
		this.employeeId = e;
		this.salary =s;
		this.name= n;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	
	public void setSalary(int ssalary) {
		this.salary =salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
