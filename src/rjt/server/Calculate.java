package rjt.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rjt.bean.JdbcService;

/**
 * Servlet implementation class Calculate
 */
@WebServlet("/Calculate")
public class Calculate extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("consumerNumber"));
		int consumerNumber = Integer.valueOf(request.getParameter("consumerNumber"));
		int lastMonth = Integer.valueOf(request.getParameter("lastMonthNumber"));
		int currentMonth = Integer.valueOf(request.getParameter("currentMonthNumber"));
		int unitComsumed = lastMonth - currentMonth;
		double newAmount = unitComsumed*1.15 + 100;
		JdbcService service = (JdbcService) getServletContext().getAttribute("service");
		boolean result = service.saveBill(consumerNumber, currentMonth, unitComsumed, newAmount);
		response.getWriter().write("result is" + result);
	}

}
