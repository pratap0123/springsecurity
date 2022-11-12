<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1>PLEASE LOGIN HERE...</h1>

	<form:form>
			UserName:<input type="text" name="username">
		<br>
		<br>
			Password:<input type="password" name="password">
		<br>
		<br>
		<input type="submit" value="Login">
	</form:form>

</body>
</html>