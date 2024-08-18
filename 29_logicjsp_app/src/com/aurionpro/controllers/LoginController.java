package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.UserDbUtil;


@WebServlet("/loginController")

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDbUtil userDbUtil =null;
       
  
    public LoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		userDbUtil =new UserDbUtil();
		
		
		userDbUtil.connectToDb();
		
//		if(username.equals("Swabhav") && password.equals("1234"))
//			dispatcher = request.getRequestDispatcher("/LoginSuccessful.jsp");
//		else
//			dispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
		
		if(userDbUtil.validateCredentials(username,password)) {
			dispatcher = request.getRequestDispatcher("/LoginSuccessful.jsp");
			request.setAttribute("username", username);
		}
			
		else
			dispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
		
		dispatcher.forward(request, response);
			
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
