package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.ApplicationStatus;


public class ApplicationStatusImpl {

	public void applicationStatus(ApplicationStatus appStatus) throws ClassNotFoundException, SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
		
		 con = ConnectionUtil.getDBConnect();
		String query = " insert into application_status(user_id,application_id,course_id,payment_status,application_status)values(?,?,?,?,?)";

		 pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, appStatus.getUserId());
		
		pstmt.setInt(2, appStatus.getApplicationId());
		
		pstmt.setInt(3, appStatus.getCourseId());
		
		pstmt.setString(4, appStatus.getPaymentStatus());
		
		pstmt.setString(5, appStatus.getApplicationStatus());

		pstmt.executeUpdate();
		}

		catch (Exception e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pstmt, con);
		}
		
	}

	public void updateApplicationStatus(ApplicationStatus as1) throws ClassNotFoundException, SQLException, NullPointerException {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
		 con = ConnectionUtil.getDBConnect();

		String update = "update application_status set payment_status=?, application_status=? where status_id=?";
		System.out.println(update);
		pstmt = con.prepareStatement(update);

		pstmt.setString(1, as1.getPaymentStatus());
		pstmt.setString(2, as1.getApplicationStatus());
		pstmt.setInt(3, as1.getStatusId());
	}

	catch (Exception e) {
		e.getMessage();
	} finally {
		ConnectionUtil.close(pstmt, con);
	}

		//System.out.println(pstmt.executeUpdate() + " is updated !!");

	}

	public List<ApplicationStatus> showAppStatus() throws ClassNotFoundException, SQLException {

		String query = "select * from application_status";
		ApplicationStatus appStatus;
		List<ApplicationStatus> show = new ArrayList<ApplicationStatus>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		
		
		 con = ConnectionUtil.getDBConnect();
		 pstmt = con.prepareStatement(query);

		 rs = pstmt.executeQuery();

		while (rs.next()) {
			appStatus = new ApplicationStatus(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
					rs.getString(6));

			show.add(appStatus);

		}
		
		
	 } catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (Exception e) {
		
		e.printStackTrace();
	} finally {
		ConnectionUtil.close(rs,pstmt, con);
	}

		return show;
	}

	public List<ApplicationStatus> showUserAppStatus(int userId) {

		String query = "select * from application_status where user_id=?";
		ApplicationStatus appStatus;
		List<ApplicationStatus> show = new ArrayList<ApplicationStatus>();
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			 con = ConnectionUtil.getDBConnect();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				appStatus = new ApplicationStatus(rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6));

				show.add(appStatus);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(rs,pstmt, con);
		}
		return show;

	}

}
