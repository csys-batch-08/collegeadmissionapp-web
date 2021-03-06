package com.collegeadmission.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.CardDetailsDaoImpl;
import com.collegeadmission.model.CardDetails;

/**
 * Servlet implementation class InsertCardDetails
 */
@WebServlet("/InsertCardDetailsServlet")
public class InsertCardDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertCardDetailsServlet() {
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		try {
		int userId = (int) session.getAttribute("UserId");
		 int courseId = Integer.parseInt(request.getParameter("courseid")); 
		long cardNumber = Long.parseLong(request.getParameter("cardNumber"));
		int cvvNumber = Integer.parseInt(request.getParameter("cvvNumber"));
		String cardHolderName = request.getParameter("cardHolderName");

		CardDetails card = new CardDetails(userId, cardNumber, cvvNumber, cardHolderName);
		CardDetailsDaoImpl cardDao = new CardDetailsDaoImpl();
		
			cardDao.insertCardDetails(card);
			session.setAttribute("courseid", courseId); 
			RequestDispatcher rd = request.getRequestDispatcher("InsertApplicationStatusServlet");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
		e.getMessage();
		}	
			
			
			
			
			
			
		}

		//doGet(request, response);

	}


