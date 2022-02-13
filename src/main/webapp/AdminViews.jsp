
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
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
	<div class="content">
		<h2>View All Users</h2>
		<a href="ViewAllUsers"> Show Users</a>
		<hr />

		<form action="DeleteApplicationServlet" method="post">
			<h2>Delete Application</h2>

			<label for="applicationId">Application Id</label> <input
				type="number" name="applicationId" required><br />
			<br>
			<button type="submit">Delete Application</button>
		</form>
		<hr />
		<br>

		<h2>View All Applications</h2>
		<a href="ViewAllApplicants"> Show All Applications</a>
		<hr />
		<h2>Insert Courses Details</h2>
		<a href="InsertCourses.jsp"> Insert </a>
		<hr />
		<h2>Edit Courses</h2>
		<a href="UpdateCourses.jsp"> Edit </a>
		<hr />
		<h2>View All Application Status</h2>
		<a href="ViewAllApplicationStatus"> View All Application Status </a>
		<hr />
		<h2>Edit Application Status</h2>
		<a href="UpdateApplicationStatus.jsp"> Edit </a>
	</div>
</body>
</html>