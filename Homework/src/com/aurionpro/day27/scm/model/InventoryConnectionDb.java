package com.aurionpro.day27.scm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InventoryConnectionDb {
	
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
	
	
	public void getInventoryDetails() {
		
		try {
			ResultSet inventoryData = statement.executeQuery("select * from inventory");
			while(inventoryData.next()) {
				System.out.println(inventoryData.getInt(1) + "\t" + inventoryData.getInt(2) + "\t" + inventoryData.getInt(3));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addInventory() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter inventory id : ");
		int inventory = scanner.nextInt();
		
		System.out.println("Enter productId  : ");
		int product = scanner.nextInt();
		
		System.out.println("Enter quantity on hand : ");
		int quantity = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into inventory value(?,?,?)");
			preparedStatement.setInt(1, inventory);
			preparedStatement.setInt(2 ,product);
			preparedStatement.setInt(3, quantity);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	public void updateInventoryQuantity() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter inventory id you want to change quantity for");
		int inventory = scanner.nextInt();

		System.out.println("Enter new quantity");
		int quantity = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("UPDATE inventory SET quantityonhand = ? WHERE inventoryid = ?");
			preparedStatement.setInt(1, quantity);
			preparedStatement.setInt(2, inventory);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteInventory() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee Id of employee you want to delete");
		int inventoryIdDelete = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from inventory WHERE inventoryId = ?");

			preparedStatement.setInt(1, inventoryIdDelete);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from inventory table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }
}
