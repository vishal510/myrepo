//DBServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="db",value="/dburl",initParams={@WebInitParam(name="driver",value="oracle.jdbc.driver.OracleDriver"),
		                                                                                          @WebInitParam(name="url",value="jdbc:oracle:thin:@localhost:1521:xe"),
		                                                                                          @WebInitParam(name="dbuser",value="system"),
		                                                                                          @WebInitParam(name="dbpwd",value="manager")
                                                                                                   }
                        ) 
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
		 RequestDispatcher rd=null,rd1=null,rd2=null;
		 ServletContext sc=null;
          //general settings
		  pw=res.getWriter();
  		 res.setContentType("text/html");
		 //get Access to ServletConfig object
		 cg=getServletConfig();
		 //read Servlet Init param values
		 driver=cg.getInitParameter("driver");
		 url=cg.getInitParameter("url");
		 user=cg.getInitParameter("dbuser");
         pwd=cg.getInitParameter("dbpwd");
		 try{
		 //include header
			 rd1=req.getRequestDispatcher("/headerurl");
			 rd1.include(req,res);
			 
			 
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
		   //add hyperlink
           pw.println("<br><a href='input.html'>home </a>");
           
		   //include footer
			 rd2=req.getRequestDispatcher("/footer.html");
			 rd2.include(req,res);
		 }//try
		 catch(Exception e){
			 //forward request to ErrorServlet
			 rd=req.getRequestDispatcher("errorurl");
			 rd.forward(req,res);
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
		
		   //close stream
		   pw.close();
	}//doGet(-,-)

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		  doGet(req,res);
	}//doPost(-,-)


}//class