package com.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserHomePageServlet {

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>User Home Page</h1>");
		out.print("<h2>This is User home page</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
