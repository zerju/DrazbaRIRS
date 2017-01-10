<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registracija</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="registracija">
	<form>
		<input type="text" name="username" placeholder="Username..."/>
		<input type="text" name="Email" placeholder="Email"/>
		<input type="password" name="Password" placeholder="Password"/>
		<input type="password" name="Repeat password" placeholder="Repeat password"/>
		<input type="submit" name="registerButton" value="Registriraj"/>
	</form>
</div>
</body>
</html>