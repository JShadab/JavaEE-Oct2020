package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/second")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		out.print("Hello From Second Servlet, Hi SendRedirect");

		out.print("<br>");

//		out.print(req.getClass().getName());
//
//		out.print("<br>");
//
//		out.print(resp.getClass().getName());
//		out.print("<br>");

		out.print("Hello From Second Servlet");

	}

}
