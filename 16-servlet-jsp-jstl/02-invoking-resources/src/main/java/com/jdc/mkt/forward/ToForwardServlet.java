package com.jdc.mkt.forward;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import static com.jdc.mkt.util.HtmlGeneartor.*;

@WebServlet(urlPatterns = "/toForward")
public class ToForwardServlet extends HttpServlet{

	private static final long serialVersionUID = -7861251969417153917L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var date = (LocalDate) req.getAttribute("date");
		var data = req.getParameter("data");
		resp.getWriter()
		.append(getHtmlHeader())
		.append("<p class='text-danger'>")
		.append("Today is :"+date)
		.append("</p>")
		.append("<p> Parameter ::: ")
		.append(data+"</p>")
		.append(getHtmlFooter());
	}
}
