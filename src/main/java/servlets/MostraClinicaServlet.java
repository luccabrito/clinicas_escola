package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraClinica")
public class MostraClinicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Clinica clinica = banco.buscaClinicaPelaId(id);
		request.setAttribute("clinica", clinica);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraClinica.jsp");
		rd.forward(request, response);
	}
}
