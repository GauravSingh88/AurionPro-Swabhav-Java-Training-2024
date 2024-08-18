package com.aurionpro.day27.scm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrdersConnectionDb {
	
	
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
	
	
	public void getOrdersDetails() {
		
		try {
			ResultSet ordersData = statement.executeQuery("select * from orders");
			while(ordersData.next()) {
				System.out.println(ordersData.getInt(1) + "\t" + ordersData.getString(2) + "\t" + ordersData.getInt(3));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addOrder() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter order id : ");
		int order = scanner.nextInt();
		
		System.out.println("Enter date  : ");
		String date = scanner.next();
		
		System.out.println("Enter supplierID : ");
		int supplier = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into orders value(?,?,?)");
			preparedStatement.setInt(1, order);
			preparedStatement.setString(2 ,date);
			preparedStatement.setInt(3, supplier);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	public void updateSupplierID() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter order id you want to change supplierID for");
		int order = scanner.nextInt();

		System.out.println("Enter new supplierID");
		int supplier = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("UPDATE orders SET supplierId = ? WHERE orderId = ?");
			preparedStatement.setInt(1, supplier);
			preparedStatement.setInt(2, order);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteOrder() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter order Id of order you want to delete");
		int order = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from orders WHERE orderId = ?");

			preparedStatement.setInt(1, order);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from orders table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }
	
	
	public void query2() {
	    try {
	        String sql = "SELECT od.orderdetailid, od.orderID, od.productID, p.name, od.quantity, od.price, o.orderdate, o.supplierid " +
	                     "FROM (orders o JOIN orderdetails od ON o.orderid = od.orderid) " +
	                     "LEFT JOIN products p ON od.productid = p.productid";

	        ResultSet orderDetailsData = statement.executeQuery(sql);

	        while (orderDetailsData.next()) {
	            System.out.println(orderDetailsData.getInt(1) + "\t" +   // orderdetailid
	                               orderDetailsData.getInt(2) + "\t" +   // orderID
	                               orderDetailsData.getInt(3) + "\t" +   // productID
	                               orderDetailsData.getString(4) + "\t" + // productname
	                               orderDetailsData.getInt(5) + "\t" +   // quantity
	                               orderDetailsData.getDouble(6) + "\t" + // price
	                               orderDetailsData.getDate(7) + "\t" +   // orderdate
	                               orderDetailsData.getInt(8));           // supplierid
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	public void query5() {
	    try {
	        String sql = "SELECT orderid, orderdate " +
	                     "FROM orders " +
	                     "WHERE orderdate > NOW() - INTERVAL 1 MONTH";

	        ResultSet recentOrdersData = statement.executeQuery(sql);

	        while (recentOrdersData.next()) {
	            System.out.println(recentOrdersData.getInt(1) + "\t" +
	                               recentOrdersData.getDate(2));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	
	public void query7() {
	    try {
	        String sql = "SELECT o.orderid, SUM(od.quantity * od.price) AS total " +
	                     "FROM orders o " +
	                     "LEFT JOIN orderdetails od ON o.orderid = od.OrderID " +
	                     "GROUP BY o.orderid";

	        ResultSet orderTotalsData = statement.executeQuery(sql);

	        while (orderTotalsData.next()) {
	            System.out.println(orderTotalsData.getInt(1) + "\t" +
	                               orderTotalsData.getDouble(2));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}



}
