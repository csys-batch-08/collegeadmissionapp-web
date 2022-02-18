<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title> Update Application Status </title>
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
	top: 300px;
	left: 200px;
	width: 400px;
	height: 200px;
	border: 2px solid white;
	box-shadow: 0 0 80px black;
	border-radius: 5px;
}

.updateform button {
	position: relative;
	left: 160px;
}

#paymentStatus {
	position: relative;
	left: 20px;
}

#statusId {
	position: relative;
	left: 60px;
}
</style>
</head>
<body>

	<ul>
		<li><a href="adminView.jsp">Admin View</a></li>
		<li style="float: right"><a href="login.jsp"><strong>Logout</strong></a></li>
	</ul>

	<div class="updateform">
		<form action="UpdateApplicationStatusServlet" method="post">
			<label>Enter the payment status</label> <input type="text"
				id="paymentStatus" name="paymentStatus" required><br> <br>
			<label>Enter the application status</label> <input type="text"
				id="applicationStatus" name="applicationStatus" required><br>
			<br> <label>Enter the status id </label> <input type="number"
				id="statusId" name="statusId" required><br> <br>
			<button type="submit">submit</button>
		</form>
	</div>
</body>
</html>