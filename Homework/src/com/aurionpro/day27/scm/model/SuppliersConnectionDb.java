package com.aurionpro.day27.scm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SuppliersConnectionDb {
	
	
	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","root");
			System.out.println("Connection successful");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getSuppliersDetails() {
		
		try {
			ResultSet suppliersData = statement.executeQuery("select * from suppliers");
			while(suppliersData.next()) {
				System.out.println(suppliersData.getInt(1) + "\t" + suppliersData.getString(2) + suppliersData.getString(3)+ suppliersData.getString(4));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void addSuppliers() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter supplier id : ");
		int supplier = scanner.nextInt();
		
		System.out.println("Enter Name  : ");
		String name = scanner.next();
		
		System.out.println("Enter contactInfo  : ");
		String contact = scanner.next();
		
		System.out.println("Enter address : ");
		String address = scanner.next();
		
		try {
			preparedStatement = connection.prepareStatement("insert into suppliers value(?,?,?,?)");
			preparedStatement.setInt(1, supplier);
			preparedStatement.setString(2 ,name);
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, address);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	public void updateSupplierName() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter supplier id you want to change name for");
		int supplier = scanner.nextInt();

		System.out.println("Enter name");
		String name = scanner.next();
		try {
			preparedStatement = connection.prepareStatement("UPDATE suppliers SET name = ? WHERE supplierId = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, supplier);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteSuppliers() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter supplier Id of supplier you want to delete");
		int supplier = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from suppliers WHERE supplierId = ?");

			preparedStatement.setInt(1, supplier);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from suppliers table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }
	
	
	public void query10() {
	    try {
	        String sql = "SELECT s.supplierid, s.name " +
	                     "FROM suppliers s " +
	                     "LEFT JOIN products p ON s.supplierid = p.supplierid " +
	                     "WHERE p.productid IS NULL";

	        ResultSet suppliersWithoutProductsData = statement.executeQuery(sql);

	        while (suppliersWithoutProductsData.next()) {
	            System.out.println(suppliersWithoutProductsData.getInt(1) + "\t" +
	                               suppliersWithoutProductsData.getString(2));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}
