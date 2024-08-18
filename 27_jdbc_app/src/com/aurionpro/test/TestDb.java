package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class TestDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbConnection connection1 = new DbConnection();
		connection1.connectToDb();
		connection1.getStudentDetails();
//		connection1.addStudent();
//		connection1.getStudentDetails();
//		connection1.updateStudent();
		connection1.deleteStudent();
		connection1.getStudentDetails();
//		
//		connection1.countColumns();
//		connection1.printColumnDataTypes();



	}

}
