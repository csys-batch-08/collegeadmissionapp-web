<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Courses</title>
</head>
<body>

<h2> Update Courses </h2>

<form action="UpdateCoursesServlet" method= "post">
<label>Enter the admission fees</label>
<input type="number" name="admissionFees" required> <br> <br>

<label>Enter the tuition fees</label>
<input type="number" name="tuitionFees" required> <br> <br>

<label>Enter the course id </label>
<input type="number" name="courseId" required> <br> <br>

<button type="submit" >submit</button>
</form>

</body>
</html>