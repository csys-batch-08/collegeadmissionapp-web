<%@page import="com.collegeadmission.impl.ApplicationDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.collegeadmission.model.ApplicationDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	ApplicationDaoImpl applis = new ApplicationDaoImpl();
	List<ApplicationDetails> applicationList = applis.showAllApplications();
	%>
	<div id="allusers">
		<table>
			<thead>
				<tr>
					<th>Application Id
					<th>
					<th>User Id</th>
					<th>Student Name</th>
					<th>Father Name</th>
					<th>Date of Birth</th>
					<th>Aadhar Number</th>
					<th>Sslc Mark
					<th>
					<th>Hsc Mark
					<th>
					<th>Address
					<th>
					<th>City
					<th>
					<th>Pincode
					<th>
					<th>User State
					<th>
					<th>Nationality
					<th>
				</tr>
			</thead>
			<tbody>
				<%
				for (ApplicationDetails applist : applicationList) {
				%>
				<tr>
					<td><%=applist.getApplicationId()%></td>
					<td><%=applist.getUserId()%></td>
					<td><%=applist.getStudentName()%></td>
					<td><%=applist.getFatherName()%></td>
					<td><%=applist.getDateofBirth()%></td>
					<td><%=applist.getAadharNumber()%></td>
					<td><%=applist.getSslcMark()%></td>
					<td><%=applist.getHscMark()%></td>
					<td><%=applist.getAddress()%></td>
					<td><%=applist.getCity()%></td>
					<td><%=applist.getPincode()%></td>
					<td><%=applist.getUserState()%></td>
					<td><%=applist.getNationality()%></td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>


</body>
</html>