<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert Courses</title>
<style type="text/css">
body {
	background-image:
		url("https://d2jyir0m79gs60.cloudfront.net/news/images/successful-college-student-lg.png");
	background-size: cover;
	background-repeat: no-repeat;
	color: white;
}

.insertform {
	height: 400px;
	width: 350px;
	background-color: sandal;
	position: absolute;
	top: 150px;
	left: 200px;
	border-radius: 5px;
	box-shadow: 0 0 10px black;
}

.insertform input {
	position: relative;
	left: 80px;
}

.insertform button {
	position: relative;
	left: 140px;
}

.insertform h1 {
	position: relative;
	text-align: center;
}
</style>
</head>
<body>

	<ul>
		<li><a href="adminView.jsp">Admin View</a></li>
		<li style="float: right"><a href="login.jsp"><strong>Logout</strong></a></li>
	</ul>

	<div class="insertform">
		<form action="InsertCoursesServlet" method="post">

			<h1>Insert Course Details</h1>

			<input type="number" name="courseId" placeholder="Course ID" required><br>
			<br> <input type="text" name="courseType"
				placeholder="Course Type" required><br> <br> <input
				type="text" name="courseName" placeholder="Course Name" required><br>
			<br> <input type="number" name="admissionFees"
				placeholder="Admission Fees" required><br> <br> <input
				type="number" name="tuitionFees" placeholder="Tuition Fees" required><br>
			<br>

			<button type="submit">Submit</button>
			<br> <br>
		</form>
	</div>

</body>

</body>
</html>