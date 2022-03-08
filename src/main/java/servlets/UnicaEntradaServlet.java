package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.AlteraClinica;
import acao.ListaClinicas;
import acao.MostraClinica;
import acao.NovaClinica;
import acao.RemoveClinica;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
		if (paramAcao.equals("ListaClinicas")) {
			ListaClinicas acao = new ListaClinicas();
			acao.executa(request, response);
			
		} else if (paramAcao.equals("RemoveClinica")) {
			RemoveClinica acao = new RemoveClinica();
			acao.executa(request, response);
			
		} else if (paramAcao.equals("MostraClinica")) {
			MostraClinica acao = new MostraClinica();
			acao.executa(request, response);
			
		} else if (paramAcao.equals("AlteraClinica")) {
			AlteraClinica acao = new AlteraClinica();
			acao.executa(request, response);
			
		} else if (paramAcao.equals("NovaClinica")) {
			NovaClinica acao = new NovaClinica();
			acao.executa(request, response);
		}
	
	}

}
