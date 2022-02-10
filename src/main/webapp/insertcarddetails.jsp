<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Card Details</title>
</head>
<body>

<form action="InsertCardDetailsServlet" method="post">

<input type ="number" name = "cardNumber" placeholder="Card Number" required><br><br>
<input type ="number" name = "cvvNumber" placeholder="Cvv Number" required><br><br>
<input type ="text" name = "cardholderName" placeholder ="Card Holder Name" required><br><br>

<button type="submit">Submit</button><br><br>
<input type="number" name = "courseId" value=<%=request.getParameter("courseid") %> placeholder="Course Id" required>

</form>
</body>
</html>