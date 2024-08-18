package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.TransactionDbUtil;
import com.aurionpro.entity.Transaction;

@WebServlet("/ViewTransactionsController")
public class ViewTransactionsController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TransactionDbUtil transactionDbUtil = null;

    public ViewTransactionsController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ViewTransactionsController doGet method called");
        System.out.println("inside controller trasaction");
        
        transactionDbUtil = new TransactionDbUtil();
        transactionDbUtil.connectToDb();

        // Fetch the list of transactions from the database
        List<Transaction> transactions = transactionDbUtil.getAllTransactions();

        // Set the transaction list as a request attribute
        request.setAttribute("transactions", transactions);

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewTransactionsPage.jsp");
        dispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}


//@WebServlet("/ViewTransactionsController")
//public class ViewTransactionsController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    private TransactionDbUtil transactionDbUtil = null;
//
//    public ViewTransactionsController() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        transactionDbUtil = new TransactionDbUtil();
//        transactionDbUtil.connectToDb();
//
//        // Fetch the list of transactions from the database
//        List<Transaction> transactions = transactionDbUtil.getAllTransactions();
//
//        // Set the transaction list as a request attribute
//        request.setAttribute("transactions", transactions);
//
//        // Forward the request to the new JSP page
//        RequestDispatcher dispatcher = request.getRequestDispatcher("viewTransactionsPage.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
//}

