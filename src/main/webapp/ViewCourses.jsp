<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.collegeadmission.model.*"%>
<%@page import="java.util.*"%>
<%@page import="com.collegeadmission.impl.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<%
CoursesDaoImpl showCourses = new   CoursesDaoImpl();
List<CourseDetails> courseList = new ArrayList<CourseDetails>();
courseList=showCourses.showAllCourses();
%>		

<table class="table table-striped">			
<thead>
<tr>	
<th >Course Id</th>
<th>Course Type</th>
<th>Course Name</th>
<th>Admission Fees</th>
<th>Tuition Fees</th>
<th>Apply Link</th>
</tr>
</thead>

<tbody>									
<%
for(CourseDetails list : courseList) {
%>
<tr>
<td><%=list.getCourseId()%></td>
<td><%=list.getCourseType()%></td>
<td> <%=list.getCourseName()%></td>	
<td><%=list.getAdmissionFees() %></td>	
<td><%=list.getTuitionFees()%></td>	
<td><a href="insertcarddetails.jsp?courseid=<%=list.getCourseId()%>">Apply</a></td>
</tr>
<%
}
%>
</tbody>
</table>

</body>
</html>