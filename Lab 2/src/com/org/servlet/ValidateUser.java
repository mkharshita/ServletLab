package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ValidateUser() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String unm=request.getParameter("Uname");
		String pwd=request.getParameter("pwd");
		if((unm.equals("Harshita"))&&(pwd.equals("root123"))) {
			RequestDispatcher rdValid=request.getRequestDispatcher("/Success.html");
			rdValid.forward(request, response);
	}
	else {
        out.print("Sorry username or password error");  
		RequestDispatcher rdFail=request.getRequestDispatcher("/Login.html");
		rdFail.include(request, response);
	}
	}
}
