package com.collegeadmission.servlet;
//import java.io.PrintWriter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.AdminDaoImpl;
import com.collegeadmission.impl.UserDaoImpl;
import com.collegeadmission.model.Admin;
import com.collegeadmission.model.UserDetails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		String emailId = request.getParameter("email");
		String Password = request.getParameter("password");

		UserDaoImpl user = new UserDaoImpl();
		AdminDaoImpl adminDao = new AdminDaoImpl();
		try {

			if (emailId.endsWith("@admin.com")) {

				boolean flag = adminDao.loginAdmin(emailId, Password);
				if (flag) {
					response.sendRedirect("adminView.jsp");
				} else {
					request.getRequestDispatcher("login.jsp").forward(request, response);

				}
			}

			else {

				UserDetails userDetails = user.login(emailId, Password);
				System.out.println(userDetails);
				if (userDetails != null) {
					session.setAttribute("UserId", userDetails.getUserId());
					session.setAttribute("userDetails", userDetails);
					response.getWriter().print("Login Suceessful");
					response.sendRedirect("userView.jsp");
				} else {
					// response.sendRedirect("UserLoginError.jsp");
					response.getWriter().print("Login Unsuceessful");

				}
			}
		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}
}
