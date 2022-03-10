package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Banco;
import modelos.Clinica;

public class ListaClinicas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		System.out.println("listando clinicas");

		Banco banco = new Banco();
		List<Clinica> lista = banco.getClinicas();
		
		request.setAttribute("clinicas", lista);
		
		return "forward:listaClinicas.jsp";
	}
}