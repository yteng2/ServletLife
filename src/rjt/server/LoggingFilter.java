package rjt.server;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
@WebFilter(urlPatterns = {"/Servlet1"})
public class LoggingFilter implements Filter {
	Logger logger = Logger.getLogger(this.getClass());

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		logger.info("hit controller");
		logger.debug(arg0.getLocale());
		
		HttpServletRequest obj = (HttpServletRequest)arg0;
		
		arg1.getWriter().println("hello1");
		
		logger.debug(obj.getServletPath());
		
//		arg2.doFilter(arg0, arg1);
		
		arg1.getWriter().println("hello2");
		logger.debug("request processed successfully");
	}
	
	

}
