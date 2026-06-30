package com.jdc.mkt.redirect;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static com.jdc.mkt.util.HtmlGeneartor.*;

@WebServlet(urlPatterns = "/toRedirect")
public class ToRedirectServlet extends HttpServlet{

	private static final long serialVersionUID = -4123553385898210180L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var isAlive = (Boolean) req.getAttribute("isAlive");
		
		resp.getWriter()
		.append(getHtmlHeader())
		.append("<p class='text-danger'>")
		.append("Is Alive ::: "+((null!=isAlive)?"Old Request":"New Request"))
		.append("</p>")
		.append(getHtmlFooter());
	}
}
