package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.MarksComparator;
import com.aurionpro.model.NameComparator;
import com.aurionpro.model.RollNoComparator;
import com.aurionpro.model.StudentComparator;
import com.aurionpro.model.Students;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		List<Students> students = new ArrayList<Students>();
		
//		System.out.println("Enter number of students you want to create : ");
//		int numberOfStudents = scanner.nextInt();
//		
//		for(int i = 0 ; i < numberOfStudents ; i++) {
//			System.out.println("Enter name for student " + (i+1) + " : ");
//			String name = scanner.next();
//			System.out.println("Enter marks for student " + (i+1) + " : ");
//			int marks =  scanner.nextInt();
//			
//			students.add(new Students((i+1), name , marks)) ;
//			
//		}
//		
		
		students.add(new Students(1,"Bhakti",80));
		students.add(new Students(1,"Baakti",80));
		students.add(new Students(3,"Suhas",100));
		students.add(new Students(2,"Gaurav",70));
		students.add(new Students(1,"Waghmare",80));
		students.add(new Students(3,"Zeno",100));
		students.add(new Students(2,"Aakash",70));
		
		System.out.println("Before Sorting");
		for(Students student : students) {
			System.out.println(student);
		}
		
		System.out.println("After sorting by roll no :");
		
		Collections.sort(students, new RollNoComparator());
		for(Students student : students) {
			System.out.println(student);
		}
		
		System.out.println("After sorting by marks :");
		
		Collections.sort(students, new MarksComparator());
		for(Students student : students) {
			System.out.println(student);
		}
		
		System.out.println("After sorting by name :");
		
		Collections.sort(students, new NameComparator());
		for(Students student : students) {
			System.out.println(student);
		}
		
		
		Collections.sort(students,new StudentComparator.MarksComparator());
//		for(int i = 0; i< students.size();i++) {
//			System.out.println(students.get(i));
//		}
//		
//		for(Students student:students) {
//			System.out.println(student);
//		}
//		
//		System.out.println("using iterator");
//		
//		Iterator<Students> studentIterator = students.iterator();
//		while(studentIterator.hasNext()) {
//			System.out.println(studentIterator.next());
//		}
//		
//		System.out.println("using list iterator");
//		
//		ListIterator<Students> studentListIterator = students.listIterator();
//		while(studentListIterator.hasNext()) {
//			System.out.println(studentListIterator.next());
//		}
//		while(studentListIterator.hasPrevious()) {
//			System.out.println(studentListIterator.previous());
//		}
		
		
		
		
		
		

	}

}
