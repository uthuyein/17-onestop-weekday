package com.jdc.mkt.hello;

import java.io.IOException;

import com.jdc.mkt.dto.Data;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info",initParams = {
		@WebInitParam(name = "name",value = "Andrew"),
		@WebInitParam(name = "age",value = "25")
})
public class InformationServlet extends HttpServlet{

	private static final long serialVersionUID = -4663039526118639408L;

	private static final String Header = """		
										<!DOCTYPE html>
										<html>
										<head>
										<meta charset="UTF-8">
										<title>Information</title>
										</head>
										<body>					
										""";
	
	private static final String Footer = """
										</body>
										</html>
										""";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("data", new Data("data1", 20));
		
//		Http reqest
		var headers = req.getHeaderNames();
		while(headers.hasMoreElements()) {
			var header = headers.nextElement();
			System.out.println(header +" : "+req.getHeader(header));
		}
		
//		Http Servlet
		var inits = getInitParameterNames();
		while(inits.hasMoreElements()) {
			var init = inits.nextElement();
			System.out.println(init+" : "+getInitParameter(init));
		}
		
//		Http parameter
		var paramValue = req.getParameter("pName");
		
//		Http Get Attribute
		Data data = (Data) req.getAttribute("data");
		
		resp.getWriter()
		.append(Header)
		.append("""
				<h1> Servlet Information </h1>
				<p>Param value : %s</p>
				<p>Attribute value : %s</p>
				<p> <a href='./'>Home </a><p>
				""".formatted(paramValue, data.name()+" : "+data.count()))
		.append(Footer);
		
		
	}
}
