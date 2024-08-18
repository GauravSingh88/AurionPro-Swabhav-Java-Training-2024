package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DbConnection {
	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	public void connectToDb() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			System.out.println("Connection Successful");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void getStudentDetails() {
		
		try {
			ResultSet dbStudentData = statement.executeQuery("select * from students");
			
			while(dbStudentData.next()) {
				System.out.println(dbStudentData.getInt(1) + " \t" + dbStudentData.getString("name") + "\t" + dbStudentData.getInt("age") + "\t" + dbStudentData.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addStudent() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll no");
		int rollNo = scanner.nextInt();
		System.out.println("Enter name");
		String name =  scanner.next();
		System.out.println("Enter age ");
		int age = scanner.nextInt();
		System.out.println("Enter percentage");
		double percentage = scanner.nextDouble();
		try {
//			statement.executeUpdate("insert into students values(" + rollNo + ",'" + name + "'," + age + "," +percentage +")");
			preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?)");
			preparedStatement.setInt(1, rollNo);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setDouble(4, percentage);
			preparedStatement.executeUpdate();
//			statement.executeUpdate("insert into students values(3,'suhas',21,100.00)");
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateStudent() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll no you want to change percentage for");
		int rollNo = scanner.nextInt();

		System.out.println("Enter new percentage");
		double percentage = scanner.nextDouble();
		try {
//			statement.executeUpdate("insert into students values(" + rollNo + ",'" + name + "'," + age + "," +percentage +")");
			preparedStatement = connection.prepareStatement("UPDATE students SET percentage = ? WHERE roll_no = ?");
			preparedStatement.setDouble(1, percentage);
			preparedStatement.setInt(2, rollNo);

			preparedStatement.executeUpdate();
//			statement.executeUpdate("insert into students values(3,'suhas',21,100.00)");
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void deleteStudent() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll no of student you want to delete");
		int rollNo = scanner.nextInt();


		try {
//			statement.executeUpdate("insert into students values(" + rollNo + ",'" + name + "'," + age + "," +percentage +")");
			preparedStatement = connection.prepareStatement("DELETE from students WHERE roll_no = ?");

			preparedStatement.setInt(1, rollNo);

			preparedStatement.executeUpdate();
//			statement.executeUpdate("insert into students values(3,'suhas',21,100.00)");
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void countColumns() {
		 try {
	            DatabaseMetaData metaData = connection.getMetaData();
	            
	            // Specify the database, schema, and table
	            String catalog = null; // Use null or the catalog name if applicable
	            String schemaPattern = null; // Use null or the schema name if applicable
	            String tableNamePattern = "students"; // Table name
	            
	            // Retrieve column metadata
	            ResultSet columns = metaData.getColumns(catalog, schemaPattern, tableNamePattern, null);
	            
	            // Count the number of columns
	            int columnCount = 0;
	            while (columns.next()) {
	                columnCount++;
	            }
	            
	            System.out.println("Number of columns in table '" + tableNamePattern + "': " + columnCount);
	            

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	

    public void printColumnDataTypes() {
        try {
            DatabaseMetaData metaData = connection.getMetaData();

            // Specify the database, schema, and table
            String catalog = null; // Use null or the catalog name if applicable
            String schemaPattern = null; // Use null or the schema name if applicable
            String tableNamePattern = "students"; // Table name

            // Retrieve column metadata
            ResultSet columns = metaData.getColumns(catalog, schemaPattern, tableNamePattern, null);

            // Print column data types
            System.out.println("Column Data Types for table '" + tableNamePattern + "':");
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String columnType = columns.getString("TYPE_NAME");
                int columnSize = columns.getInt("COLUMN_SIZE");

                System.out.println("Column Name: " + columnName);
                System.out.println("Data Type: " + columnType);
                System.out.println("Column Size: " + columnSize);
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    

}
