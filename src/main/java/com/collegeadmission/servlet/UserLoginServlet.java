package com.collegeadmission.servlet;
//import java.io.PrintWriter;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.impl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//doPost(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String emailId = request.getParameter("email");
		String Password = request.getParameter("password");
		
		UserDaoImpl user =new UserDaoImpl();
		
		try {
			Boolean Str = user.login(emailId, Password);
			System.out.println(Str);
			if(Str==true)
			{
				response.getWriter().print("Login Suceessful");
				response.sendRedirect("UserView.jsp");
			}
			else
			{
				//response.sendRedirect("UserLoginError.jsp");
				response.getWriter().print("Login Unsuceessful");
				
			}
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}
}
