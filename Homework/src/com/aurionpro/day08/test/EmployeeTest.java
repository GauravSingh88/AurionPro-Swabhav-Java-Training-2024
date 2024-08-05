package com.aurionpro.day08.test;

import java.util.Scanner;

import com.aurionpro.day08.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		Employee employee1 = new Employee();
		
		System.out.println("Enter employee id :");
		int empID = sc.nextInt();
		employee1.setEmployeeId(empID);
		
		System.out.println("Enter salary of Employee :");
		int salary = sc.nextInt();
		employee1.setSalary(salary);
		
		sc.nextLine();
		
		System.out.println("Enter employee name :");
		String name = sc.nextLine();
		
		employee1.setName(name);
		
		System.out.println();
		
		
		Employee employee2 = new Employee();
		
		System.out.println("Enter employee id :");
		empID = sc.nextInt();
		employee2.setEmployeeId(empID);
		
		System.out.println("Enter salary of Employee :");
		salary = sc.nextInt();
		employee2.setSalary(salary);
		
		sc.nextLine();
		
		System.out.println("Enter employee name :");
		name = sc.nextLine();
		employee2.setName(name);
		
		System.out.println();
		
		System.out.println("Which employee details you want to be printed");
		int option  = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Employee 1 details are as follows :-");
			System.out.println("Name : " + employee1.getName());
			System.out.println("Salary : " + employee1.getSalary());
			System.out.println("Employee id : " + employee1.getEmployeeId());
			break;
		case 2:
			System.out.println("Employee 2 details are as follows :-");
			System.out.println("Name : " + employee2.getName());
			System.out.println("Salary : " + employee2.getSalary());
			System.out.println("Employee id : " + employee2.getEmployeeId());
			break;
		default:
			System.out.println("Enter valid input ");
			
		}
		
		
		
		
		
		
		
		
		

	}

}
