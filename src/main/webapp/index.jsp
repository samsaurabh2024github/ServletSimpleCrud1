<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <!-- syntax to create for loop -->
	<%for(int i=0;i<=10;i++){%>
	
		<h4><%=i%></h4>
	
	<%}%>
	
	<%! 
		public int addTwoNumber(int a,int b){
			return a+b;
		}
	%>
	
	<%int b = addTwoNumber(32, 89);%>
	
	<h5><%=addTwoNumber(10, 20)%> <%=b%></h5>
	
	
	
	
</body>
</html>