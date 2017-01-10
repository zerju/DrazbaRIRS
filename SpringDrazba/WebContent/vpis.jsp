<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vpis</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="vpis">
	<form>
		<input type="text" name="username" placeholder="Username..."/>
		<input type="password" name="password" placeholder="Password..."/>
		<a href="registracija.jsp">Nimam še računa...</a>
		<input type="submit" name="vpisButton" value="Vpis"/>
	</form>
</div>
</body>
</html>