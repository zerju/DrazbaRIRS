<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj dražbo</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="dodaj">
	<form>
		<span>Ime dražbe</span>
		<input type="text" name="imeDrazbe" placeholder="Ime Dražbe"/>
		<span>Ime predmeta</span>
		<input type="text" name="imePredmeta" placeholder="Ime Predmeta"/>
		<span>Začetna cena</span>
		<input type="number" name="quantity" min="1" max="15000000" placeholder="Začetna Cena"/>
		<span>Do kdaj bo trajala dražba</span>
		<input type="datetime-local" name="izbranCas">
		<span>Opis</span>
		<textarea rows="4" cols="50"></textarea>
		<button name="slikaButton">Naloži slike...</button>
		<input type="submit" name="dodajDrazbo" value="Dodaj drazbo"/>
	</form>
</div>
</body>
</html>