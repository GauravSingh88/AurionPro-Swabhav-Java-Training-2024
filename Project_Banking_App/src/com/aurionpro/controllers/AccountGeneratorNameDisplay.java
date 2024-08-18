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
import com.aurionpro.entity.CustomerNames;


@WebServlet("/AccountGeneratorNameDisplay")
public class AccountGeneratorNameDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountGeneratorNameDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        System.out.println("Account AccountGeneratorNameDisplay is getting called");
        RequestDispatcher dispatcher = null;

        customerDbUtil = new CustomerDbUtil();
        customerDbUtil.connectToDb();
        HttpSession session = request.getSession(false);

        // Fetch the list of customers from the database
//        CustomerNames customerNames = customerDbUtil.getFirstNameAndLastName(Integer.parseInt( session.getAttribute("CustomerId").toString()));

        // Set the customer list as a request attribute
//        request.setAttribute("customerNames", customerNames);
        
//        System.out.println(customerNames.getFirstName());
//        System.out.println(customerNames.getLastName());

        // Forward the request to the JSP page
        dispatcher = request.getRequestDispatcher("AccountNumberGenerator.jsp");
        dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
