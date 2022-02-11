<%@page import="com.collegeadmission.model.ApplicationStatus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<form action = "" method="post">

<h1>Application Status Details</h1>

<table>
<tr>
<th>Course id</th>
<th>Payment Status</th>
<th>Application Status</th>
</tr>
<% List<ApplicationStatus> appStatusList=(List<ApplicationStatus>)session.getAttribute("appStatusList");
for(ApplicationStatus appStatus:appStatusList)
	{%>
	<tr>
	<td>
	<%=appStatus.getCourseId() %>
	</td>
	<td>
	<%=appStatus.getPaymentStatus() %>
	</td>
	<td>
	<%=appStatus.getApplicationStatus() %>
	</td>
	</tr>
	<%} %>
</table>

<button type="submit">Submit</button><br><br>
</form>


</body>
</html>