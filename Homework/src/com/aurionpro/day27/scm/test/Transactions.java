package com.aurionpro.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement withdrawStmt = null;
        PreparedStatement depositStmt = null;

        try {
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false); // Disable auto-commit for transaction management

            // Prepare statements
            String withdrawSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            String depositSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

            withdrawStmt = conn.prepareStatement(withdrawSQL);
            depositStmt = conn.prepareStatement(depositSQL);

            // Set parameters for withdrawal
            withdrawStmt.setDouble(1, 100.00); // Amount to withdraw
            withdrawStmt.setInt(2, 1); // Source account ID

            // Set parameters for deposit
            depositStmt.setDouble(1, 100.00); // Amount to deposit
            depositStmt.setInt(2, 2); // Destination account ID

            // Execute the transactions
            withdrawStmt.executeUpdate();
            depositStmt.executeUpdate();

            // Commit the transaction
            conn.commit();

            System.out.println("Transaction successful");

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    // Rollback in case of error
                    conn.rollback();
                    System.out.println("Transaction rolled back");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (withdrawStmt != null) withdrawStmt.close();
                if (depositStmt != null) depositStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
