package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/counter",loadOnStartup = 1)
public class CounterServlet extends HttpServlet{

	private static final long serialVersionUID = -9220759513249316143L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//		Cookie
		Cookie ck = new Cookie("name","Andrew" );
		ck.setMaxAge(10);
		resp.addCookie(ck);
		
		//		Request Scope
		var c1 = (Counter)req.getAttribute("counter");
		if(null == c1) {
			c1 = new Counter();
		}
		c1.coutUp();
		req.setAttribute("counter", c1);
		
		//		Session Scope
		var session = req.getSession(true);
		var c2 = (Counter)session.getAttribute("counter");
		if(null == c2) {
			c2 = new Counter();
		}
		c2.coutUp();
		session.setAttribute("counter", c2);
		
		//		Application Scope
		var context = getServletContext();
		var c3 = (Counter)context.getAttribute("counter");
		if(null == c3) {
			c3 = new Counter();
		}
		c3.coutUp();
		context.setAttribute("counter", c3);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
