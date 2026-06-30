package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import static com.jdc.mkt.util.HtmlGeneartor.*;

@WebServlet(urlPatterns = "/",loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1692928675339424051L;
	
	private static final String content ="""
										<div class='p-3'>
										<h1 class='text-primary'>Servlet Invoking Resources</h1>
										<ul class='navbar-nav'>
											<li class='nav-item'><a class='nav-link' href='./include'>Include Servlet</a> </li>
											<li class='nav-item'><a class='nav-link' href='./forward?data=test'>Forward Servlet</a> </li>
											<li class='nav-item'><a class='nav-link' href='./redirect'>Redirect Servlet</a> </li>
										</ul>
										</div>
										 """;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
		.append(getHtmlHeader())
		.append(content)
		.append(getHtmlFooter());
	}

}
