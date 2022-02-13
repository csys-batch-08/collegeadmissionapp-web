package com.collegeadmission.model;

import java.util.Objects;

public class CardDetails {

	private int user_id;
	private int card_id;
	private long card_number;
	private int cvv_number;
	private String cardholder_name;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public long getCard_number() {
		return card_number;
	}

	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}

	public int getCvv_number() {
		return cvv_number;
	}

	public void setCvv_number(int cvv_number) {
		this.cvv_number = cvv_number;
	}

	public String getCardholder_name() {
		return cardholder_name;
	}

	public void setCardholder_name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(card_id, card_number, cardholder_name, cvv_number, user_id);
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
		return card_id == other.card_id && card_number == other.card_number
				&& Objects.equals(cardholder_name, other.cardholder_name) && cvv_number == other.cvv_number
				&& user_id == other.user_id;
	}

	@Override
	public String toString() {
		return "CardDetails [user_id=" + user_id + ", card_id=" + card_id + ", card_number=" + card_number
				+ ", cvv_number=" + cvv_number + ", cardholder_name=" + cardholder_name + "]";
	}

	public CardDetails(int user_id, int card_id, long card_number, int cvv_number, String cardholder_name) {
		super();
		this.user_id = user_id;
		this.card_id = card_id;
		this.card_number = card_number;
		this.cvv_number = cvv_number;
		this.cardholder_name = cardholder_name;
	}

	public CardDetails(int user_id, long card_number, int cvv_number, String cardholder_name) {
		super();
		this.user_id = user_id;
		this.card_number = card_number;
		this.cvv_number = cvv_number;
		this.cardholder_name = cardholder_name;
	}

	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
