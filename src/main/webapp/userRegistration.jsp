<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

div{
padding: 3px;
}
</style>
</head>
<body>
<form action="saveUser" method="post">
<div> 
  Name : <input type="text" name="name"> 
  </div> 
 
  <div> 
  Gender :<input type="text" name="gender"> 
  </div> 
  <div> 
   Dob : <input type="date" name="dob"> 
  </div> 
 
  <div> 
  PhoneNum :<input type="tel" name="phn"> 
  </div> 
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