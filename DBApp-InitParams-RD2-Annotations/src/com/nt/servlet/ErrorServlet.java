package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorurl")
public class ErrorServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ErrorServlet:: doGet(-,-)");
		PrintWriter pw=null;
		pw=res.getWriter();
		 //general settings
      pw.println("<h1 style='color:red;text-align:center'>Internal Problem .. Try Again </h1>");
     pw.println("<br><a href='input.html'>home</a>");
     pw.close();
      }
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       doGet(req,res);
       }
}//class
