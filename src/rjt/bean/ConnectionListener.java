package rjt.bean;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConnectionListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContextListener ended");	
		arg0.getServletContext().removeAttribute("service");
	}

        //Run this before web application is started
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContextListener started");	
		JdbcService service = new JdbcService();
		arg0.getServletContext().setAttribute("service", service);
	}

}
