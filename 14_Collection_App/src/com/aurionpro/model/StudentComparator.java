package com.aurionpro.model;

import java.util.Comparator;

public class StudentComparator {
	
	public static class NameComparator implements Comparator<Students>  {

		@Override
		public int compare(Students student1, Students student2) {
			return student1.getName().compareTo(student2.getName());

		}

	}
	
	public static class RollNoComparator implements Comparator<Students> {

		@Override
		public int compare(Students student1, Students student2) {
//			if(student1.getRollNo()>student2.getRollNo())
//				return 1;
//			if(student1.getRollNo()<student2.getRollNo())
//				return -1;
	//
//			return 0;
			
			
			//better way
			return student1.getRollNo() - student2.getRollNo();
		}

			
	}
	
	
	public static class MarksComparator implements Comparator<Students> {
	
		@Override
		public int compare(Students student1, Students student2) {
			if(student1.getMarks()>student2.getMarks())
				return 1;
			if(student1.getMarks()<student2.getMarks())
				return -1;
	
			return 0;
		
		}
		
		
	
	}


}
