package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
//import java.sql.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, res);

		PrintWriter pw = null;
		String link = null;
		Locale locales[] = null;
		pw = res.getWriter();
		res.setContentType("text/html");
		link = req.getParameter("s1");
		if (link.equalsIgnoreCase("link1")) {
			locales = Locale.getAvailableLocales();
			for (Locale lc : locales) {
				pw.println(lc.getDisplayLanguage() + "<br>");
			}
		}//if
			else if(link.equalsIgnoreCase("link2")) {
				locales = Locale.getAvailableLocales();
				for(Locale lc:locales) {
					pw.println(lc.getDisplayCountry()+"<br>");
				}
			}
		 else {
			pw.println("Date and Time:" + new Date());
		}
		pw.println("<a href='page.html'>home</a>");

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
}
