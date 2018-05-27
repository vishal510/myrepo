package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcelServlet extends HttpServlet {
	static {
		System.out.println("ExcelServlet:static block");
	}

	public ExcelServlet() {
		System.out.println("ExcelServlet:0-param constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ExcelServlet:init(ServletConfig)");
		super.init(config);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ExcelServlet");
		PrintWriter pw = null;
		pw = resp.getWriter();
		resp.setContentType("text/vnd.ms-excel");
		pw.println("<table border='1'align='center'>");
		pw.println("<tr><th>IPL TEAM</th><th>CAPTAIN</th></tr>");
		pw.println("<tr><td>RCB</td><td>KOHLI</td></tr>");
		pw.println("<tr><td>MI</td><td>ROHIT</td></tr>");
		pw.println("<tr><td>KKR</td><td>DK</td></tr>");
		pw.println("<tr><td>CSK</td><td>DHONI</td></tr>");
		pw.println("<tr><td>SRH</td><td>WILLIAMSON</td></tr>");
		pw.println("<tr><td>KXI</td><td>ASHWIN</td></tr>");
		pw.println("<tr><td>RR</td><td>RAHANE</td></tr>");
		pw.println("<tr><td>DD</td><td>PANT</td></tr>");
		pw.println("</table>");
		pw.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("ExcelServlet:destroy method");
		super.destroy();
	}
}
