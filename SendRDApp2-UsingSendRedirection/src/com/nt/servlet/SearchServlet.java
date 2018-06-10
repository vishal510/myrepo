package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchurl")
public class SearchServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String ss=null;
		String engine=null;
		String url=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data
		ss=req.getParameter("ss");
		engine=req.getParameter("engine");
		//prepare URL with query string based on the search engine we
		//choose.
		if(engine.equalsIgnoreCase("google")){
			url=" https://www.google.co.in/search?q="+ss;
		}
		else if(engine.equalsIgnoreCase("bing")){
			url="https://www.bing.com/search?q="+ss;
		}
		else{
			url="https://in.search.yahoo.com/search?p="+ss;
		}
		//perform SendRedirection
		pw.println("<b>SearchSErvlet:: before res.sendRedirect(-)");
		System.out.println("SearchServlet:: before res.sendRedirect(-)");
		res.sendRedirect(url);
		RequestDispatcher rd=req.getRequestDispatcher("/abc.html");
		rd.include(req,res);
		System.out.println("SearchServlet:: after res.sendRedirect(-)");
		pw.println("<b>SearchSErvlet:: after res.sendRedirect(-)");
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}//doPost(-,-)
}//class
