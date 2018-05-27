package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, res);
		PrintWriter pw = null;
		String comp = null;
		int val1 = 0, val2 = 0;
		pw = res.getWriter();
		res.setContentType("text/html");
		comp = req.getParameter("s1");
		if (comp.equals("link1")) {
			pw.println("Date and time" + new Date());
		} else if (comp.equals("link2")) {
			pw.println("System properties" + System.getProperties());
		} else if (comp.equals("add")) {
			val1 = Integer.parseInt(req.getParameter("t1"));
			val2 = Integer.parseInt(req.getParameter("t2"));
			pw.println("Addition : " + (val1 + val2));
		} else if (comp.equals("sub")) {
			val1 = Integer.parseInt(req.getParameter("t1"));
			val2 = Integer.parseInt(req.getParameter("t2"));
			pw.println("Substraction : " + (val1 - val2));
		} else {
			val1 = Integer.parseInt(req.getParameter("t1"));
			val2 = Integer.parseInt(req.getParameter("t2"));
			pw.println("Multiplication : " + (val1 * val2));
		}

		pw.println("<a href='form.html'>home</a>");

	}// doGet

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}

}
