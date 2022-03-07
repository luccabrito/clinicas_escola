package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaClinica")
public class NovaClinicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Cadastrando nova clínica");
		
        String nomeClinica = request.getParameter("nome");
        String enderecoClinica = request.getParameter("endereco");
        String telefoneClinica = request.getParameter("telefone");
        Clinica clinica = new Clinica();
        clinica.setNome(nomeClinica);
        clinica.setEndereco(enderecoClinica);
        clinica.setTelefone(telefoneClinica);
        
        Banco banco = new Banco();
        banco.adiciona(clinica);
        
        RequestDispatcher rd = request.getRequestDispatcher("/listaClinicas");
        request.setAttribute("clinica", clinica.getNome());
        rd.forward(request, response);
	}
}
