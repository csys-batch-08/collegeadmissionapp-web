<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
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
				<th>Status Id</th>
				<th>User Id</th>
				<th>Application Id</th>
				<th>Course Id</th>
				<th>Payment Status</th>
				<th>Application Status</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${applicationstatus}" var="status">
				<tr>
					<td>${status.statusId}</td>
					<td>${status.userId}</td>
					<td>${status.applicationId}</td>
					<td>${status.courseId}</td>
					<td>${status.paymentStatus}</td>
					<td>${status.applicationStatus}</td>

				</tr>
			</c:forEach>

		</tbody>
	</table>


</body>
</html>