package com.nt.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBServlet extends HttpServlet {
	Connection con;
	PreparedStatement ps;

	@Override
	public void init() throws ServletException {
		try {
			ServletConfig cg = getServletConfig();
			String s1 = cg.getInitParameter("driver");
			String s2 = cg.getInitParameter("dburl");
			String s3 = cg.getInitParameter("dbuser");
			String s4 = cg.getInitParameter("dbpwd");
			Class.forName(s1);
			System.out.println("class loaded");
			con = DriverManager.getConnection(s2,s3,s4);
			System.out.println("coonnection is ready");
			System.out.println("Output is ready on browser");

			ps = con.prepareStatement("select empno,ename,job,sal from emp where empno=?");
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}// init()

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			int no = Integer.parseInt(req.getParameter("eno"));
			// System.out.println("eno:"+no);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pw.println("<br>Employee eno:" + rs.getInt(1));
				pw.println("<br>Employee name:" + rs.getString(2));
				pw.println("<br>Employee job:" + rs.getString(3));
				pw.println("<br>Employee salary:" + rs.getFloat(4));
			} // if
			else {
				pw.println("<br>No Employee Found");
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}// doGet

	/*
	 * @Override public void doPost(HttpServletRequest req, HttpServletResponse res)
	 * throws ServletException, IOException {
	 * 
	 * doGet(req, res); }// doPost
	 */
	public void destroy() {
		try {
			if (ps != null)
				ps.close();
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (con != null)
				con.close();
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}// destroy

}// class
