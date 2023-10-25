<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h2>Add Product</h2>

<form:form method="post" modelAttribute="command" action="product">

<label>Product Id</label>
<form:input path="id"/>

<label>Product Name</label>
<form:input path="productName"/>

<label>Rate per Unit</label>
<form:input path="ratePerUnit"/>

<input type="submit" value="Add">

</form:form>


</body>
</html>