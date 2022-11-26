package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AgendaCtrl() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//REDIRECT - invio un redirect al browser, che farà una nuova request alla pagina indicata
//		response.sendRedirect("agenda.jsp"); 
		
		//FOREWARD
//		request.getRequestDispatcher("agenda.jsp").forward(request, response); // reindirizzo, ma rimango sul server
		
		//INCLUDE - includo + pagine jsp
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("agenda.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
