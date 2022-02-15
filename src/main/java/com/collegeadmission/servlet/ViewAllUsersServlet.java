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

import com.collegeadmission.impl.UserDaoImpl;
import com.collegeadmission.model.UserDetails;

/**
 * Servlet implementation class ViewAllUsersServlet
 */
@WebServlet("/viewAllUsers")
public class ViewAllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllUsersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDaoImpl showUsers = new UserDaoImpl();
		List<UserDetails> userList = new ArrayList<UserDetails>();
		try {
			userList = showUsers.showAllUsers();
			request.setAttribute("userList", userList);
			// System.out.println(userList);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllUsers.jsp");
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

		UserDaoImpl showUsers = new UserDaoImpl();
		List<UserDetails> userList = new ArrayList<UserDetails>();
		try {
			userList = showUsers.showAllUsers();
			request.setAttribute("userList", userList);
			// System.out.println(userList);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllUsers.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
