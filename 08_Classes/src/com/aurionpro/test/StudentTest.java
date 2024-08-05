package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student student1 =  new Student();
		System.out.println("Enter name of Student");
		String name =  sc.next();
		student1.setName(name);
		
		System.out.println("Enter age of Student");
		int age =  sc.nextInt();
		student1.setAge(age);
		
		System.out.println("Enter percentage of Student");
		int percentage =  sc.nextInt();
		student1.setPercentage(percentage);
		
		System.out.println("Enter roll no of Student");
		int rollNo =  sc.nextInt();
		student1.setRollNO(rollNo);
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Details of studen are :");
		System.out.println("Name of Student is :" + student1.getName());
		System.out.println("Age of Student is :" + student1.getAge());
		System.out.println("Roll no of Student is :" + student1.getRollNo());
		System.out.println("Percentage of Student is :" + student1.getPercentage());
		System.out.println("Grade of Student is  :" + student1.checkGrade());
		
		
		System.out.println();
		System.out.println();
		
		Student student2 =  new Student();
		System.out.println("Enter name of Student");
		name =  sc.next();
		student2.setName(name);
		
		System.out.println("Enter age of Student");
		age =  sc.nextInt();
		student2.setAge(age);
		
		System.out.println("Enter percentage of Student");
		percentage =  sc.nextInt();
		student2.setPercentage(percentage);
		
		System.out.println("Enter roll no of Student");
		rollNo =  sc.nextInt();
		student2.setRollNO(rollNo);
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Details of studen are :");
		System.out.println("Name of Student is :" + student2.getName());
		System.out.println("Age of Student is :" + student2.getAge());
		System.out.println("Roll no of Student is :" + student2.getRollNo());
		System.out.println("Percentage of Student is :" + student2.getPercentage());
		System.out.println("Grade of Student is  :" + student2.checkGrade());
		
		
		

	}

}
