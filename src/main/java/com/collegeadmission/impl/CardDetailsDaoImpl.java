package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.CardDetails;

public class CardDetailsDaoImpl {
	
	public void insertCardDetails(CardDetails card) throws ClassNotFoundException, SQLException {
		

		String courseQuery = "insert into card_details(User_Id,card_number,cvv_number,cardholder_name) values(?,?,?,?)";
		
		Connection con = ConnectionUtil.getDBConnect();
		
		PreparedStatement pstmt = con.prepareStatement(courseQuery);
		
		pstmt.setInt(1,card.getUser_id());
		pstmt.setLong(2,card.getCard_number());
		pstmt.setInt(3,card.getCvv_number());
		pstmt.setString(4, card.getCardholder_name());
		
			
			int result=pstmt.executeUpdate();
			//System.out.println("Course Selected Successfully");
			pstmt.close();
			con.close();
	    }

		
	}

