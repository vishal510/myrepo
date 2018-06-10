package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s3url")
public class Servlet3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=null;
		PrintWriter pw=null;
		HttpSession ses=null;
		ServletContext sc=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read and dispaly req attr(result) value
		pw.println("<b>(Servlet3) request attribute result value:: "+req.getAttribute("result"));
		//read and display ses attr(result) values
		ses=req.getSession();
		pw.println("<br><b>(Servlet3) ses attribute ses user value:: "+ses.getAttribute("user"));
		 //read and display ServletContext attribute value
		 sc=getServletContext();
		 pw.println("<br><b>(Servlet3) ServletContext attribute  value:: "+sc.getAttribute("reqCount"));
		 
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           doGet(req,res);
	}

}
