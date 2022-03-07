package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alteraClinica")
public class AlteraClinicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeClinica = request.getParameter("nome");
		String enderecoClinica = request.getParameter("endereco");
		String telefoneClinica = request.getParameter("telefone");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Clinica clinica = banco.buscaClinicaPelaId(id);
		clinica.setNome(nomeClinica);
		clinica.setEndereco(enderecoClinica);
		clinica.setTelefone(telefoneClinica);
		
		response.sendRedirect("listaClinicas");
	}

}
