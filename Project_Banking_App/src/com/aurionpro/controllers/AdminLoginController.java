package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.CustomerDbUtil;
import com.aurionpro.entity.CustomerNameAndId;




/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
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


	        // Fetch the list of customers from the database
	        List<CustomerNameAndId> customerNameAndIds = customerDbUtil.getLastestThreeCustomers();

	        // Set the customer list as a request attribute
	        request.getSession().setAttribute("customerNameAndIds", customerNameAndIds);
	        System.out.println("add bank account controller is called");
	        dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
	        for(CustomerNameAndId customerNameAndId: customerNameAndIds) {
		        System.out.println(customerNameAndId);

	        }
		
		if(customerDbUtil.validateCredentialsForAdmin(username,password)) {
			dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
			request.setAttribute("username", username);
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
