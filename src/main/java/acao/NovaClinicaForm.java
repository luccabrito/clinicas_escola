package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaClinicaForm {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "forward:formNovaClinica.jsp";
	}
}
