package com.jdc.mkt.include;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/toInclude")
public class ToIncludeServlet extends HttpServlet{

	
	private static final long serialVersionUID = -5205702919940119773L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
		.append("<h3 class='p-5'>This is from ToInclude Servlet</h3>");
	}

}
