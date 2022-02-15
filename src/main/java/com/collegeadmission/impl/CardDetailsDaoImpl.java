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

		pstmt.setInt(1, card.getUserId());
		pstmt.setLong(2, card.getCardNumber());
		pstmt.setInt(3, card.getCvvNumber());
		pstmt.setString(4, card.getCardHolderName());

		int result = pstmt.executeUpdate();
		// System.out.println("Course Selected Successfully");
		pstmt.close();
		con.close();
	}

}
