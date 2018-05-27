package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// super.doPost(req, resp);

		PrintWriter pw = null;
		String name = null;
		String tage = null;
		String vstatus = null;
		int age = 0;
		// get PrintWriter
		pw = res.getWriter();
		// set response content type
		res.setContentType("text/html");
		// read form data from the form components of form page
		name = req.getParameter("pname");
		tage = req.getParameter("page");
		///////////System.out.println(name + "" + tage);

		vstatus = req.getParameter("vflag");// get Client side validation status
		// if (vstatus.equals("no"))// if client side validation are not done

		if (vstatus.equals("no")) {
			// server form validation logic
			if (name.equals("") || name == null || name.length() == 0)// required rule
			{
				pw.println("<font color = red>server : Person name is mandatory</font>");
				return;
			}
			if (tage.equals("") || tage == null || tage.length() == 0)// required rule
			{
				pw.println("<font color = red>server : Person age is mandatory</font>");
				return;// to check age is numeric value or not
			} else {
				try {
					// convert given age value to numeric value
					age = Integer.parseInt(tage);

				} catch (NumberFormatException nfe) {
					pw.println("<font color = red>server : Person age must be numeric value</font>");
					return;
				}
			} // else
			System.out.println("Server Side Validation Completed");
		} // if
		else {// when client side form validation are done
			try {
				age = Integer.parseInt(tage);
			} catch (NumberFormatException nfe) {
				pw.println("<font color = red>server : Person age is must</font>");

				return;

			}
		}
		// write request processing logic /B.logic
		if (age >= 18) {

			pw.println("<h1 style='color:green'>" + name + "  you are eligible for vote</h1>");
		} else {
			pw.println("<h1 style='color:red'>" + name + "  you are not eligible for vote</h1>");
			pw.println("<br><br><a href='input.html'></a>");
		}
		// close stream
		pw.close();
	}// toGet(-,-)

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("VoterServlet:doGet(-,-)");
		doPost(req, res);

		
	}// class
}
