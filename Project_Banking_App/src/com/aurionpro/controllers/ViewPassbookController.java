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
import com.aurionpro.data.TransactionDbUtil;
import com.aurionpro.entity.Transaction;

@WebServlet("/ViewPassbookController")
public class ViewPassbookController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TransactionDbUtil transactionDbUtil = null;
    private CustomerDbUtil customerDbUtil = null;

    public ViewPassbookController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Passbook controller is being called");
       
        HttpSession session = request.getSession(false);
        transactionDbUtil = new TransactionDbUtil();
        customerDbUtil = new CustomerDbUtil();
        transactionDbUtil.connectToDb();
//        Object customerIdnew = session.getAttribute("customerId");
//        System.out.println(customerIdnew);
        
        
        Integer customerIdObj = (Integer)session.getAttribute("customerId") ;
        System.out.println("cusetomer id  is " +customerIdObj);
//        int customerId = customerIdObj;
//        
//        int accountNumber = customerDbUtil.getAccountNumberFromCustomerId(customerId);
//        System.out.println(accountNumber);
        
//        Integer customerId = (Integer) session.getAttribute("customerId");
//        System.out.println(customerId);
        
        
        int accountNumber = customerDbUtil.getAccountNumberFromCustomerId(customerIdObj);
        System.out.println("accountnnumber is " +accountNumber);
        

        // Fetch the list of transactions from the database
        List<Transaction> passbook = transactionDbUtil.getPassbook(accountNumber);

        // Set the transaction list as a request attribute
        request.setAttribute("passbook", passbook);

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewPassbook.jsp");
        dispatcher.forward(request, response);
        System.out.println(passbook);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}


