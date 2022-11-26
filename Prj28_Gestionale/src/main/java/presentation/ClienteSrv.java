package presentation;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONObject;

import controller.ClienteController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

@WebServlet("/clienti")
public class ClienteSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClienteController ctrl = new ClienteController();
	
	public ClienteSrv() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("titolo", "clienti");
		
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		request.getRequestDispatcher("main/menu.jsp").include(request, response);
		request.getRequestDispatcher("main/titolo.jsp").include(request, response);
		
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	
	
}
