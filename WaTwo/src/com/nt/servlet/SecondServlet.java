package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		pw = res.getWriter();
		res.setContentType("text/html");
		int no = 0;
		int cube = 0;
		no = Integer.parseInt(req.getParameter("no"));
		cube = no*no*no;
		pw.println("<br>Second Servlet cube::"+cube);
		
	//	pw.close();
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
