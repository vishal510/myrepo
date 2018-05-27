package com.nt.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LcTestServlet extends HttpServlet{
	static {
		System.out.println("LcTestServlet:static block");
	}
	public LcTestServlet() {
		System.out.println("LcTestServlet:0 param constructor");
	}
	public void init(ServletConfig cg) {
		System.out.println("LcTestServlet:init(ServletConfig)");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		System.out.println("LcTestServlet:service(-,-)");
	//PrintWriter pw= null;
		res.setContentType("test/text");
	PrintWriter pw = res.getWriter();
	Date d = new Date();
	pw.println("<b><i><center>Date and Time is "+d+"</b></i></center>");
	pw.close();
	}
	public void destroy() {
		System.out.println("LcTestServlet:destroy()");
	}
	

}
