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

<div align="center">
        <form action="list_teacher" >
		<input  type="submit" value="Refresh">
	  </form>
        <table border="1" cellpadding="10">
            <caption><h2>List of Teachers</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Age</th>
                <th>Role</th>
                
   
            </tr>
            <c:forEach var="user" items="${class_info}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.jender}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><c:out value="${user.role}" /></td>
                    
                    <td>
                     
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete_teacher?id=<c:out value='${user.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>