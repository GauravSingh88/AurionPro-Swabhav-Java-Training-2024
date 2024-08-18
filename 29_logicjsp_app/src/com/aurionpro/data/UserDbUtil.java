package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.User;

public class UserDbUtil {

	
	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	
	
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","root");
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
	
	public ResultSet getAllUsers() {
		ResultSet dbUsers=null;
		try {
			dbUsers = statement.executeQuery("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUsers;
		
	}
	
	
	public boolean validateCredentials(String username,String password) {
		
		ResultSet dbUsers = getAllUsers();
		try {
			while(dbUsers.next()) {
				if(dbUsers.getString("username").equals(username)) {
					if(dbUsers.getString("password").equals(password)) {
						return true;
					}
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public List<User> getUsers() {
		ResultSet dbUsers=null;
		List<User> users = new ArrayList<User>();
		try {
			dbUsers = statement.executeQuery("select * from users");
			while(dbUsers.next()) {
				users.add(new User(dbUsers.getInt(1) , dbUsers.getString(2) , dbUsers.getString(3)));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}
