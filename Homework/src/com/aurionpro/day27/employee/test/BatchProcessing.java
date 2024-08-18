package com.aurionpro.day27.employee.test;

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
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false);

            String sql = "INSERT INTO transactions (account_id, amount) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1);
            pstmt.setDouble(2, 200.00);
            pstmt.addBatch();

            pstmt.setInt(1, 2);
            pstmt.setDouble(2, 300.00);
            pstmt.addBatch();

            pstmt.setInt(1, 3);
            pstmt.setDouble(2, 400.00);
            pstmt.addBatch();

            pstmt.executeBatch();

            conn.commit();

            System.out.println("Batch processing successful");

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Batch processing rolled back");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
