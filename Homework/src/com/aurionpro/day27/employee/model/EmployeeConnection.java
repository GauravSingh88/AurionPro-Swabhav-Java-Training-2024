package com.aurionpro.day27.employee.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeConnection {
	
	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			System.out.println("Connection successful");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void getEmployeeDetails() {
		
		try {
			ResultSet employeesData = statement.executeQuery("select * from employees");
			while(employeesData.next()) {
				System.out.println(employeesData.getInt(1) + "\t" + employeesData.getString(2) + "\t" + employeesData.getDouble(3));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void addEmployee() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee id : ");
		int employeeId = scanner.nextInt();
		
		System.out.println("Enter employee name : ");
		String empName = scanner.next();
		
		System.out.println("Enter employee salary : ");
		double empSalary = scanner.nextDouble();
		
		try {
			preparedStatement = connection.prepareStatement("insert into employees value(?,?,?)");
			preparedStatement.setInt(1, employeeId);
			preparedStatement.setString(2 ,empName);
			preparedStatement.setDouble(3, empSalary);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void updateEmployeeSalary() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee id you want to change salary for");
		int employeeId = scanner.nextInt();

		System.out.println("Enter new salary");
		double newSalary = scanner.nextDouble();
		try {
			preparedStatement = connection.prepareStatement("UPDATE employees SET salary = ? WHERE empId = ?");
			preparedStatement.setDouble(1, newSalary);
			preparedStatement.setInt(2, employeeId);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateEmployeeName() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee id you want to change name for");
		int employeeId = scanner.nextInt();

		System.out.println("Enter new salary");
		String newName = scanner.next();
		try {
			preparedStatement = connection.prepareStatement("UPDATE employees SET name = ? WHERE empId = ?");
			preparedStatement.setString(1, newName);
			preparedStatement.setInt(2, employeeId);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteEmployee() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee Id of employee you want to delete");
		int employeeId = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from employees WHERE empId = ?");

			preparedStatement.setInt(1, employeeId);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from employees table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }
	
	

}
