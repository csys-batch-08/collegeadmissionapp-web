<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="com.collegeadmission.model.*"%>
<%@page import="java.util.*"%>
<%@page import="com.collegeadmission.impl.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Courses</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
a {
	color: black;
	text-decoration: none;
	font-size: 30px;
	font-weight: bold;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	background-color: #04AA6D;
}
</style>
</head>
<body>

	<ul>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="insertApplication.jsp">InsertApplication</a></li>
		<li><a href="viewCourses">View Courses</a></li>
		<li><a href="insertCardDetails.jsp">Insert Card Details</a></li>
		<li style="float: right"><a href="login.jsp">Logout</a></li>
	</ul>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Course Id</th>
				<th>Course Type</th>
				<th>Course Name</th>
				<th>Admission Fees</th>
				<th>Tuition Fees</th>
				<th>Apply Link</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${courseList}" var="course">
				<tr>
					<td>${course.courseId}</td>
					<td>${course.courseType}</td>
					<td>${course.courseName}</td>
					<td>${course.admissionFees}</td>
					<td>${course.tuitionFees}</td>
					<td><a
						href="insertCardDetails.jsp?courseid=${course.courseId }">Apply</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>