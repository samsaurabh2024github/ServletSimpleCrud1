<%@page import="com.ibm.servlet_simple_crud_operation.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.ibm.servlet_simple_crud_operation.dao.StudentDao"%>
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
			List<Student> students=new StudentDao().getAllStudentDataDao(); 
	%>

	<div>
		<table border="2">
			<tr>
				<th>id</th>
				<th>firstname</th>
				<th>lastname</th>
				<th>nickname</th>
				<th>email</th>
				<th>password</th>
				<th>dob</th>
				<th>mobile</th>
				<th>gender</th>
				<th>address</th>
				<th colspan="2">Action</th>
			</tr>
			
			<%for(Student student:students){%>
				<tr>
					<td><%=student.getId()%></td>
					<td><%=student.getFirstName() %></td>
					<td><%=student.getLastName() %></td>
					<td><%=student.getNickName() %></td>
					<td><%=student.getEmail() %></td>
					<td>**********</td>
					<td><%=student.getDob()%></td>
					<td><%=student.getMobile() %></td>
					<td><%=student.getGender() %></td>
					<td><%=student.getAddress() %></td>
					<td ><a href="delete?id=<%=student.getId()%>" style="color: red">DELETE</a></td>
					<td><a href="edit.jsp?id=<%=student.getId()%>" style="color: green;">EDIT</a></td>
				</tr>
			<%}%>
		</table>
	</div>

</body>
</html>