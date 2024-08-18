package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.CustomerDbUtil;
import com.aurionpro.entity.CustomerNameAndId;

/**
 * Servlet implementation class AddBankAccountController
 */
@WebServlet("/AddBankAccountController")
public class AddBankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBankAccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        
//        String customerId = request.getParameter("customerId");
//        
//        // Create or get the existing session
//        HttpSession session = request.getSession();
//        session.setAttribute("customerId", customerId);
//		RequestDispatcher dispatcher = null;
//		
//		System.out.println("customer id is :" + customerId);
//
//		dispatcher = request.getRequestDispatcher("/AccountNumberGenerator.jsp");
//		dispatcher.forward(request, response);
		
		
		
		//chatgpt codde
		
		 response.setContentType("text/html");

	        String customerId = request.getParameter("customerId");
	        
	        customerDbUtil =new CustomerDbUtil();
			
			
			customerDbUtil.connectToDb();


		        // Fetch the list of customers from the database
		        List<CustomerNameAndId> customerNameAndIds = customerDbUtil.getLastestThreeCustomers();

		        // Set the customer list as a request attribute
		        request.setAttribute("customerNameAndIds", customerNameAndIds);
		        System.out.println("add bank account controller is called");
		        RequestDispatcher dispatcher  = request.getRequestDispatcher("/AddBankAccount.jsp");
		        
		        for(CustomerNameAndId customerNameAndId: customerNameAndIds) {
			        System.out.println(customerNameAndId);

		        }

//	        if (customerId != null && !customerId.isEmpty()) {
//	            // Create or get the existing session
//	            HttpSession session = request.getSession();
//	            session.setAttribute("customerId", customerId);
//	            dispatcher = request.getRequestDispatcher("/AccountNumberGenerator.jsp");
//	            dispatcher.forward(request, response);
//	        } else {
//	            // Redirect to an error page or back to the search page if customerId is missing
//	            response.sendRedirect("error.jsp");
//	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
