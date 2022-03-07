package servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
        PrintWriter out = response.getWriter();
        out.println("<html><body>Empresa " + nomeClinica + " cadastrada com sucesso!</body></html>");
		
	}
}
