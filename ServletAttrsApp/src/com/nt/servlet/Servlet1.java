package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s1url")
public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=null;
		HttpSession ses=null;
		ServletContext sc=null;
		//get Session obj
		ses=req.getSession();
		//create request attribute
		req.setAttribute("result","pass");
		//create Session attribute
		ses.setAttribute("user","raja");
		//create ServletContext attribute
		sc=getServletContext();
		sc.setAttribute("reqCount", 10);
		
		
		//forward request to SErvlet2 comp
		rd=req.getRequestDispatcher("/s2url");
		rd.forward(req,res);
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           doGet(req,res);
	}

}
