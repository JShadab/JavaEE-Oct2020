package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/receiver")
public class ReceiverServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = (String) req.getAttribute("name");
		String city = (String) req.getAttribute("city");

		PrintWriter pw = resp.getWriter();

		pw.print("Name: " + name + "<br>");
		pw.print("City: " + city + "<br>");

	}

}
