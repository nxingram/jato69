<%
	String titolo = "Home";	
	if((String )request.getAttribute("titolo") != null){
		titolo = (String )request.getAttribute("titolo");
	}

%>

<!-- <nav>
    <a href="/Prj28_Gestionale" >home</a> 
    <a href="articoli" title="articoli" id="articoli" class="link_menu">articoli</a> 
    <a href="impiegati" title="impiegati" id="impiegati" class="link_menu">impiegati</a> 
    <a href="clienti" title="clienti" id="clienti" class="link_menu">clienti</a> 
    <a href="ordini" title="ordini" id="ordini" class="link_menu">ordini</a> 
    <a href="uffici" title="uffici" id="uffici" class="link_menu">uffici</a> 

</nav> -->
<h1 class="visually-hidden">Applicazione gestionale</h1>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/Prj28_Gestionale">Gestionale Ordini</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link <%=titolo.equals("Home")?"active":"" %>" aria-current="page" href="/Prj28_Gestionale">Home</a>
          </li>
          <li class="nav-item">
            <a href="articoli" title="articoli" id="articoli" class="nav-link <%=titolo.equals("articoli")?"active":"" %>">articoli</a> 
          </li>
          <li class="nav-item">
            <a href="impiegati" title="impiegati" id="impiegati" class="nav-link <%=titolo.equals("impiegati")?"active":"" %>">impiegati</a>
          </li>
          <li class="nav-item">
            <a href="clienti" title="clienti" id="clienti" class="nav-link <%=titolo.equals("clienti")?"active":"" %>">clienti</a> 
          </li>
          <li class="nav-item">
            <a href="ordini" title="ordini" id="ordini" class="nav-link <%=titolo.equals("ordini")?"active":"" %>">ordini</a> 
          </li>
          <li class="nav-item">
            <a href="uffici" title="uffici" id="uffici" class="nav-link <%=titolo.equals("uffici")?"active":"" %>">uffici</a> 
          </li>
        </ul>
      </div>
    </div>
  </nav>