package com.onlineteststart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Thanks
 */
@WebServlet("/Thanks")
public class Thanks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thanks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String username = request.getParameter("username");
		
		PrintWriter out = response.getWriter();
	    HttpSession session = request.getSession();
	    String username= (String)session.getAttribute("uname");
	    if(username==null) {
	    	response.sendRedirect("index.html");
	    }
	  //  String username= (String)session.getAttribute("uname");
	    java.util.Date startTime = (java.util.Date) session.getAttribute("startTime");
	    out.println("<h1>Thank you very much, " + username+ "for taking the test");
	    out.println("<h1>Test taken by " + username+ "on:"+startTime);
		out.println("<h1>Thanks for taking the test");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
