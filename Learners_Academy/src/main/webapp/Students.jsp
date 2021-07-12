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

	<h1>List/Add Student</h1>
	<h2>
	 <a href="MainPage.jsp">Home Page</a>
	 </h2>
<form action="insert_student">
	<fieldset>
			Name:<br/>	<input type="text" name="name" placeholder="inter name">
		  	<br/>
		  	Email:<br/> <input type="email" name="email" placeholder="inter email">
		  	<br/>
		  	Gender:
		  	<br/>
			  	<select name="jender">
				    <option value="male">male</option>
				    <option value="female">female</option>
			  	</select>
		 	<br/>
		 	Age:<br/>	<input type="text" name="age" placeholder="age"><br/>
		  
		  	Class Number:<br/>
				 <select id="Class" name="class1">
				   			<c:if test="${listclasses !=  null}">
							<c:forEach var="user" items="${listclasses}">
							
							<option value="${user[1]}"><c:out value="${user[1]} / RoomNo: ${user[2]}" /></option>
							 
							</c:forEach>
							</c:if>
				 </select>
		  	<br/>
		  	Role:<br/>
			  	<select name="role">
				    <option value="Student">Studnt</option>
			 	</select>
	  </fieldset><br/>
	   <%  
	
			if(request.getAttribute("TheState") == (Object)false ) {
				
				%><span id="e" style='color:red'>Empty fields!!</span><%
			}
		
	
		%>
		<br/>
	  <input type="submit" value="save">
  </form>
  
  		<div align="center">
        <form action="list_student" >
		<input  type="submit" value="Refresh">
	  </form>
        <table border="1" cellpadding="10">
            <caption><h2>List of Students</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Age</th>
                <th>Role</th>
                <th>Class</th>
                
   
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.jender}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><c:out value="${user.role}" /></td>
                    <td><c:out value="${user.class1}" /></td>
                    
                    <td>
                    
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete_student?id=<c:out value='${user.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>