<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="age" value="${91}" scope="session"></c:set>   <!-- inbuilt tag is c:set from tags.core similarly c:out -->
	<c:out value="${age}" />

	
	
	<c:choose>
		<c:when test="${age>18 }">
			<c:out value="eligible for vote"></c:out>
		</c:when>
	<c:otherwise>
		<c:out value="not eligible"></c:out><br>
	</c:otherwise>
	</c:choose>
	
	<br><c:forEach var="dt" begin="1"  end="10">
		<c:out value="${dt}"></c:out><br>
	</c:forEach>	
	
</body>
</html>