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
										<h1>Servlet Invoking Resources</h1>
										<ul>
											<li><a href='./include'>Include Servlet</a> </li>
											<li><a href='./forward'>Forward Servlet</a> </li>
											<li><a href='./redirect'>Redirect Servlet</a> </li>
										</ul>
										 """;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
		.append(getHtmlHeader())
		.append(content)
		.append(getHtmlFooter());
	}

}
