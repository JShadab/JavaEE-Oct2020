package p1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter( urlPatterns = "/payment")
public class IpFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		String ip = req.getRemoteAddr();

		
		System.out.println("I m in IP Filter: "+ip);
		
		chain.doFilter(req, resp);

	}

}
