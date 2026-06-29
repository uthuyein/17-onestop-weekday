package com.jdc.mkt.include;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static com.jdc.mkt.util.HtmlGeneartor.*;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{

	private static final long serialVersionUID = -2589310339089063847L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var dispatcher = req.getRequestDispatcher("./toInclude");
		resp.getWriter()
		.append(getHtmlHeader())
		.append("<h3>This is from include servlet</h3>")
		.append(getHtmlFooter());
		
		dispatcher.include(req, resp);
		
	}

}
