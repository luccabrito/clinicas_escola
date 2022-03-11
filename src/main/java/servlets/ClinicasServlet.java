package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelos.Banco;
import modelos.Clinica;

@WebServlet("/clinicas")
public class ClinicasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Clinica> clinicas = new Banco().getClinicas();
		
		Gson gson = new Gson();
		String json = gson.toJson(clinicas);
		
		response.setContentType("application/json");
		response.getWriter().print(json);
		
	}

}
