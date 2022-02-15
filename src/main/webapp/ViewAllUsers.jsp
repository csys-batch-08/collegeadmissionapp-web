<%@page import="com.collegeadmission.model.UserDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.collegeadmission.impl.UserDaoImpl"%>
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
<title>View All Users</title>
</head>
<body>

	<ul>
		<li><a href="adminView.jsp">Admin View</a></li>
		<li style="float: right"><a href="login.jsp"><strong>Logout</strong></a></li>
	</ul>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>User Id</th>
				<th>Name</th>
				<th>User Name</th>
				<th>MailId</th>
				<th>Mobile Number</th>
				<th>User Password</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${userList}" var="users">
				<tr>
					<td>${users.userId}</td>
					<td>${users.name}</td>
					<td>${users.userName}</td>
					<td>${users.email}</td>
					<td>${users.mobileNumber}</td>
					<td>${users.userPassword}</td>

				</tr>
			</c:forEach>

		</tbody>
	</table>


</body>
</html>