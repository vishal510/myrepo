package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  PrintWriter pw=null;
		  String name=null,fname=null,ms=null;
		//general setting
		  pw=res.getWriter();
		  res.setContentType("text/html");
		//read form data
		  name=req.getParameter("pname");
		  fname=req.getParameter("fname");
		  ms=req.getParameter("ms");
		  //Generate form2 dynamically  based on the given marital status
		  if(ms.equalsIgnoreCase("married")){
			  pw.println("<h1 style='color:red;text-align:center'>Form2- Provide Marriage Life Details </h1>");
			  pw.println("<form action='secondurl' method='POST'>");
			  pw.println("Spouse name::<input type='text' name='f2t1'> <br>" );
			  pw.println("No.of kids::<input type='text' name='f2t2'> <br>" );
			  //add form1 data to form2 as hidden box comp values
			  pw.println("<input type='hidden' name='hname' value="+name+"><br>");
			  pw.println("<input type='hidden' name='hfname' value="+fname+"><br>");
			  pw.println("<input type='hidden' name='hms' value="+ms+"><br>");
              pw.println("<input type='submit' value='submit'>");			
              pw.println("</form>");
		  }
		  else{
			  pw.println("<h1 style='color:red;text-align:center'>Form2- Provide Marriage Life Detaisl </h1>");
			  pw.println("<form action='secondurl' method='POST'>");
			  pw.println("when do u wan to marry::<input type='text' name='f2t1'> <br>" );
			  pw.println("why do want  to marry::<input type='text' name='f2t2'> <br>" );
			  //add form1 data to form2 as hidden box comp values
			  pw.println("<input type='hidden' name='hname' value="+name+"><br>");
			  pw.println("<input type='hidden' name='hfname' value="+fname+"><br>");
			  pw.println("<input type='hidden' name='hms' value="+ms+"><br>");
              pw.println("<input type='submit' value='submit'>");			
              pw.println("</form>");
		  }
	}//method
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}//method
}//class
