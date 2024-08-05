package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {


		Student student1 = new Student();
		student1.setAddress("Airoli");
		student1.setAge(21);
		student1.setName("Gaurav");
		student1.setPercentage(100.00);
		student1.setRollNo(1);
		
		System.out.println(student1);

	}

}
