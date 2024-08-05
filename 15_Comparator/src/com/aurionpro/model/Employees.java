package com.aurionpro.model;

public class Employees {
	
	private int employeeId;
	private int salary;
	private String name;
	public Employees(int employeeId, int salary, String name) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", salary=" + salary + ", name=" + name + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
