<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.raiseissue {
	align-content: center;
}
</style>
<title>RAISE ISSUE</title>
<style>
.error{color:red}
</style>
</head>
<div
	style="text-align: right; padding: 5px; margin: 5px 0px; background: #ccc;">	
</div>
<body>
<br>
<h2 align="center">Please fill following details to raise a issue</h2>
<br><br><br><br><br><br>

		<form:form method="post" action="issueraised" modelAttribute="IssueDetail">
		<table align="center">
		<tr><td>
		Issue Id:</td><td> <form:input path="" value="Auto Filled"/>
		<form:input type="hidden" path="custIssueId"/>
		</td></tr>
		<tr><td>
		Issue Report Date: (Format:yyyy/mm/dd)</td><td> <form:input path="issueReportDate"/>
		<form:errors path="issueReportDate" cssClass="error"/>
		</td></tr>
		<tr><td>
		Customer Id:</td><td> <form:input path="custId"/>
		<form:errors path="custId" cssClass="error"/>
		</td></tr>
		<tr><td>
		Category:</td><td> <form:input path="category"/>
		<form:errors path="category" cssClass="error"/>
		</td></tr>
		<tr><td>
		Description:</td><td> <form:textarea path="description"/>
		<form:errors path="description" cssClass="error"/>
		<form:input type="hidden" path="ccRepId" value="CCR"/>
		<form:input type="hidden" path="issueStatus" value="In Progress"/>
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