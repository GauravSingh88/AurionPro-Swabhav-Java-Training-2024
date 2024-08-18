package com.aurionpro.day27.employee.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement withdrawStmt = null;
        PreparedStatement depositStmt = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false);

            String withdrawSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            String depositSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

            withdrawStmt = conn.prepareStatement(withdrawSQL);
            depositStmt = conn.prepareStatement(depositSQL);

            withdrawStmt.setDouble(1, 100.00);
            withdrawStmt.setInt(2, 1);

            depositStmt.setDouble(1, 100.00);
            depositStmt.setInt(2, 2);

            withdrawStmt.executeUpdate();
            depositStmt.executeUpdate();

            conn.commit();

            System.out.println("Transaction successful");

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
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
