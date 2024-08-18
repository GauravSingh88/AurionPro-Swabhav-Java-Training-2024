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
import com.aurionpro.entity.Customer;


/**
 * Servlet implementation class ViewCustomersController
 */
@WebServlet("/ViewCustomersController")
public class ViewCustomersController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDbUtil customerDbUtil = null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomersController() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher dispatcher = null;

        customerDbUtil = new CustomerDbUtil();
        customerDbUtil.connectToDb();

        // Fetch the list of customers from the database
        List<Customer> customers = customerDbUtil.getAllCustomers();

        // Set the customer list as a request attribute
        request.setAttribute("customers", customers);

        // Forward the request to the JSP page
        dispatcher = request.getRequestDispatcher("ViewCustomers.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
