package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class LoginServlet extends HttpServlet {
	private static final String   AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PASS=?";
    
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String user=null,pass=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data
		user=req.getParameter("user");
		pass=req.getParameter("pwd");
		try{
		//get Pooled Connection object
			con=getPooledConnection();
		//create JDBC PrepredStatement object
			ps=con.prepareStatement(AUTH_QUERY);
        //set values to query params
			ps.setString(1,user);
			ps.setString(2,pass);
		//execute query
			rs=ps.executeQuery();
		 //process the ResultSet
			if(rs.next()){
				count=rs.getInt(1);
			}
			if(count==0)
				pw.println("<h1 style='color:red;text-align:center'>INVALID CREDENTIALS </h1>");
			else
				pw.println("<h1 style='color:green;text-align:center'>VALID CREDENTIALS </h1>");
			
			//add hyperlink
			pw.println("<br><a href='login.html'>home </a>");
			
		}//try
		catch(SQLException se){
			se.printStackTrace();
			pw.println("<h1 style='color:red;>Internal problem </h1>");
		}
		catch(Exception e){
			e.printStackTrace();
			pw.println("<h1 style='color:red;>Internal problem </h1>");
		}
		finally{
			//close jdbc objects
			try{
				rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				ps.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				pw.close();
			}
			catch(Exception se){
				se.printStackTrace();
			}
		}//finally
		
	}//method
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	private Connection getPooledConnection()throws Exception{
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		//create InitialContext obj and get connecton with JndiRegistry
		ic=new InitialContext();
		ds=(DataSource)ic.lookup("java:/comp/env/DsJndi");
		//get con object from JDBC con pool
		con=ds.getConnection();
		return con;
	}//method
	
}//class
