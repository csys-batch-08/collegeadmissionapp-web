package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.CardDetails;

public class CardDetailsDaoImpl {

	public void insertCardDetails(CardDetails card) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

		String courseQuery = "insert into card_details(User_Id,card_number,cvv_number,cardholder_name) values(?,?,?,?)";

		 con = ConnectionUtil.getDBConnect();

		 pstmt = con.prepareStatement(courseQuery);

		pstmt.setInt(1, card.getUserId());
		pstmt.setLong(2, card.getCardNumber());
		pstmt.setInt(3, card.getCvvNumber());
		pstmt.setString(4, card.getCardHolderName());

		pstmt.executeUpdate();
		// System.out.println("Course Selected Successfully");
		pstmt.close();
		con.close();
	}


		catch (Exception e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pstmt, con);
		}

	}
}
