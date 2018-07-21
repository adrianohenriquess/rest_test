package com.example.rest_test.cdi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GoldilocksServlet", urlPatterns = { "/GoldilocksServlet" })
public class GoldilocksServlet extends HttpServlet {

	private static final long serialVersionUID = -4940933175649128113L;

	@Inject
	private Bed bed3;

	@Inject
	@Comfort("firm")
	private Bed bed1;

	private Bed bed2;

	@Inject
	@Comfort("yielding")
	public void initializeBed(Bed bean) {
		this.bed2 = bean;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Goldilocks and the CDI beans</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div align='center'>");
			out.println("<h2>Hello Servlet using three CDI beans</h2>");
			out.println("<img width = '80' height='80' src='Goldilocks.jpg'></img>");
			out.println("<p>");
			out.println("Goldilocks tried the first bed, but it was " + bed1.tryIt() + ".<br><br>");
			out.println("Goldilocks tried the second bed, but it was " + bed2.tryIt() + ".<br><br>");
			out.println("Goldilocks tried the third bed, and it was " + bed3.tryIt() + ".<br><br>");
			out.println("</p>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
