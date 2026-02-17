<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Declaration tag this is comment line -->
	
	<%!
		int x=200;
		int y = 300;
		public int add(){
			return x+y;
		}
	%>
	
	
	<!--  expression tag -->
	<%= add() %>
	
	<!--  scriplet tags -->
	<br>
	<%
		 out.println("Current date : "+new Date());
	%>
	
</body>
</html>