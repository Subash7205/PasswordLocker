<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%=(String)session.getAttribute("saveMesseage") %></h2>
<h1>User login</h1>
<form action="userLogin" method="post">

<div> 
   Email : <input type="email" name="email"> 
  </div> 
 
  <div> 
  Password :<input type="text" name="password"> 
  </div> 
  <div> 
   <input type="Submit" value="Submit"> 
  </div> 
</form>

</body>
</html>