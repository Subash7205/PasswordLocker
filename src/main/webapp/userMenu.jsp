<%@page import="org.ass.passwordlocker.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to user menu</h1>
<%User user=(User)session.getAttribute("logged user");
if(user!=null){
	%>
	<h1>Welcome to the User menu</h1>
	<a href="userLogout">logged out</a>

<%}else{%>
<h1>Please login to use other functions</h1><br>
<a href="userLogin.jsp">back to Login</a>

<%}%>
</body>
</html>