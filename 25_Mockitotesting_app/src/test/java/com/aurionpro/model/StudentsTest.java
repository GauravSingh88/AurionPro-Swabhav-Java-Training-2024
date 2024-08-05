package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentsTest {
	
	private IStudentService studentService;
	private Students student;
	
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Students(studentService);
	}

	@Test
	void testCalculatePercentage() {
		
		Mockito.when(studentService.getTotalMarks()).thenReturn((double) 650);
		Mockito.when(studentService.getTotalNumberOfSubjects()).thenReturn((double) 10);
		
		
		assertEquals(65, student.calculatePercentage());
	}

}
