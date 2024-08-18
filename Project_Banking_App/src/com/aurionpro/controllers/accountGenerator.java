package com.aurionpro.controllers;

import java.io.IOException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.aurionpro.data.CustomerDbUtil;

@WebServlet("/accountGenerator")
public class accountGenerator extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//	private CustomerDbUtil customerDbUtil =null;
//    
//    
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String customerIdString = request.getParameter("customerId");
//
//       
//        customerDbUtil.connectToDb();
//        int customerId = Integer.parseInt(customerIdString);
//        System.out.println("customer id is and is recieved :" + customerId);
//        
//        // Fetch customer details from the database using the customer ID
//        CustomerDbUtil customerData = new CustomerDbUtil();
//        String customerName = customerData.getFirstNameAndLastName(customerId);
//        System.out.println(customerName);
//        
//        // Generate a random 6-digit account number
//        String accountNumber = generateAccountNumber();
//
//        // Set attributes for customer name, ID, and generated account number
//        request.setAttribute("customerId", customerId);
//        request.setAttribute("accountGeneratorNameDisplay", customerName);
//        request.setAttribute("accountNumber", accountNumber);
//        
//        System.out.println("this is " + customerName);
//        
//        // Forward to JSP for displaying the account number generator page
//        RequestDispatcher dispatcher = request.getRequestDispatcher("AccountNumberGenerator.jsp");
//        dispatcher.forward(request, response);
//    }
//    
//    private String generateAccountNumber() {
//        Random random = new Random();
//        return String.valueOf(100000 + random.nextInt(900000));
//    }
	
	
	 private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Retrieve customer ID from request
	        String customerIdString = request.getParameter("customerId");
	        
	        if (customerIdString == null || customerIdString.trim().isEmpty()) {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Customer ID is missing");
	            return;
	        }

	        int customerId;
	        try {
	            customerId = Integer.parseInt(customerIdString);
	        } catch (NumberFormatException e) {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Customer ID format");
	            return;
	        }

	        // Initialize CustomerDbUtil and connect to the database
	        CustomerDbUtil customerData = new CustomerDbUtil();
	        customerData.connectToDb(); // Ensure this is called to initialize connection and statement

	        // Fetch customer details from the database
	        String customerName = customerData.getFirstNameAndLastName(customerId);

	        // Generate a random 6-digit account number
	        String accountNumber = generateAccountNumber();

	        // Set attributes for customer name, ID, and generated account number
	        request.setAttribute("customerId", customerId);
	        request.setAttribute("accountGeneratorNameDisplay", customerName);
	        request.setAttribute("accountNumber", accountNumber);

	        // Forward to JSP for displaying the account number generator page
	        RequestDispatcher dispatcher = request.getRequestDispatcher("AccountNumberGenerator.jsp");
	        dispatcher.forward(request, response);
	    }

	    // Method to generate a random 6-digit account number
	    private String generateAccountNumber() {
	        int number = 100000 + (int) (Math.random() * 900000);
	        return String.valueOf(number);
	    }
}
