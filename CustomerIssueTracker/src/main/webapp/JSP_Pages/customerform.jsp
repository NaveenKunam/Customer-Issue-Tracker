<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
.error{color:red}
</style>
</head>
<div
	style="text-align: right; padding: 5px; margin: 5px 0px; background: #ccc;">	
</div>
<body>
	
		<h2 align="center" id="heading3">Welcome To Home Page</h2>
		<br><br><br><br><br>
		<form:form method="post" action="login" modelAttribute="customer">
		<table align="center">
		<tr><td>
		Customer Id:</td><td> <form:input path="custId"/>
		<form:errors path="custId" cssClass="error"/>
		</td></tr>
		<tr><td>
		Customer Name:</td><td> <form:input path="custName"/>
		<form:errors path="custName" cssClass="error"/>
		</td></tr>
		<tr><td>
		Customer Address:</td><td> <form:input path="custAddress"/>
		<form:errors path="custAddress" cssClass="error"/>
		</td></tr>
		<tr><td>
		Customer Phone:</td><td> <form:input path="custPhone"/>
		<form:errors path="custPhone" cssClass="error"/>
		</td></tr>
		<tr><td>
		Create new login Id:</td><td> <form:input path="loginId"/>
		<form:errors path="loginId" cssClass="error"/>
		</td></tr>
		<tr><td>
		Create new Password:</td><td> <form:input type="password" path="password"/>
		<form:errors path="password" cssClass="error"/>
		</td></tr>
		<tr><td>
		<input type="submit" value=Submit>
		</td><td>
		<input type="reset" value="Clear">
		</td></tr>
		</table>
		</form:form>
		
	
</body>

</html>