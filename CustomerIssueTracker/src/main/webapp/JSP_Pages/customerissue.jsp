<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Issue Details</title>
</head>
<div
	style="text-align: right; padding: 5px; margin: 5px 0px; background: #ccc;">	
</div>
<body> 

<h3 id="cust">Customer Issue Details</h3>

	<table border="2" width="70%" cellpadding="2" modelAttribute="IssueDetail">
	<tr><th>Issue Id</th><th>Issue Report Date</th><th>Customer Id</th><th>Category</th><th>Description</th><th>Status</th><th>CC Rep Id</th></tr>
	<tr>
	<td>${issueId}</td>
	<td>${issueDate}</td>
	<td>${cusId}</td>
	<td>${cat}</td>
	<td>${desc}</td>
	<td>${status}</td>
	<td>${ccrId}</td>
	
	</tr>
	</table>
	<br><br>
	<a href="login1">Back to Login Page</a><br>
	<a href="customerPage">Back To Customer's Page</a>

</body>
</html>