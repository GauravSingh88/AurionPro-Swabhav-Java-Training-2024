package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.CustomerDbUtil;

/**
 * Servlet implementation class CustomerLoginController
 */
@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		customerDbUtil =new CustomerDbUtil();
		
		
		customerDbUtil.connectToDb();
		
		int customerId = customerDbUtil.getCustomerIdFromUsername(username);
		
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(customerId);
		
		// Assuming you have retrieved the customerId from the login process
		HttpSession session = request.getSession();
		session.setAttribute("customerId", customerId);

		if(customerDbUtil.validateCredentialsForCustomer(username,password)) {
			dispatcher = request.getRequestDispatcher("/CustomerHome.jsp");
			request.setAttribute("username", username);
			request.setAttribute("customerId", customerId);
		}
			
		else
			dispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
		
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
