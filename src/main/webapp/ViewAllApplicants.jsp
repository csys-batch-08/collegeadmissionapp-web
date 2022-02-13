<%@page import="com.collegeadmission.impl.ApplicationDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.collegeadmission.model.ApplicationDetails"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table class="table table-striped">
		<thead>
			<tr>
				<th>Application Id</th>
				<th>User Id</th>
				<th>Student Name</th>
				<th>Father Name</th>
				<th>Date of Birth</th>
				<th>Aadhar Number</th>
				<th>Sslc Mark</th>
				<th>Hsc Mark</th>
				<th>Address</th>
				<th>City</th>
				<th>Pincode</th>
				<th>State</th>
				<th>Nationality</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${applicationList}" var="applist">
				<tr>
					<td>${applist.applicationId}</td>
					<td>${applist.userId}</td>
					<td>${applist.studentName}</td>
					<td>${applist.fatherName}</td>
					<td>${applist.dateofBirth}</td>
					<td>${applist.aadharNumber}</td>
					<td>${applist.sslcMark}</td>
					<td>${applist.hscMark}</td>
					<td>${applist.address}</td>
					<td>${applist.city}</td>
					<td>${applist.pincode}</td>
					<td>${applist.userState}</td>
					<td>${applist.nationality}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>