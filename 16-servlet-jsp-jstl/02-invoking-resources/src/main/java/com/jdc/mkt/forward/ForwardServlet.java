package com.jdc.mkt.forward;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet{

	private static final long serialVersionUID = -7861251969417153917L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("date", LocalDate.now());
		var dispatcher = req.getRequestDispatcher("./toForward");
		dispatcher.forward(req, resp);
	}
}
