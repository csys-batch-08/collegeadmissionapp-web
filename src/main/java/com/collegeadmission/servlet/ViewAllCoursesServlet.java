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

import com.collegeadmission.impl.CoursesDaoImpl;
import com.collegeadmission.model.*;

/**
 * Servlet implementation class ViewAllCoursesServlet
 */
@WebServlet("/viewCourses")
public class ViewAllCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllCoursesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CoursesDaoImpl showCourses = new CoursesDaoImpl();
		List<CourseDetails> courseList = new ArrayList<CourseDetails>();
		try {
			courseList = showCourses.showAllCourses();
			request.setAttribute("courseList", courseList);
			//System.out.println(courseList);
			RequestDispatcher rd = request.getRequestDispatcher("viewCourses.jsp");
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
		// TODO Auto-generated method stub

		CoursesDaoImpl showCourses = new CoursesDaoImpl();
		List<CourseDetails> courseList = new ArrayList<CourseDetails>();
		try {
			courseList = showCourses.showAllCourses();
			request.setAttribute("courseList", courseList);
			//System.out.println(courseList);
			RequestDispatcher rd = request.getRequestDispatcher("viewCourses.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
