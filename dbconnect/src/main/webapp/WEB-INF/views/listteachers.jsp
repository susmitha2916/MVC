<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
	   <tr>
	      <th>tID:</th>
	      <th>NAME:</th>
	      <th>subject:</th>
	   </tr>
	   <c:forEach var="teacher" items="${liststud}">
	   <tr>
	     <td>${teacher.tid}</td>
	     <td>${teacher.name}</td>
	     <td>${teacher.subject}</td>
	   </tr>
	   </c:forEach>
	</table>
</body>
</html>
