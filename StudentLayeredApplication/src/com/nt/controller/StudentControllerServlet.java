package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentControllerServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentVO vo = null;
		String sno = null,sname = null, m1 = null,m2 = null,m3 = null; 
		StudentDTO dto = null;
		StudentService service = null;
		String result = null;
		PrintWriter pw = null;
				
		pw = res.getWriter();
		res.setContentType("text/html");
		
		//read form data
		sno = req.getParameter("sno");
		sname = req.getParameter("sname");
		m1 = req.getParameter("m1");
		m2 = req.getParameter("m2");
		m3 = req.getParameter("m3");
		//create vo class object having form data
		
		vo = new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		//convet vo class object to dto class object
		dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(sname);
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service class
		service = new StudentService();try {
		result = service.generateResult(dto);
		}catch (Exception e) {
			e.printStackTrace();
		}
		pw.println("<h1>Result"+result+"</h1>");
      	pw.println("<a href= 'form.html'>home</a>");
      	pw.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
