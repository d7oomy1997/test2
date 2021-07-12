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

	<h1>List/Add Subject</h1>
	<h2>
	 <a href="MainPage.jsp">Home Page</a>
	 </h2>
	
	
	<form action="insert" method="post" style="border-style: solid; border-color:black; padding: 2%;">
		
		Subject Name: <input type="text" name="subject_input"><br/>
		Subject Credits: <input type="number" name="credits_input"><br/><br/>
		 <%  
	
			if(request.getAttribute("TheState") == (Object)false ) {
				
				%><span id="e" style='color:red'>Empty fields!!</span><%
			}
		
	
		%>
		<br/>
		<input type="Submit" value="Save" style="margin-left: 10%">
		
		
	</form>
	<br/>
	<br/>
	

	
	
	
	<div align="center">
        <form action="list" >
		<input  type="submit" value="Refresh">
	  </form>
        <table border="1" cellpadding="10">
            <caption><h2>List of Subjects</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Credits</th>
   
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.credits}" /></td>
                    
                    <td>
                     
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<c:out value='${user.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
	
	

</body>
</html>
