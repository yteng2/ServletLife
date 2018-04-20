package rjt.server;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;
@WebFilter(urlPatterns = {"/*"})
public class PerformanceFilter implements Filter{
Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		LocalDateTime time = LocalDateTime.now();
		arg2.doFilter(arg0, arg1);
		LocalDateTime time1 = LocalDateTime.now();
		int d = Duration.between(time, time1).getNano();
		logger.info("time taken to process request is " +d+" s");
	}
	
	
}
