package com.collegeadmission.model;

import java.io.Serializable;
import java.util.Objects;

public class UserDetails implements Serializable {

	private int userId;
	private String name;
	private String userName;
	private String email;
	private long mobileNumber;
	private String userPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email, mobileNumber, userId, userName, userPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(name, other.name) && Objects.equals(email, other.email)
				&& mobileNumber == other.mobileNumber && userId == other.userId
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", Name=" + name + ", userName=" + userName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", userPassword=" + userPassword + "]";
	}

	public UserDetails(String name, String userName, String email, long mobileNumber, String userPassword) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userPassword = userPassword;
	}

	public UserDetails(int userId, String name, String userName, String email, long mobileNumber, String userPassword) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userPassword = userPassword;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
