package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collegeadmission.connection.*;
import com.collegeadmission.model.UserDetails;

public class UserDaoImpl {

	Scanner sc = new Scanner(System.in);

	public void insert(UserDetails str) throws ClassNotFoundException, SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
		
		 con = ConnectionUtil.getDBConnect();
		String query = "insert into user_details(Name,User_Name,Email,Mobile_Number,User_Password) values(?,?,?,?,?)";

		pstmt = con.prepareStatement(query);

		pstmt.setString(1, str.getName());
		pstmt.setString(2, str.getUserName());
		pstmt.setString(3, str.getEmail());
		pstmt.setLong(4, str.getMobileNumber());
		pstmt.setString(5, str.getUserPassword());

		pstmt.executeUpdate();
		
	}

	catch (Exception e) {
		e.getMessage();
	} finally {
		ConnectionUtil.close(pstmt, con);
	}
	}

	public ResultSet getEmailDetails(UserDetails rp) throws SQLException, ClassNotFoundException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ConnectionUtil.getDBConnect();
			String query = "select * from user_details where email=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			rs = pstmt.executeQuery();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			ConnectionUtil.close(rs, pstmt, con);

		}
		return rs;
	}

	public UserDetails login(String emailId, String Password) throws ClassNotFoundException, SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserDetails userDetails = null;

		try {
		
		 con = ConnectionUtil.getDBConnect();

		String query = "select * from user_details where Email= ? and User_Password= ? ";

		 pstmt = con.prepareStatement(query);

		// System.out.println("Registered");

		pstmt.setString(1, emailId);
		pstmt.setString(2, Password);

		rs = pstmt.executeQuery();
		//UserDetails userDetails = null;
		if (rs.next()) {
			userDetails = new UserDetails(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getLong(5), rs.getString(6));
			//return userDetails;
		}
		}
		

	catch (Exception e) {
		e.getMessage();
	} finally {
		ConnectionUtil.close(rs, pstmt, con);
	}

		return userDetails;
	}

	public List<UserDetails> showAllUsers() throws ClassNotFoundException, SQLException {
		List<UserDetails> userList = new ArrayList<UserDetails>();
		String showusersquery = "select * from user_details";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getDBConnect();

			pstmt = con.prepareStatement(showusersquery);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// System.out.println(rs.getString(2));
				UserDetails userdetails = new UserDetails(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getLong(5), rs.getString(6));
				userList.add(userdetails);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, pstmt, con);
		}

		return userList;
	}

}
