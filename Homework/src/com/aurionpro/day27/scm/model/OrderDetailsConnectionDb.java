package com.aurionpro.day27.scm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderDetailsConnectionDb {
	
	
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
	
	public void getOrdersdetailDetails() {
		
		try {
			ResultSet ordersdetailData = statement.executeQuery("select * from orderdetails");
			while(ordersdetailData.next()) {
				System.out.println(ordersdetailData.getInt(1) + "\t" + ordersdetailData.getInt(2) + "\t" + ordersdetailData.getInt(3)+ "\t" + ordersdetailData.getInt(4)+ "\t" + ordersdetailData.getInt(5));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addOrderDetails() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter orderDetail id : ");
		int orderDetail = scanner.nextInt();
		
		System.out.println("Enter order id : ");
		int order = scanner.nextInt();
		
		System.out.println("Enter productId  : ");
		int product = scanner.nextInt();
		
		System.out.println("Enter quantity  : ");
		int quantity = scanner.nextInt();
		
		System.out.println("Enter price  : ");
		int price = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into orderDetails value(?,?,?,?,?)");
			preparedStatement.setInt(1, orderDetail);
			preparedStatement.setInt(2 ,order);
			preparedStatement.setInt(3, product);
			preparedStatement.setInt(4 ,quantity);
			preparedStatement.setInt(5, price);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	public void updateOrderDetailPrice() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter orderDetail id you want to change price for");
		int orderDetail = scanner.nextInt();

		System.out.println("Enter new price");
		int price = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("UPDATE orderdetails SET price = ? WHERE orderdetailid = ?");
			preparedStatement.setInt(1, price);
			preparedStatement.setInt(2, orderDetail);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteOrderDetails() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter orderDetialId of order you want to delete");
		int orderDetailIdDelete = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from orderdetails WHERE orderdetailid = ?");

			preparedStatement.setInt(1, orderDetailIdDelete);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from order details table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }

}
