package com.collegeadmission.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.ApplicationStatusImpl;
import com.collegeadmission.model.ApplicationStatus;

/**
 * Servlet implementation class ViewAllApplicationStatus
 */
@WebServlet("/viewAllApplicationStatus")
public class ViewAllApplicationStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllApplicationStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationStatusImpl appstat = new ApplicationStatusImpl();
		try {
			List<ApplicationStatus> appstatus = appstat.showAppStatus();
			HttpSession session = request.getSession();
			session.setAttribute("applicationstatus", appstatus);
			response.sendRedirect("viewAllApplicationStatus.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
