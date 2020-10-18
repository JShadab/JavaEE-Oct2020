package p2;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5
		* 5, location = "C:\\tmp")

@WebServlet(urlPatterns = "/upload")
public class UploadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// String uploadPath = getServletContext().getRealPath("") + "doc";

		String uploadPath = "C:\\Users\\Shadab\\Desktop\\web-app\\demo4\\WebContent\\doc";

		File uploadDir = new File(uploadPath);

		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		
		for (Part part : req.getParts()) {
			String fileName = getFileName(part);
			part.write(uploadPath + File.separator + fileName);
		}

		resp.getWriter().print("File successfully write");

	}

	private String getFileName(Part part) {
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename"))
				return content.substring(content.indexOf("=") + 2, content.length() - 1);
		}
		return "NA";
	}
}
