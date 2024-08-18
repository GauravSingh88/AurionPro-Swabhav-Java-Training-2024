package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Transaction;

public class TransactionDbUtil {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingappdb", "root", "root");
            System.out.println("Connection successful in transaction");
			statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> getAllTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        try {
            String query = "SELECT * FROM transactions order by transactionid  desc";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                transactions.add(new Transaction(
                    resultSet.getInt("transactionId"),
                    resultSet.getString("sendersaccountNumber"),
                    resultSet.getString("recieversaccountNumber"),
                    resultSet.getString("typeOfTransfer"),
                    resultSet.getDouble("amount"),
                    resultSet.getDate("date")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
    
	 public List<Transaction> getPassbook(int accountNumber) {
	        ResultSet dbTransactionData = null;
	        List<Transaction> passbook = new ArrayList<>();
	        try {
	            dbTransactionData = statement.executeQuery("SELECT * FROM transactions where (sendersaccountNumber =" + accountNumber + " OR recieversaccountnumber = " +accountNumber+ ") order by transactionid  desc" );
	            while (dbTransactionData.next()) {
	                passbook.add(new Transaction(
	                    dbTransactionData.getInt("transactionId"),
	                    dbTransactionData.getString("sendersaccountNumber"),
	                    dbTransactionData.getString("recieversaccountNumber"),
	                    dbTransactionData.getString("typeOfTransfer"),
	                    dbTransactionData.getDouble("amount"),
	                    dbTransactionData.getDate("date")
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return passbook;
	    }
}
