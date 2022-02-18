package com.collegeadmission.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.impl.ApplicationDaoImpl;
import com.collegeadmission.model.ApplicationDetails;

/**
 * Servlet implementation class ViewAllApplicants
 */
@WebServlet("/viewAllApplications")
public class ViewAllApplicants extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllApplicants() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ApplicationDaoImpl showApplications = new ApplicationDaoImpl();
		List<ApplicationDetails> applicationList = new ArrayList<ApplicationDetails>();
		try {
			applicationList = showApplications.showAllApplications();
			request.setAttribute("applicationList", applicationList);
			//System.out.println(applicationList);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllApplications.jsp");
			rd.forward(request, response);
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

		ApplicationDaoImpl showApplications = new ApplicationDaoImpl();
		List<ApplicationDetails> applicationList = new ArrayList<ApplicationDetails>();
		try {
			applicationList = showApplications.showAllApplications();
			request.setAttribute("applicationList", applicationList);
			//System.out.println(applicationList);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllApplications.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
