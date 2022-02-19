package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collegeadmission.connection.*;
//import com.collegeadmission.impl.*;
import com.collegeadmission.model.*;
//import com.collegeadmission.servlet.*;

public class ApplicationDaoImpl {

	public void insertApplication(ApplicationDetails applicationdetails) throws ClassNotFoundException, SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			String formQuery = "insert into application_details(user_id,Student_Name,Father_Name,Date_of_Birth,Aadhar_Number,SSLC_Mark,HSC_Mark,Address,City,Pincode,User_State,Nationality) values(?,?,?,?,?,?,?,?,?,?,?,?)";

			con = ConnectionUtil.getDBConnect();

			pstmt = con.prepareStatement(formQuery);

			pstmt.setInt(1, applicationdetails.getUserId());

			pstmt.setString(2, applicationdetails.getStudentName());

			pstmt.setString(3, applicationdetails.getFatherName());

			// System.out.println(applicationdetails.getDateofBirth());
			pstmt.setDate(4, new java.sql.Date(applicationdetails.getDateofBirth().getTime()));

			pstmt.setLong(5, applicationdetails.getAadharNumber());

			pstmt.setInt(6, applicationdetails.getSslcMark());

			pstmt.setInt(7, applicationdetails.getHscMark());

			pstmt.setString(8, applicationdetails.getAddress());

			pstmt.setString(9, applicationdetails.getCity());

			pstmt.setInt(10, applicationdetails.getPincode());

			pstmt.setString(11, applicationdetails.getUserState());

			pstmt.setString(12, applicationdetails.getNationality());

			pstmt.executeUpdate();
			// System.out.println("Registered Successfully");
			// pstmt.close();
			// con.close();
		}

		catch (Exception e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pstmt, con);
		}

	}

	public List<ApplicationDetails> showAllApplications() throws ClassNotFoundException, SQLException, NullPointerException {
		List<ApplicationDetails> applicationList = new ArrayList<ApplicationDetails>();
		String showapplicationsquery = "select * from application_details";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnectionUtil.getDBConnect();
		
		
			pstmt = con.prepareStatement(showapplicationsquery);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ApplicationDetails applicationdetails = new ApplicationDetails(rs.getInt(1), rs.getInt(2),
						rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13));
				applicationList.add(applicationdetails);
			}
		 } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs,pstmt, con);
		}
		
		return applicationList;

	}

	public int findAppId(ApplicationDetails application) {
		String query = "select application_id from application_details where student_name=? and father_name=?";
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;


		try {
			con = ConnectionUtil.getDBConnect();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, application.getStudentName());
			pstmt.setString(2, application.getFatherName());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		} 
		
		finally {
			
		
		
		ConnectionUtil.close(pstmt, con);	

		}

		return result;

	}

}
