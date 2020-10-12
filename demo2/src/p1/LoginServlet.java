package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.EmployeeDAO;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		boolean isLoginOK = EmployeeDAO.isAuthenticated(email, password);

		if (isLoginOK) {
			
			HttpSession newSession = req.getSession();
			req.getRequestDispatcher("/payment").forward(req, resp);
			
		} else {
			resp.getWriter().print("Login Failed");
		}
	}

}
