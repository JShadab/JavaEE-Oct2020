package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/payment")
public class PaymentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if (session == null) {
			//Direct Payment Servlet
			
			resp.sendRedirect("/demo2/pages/login.html");
			
		} else {
			//via Login Servlet

			PrintWriter out = resp.getWriter();

			out.print("I am Payment Servlet");
			
		}

	}

}
