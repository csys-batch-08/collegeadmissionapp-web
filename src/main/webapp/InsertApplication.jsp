<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert Application</title>
<style>
body {
	background-image:
		url("https://d2jyir0m79gs60.cloudfront.net/news/images/successful-college-student-lg.png");
	background-size: cover;
	background-repeat: no-repeat;
	color: white;
}

input {
	width: 250px;
	height: 30px;
	border-radius: 5px;
	margin-top: 10px;
	border: 1px solid;
	padding-left: 15px;
}

form {
	margin-left: 40%;
	background: rgba(0, 0, 0, .5);
	width: 270px;
	padding: 3px;
}
</style>
</head>
<body>

	<ul>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="login.jsp">Login</a></li>
		<li><a href="insertApplication.jsp">InsertApplication</a></li>
		<li><a href="viewCourses">View Courses</a></li>
		<li><a href="insertCardDetails.jsp">Insert Card Details</a></li>
		<li style="float: right"><a href="login.jsp">Logout</a></li>
	</ul>

	<form action="InsertApplicationServlet" method="post">
		<h1>Application Details</h1>

		<input type="text" name="studentname" placeholder="Student Name"
			pattern="[A-Za-z.,]{3,30}" required><br> <br> <input
			type="text" name="fathername" placeholder="Father Name"
			pattern="[A-Za-z., ]{3,30}" required><br> <br> <input
			type="date" name="dateofbirth" id="dob" placeholder="DateofBirth"
			pattern="" required><br> <br> <input type="number"
			name="aadharnumber" placeholder="Aadhar Number" pattern="[0-9] {12}"
			required><br> <br> <input type="number"
			name="sslcMark" placeholder="SSLC Mark" pattern="[0-4] {1} [0-9]{2}"
			required> <input type="file" name="sslcMarkimage"
			placeholder="Insert your SSLC Marksheet" pattern="[0-4] {1} [0-9]{2}"
			required> <br> <br> <input type="number"
			name="hscMark" placeholder="HSC Mark" pattern="[0-1] {2}[0-9]{2}"
			required> <input type="file" name="sslcMarkimage"
			placeholder="Insert your HSC Marksheetft"
			pattern="[0-4] {1} [0-9]{2}" required> <br> <br> <input
			type="text" name="address" placeholder="Address" required><br>
		<br> <input type="text" name="city" placeholder="City" required><br>
		<br> <input type="number" name="pincode" placeholder="Pincode"
			pattern="[0-9] {6}" required><br> <br> <input
			type="text" name="userstate" placeholder="State" required><br>
		<br> <input type="text" name="nationality"
			placeholder="Nationality" required><br> <br>

		<button type="submit">Submit</button>
		<button type="reset">Reset</button>
		<br> <br> <br> <br>
	</form>
	<script>
		today();
		function today() {
			var today = new Date();
			var dd = String(today.getDate()).padStart(2, '0');
			var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
			var yyyy = today.getFullYear();
			var yyyy1 = today.getFullYear() - 17;
			maxdate = yyyy1 + '-' + mm + '-' + dd;

			document.getElementById("dob").setAttribute("max", maxdate);

		}
	</script>


</body>
</html>