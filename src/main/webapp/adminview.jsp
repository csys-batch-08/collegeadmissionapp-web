<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>

<title>Admin View</title>
<style type="text/css">
body {
	background-image:
		url("https://d2jyir0m79gs60.cloudfront.net/news/images/successful-college-student-lg.png");
	background-size: cover;
	background-repeat: no-repeat;
	color: white;
}

ul {
	list-style: none;
}

a {
	text-decoration: none;
	color: white;
}

a:hover {
	color: yellow;
}
</style>
</head>
<body>

	<ul>
		<li style="float: right"><a href="login.jsp"><strong>Logout</strong></a></li>
	</ul>


	<c:if test="${param.sucess eq 1}">
		<h2>
			<c:out value="${valid }" />
		</h2>
	</c:if>

	<c:if test="${param.sucess eq 2}">
		<h2>
			<c:out value="${invalid }" />
		</h2>
	</c:if>

	<div class="content">

		<h2>View All Users</h2>
		<a href="viewAllUsers"> Show Users</a>
		<hr />

		<h2>View All Applications</h2>
		<a href="viewAllApplications"> Show All Applications</a>
		<hr />

		<h2>Insert Courses Details</h2>
		<a href="insertCourses.jsp"> Insert </a>
		<hr />

		<h2>Edit Courses</h2>
		<a href="updateCourses.jsp"> Edit </a>
		<hr />

		<h2>View All Application Status</h2>
		<a href="viewAllApplicationStatus"> View All Application Status </a>
		<hr />

		<h2>Edit Application Status</h2>
		<a href="updateApplicationStatus.jsp"> Edit </a>

	</div>
</body>
</html>