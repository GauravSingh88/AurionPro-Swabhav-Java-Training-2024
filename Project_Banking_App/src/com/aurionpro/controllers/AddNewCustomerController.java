package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.CustomerDbUtil;

/**
 * Servlet implementation class AddNewCustomerController
 */
@WebServlet("/AddNewCustomerController")
public class AddNewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		RequestDispatcher dispatcher = null;
//		String firstName = request.getParameter("firstname");
//		String lastName = request.getParameter("lastname");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		customerDbUtil =new CustomerDbUtil();
//		
//		
//		customerDbUtil.connectToDb();
////		System.out.println(username);
////		System.out.println(lastName);
////		System.out.println(firstName);
////		System.out.println(password);
////		System.out.println(customerDbUtil.getLastCustomerId());
//		
//		
//		customerDbUtil.addNewCustomer(username, password, firstName, lastName);
//		
//		
//		dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
//		dispatcher.forward(request, response);
//		
//		
//		
//		
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	
	// code with validation
	
	
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		RequestDispatcher dispatcher = null;
//
//		// Retrieve parameters
//		String firstName = request.getParameter("firstname").trim();
//		String lastName = request.getParameter("lastname").trim();
//		String username = request.getParameter("username").trim();
//		String password = request.getParameter("password").trim();
//
//		// Server-side validation
//		String errorMessage = validateInput(firstName, lastName, username, password);
//		if (errorMessage != null) {
//			request.setAttribute("error", errorMessage);
//			dispatcher = request.getRequestDispatcher("/AddNewCustomer.jsp");
//			dispatcher.forward(request, response);
//			return;
//		}
//
//		// If validation passes, proceed with adding the customer
//		customerDbUtil = new CustomerDbUtil();
//		customerDbUtil.connectToDb();
//		customerDbUtil.addNewCustomer(username, password, firstName, lastName);
//
//		dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//	// Method for validating input
//	private String validateInput(String firstName, String lastName, String username, String password) {
//		if (!firstName.matches("^[A-Za-z]+$")) {
//			return "First Name should contain only alphabetic characters.";
//		}
//		if (!lastName.matches("^[A-Za-z]+$")) {
//			return "Last Name should contain only alphabetic characters.";
//		}
//		if (username.length() < 4) {
//			return "Username must be at least 4 characters long.";
//		}
//		if (password.length() < 8) {
//			return "Password must be at least 8 characters long.";
//		}
//		return null; // Return null if there are no validation errors
//	}
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Retrieve form data
        String firstName = request.getParameter("firstname").trim();
        String lastName = request.getParameter("lastname").trim();
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();

        // Perform server-side validation
        String errorMessage = validateInput(firstName, lastName, username, password);
        if (errorMessage != null) {
            // Validation failed, set error message and forward back to the form
            request.setAttribute("error", errorMessage);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/AddNewCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Validation passed, proceed to add the customer
        customerDbUtil = new CustomerDbUtil();
        customerDbUtil.connectToDb();
        try {
        	customerDbUtil.addNewCustomer(username, password, firstName, lastName);
        	response.sendRedirect("Success.jsp"); // Redirect to success page
        } catch (SQLException e) {
            request.setAttribute("errorMessage", "Username already exists. Please choose a different username.");
            request.getRequestDispatcher("AddNewCustomer.jsp").forward(request, response); // Forward to form page with error message
        }
        // Redirect to the Admin Home page
//        response.sendRedirect("AdminHome.jsp");
    }

    private String validateInput(String firstName, String lastName, String username, String password) {
        if (firstName == null || !firstName.matches("[A-Za-z]{2,}")) {
            return "First name must contain only letters and be at least 2 characters long.";
        }
        if (lastName == null || !lastName.matches("[A-Za-z]{2,}")) {
            return "Last name must contain only letters and be at least 2 characters long.";
        }
        if (username == null || username.length() < 4) {
            return "Username must be at least 4 characters long.";
        }
        if (password == null || password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        return null;
    }
}
