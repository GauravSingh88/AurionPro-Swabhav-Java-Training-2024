package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Employees;
import com.aurionpro.model.EmployeesComparator;


public class EmployeesTest {

	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<Employees>();
		
		employees.add(new Employees(1,90008,"Bhakti"));
		employees.add(new Employees(2,56756,"Baakti"));
		employees.add(new Employees(3,45645,"Suhas"));
		employees.add(new Employees(8,345646,"Gaurav"));
		employees.add(new Employees(5,346,"Waghmare"));
		employees.add(new Employees(6,32324,"Zeno"));
		employees.add(new Employees(9,12414,"Aakash"));
		
		
		System.out.println("Before Sorting");
		for(Employees employee:employees ) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by id");
		Collections.sort(employees, new EmployeesComparator.EmployeeIdComparator());
		for(Employees employee:employees ) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by name");
		Collections.sort(employees, new EmployeesComparator.NameComparator());
		for(Employees employee:employees ) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("After sorting by salary");
		Collections.sort(employees, new EmployeesComparator.SalaryComparator());
		for(Employees employee:employees ) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------------");
	}
	
	

}
