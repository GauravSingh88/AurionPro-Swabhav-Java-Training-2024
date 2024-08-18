package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.CustomerDbUtil;

@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Override doPost method to handle form submission
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String customerIdString = request.getParameter("customerId");
        String accountNumber = request.getParameter("accountNumber");
        String openingBalanceString = request.getParameter("openingBalance");

        // Initialize database utility
        CustomerDbUtil customerDbUtil = new CustomerDbUtil();
        customerDbUtil.connectToDb();

        try {
            // Parse customer ID and opening balance
            int customerId = Integer.parseInt(customerIdString);
            double openingBalance = Double.parseDouble(openingBalanceString);

            // Check if the customer exists and account number is valid
            if (customerDbUtil.getFirstNameAndLastName(customerId) != null && accountNumber != null && !accountNumber.isEmpty()) {
                // Add the new account to the database
                customerDbUtil.addAccount(accountNumber, openingBalance, customerId);

                // Redirect to confirmation page or success page
                response.sendRedirect("Success.jsp");
            } else {
                // Handle invalid data or customer not found
                response.sendRedirect("AccountGenerator.jsp?error=Invalid data");
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format
            response.sendRedirect("AccountGenerator.jsp?error=Invalid input");
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
            response.sendRedirect("AccountGenerator.jsp?error=Server error");
        } 
    }
}
