package com.aurionpro.day27.scm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.DeleteStatement;

public class ProductsConnectionDb {
	
	
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
	
	public void getProductsDetails() {
		
		try {
			ResultSet productsData = statement.executeQuery("select * from products");
			while(productsData.next()) {
				System.out.println(productsData.getInt(1) + "\t" + productsData.getString(2)+ "\t" + productsData.getString(3) + "\t" + productsData.getInt(4));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void addProducts() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product id : ");
		int product = scanner.nextInt();
		
		System.out.println("Enter Name  : ");
		String name = scanner.next();
		
		System.out.println("Enter description  : ");
		String description = scanner.next();
		
		System.out.println("Enter supplierId : ");
		int supplier = scanner.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into products value(?,?,?,?)");
			preparedStatement.setInt(1, product);
			preparedStatement.setString(2 ,name);
			preparedStatement.setString(3, description);
			preparedStatement.setInt(4, supplier);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	public void updateSupplierId() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id you want to change supplierID for");
		int product = scanner.nextInt();

		System.out.println("Enter new quantity");
		int supplier = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("UPDATE products SET supplierId = ? WHERE productId = ?");
			preparedStatement.setInt(1, supplier);
			preparedStatement.setInt(2, product);

			preparedStatement.executeUpdate();
			System.out.println("Record updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


	
	public void deleteProduct() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product Id of product you want to delete");
		int product = scanner.nextInt();


		try {
			preparedStatement = connection.prepareStatement("DELETE from products WHERE productId = ?");

			preparedStatement.setInt(1, product);

			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public void printOptions() {
    	System.out.println("You can perform following options :");
    	System.out.println("Choose the numeric value associated with them");
    	System.out.println("1.) Read all values from products table");
    	System.out.println("2.) Insert data in table");
    	System.out.println("3.) Update data in table");
    	System.out.println("4.) Delete data from table");
    	System.out.println("5.) Exit");
    }
	
	
	public void query1() {
		
		try {
			ResultSet productsData = statement.executeQuery("select p.productID, p.name, s.name  from  products p left join suppliers s on p.supplierID = s.supplierID");
			while(productsData.next()) {
				System.out.println(productsData.getInt(1) + "\t" + productsData.getString(2)+ "\t" + productsData.getString(3));
			}
			System.out.println("data fetched successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void query3() {
	    try {
	        String sql = "SELECT p.name, s.name " +
	                     "FROM products p " +
	                     "LEFT JOIN suppliers s ON p.supplierid = s.supplierid " +
	                     "WHERE p.productid = 2";

	        ResultSet productSupplierData = statement.executeQuery(sql);

	        while (productSupplierData.next()) {
	            System.out.println(productSupplierData.getString(1) + "\t" +
	                               productSupplierData.getString(2));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void query4() {
	    try {
	        String sql = "SELECT p.productid, p.name, i.QuantityOnHand " +
	                     "FROM products p " +
	                     "LEFT JOIN inventory i ON p.productid = i.productid";

	        ResultSet productInventoryData = statement.executeQuery(sql);

	        while (productInventoryData.next()) {
	            System.out.println(productInventoryData.getInt(1) + "\t" +
	                               productInventoryData.getString(2) + "\t" +
	                               productInventoryData.getInt(3));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	public void query6() {
	    try {
	        String sql = "SELECT p.productid, p.name, SUM(od.Quantity) AS total " +
	                     "FROM products p " +
	                     "LEFT JOIN orderdetails od ON p.productid = od.productid " +
	                     "GROUP BY p.productid, p.name";

	        ResultSet productTotalsData = statement.executeQuery(sql);

	        while (productTotalsData.next()) {
	            System.out.println(productTotalsData.getInt(1) + "\t" +
	                               productTotalsData.getString(2) + "\t" +
	                               productTotalsData.getInt(3));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	
	public void query8() {
	    try {
	        String sql = "SELECT productid, name, COUNT(DISTINCT supplierid) AS count " +
	                     "FROM products " +
	                     "GROUP BY productid, name " +
	                     "HAVING COUNT(DISTINCT supplierid) > 1";

	        ResultSet productSuppliersData = statement.executeQuery(sql);

	        while (productSuppliersData.next()) {
	            System.out.println(productSuppliersData.getInt(1) + "\t" +
	                               productSuppliersData.getString(2) + "\t" +
	                               productSuppliersData.getInt(3));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	public void query9() {
	    try {
	        String sql = "SELECT p.productID, p.name, AVG(i.quantityonhand) AS average " +
	                     "FROM products p " +
	                     "JOIN inventory i ON p.productID = i.productID " +
	                     "GROUP BY p.productID, p.name";

	        ResultSet productInventoryAverageData = statement.executeQuery(sql);

	        while (productInventoryAverageData.next()) {
	            System.out.println(productInventoryAverageData.getInt(1) + "\t" +
	                               productInventoryAverageData.getString(2) + "\t" +
	                               productInventoryAverageData.getDouble(3));
	        }

	        System.out.println("Data fetched successfully");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}




}
