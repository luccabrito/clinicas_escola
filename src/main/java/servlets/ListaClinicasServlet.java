package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaClinicas")
public class ListaClinicasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Clinica> lista = banco.getClinicas();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
        out.println("<ul>");
        for (Clinica clinica : lista) { 
            out.println("<li>" + clinica.getNome() + "</li>");
        }        
        out.println("</ul>");
        out.println("</body></html>");	
	}
}