package com.aurionpro.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionPasswordController")
public class SessionPasswordController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SessionPasswordController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the session
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            String password = request.getParameter("password");
            PrintWriter writer = response.getWriter();
            writer.print("Username : " + username + "<br>");
            writer.print("Password : " + password);
        } else {
            response.getWriter().print("Session has expired or does not exist.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
