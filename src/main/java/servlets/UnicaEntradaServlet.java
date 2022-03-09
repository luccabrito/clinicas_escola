package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.AlteraClinica;
import acao.ListaClinicas;
import acao.MostraClinica;
import acao.NovaClinica;
import acao.NovaClinicaForm;
import acao.RemoveClinica;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		String nome = null;
		
		if (paramAcao.equals("ListaClinicas")) {
			ListaClinicas acao = new ListaClinicas();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("RemoveClinica")) {
			RemoveClinica acao = new RemoveClinica();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("MostraClinica")) {
			MostraClinica acao = new MostraClinica();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("AlteraClinica")) {
			AlteraClinica acao = new AlteraClinica();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("NovaClinica")) {
			NovaClinica acao = new NovaClinica();
			nome = acao.executa(request, response);
		} else if (paramAcao.equals("NovaClinicaForm")) {
			NovaClinicaForm acao = new NovaClinicaForm();
			nome = acao.executa(request, response);
		}
		
		String[] direcionamento = nome.split(":");
		
		if (direcionamento[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + direcionamento[1]);
			rd.forward(request, response);
		} else if (direcionamento[0].equals("redirect")) {
			response.sendRedirect(direcionamento[1]);
		}
	}
}