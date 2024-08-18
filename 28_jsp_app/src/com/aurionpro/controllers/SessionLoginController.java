package com.aurionpro.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLoginController")
public class SessionLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SessionLoginController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        String username = request.getParameter("username");
        
        // Create or get the existing session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        
        PrintWriter writer = response.getWriter();
        writer.print("<form action='SessionPasswordController' method='post'> ");
        writer.print("Password: <input type='text' name='password'>");
        writer.print("<button>go</button></form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
