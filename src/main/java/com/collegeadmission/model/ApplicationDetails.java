package com.collegeadmission.model;

import java.util.Date;
import java.util.Objects;

public class ApplicationDetails {

	private int applicationId;
	private int userId;
	private String studentName;
	private String fatherName;
	private Date dateofBirth;
	private long aadharNumber;
	private int sslcMark;
	private int hscMark;
	private String address;
	private String city;
	private int pincode;
	private String userState;
	private String nationality;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getSslcMark() {
		return sslcMark;
	}

	public void setSslcMark(int sslcMark) {
		this.sslcMark = sslcMark;
	}

	public int getHscMark() {
		return hscMark;
	}

	public void setHscMark(int hscMark) {
		this.hscMark = hscMark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateofBirth, aadharNumber, address, applicationId, city, fatherName, hscMark, nationality,
				pincode, sslcMark, studentName, userId, userState);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDetails other = (ApplicationDetails) obj;
		return Objects.equals(dateofBirth, other.dateofBirth) && aadharNumber == other.aadharNumber
				&& Objects.equals(address, other.address) && applicationId == other.applicationId
				&& Objects.equals(city, other.city) && Objects.equals(fatherName, other.fatherName)
				&& hscMark == other.hscMark && Objects.equals(nationality, other.nationality)
				&& pincode == other.pincode && sslcMark == other.sslcMark
				&& Objects.equals(studentName, other.studentName) && userId == other.userId
				&& Objects.equals(userState, other.userState);
	}

	@Override
	public String toString() {
		return "ApplicationDetails [applicationId=" + applicationId + ", userId=" + userId + ", studentName="
				+ studentName + ", fatherName=" + fatherName + ", DateofBirth=" + dateofBirth + ", aadharNumber="
				+ aadharNumber + ", sslcMark=" + sslcMark + ", hscMark=" + hscMark + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", userState=" + userState + ", nationality=" + nationality + "]";
	}

	public ApplicationDetails(int applicationId, int userId, String studentName, String fatherName, Date dateofBirth,
			int aadharNumber, int sslcMark, int hscMark, String address, String city, int pincode, String userState,
			String nationality) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.dateofBirth = dateofBirth;
		this.aadharNumber = aadharNumber;
		this.sslcMark = sslcMark;
		this.hscMark = hscMark;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.userState = userState;
		this.nationality = nationality;
	}

	public ApplicationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationDetails(int applicationId) {
		this.applicationId = applicationId;
	}

	public ApplicationDetails(int userId, String studentName, String fatherName, Date dt, long aadharNumber,
			int sslcMark, int hscMark, String address, String city, int pincode, String userState, String nationality) {
		// TODO Auto-generated constructor stub

		this.userId = userId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.dateofBirth = dt;
		this.aadharNumber = aadharNumber;
		this.sslcMark = sslcMark;
		this.hscMark = hscMark;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.userState = userState;
		this.nationality = nationality;

	}

}
