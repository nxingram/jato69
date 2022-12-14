package presentation;

import java.io.IOException;

import org.json.JSONArray;

import controller.OrdineCtrl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ordini")
public class OrdineSrv extends HttpServlet{

	OrdineCtrl ctrl = new OrdineCtrl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("titolo", "ordini");
		
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		request.getRequestDispatcher("main/menu.jsp").include(request, response);
		request.getRequestDispatcher("main/titolo.jsp").include(request, response);
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);

	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
