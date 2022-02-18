<%@page import="com.collegeadmission.model.ApplicationStatus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title> View Application Status </title>

</head>
<body>

	<form action="" method="post">

		<h1>Application Status Details</h1>

		<table>
			<tr>
				<th>Course id</th>
				<th>Payment Status</th>
				<th>Application Status</th>
			</tr>

			<tbody>
				<c:forEach items="${appStatusList}" var="appStatus">
					<tr>
						<td>${appStatus.courseId}</td>
						<td>${appStatus.paymentStatus}</td>
						<td>${appStatus.applicationStatus}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</form>


</body>
</html>