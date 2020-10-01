package com.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdminHomePageServlet extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Admin Home Page</h1>");
		out.print("<h2>This is Admin home page</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
	

}
