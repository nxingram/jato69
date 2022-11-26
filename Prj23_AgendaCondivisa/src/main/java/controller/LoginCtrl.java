package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCtrl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("mi hai chiamato via GET");
//		risposta.setContentType("text/html");//MIME type
//		risposta.getWriter().append("<h1>ciao, sono il metodo get ;)</h1>"); 
		
//		risposta.sendRedirect("formLogin.jsp");
		//INCLUDE - includo + pagine jsp
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("formLogin.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.equals("mauro") && password.equals("12345")) {
			//risposta.sendRedirect("areaRiservata.jsp"); //v1
//			richiesta.getRequestDispatcher("areaRiservata.jsp").forward(richiesta, risposta); //v2
			
			//INCLUDE - includo + pagine jsp
			request.getRequestDispatcher("header.jsp").include(request, response);
			request.getRequestDispatcher("areaRiservata.jsp").include(request, response);
			request.getRequestDispatcher("footer.jsp").include(request, response);
			
		}
		else {
			doGet(request, response);
		}
		//System.out.println("mi hai chiamato via POST: " + username);
	}
	
}
