
<!DOCTYPE html>
<html lang="en">
<head>

<title>User View</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
body {
	background-image:
		url("https://d2jyir0m79gs60.cloudfront.net/news/images/successful-college-student-lg.png");
	background-size: cover;
	background-repeat: no-repeat;
	color: white;
}

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
s
</style>

<body>

	<ul>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="insertApplication.jsp">InsertApplication</a></li>
		<li><a href="viewCourses">View Courses</a></li>
		<li><a href="insertCardDetails.jsp">Insert Card Details</a></li>
		<li style="float: right"><a href="login.jsp">Logout</a></li>
	</ul>


	<h2 align="center" style="padding-top: 18%">
		Application Details : <a href="insertApplication.jsp"><button
				type="button" class="btn btn-success">Apply</button></a>
	</h2>


	<h2 align="center">
		View Courses : <a href="viewCourses"><button type="button"
				class="btn btn-success">View</button></a>
	</h2>

	<br>
	<br>

</body>
</html>