package com.nt.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		ServletConfig cg=null;
		ServletContext sc=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read init param values
		cg=getServletConfig();
		sc=getServletContext();
		pw.println("<br>p1 init param value::"+cg.getInitParameter("p1"));
		pw.println("<br>p1 context param value::"+sc.getInitParameter("p1"));
		pw.println("<br>dbuser context param value::"+sc.getInitParameter("dbuser"));
		
		pw.println("<br> ServletConfig obj class name::"+cg.getClass());
		pw.println("<br> ServletContext obj class name::"+sc.getClass());
		
		pw.println("<br> our serlvet logical name::"+cg.getServletName());
		pw.println("<br> server info::"+sc.getServerInfo());
		pw.println("<br> servlet api version::"+sc.getMajorVersion()+"."+sc.getMinorVersion());
		pw.println("<br> Context path ::"+sc.getContextPath());
		pw.println("<br> MIME type of input.html::"+sc.getMimeType("/input.html"));
		pw.println("<br> Path of input.html::"+sc.getRealPath("/input.html"));
		pw.println("<br> path of web app root folder::"+sc.getRealPath("/"));
		//write log messages
		sc.log("hello,how are u ?"+new Date());
		InputStream is=sc.getResourceAsStream("/input.html");
		int k=0;
		while((k=is.read())!=-1){
			System.out.print(((char)k));
		}
			
		
		//close stream
		pw.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}
}
