package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	 private static final String INSERT_QUERY="INSERT INTO HIDDEN_PERSON_TAB(PNAME,FNAME,MS,F2T1,F2T2) VALUES(?,?,?,?,?)";
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  PrintWriter pw=null;
		  String name=null,fname=null,ms=null;
		  String f2val1=null, f2val2=null;
		  Connection con=null;
		  PreparedStatement ps=null;
		  int result=0;
		//general setting
		  pw=res.getWriter();
		  res.setContentType("text/html");
		//read form2/req2 data data
		  f2val1=req.getParameter("f2t1");
		  f2val2=req.getParameter("f2t2");
		  //read form1/req1 data from hidden boxes (Session tracking)
		  name=req.getParameter("hname");
		  fname=req.getParameter("hfname");
		  ms=req.getParameter("hms");
		  
		  //write form1/req1 and form2/req2 data to db table as record
		  try{
			  //register jdbc driver
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  //establish the connection
			  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishal","tetrasoft");
			  //Create PreparedStatement object
			  ps=con.prepareStatement(INSERT_QUERY);
			  //set values to query params
			  ps.setString(1,name);
			  ps.setString(2,fname);
			  ps.setString(3,ms);
			  ps.setString(4,f2val1);
			  ps.setString(5,f2val2);
			  //execute the Query
			  result=ps.executeUpdate();
			  //process the ResultSEt
			  if(result==0)
				  pw.println("<br> <h1> Record not inserted </h1>");
			  else
				  pw.println("<br> <h1> Record  inserted </h1>");
		  }//try
		  catch(SQLException se){
			  se.printStackTrace();
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
		  finally{
			  //close jdbc objs
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
		  
		  
		  //display form1/req1 and form2/req2 data
		  pw.println("<br><b> form1/req1 data:"+name+"...."+fname+" ..."+ms);
		  pw.println("<br><b> form2/req2 data:"+f2val1+"...."+f2val2);
		  //add hyperlink
		  pw.println("<br><a href='form.html'> home</a>");
		  //close stream
		  pw.close();
	}//doGet(-,-)
	@Override
 	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         doGet(req,res);
	}//doPost(-,-)
}//class
