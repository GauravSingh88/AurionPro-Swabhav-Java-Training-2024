package com.aurionpro.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessing {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false); // Disable auto-commit for batch processing

            // Prepare statement for batch processing
            String sql = "INSERT INTO transactions (account_id, amount) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Add multiple updates to batch
            pstmt.setInt(1, 1); // Account ID
            pstmt.setDouble(2, 200.00); // Amount
            pstmt.addBatch();

            pstmt.setInt(1, 2); // Another Account ID
            pstmt.setDouble(2, 300.00); // Amount
            pstmt.addBatch();

            pstmt.setInt(1, 3); // Another Account ID
            pstmt.setDouble(2, 400.00); // Amount
            pstmt.addBatch();

            // Execute batch
            pstmt.executeBatch();

            // Commit transaction
            conn.commit();

            System.out.println("Batch processing successful");

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    // Rollback in case of error
                    conn.rollback();
                    System.out.println("Batch processing rolled back");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
