package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/movie")
public class MovieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String[] movies = { "DDLJ", "Bala", "LaxmiBomb", "Toilet Ek Prem Katah", null };

		req.setAttribute("movies", movies);

		req.getRequestDispatcher("/web/movies.jsp").forward(req, resp);

	}

}
