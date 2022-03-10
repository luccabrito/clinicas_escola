package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Banco;
import modelos.Clinica;

public class AlteraClinica implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		return "redirect:entrada?acao=ListaClinicas";
	}
}
