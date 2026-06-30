package com.jdc.mkt.controller;

import java.io.IOException;

import com.jdc.mkt.dto.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/savePerson","/clear"})
public class PersonController extends HttpServlet{

	private static final long serialVersionUID = 7669656647235576985L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var session = req.getSession();
		session.invalidate();
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var name = req.getParameter("name");
		var age = Integer.parseInt(req.getParameter("age"));
		
		var session = req.getSession(true);
		session.setAttribute("person", new Person(name,age));
		
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
