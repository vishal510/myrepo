package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null,fname=null,ms=null;
		int age=0;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form1/req1 data
		name=req.getParameter("pname");
		fname=req.getParameter("fname");
		age=Integer.parseInt(req.getParameter("page"));
		ms=req.getParameter("ms");
		if(ms==null)
			 ms="single";
		//generate form2 dynamically  based on the marital status..
		if(ms.equalsIgnoreCase("married")){
			pw.println("<form action='secondurl' method='POST'><br>");
			pw.println("Spouse name :: <input type='text' name='f2t1'><br>");
			pw.println("No.of kids :: <input type='text' name='f2t2'><br>");
			pw.println("<input type='submit' value='submit'>");
			pw.println("</form>");
		}
		else{
			pw.println("<form action='secondurl' method='POST'><br>");
			pw.println("when do u want to marry :: <input type='text' name='f2t1'><br>");
			pw.println("why do u want to marry  :: <input type='text' name='f2t2'><br>");
			pw.println("<input type='submit' value='submit'>");
			pw.println("</form>");
		}
		
		//close stream
		pw.close();
	}//method
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      doGet(req,res);
	}
}//class
