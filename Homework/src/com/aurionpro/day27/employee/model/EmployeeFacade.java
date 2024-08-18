package com.aurionpro.day27.employee.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeFacade {
	
	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private EmployeeConnection employeeDb = new EmployeeConnection();
	
	
//    public EmployeeFacade() {
//        employeeDb = new EmployeeConnection();
//    }
	
	public void operations() {
		
		Scanner scanner = new Scanner(System.in);
		employeeDb.connectToDb();
		
		
		employeeDb.printOptions();
		int input = scanner.nextInt();
		
		while(input!=5) {
			
			
			
			switch(input) {
			case 1:
				employeeDb.getEmployeeDetails();
				break;
			case 2:
				employeeDb.addEmployee();
				break;

			case 3:
				
				System.out.println("Do you want to update name or salary");
				System.out.println("1.) name");
				System.out.println("2.) salary");
				int option = scanner.nextInt();
				if(option == 1) 
					employeeDb.updateEmployeeName();
				if(option == 2)
					employeeDb.updateEmployeeSalary();
			
				break;

			case 4:
				employeeDb.deleteEmployee();
				
				break;
			default :
				System.out.println("Invalid Input");
				break;
			}
			employeeDb.printOptions();
			input = scanner.nextInt();
		}
		
		
		System.out.println("Thank you for using this service!!");
		
		
		
	}

}
