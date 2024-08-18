package com.aurionpro.day27.employee.test;

import com.aurionpro.day27.employee.model.EmployeeConnection;
import com.aurionpro.day27.employee.model.EmployeeFacade;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EmployeeConnection employeeDb = new EmployeeConnection();
//		
//		
//		employeeDb.connectToDb();
////		employeeDb.getEmployeeDetails();
////		employeeDb.addEmployee();
////		employeeDb.updateEmployeeName();
////		employeeDb.updateEmployeeSalary();
////		employeeDb.getEmployeeDetails();
		
		
		
		EmployeeFacade employee = new EmployeeFacade();
		employee.operations();
//		employeeDb.printOptions();
		

	}

}
