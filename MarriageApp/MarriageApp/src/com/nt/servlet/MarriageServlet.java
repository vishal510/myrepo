package com.nt.servlet;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		 PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		String gen=req.getParameter("gen");
		String age=req.getParameter("age");
		int age1=Integer.parseInt(req.getParameter("age"));
		String msg=null; 
		
		if(age1<=21){
			  pw.println("<h1 style='color:red'>Mr."+name+"         u r not eligible for marriage</h1>");
		  }
		  else{
			    pw.println("<h1 style='color:green'>Mr."+name+"     u r  eligible for marriage</h1>");

		  }

			if(age1<18 ){
		
			  pw.println("<h1 style='color:red'>Miss"+name+"         u r not eligible for marriage</h1>");
		  }
		  else{
			    pw.println("<h1 style='color:green'>Miss"+name+"     u r eligible for marriage</h1>");
		  }
			
			 pw.println("<a href='input.html'></a>");
			  pw.close();
		}
		
		 
			//pw.println(<h1 style>);

	}
