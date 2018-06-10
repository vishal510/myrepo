package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try{PrintWriter pw = null;
		pw = res.getWriter();
		res.setContentType("text/html");
		int no = 0;
		int square = 0;
		no = Integer.parseInt(req.getParameter("no"));
		square = no*no;
		pw.println("<br>First Servlet square::"+square);
		ServletContext localcontext = getServletContext();
		ServletContext localcontext1 = localcontext.getContext("/WaTwo");
		RequestDispatcher rd = localcontext1.getRequestDispatcher("/s2url");
		rd.include(req, res);
		pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
