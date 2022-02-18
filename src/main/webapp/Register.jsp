<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<title>Registration</title>
<head>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=email], input[type=submit]
	{
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<body>

	<ul>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="userLogin.jsp">Login</a></li>
		<li><a href="insertApplication.jsp">InsertApplication</a></li>
		<li><a href="viewCourses.jsp">View Courses</a></li>
		<li><a href="insertCardDetails.jsp">Insert Card Details</a></li>
		<li style="float: right"><a href="login.jsp">Logout</a></li>
	</ul>

	<div class="container">

		<h1>Register Form</h1>

		<form action="RegisterServlet" method="post">
			<label for="name">Enter Name</label> <input type="text" name="name"
				placeholder="Name" autofocus pattern="[a-zA-Z]{3,}" required>
			<br> <br> <label for="username">Enter UserName</label> <input
				type="text" name="username" placeholder="User Name" autofocus
				pattern="[a-zA-Z]{3,}" required> <br> <br> <label
				for="email">Email </label> <input type="email" name="email"
				placeholder="Email Id" id="email" required onkeyup="emailvalid()">
			<br> <br> <label for="mobileno">Enter MobileNumber</label>
			<input type="text" name="mobileno" placeholder="Mobile Number"
				required pattern="[6-9]{1}[0-9]{9}"> <br> <br> <label
				for="password"> Set Password</label> <input type="password"
				name="password" placeholder="Password" required min="8"> <br>
			<br>
			<button type="submit">Submit</button>
			<br> <br>
		</form>
	</div>


	<c:if test="${emailexist!=null}">
		<h3 style="margin-left: 590px; margin-top: 590px; size: 70%">${emailexist}</h3>

	</c:if>
	<c:remove var="emailexist" scope="session" />


</body>
</html>