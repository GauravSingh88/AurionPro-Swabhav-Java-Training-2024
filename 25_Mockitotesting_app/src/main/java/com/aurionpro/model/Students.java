package com.aurionpro.model;

public class Students {
	
	
	private IStudentService studentService;

	public Students(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	public double calculatePercentage() {
		return studentService.getTotalMarks()/studentService.getTotalNumberOfSubjects();
	}

}
