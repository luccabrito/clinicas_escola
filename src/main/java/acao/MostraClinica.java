package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Banco;
import modelos.Clinica;

public class MostraClinica implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Clinica clinica = banco.buscaClinicaPelaId(id);
		request.setAttribute("clinica", clinica);
		
		return "forward:formAlteraClinica.jsp";
	}

}
