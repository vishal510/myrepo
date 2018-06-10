package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ConPoolServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String tabName = null;
		ResultSetMetaData rsmd = null;
		PreparedStatement ps = null;
		int colCnt = 0;

		pw = res.getWriter();
		res.setContentType("text/html");
		tabName = req.getParameter("table");
		try {
			con = makeConnection();
			//makeConnection();
			st = con.createStatement();
			rs = st.executeQuery("select  * from "+tabName);
			rsmd = rs.getMetaData();
			colCnt = rsmd.getColumnCount();
			pw.println("<tabe println( = '1'bgcolor='red'>");
			pw.println("<tr bgcolor='cyan'>");
			for (int i=1;i<=colCnt;++i) {
			pw.println("<td>"+rsmd.getColumnLabel(i)+"</td>");
			 }
			pw.println("</tr>");
			while(rs.next()) {
				pw.println("<tr>");
				for (int i=1;i<=colCnt;++i) {
					pw.println("<td>"+rs.getString(i)+"</td>");
				}
					pw.println("</tr>");
			}
					pw.println("</table>");
					pw.println("<br><a href='input.html'>Try Again</a>");
					rs.close();
					st.close();
					con.close();
					
				}//try
			catch(Exception e) {
				pw.println("<b><center>internal problem</center></b>");
				pw.println("<br><a href='input.html'>Try Again</a></br>");
			}
			pw.close();
				
			}// doGet(-,-);

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	private Connection makeConnection() {
		Connection con = null;
		InitialContext ic = null;
		DataSource ds = null;
		try {
			ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
			con = ds.getConnection();
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
