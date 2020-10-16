package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Dog;
import bean.Emp;

@WebServlet(urlPatterns = "/emp")
public class EmpServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		double salary = Double.parseDouble(req.getParameter("salary"));
		String dogName = req.getParameter("dogName");

		Dog dog = new Dog();
		dog.setDogName(dogName);

		Emp e = new Emp();
		e.setName(name);
		e.setAge(age);
		e.setSalary(salary);
		
		e.setDog(dog);

		req.setAttribute("EMP", e);

		req.getRequestDispatcher("/pages/emp4.jsp").forward(req, resp);

	}

}
