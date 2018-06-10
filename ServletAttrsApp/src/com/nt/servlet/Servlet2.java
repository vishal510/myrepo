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

@WebServlet("/s2url")
public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=null;
		PrintWriter pw=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		HttpSession ses=null;
		ServletContext sc=null;
		
		//read and dispaly req attr(result) value
				pw.println("<b>(Servlet2) request attribute ses result value:: "+req.getAttribute("result"));
         //read and display Session attribute value				
			ses=req.getSession();
		pw.println("<br><b>(Servlet2) ses attribute ses user value:: "+ses.getAttribute("user"));
		 //read and display ServletContext attribute value
		 sc=getServletContext();
		 pw.println("<br><b>(Servlet2) ServletContext attribute  value:: "+sc.getAttribute("reqCount"));
		 
		
		
		
		//forward request to SErvlet2 comp
		rd=req.getRequestDispatcher("/s3url");
		rd.forward(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           doGet(req,res);
	}

}
