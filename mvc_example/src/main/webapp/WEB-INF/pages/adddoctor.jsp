<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add Doctor</h2>

<form:form method="post" modelAttribute="command" action="doctor">

<label>Doctor Id</label>

<form:input path="doctorId"/>

<label>Doctor Name</label>
<form:input path="doctorName"/>

<label>Department</label>
<form:input path="department"/>

<input type="submit" value="Add">

</form:form>

</body>
</html>