<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>

	<center>
	 	
	 	<h1>User Data</h1>
	 	
	 	<%
	 		String usr = request.getParameter("user");
	 		String pas = request.getParameter("pwd");
	 		
	 		//here we are using the inbuild object like in java code
	 		
	 		session.setAttribute("info",usr);
	 		
	 		
	 		
	 		if(usr.equals("admin") && pas.equals("java"))
	 		{
	 			%>
	 			<!-- here its again jsp html code -->
	 			<jsp:forward page="success.jsp"></jsp:forward>
	 			
	 			<% 
	 		}
	 		else{
	 			out.println("invalid credentials");
	 			%>
	 			
	 			<jsp:include page="userform.jsp"></jsp:include>
	 			<% 
	 		}
	 	
	 	%>
	
	
	</center>
</body>
</html>