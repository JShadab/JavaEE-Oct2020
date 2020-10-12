package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		RequestDispatcher rd = req.getRequestDispatcher("/second");
//		rd.forward(req, resp);

		//resp.sendRedirect("/demo2/second");
		resp.sendRedirect("http://google.com");

		// HttpServletRequest req1= new HttpServletRequestWrapper(req);
		// HttpServletResponse resp1= new HttpServletResponseWrapper(resp);

		// PrintWriter out = resp.getWriter();
		// out.print("Hello From First Servlet");
	}

}
