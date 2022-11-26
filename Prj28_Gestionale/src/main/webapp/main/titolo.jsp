<% 
	String titolo = (String) request.getAttribute("titolo");
	if(titolo!= null){
		//prima lettera maiuscola
		titolo = titolo.substring(0, 1).toUpperCase() + titolo.substring(1);
	}else{
		titolo = "";
	}

%>
<h2 class="mt-5 display-6"><%= titolo %></h2>