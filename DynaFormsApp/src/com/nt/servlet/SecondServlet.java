package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null,fname=null,ms=null;
		String age=null;
		String f2val1=null,f2val2=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form1/req1 data
		name=req.getParameter("pname");
		fname=req.getParameter("fname");
		age=req.getParameter("page");
		ms=req.getParameter("ms");
		if(ms==null)
			 ms="single";
	   //read form2/reqe data...
		f2val1=req.getParameter("f2t1");
		f2val2=req.getParameter("f2t2");
		
		pw.println("form1/req1 data:::"+name+"..."+fname+"..."+age+"..."+ms);
		pw.println("<br>form2/req2 data:::"+f2val1+"..."+f2val2);
		//add hyperlink
		pw.println("<br><a href='details.html'>home</a>");
		//close stream
		pw.close();
	}//method
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}
	
}//class
