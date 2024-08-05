package com.aurionpro.model;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employees> {

	
	
	public static class SalaryComparator implements Comparator<Employees> {

		@Override
		public int compare(Employees employee1, Employees employee2) {
			
			return employee1.getSalary()-employee2.getSalary();
		}
		
	}
	
	public static class EmployeeIdComparator implements Comparator<Employees> {

		@Override
		public int compare(Employees employee1, Employees employee2) {
			
			return employee1.getEmployeeId()-employee2.getEmployeeId();
		}
		
	}
	
	public static class NameComparator implements Comparator<Employees> {

		@Override
		public int compare(Employees employee1, Employees employee2) {
			
			return employee1.getName().compareTo(employee2.getName());
		}
		
	}

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
