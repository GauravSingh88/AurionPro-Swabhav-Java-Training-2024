package com.aurionpro.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.CustomerDbUtil;

/**
 * Servlet implementation class SendMoneyController
 */
@WebServlet("/SendMoneyController")
public class SendMoneyController extends HttpServlet {
	private CustomerDbUtil customerDbUtil;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMoneyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format the date
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println(formattedDate);
    	customerDbUtil =new CustomerDbUtil();
        
		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		String recieversAccountNumber = request.getParameter("recieversAccountNumber");
		String amount = request.getParameter("Amount") ;
        HttpSession session = request.getSession(false);
        Integer customerIdObj = (Integer)session.getAttribute("customerId") ;
        System.out.println(customerIdObj);
        int accountNumber = customerDbUtil.getAccountNumberFromCustomerId(customerIdObj);
        System.out.println("accountnnumber is " +accountNumber);

		
		customerDbUtil.connectToDb();
		
		
		customerDbUtil.addDebitTransaction(recieversAccountNumber, accountNumber, amount, formattedDate);
		System.out.println("sender account " + recieversAccountNumber);
		System.out.println("Account number is " +  accountNumber);
		System.out.println("amount is " +amount);
		
		
		
		dispatcher = request.getRequestDispatcher("/CustomerHome.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
