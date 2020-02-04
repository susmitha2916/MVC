<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Page1<br>
   <%
      String u = (String)request.getAttribute("uname");
      String p = (String)request.getAttribute("pw");
      out.write(u+", "+p);      
   %><br>
   ${ uname}
   ${pw}
</body>
</html>