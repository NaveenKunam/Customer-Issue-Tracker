<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.loginform {
	align-content: center;
}
</style>
<title>Customer Page</title>
</head>
<div
	style="text-align: right; padding: 5px; margin: 5px 0px; background: #ccc;">	
</div>
<body>
	<h2>Welcome To Customer Page</h2>
	<form action="customerform" modelAttribute="customer">
	Please Select Your Option:
	<input type="radio" name="radioName" value="raise">Raise <br> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&nbsp;
	<input type="radio" name="radioName" value="view">View Issue Status and Enter Id of Issue You Wish to See:
	<input type="text" placeholder="Enter customer Issue Id" name=issueId path="custIssueId">
	<br><br><br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>