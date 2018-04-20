package rjt.server;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rjt.bean.JdbcDao;
import rjt.bean.JdbcService;
import rjt.bean.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JdbcService service = (JdbcService) getServletContext().getAttribute("service");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] results = request.getParameterValues("skill");
		String skill = "";
		for(String result: results)
			skill += result+" ";
		String city = request.getParameter("city");
		User user = new User(fname,lname,password,gender,results,city);
		Boolean result = service.saveUser(fname, lname, password, gender, skill, city);
//			response.getWriter().write("Registration done!!!");
		if(result) {
			RequestDispatcher rd= request.getRequestDispatcher("RegisterSuccess.jsp");
			request.setAttribute("user", user);
			rd.forward(request, response);
		}
		else {
			response.getWriter().write("Registrate Failed!!!");
		}
	}

}
