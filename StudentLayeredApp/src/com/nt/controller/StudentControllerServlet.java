package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceImpl;
import com.nt.vo.StudentVO;

public class StudentControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   PrintWriter pw=null;
		   String sno=null;
		   String name=null;
		   String m1=null,m2=null,m3=null;
		   StudentVO vo=null;
		   StudentDTO dto=null;
		   StudentService service=null;
		   String result=null;
		  //general settings
		   pw=res.getWriter();
		   res.setContentType("text/html");
		   //read form data
		   sno=req.getParameter("sno");
		   name=req.getParameter("sname");
		   m1=req.getParameter("m1");
		   m2=req.getParameter("m2");
		   m3=req.getParameter("m3");
		   //Store Form data into StudentVO class object
		   vo=new StudentVO();
		   vo.setSno(sno); vo.setSname(name); vo.setM1(m1);
		   vo.setM2(m2); vo.setM3(m3);
		   //convert StudentVO class obj to StudentDTO class obj
		   dto=new StudentDTO();
		   dto.setSno(Integer.parseInt(vo.getSno()));
		   dto.setSname(vo.getSname());
		   dto.setM1(Math.round(Integer.parseInt(vo.getM1())));
		   dto.setM2(Math.round(Integer.parseInt(vo.getM2())));
		   dto.setM3(Math.round(Integer.parseInt(vo.getM3())));
		   //useService
		   service=new StudentServiceImpl();
		   try{
			   result=service.register(dto);
			   pw.println("<h1 style='color:green'>Result:::"+result+"</h1>");
		   }
		   catch(SQLException se){
			   pw.println("<h1 style='color:red'> Internal DB Problem </h1>");
		   }
		   catch(NamingException ne){
			   pw.println("<h1 style='color:red'> Internal Naming Problem </h1>");
		   }
		   catch(Exception e){
			   pw.println("<h1 style='color:red'>Unknown Internal  Problem </h1>");
		   }
		   //add hyperlink
		   pw.println("<a href='form.html'>home </a>");
		   //close stream
		   pw.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
