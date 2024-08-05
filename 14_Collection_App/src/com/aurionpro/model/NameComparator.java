package com.aurionpro.model;

import java.util.Comparator;

public class NameComparator implements Comparator<Students>  {

	@Override
	public int compare(Students student1, Students student2) {
		return student1.getName().compareTo(student2.getName());

	}

}
