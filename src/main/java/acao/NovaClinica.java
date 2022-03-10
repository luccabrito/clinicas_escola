package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Banco;
import modelos.Clinica;

public class NovaClinica implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String nomeClinica = request.getParameter("nome");
        String enderecoClinica = request.getParameter("endereco");
        String telefoneClinica = request.getParameter("telefone");
        
        Clinica clinica = new Clinica();
        clinica.setNome(nomeClinica);
        clinica.setEndereco(enderecoClinica);
        clinica.setTelefone(telefoneClinica);
        
        Banco banco = new Banco();
        banco.adiciona(clinica);
        
        request.setAttribute("clinica", clinica.getNome());
        
        return "redirect:entrada?acao=ListaClinicas";
	}
}
