package com.collegeadmission.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.ApplicationDaoImpl;
import com.collegeadmission.impl.ApplicationStatusImpl;
import com.collegeadmission.model.ApplicationDetails;
import com.collegeadmission.model.ApplicationStatus;

/**
 * Servlet implementation class InsertApplicationStatusServlet
 */
@WebServlet("/InsertApplicationStatusServlet")
public class InsertApplicationStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertApplicationStatusServlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
//			int StatusId = Integer.parseInt(request.getParameter("statusId"));
//			int UserId= Integer.parseInt(request.getParameter("userId"));
//			int ApplicationId= Integer.parseInt(request.getParameter("applicationId"));
//			int CourseId= Integer.parseInt(request.getParameter("courseId"));
//			String PaymentStatus= request.getParameter("paymentStatus");
//			String ApplicationStatus= request.getParameter("applicationStatus");
//						
//			ApplicationStatus obj = new ApplicationStatus(StatusId,UserId,ApplicationId,CourseId,PaymentStatus,ApplicationStatus);
			HttpSession session = request.getSession();
			System.out.println("InsertApplicationServlet");
			ApplicationDetails appObj = (ApplicationDetails) session.getAttribute("application");
			int courseid = (int) session.getAttribute("courseid");
			ApplicationStatusImpl ad = new ApplicationStatusImpl();
			ApplicationDaoImpl appDao = new ApplicationDaoImpl();
			int appId = appDao.findAppId(appObj);
			ApplicationStatus appStatus = new ApplicationStatus(appObj.getUserId(), appId, courseid, "pending",
					"Applied");
			ad.applicationStatus(appStatus);
			session.setAttribute("ApplicationStatus", appStatus);
			session.setAttribute("appStatusList", ad.showUserAppStatus(appObj.getUserId()));
			response.sendRedirect("viewApplicationStatus.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

	}

}
