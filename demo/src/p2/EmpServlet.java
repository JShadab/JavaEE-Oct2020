package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		String salary = req.getParameter("salary");

		String[] foods = req.getParameterValues("food");
		
		Enumeration paramNames = req.getParameterNames();
		
		while (paramNames.hasMoreElements()) {
			System.out.println(paramNames.nextElement());
		}
		
		Map map = req.getParameterMap();
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		

		PrintWriter out = resp.getWriter();

		out.println("Your Name is: " + name);
		out.println("<br>");
		out.println("Your Age is: " + age);
		out.println("<br>");
		out.println("Your Salary is: " + salary);

		for (String food : foods) {
			out.println("<br>");
			out.println("In Lunch : " + food);
		}
	}

}
