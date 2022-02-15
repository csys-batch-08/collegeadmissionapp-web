<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Courses</title>
<style type="text/css">
body {
	background-image:
		url("https://d2jyir0m79gs60.cloudfront.net/news/images/successful-college-student-lg.png");
	background-size: cover;
	background-repeat: no-repeat;
	color: white;
}

.updateform {
	position: absolute;
	top: 220px;
	left: 200px;
	width: 450px;
	height: 250px;
	box-shadow: 0 0 50px black;
	border: 2px solid white;
}

.updateform input {
	position: relative;
	right: -30px;
}

.updateform button {
	position: relative;
	left: 150px;
	top: 30px;
}

#tuitionFees {
	position: relative;
	left: 53px;
}

#courseId {
	position: relative;
	left: 65px;
}
</style>
</head>
<body>

	<ul>
		<li><a href="adminView.jsp">Admin View</a></li>
		<li style="float: right"><a href="login.jsp"><strong>Logout</strong></a></li>
	</ul>

	<div class="updateform">
		<h2>Update Courses</h2>

		<form action="UpdateCoursesServlet" method="post">
			<label>Enter the admission fees</label> <input type="number"
				id="admissionFees" name="admissionFees" required> <br>
			<br> <label>Enter the tuition fees</label> <input type="number"
				id="tuitionFees" name="tuitionFees" required> <br> <br>

			<label>Enter the course id </label> <input type="number"
				id="courseId" name="courseId" required> <br> <br>

			<button type="submit">submit</button>
		</form>
	</div>
</body>
</html>