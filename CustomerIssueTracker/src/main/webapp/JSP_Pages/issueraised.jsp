<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Following Issue Is Raised</title>
</head>
<div
	style="text-align: right; padding: 5px; margin: 5px 0px; background: #ccc;">	
</div>
<body> 
	
	<h3>Following Issue is Raised</h3>
	<table border="2" width="70%" cellpadding="2" modelAttribute="IssueDetail">
	<tr><th>Issue Id</th><th>Issue Report Date</th><th>Customer Id</th><th>Category</th><th>Description</th><th>Status</th><th>CC Rep Id</th></tr>
	<tr>
	<td>${IssueDetail.custIssueId}</td>
	<td>${IssueDetail.issueReportDate}</td>
	<td>${IssueDetail.custId}</td>
	<td>${IssueDetail.category}</td>
	<td>${IssueDetail.description}</td>
	<td>${IssueDetail.issueStatus}</td>
	<td>${IssueDetail.ccRepId}</td>
	</tr>
	</table>
	
</body>
</html>