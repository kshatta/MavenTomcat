package com.shatta;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import java.util.Locale;

@WebServlet("/view")
public class KhalilServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Get QueryString value
		String name = request.getParameter("name");
		if(name == null){
			name = "";
		}
		
		// output greeting
		response.getWriter().println("Hello  " + name + " from KhalilServlet.class");
		response.getWriter().println("This is a demo on how we can run JavaServlet using Maven, Jenkins and deploy it on Apache Tomcat");
		response.getWriter().println("Thanks for visiting. Khalil Shatta");
	}

}





