<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1>Adminstrator Login</h1><br/>
	
	<form action="login" method="post">
	User Name: <input type="text" name="username" placeholder="Enter username" value="abo sadem"><br/>
	Password : <input type="text" name="password" placeholder="Enter password" value="1234"><br/><br/>
	
	
	
	<%  
	
		if(request.getAttribute("TheState") == (Object)false ) {
			out.print(request.getAttribute("TheState"));
			%><span id="e" style='color:red'>Invalid Credentials!!</span><%
		}
		
	
	%>
	
		
	
	
	<input type="submit" value="Login">
	
	
	</form>


</body>
</html>