package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String pVal = null;
		String pwd = null;
		String rtpwd = null;
		int age = 0;
		pw = res.getWriter();
		// set content Type
		res.setContentType("text/html");
		// get system date
		pVal = req.getParameter("s1");
		if (pVal == null) {
			pwd = req.getParameter("pwd");
			rtpwd = req.getParameter("rtpwd");
			if (pwd.equals(rtpwd)) {
				pw.println("<h1 style='color:green'>Both password match</h1>");
			} else {
				pw.println("<h1 style='color:blue'>Both password did not match</h1>");
			}
		} else {
			pw.println("<h1 style='color:green'>the form data is(form submission)</h1>");
			pw.println("<br>name=" + req.getParameter("user"));
			pw.println("<br>password=" + req.getParameter("pwd"));
			pw.println("<br>retype password=" + req.getParameter("rtpwd"));
			pw.println("<br>age=" + req.getParameter("age"));
			pw.println("<br>address=" + req.getParameter("address"));
		}
		pw.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
