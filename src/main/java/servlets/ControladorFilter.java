package servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.Acao;


@WebFilter("/entrada")
public class ControladorFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] direcionamento = nome.split(":");
		
		if (direcionamento[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + direcionamento[1]);
			rd.forward(request, response);
		} else if (direcionamento[0].equals("redirect")) {
			response.sendRedirect(direcionamento[1]);
		}
	}
}
