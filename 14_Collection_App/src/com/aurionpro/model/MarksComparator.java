package com.aurionpro.model;

import java.util.Comparator;

public class MarksComparator implements Comparator<Students> {

	@Override
	public int compare(Students student1, Students student2) {
		if(student1.getMarks()>student2.getMarks())
			return 1;
		if(student1.getMarks()<student2.getMarks())
			return -1;

		return 0;
	
	}
	
	

}
