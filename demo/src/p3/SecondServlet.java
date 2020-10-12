package p3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("EMAIL");

		ServletContext context = getServletContext();
		String phone = context.getInitParameter("PHONE");

		PrintWriter out = resp.getWriter();

		out.print("Admin Email is: " + email);
		out.print("<br>");
		out.print("Admin Phone is: " + phone);
	}

}
