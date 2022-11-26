package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import org.json.JSONArray;

import controller.HubUffici;

/**
 * Servlet implementation class UfficioCtrl
 */

@WebServlet("/uffici")
public class UfficioSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HubUffici ctrl = new HubUffici();

	public UfficioSrv() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("titolo", "uffici");
		
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		request.getRequestDispatcher("main/menu.jsp").include(request, response);
		request.getRequestDispatcher("main/titolo.jsp").include(request, response);
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);

	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
