package com.collegeadmission.model;

import java.io.Serializable;
import java.util.Objects;

public class CardDetails implements Serializable {

	private int userId;
	private int cardId;
	private long cardNumber;
	private int cvvNumber;
	private String cardHolderName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cardHolderName, cardId, cardNumber, cvvNumber, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardDetails other = (CardDetails) obj;
		return Objects.equals(cardHolderName, other.cardHolderName) && cardId == other.cardId
				&& cardNumber == other.cardNumber && cvvNumber == other.cvvNumber && userId == other.userId;
	}
	@Override
	public String toString() {
		return "CardDetails [userId=" + userId + ", cardId=" + cardId + ", cardNumber=" + cardNumber + ", cvvNumber="
				+ cvvNumber + ", cardHolderName=" + cardHolderName + "]";
	}
	public CardDetails(int userId, int cardId, long cardNumber, int cvvNumber, String cardHolderName) {
		super();
		this.userId = userId;
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.cardHolderName = cardHolderName;
	}
	public CardDetails(int userId, long cardNumber, int cvvNumber, String cardHolderName) {
		super();
		this.userId = userId;
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.cardHolderName = cardHolderName;
	}
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
