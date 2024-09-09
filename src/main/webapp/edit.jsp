<%@page import="com.ibm.servlet_simple_crud_operation.dao.StudentDao"%>
<%@page import="com.ibm.servlet_simple_crud_operation.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));

	Student student = new StudentDao().getStudentByIdDao(id);
	%>

	<h3 style="text-align: center; margin-top: 20px;">Registration
		Form</h3>
	<form id="myForm" action="editForm" method="post"
		style="margin-top: 20px;">
		<div class="form-group">
			<label for="firstName">ID:</label> <input type="text" id="firstName"
				name="id" value="<%=id%>">
		</div>
		<div class="form-group">
			<label for="firstName">First Name:</label> <input type="text"
				id="firstName" name="firstName" value="<%=student.getFirstName()%>">
		</div>

		<div class="form-group">
			<label for="lastName">Last Name:</label> <input type="text"
				id="lastName" name="lastName" value="<%=student.getLastName()%>">
		</div>

		<div class="form-group">
			<label for="nickName">Nick Name:</label> <input type="text"
				id="nickName" name="nickName" value="<%=student.getNickName()%>">
		</div>

		<div class="form-group">
			<label for="email">Email:</label> <input type="email" id="email"
				name="email" value="<%=student.getEmail()%>">
		</div>

		<div class="form-group">
			<label for="password">Password:</label> <input type="password"
				id="password" name="password" value="<%=student.getPassword()%>">
		</div>

		<div class="form-group">
			<label for="dob">Date of Birth:</label> <input type="date" id="dob"
				name="dob" value="<%=student.getDob()%>">
		</div>

		<div class="form-group">
			<label for="mobile">Mobile:</label> <input type="text" id="mobile"
				name="mobile" value="<%=student.getMobile()%>">
		</div>



		<div class="form-group">
			<label>Gender:</label>
			<div class="radio-group">
				<input type="radio" id="male" name="gender" value="Male"
					<%if (student.getGender().equalsIgnoreCase("male")) {%>
					checked="checked" <%}%>> <label for="male">Male</label> <input
					type="radio" id="female" name="gender" value="Female"
					<%if (student.getGender().equalsIgnoreCase("female")) {%>
					checked="checked" <%}%>> <label for="female">Female</label>
				<input type="radio" id="others" name="gender" value="Others">
				<label for="others"
					<%if (student.getGender().equalsIgnoreCase("others")) {%>checked="checked"<%}%>>Others</label>
			</div>
		</div>

		<div class="form-group">
			<label for="address">Address:</label>
			<textarea id="address" name="address" rows="3" cols="25"><%=student.getAddress()%></textarea>
		</div>

		<button type="submit">update</button>
	</form>
</body>
</html>
