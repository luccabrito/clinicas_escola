package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Banco;

public class RemoveClinica implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.removeClinica(id);
		
		return "redirect:entrada?acao=ListaClinicas";
	}

}
