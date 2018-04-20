package rjt.bean;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter{

	public MyFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(request,response);
		long after = System.currentTimeMillis();
		String name = "";
		if(request instanceof HttpServletRequest) {
			name = ((HttpServletRequest) request).getRequestURI();
		}
		request.getServletContext().log(name +":"+ (after - before) + "ms");
		
	}

}
