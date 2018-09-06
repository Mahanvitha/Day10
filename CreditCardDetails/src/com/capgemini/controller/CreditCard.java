package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/creditCardDetails")
public class CreditCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CreditCard() {
        super();
     
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String accountNumber=request.getParameter("accountNumber");
		String cvv=request.getParameter("cvv");
	    String yy=request.getParameter("yy");
	    String mm=request.getParameter("mm");
	    out.println("<h3>account number: "+accountNumber+"<br>yy/mm :"+yy+"/"+mm+"</h3>");
	    out.close();
	}

}
