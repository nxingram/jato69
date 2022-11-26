<%@page import="dao.LibroDAO"%>
<%@page import="model.Libro"%>
<%
	String titolo =  request.getParameter("titoloLibro");	


	Libro l = new Libro(titolo);
	LibroDAO dao = new LibroDAO();
	dao.addLibro(l);

	response.sendRedirect("inserisci.jsp?insert=success");
%>

<h1><%=titolo %></h1>

