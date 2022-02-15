<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Card Details</title>
</head>

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
input[type=text], input[type=number], input[type=submit] {
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

#Payment {
	height: 100vh;
}
</style>
</head>
<body>

	<ul>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="insertApplication.jsp">InsertApplication</a></li>
		<li><a href="viewCourses.jsp">View Courses</a></li>
		<li><a href="insertCardDetails.jsp">Insert Card Details</a></li>
		<li style="float: right"><a href="login.jsp">Logout</a></li>
	</ul>

	<div class="container">
${param.courseid}
		<h1>ATM Card Details</h1>

		<form action="InsertCardDetailsServlet?courseid=${param.courseid}" id="Payment" method="post">

			<label for="Debit Card Number">Enter ATM Card Number</label> <input
				type="number" name="cardNumber" placeholder="Card Number" required><br>
			<br> <label for="CVV Number"> Enter CVV Number </label> <input
				type="number" name="cvvNumber" placeholder="Cvv Number" required><br>
			<br> <label for="Card Holder Name">Enter Card Holder
				Name</label> <input type="text" name="cardHolderName"
				placeholder="Card Holder Name" required><br> <br>

			<button type="submit">Submit</button>
			<br> <br>


		</form>
	</div>
</body>
</html>