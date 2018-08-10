package com.onlineteststart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String userName;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			PrintWriter out = response.getWriter();
			boolean alreadyVisited = false;
			response.setContentType("text/html");
			//retrieve all the cookies
			Cookie []allCookie = request.getCookies();
			
			//printing all cookie
			if(allCookie != null)
			{
				for(int i=0;i<allCookie.length;i++)
				{
		           //out.println("<h3>Cookie Name : "+allCookie[i].getName()+
				//" Cookie Value : "+allCookie[i].getValue());
		           if(allCookie[i].getName().equals(username))
		           {
		        	   alreadyVisited=true;
		        	   break;
		           }
				}
			}
			else
			{
				out.println("No Cookie found");
			}
			
			java.util.Date startDateTime = new java.util.Date();
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			session.setAttribute("startTime", startDateTime);
			
			
			if(alreadyVisited)
			{
				out.println("<h1>You have already Visited the website :"+username);
			}
			else
			{
				out.println("<h1>Welcome First Time Visitor:"+username);
				Cookie cookie = new Cookie(username, username);
				response.addCookie(cookie);
			}
				
			
			
			
			
			out.println("<h1><br/><br/> <a href=start.html>Start Test</a>");
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
