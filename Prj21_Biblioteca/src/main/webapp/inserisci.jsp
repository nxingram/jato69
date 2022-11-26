<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Inserisci</h1>
<%@ include file="menu.jsp" %>

<br>
<form action="doInserisci.jsp" method="get">
	<label for="titoloLibro">Titolo</label>
	<input type="text" name="titoloLibro" id="titoloLibro">
	<input type="submit" value="Aggiungi libro">
</form>
<div>
<%
	if(request.getParameter("insert")!= null){
		out.print(request.getParameter("insert"));
	}

%>
</div>
</body>
</html>