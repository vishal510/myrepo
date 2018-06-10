//DBServlet.java
package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.sql.*;

public class DBServlet extends HttpServlet
{
	private static final String  GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		 PrintWriter  pw=null;
		 int no=0;
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 ServletConfig cg=null;
		 String driver=null,url=null,user=null,pwd=null;
		 ServletContext sc=null;
          //general settings
		  pw=res.getWriter();
  		 res.setContentType("text/html");
/*		 //get Access to ServletConfig object
		 cg=getServletConfig();
*/		 //get Access to SErvletContext object
  		 sc=getServletContext();
		 //read Servlet Context param values
		 driver=sc.getInitParameter("driver");
		 url=sc.getInitParameter("url");
		 user=sc.getInitParameter("dbuser");
         pwd=sc.getInitParameter("dbpwd");
		 try{
		  //read form data
           no=Integer.parseInt(req.getParameter("eno"));
		   //register JDBC driver s/w
		   Class.forName(driver);
		   //establish the connection
           con=DriverManager.getConnection(url,user,pwd);
		   //create PreparedStatement object
		   ps=con.prepareStatement( GET_EMP_DETAILS_BY_NO);
		   //set value to query param
		   ps.setInt(1,no);
		   //execute the Query
		   rs=ps.executeQuery();
		   //process  the ResultSet
		   pw.println("<h1 style='color:cyan'>Emloyee Details are </h1>");
		   if(rs.next()){
			   pw.println("<b> emloyee number :: </b>"+rs.getInt(1));
			   pw.println("<b> employee name :: </b>"+rs.getString(2));
			   pw.println("<b> employee job :: </b>"+rs.getString(3));
			   pw.println("<b> employee salary :: </b>"+rs.getInt(4));
		   }
		   else{
                 pw.println("<h1 style='color:red'>Employee not found</h1>");
		   }
			cg=getServletConfig();
			sc=getServletContext();
			pw.println("<br>p1 init param value::"+cg.getInitParameter("p1"));
			pw.println("<br>dbuser context param value::"+sc.getInitParameter("dbuser"));
			
			
			//close stream
		 }//try
		 catch(SQLException se){
			 se.printStackTrace();
		 }
		 catch(ClassNotFoundException cnf){
			 cnf.printStackTrace();
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 finally{
			 try{
				 if(rs!=null)
					 rs.close();
			 }
			 catch(SQLException se){
				 se.printStackTrace();
			 }
			  try{
				 if(ps!=null)
					 ps.close();
			 }
			 catch(SQLException se){
				 se.printStackTrace();
			 }
			  try{
				 if(con!=null)
					 con.close();
			 }
			 catch(SQLException se){
				 se.printStackTrace();
			 }
		 }//finally
		 //add hyperlink
           pw.println("<br><a href='input.html'>home </a>");
		   //close stream
		   pw.close();
	}//doGet(-,-)

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		  doGet(req,res);
	}//doPost(-,-)


}//class