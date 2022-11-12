<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1>PLEASE LOGIN HERE...</h1>
	<h1>
	
	<c:if test="${param.error=null}"></c:if>
	<i>Incorrect password or username</i>

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