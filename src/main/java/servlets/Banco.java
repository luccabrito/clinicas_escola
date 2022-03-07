package servlets;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Clinica> lista = new ArrayList<>();
	
	static {
		Clinica clinica = new Clinica();
		clinica.setNome("SPA - UFPE");
		clinica.setEndereco("Rua Acadêmico Hélio Ramos, S/N");
		clinica.setTelefone("(81) 2126-8731");
		Clinica clinica2 = new Clinica();
		clinica2.setNome("FAFIRE");
		clinica2.setEndereco("Av. Conde da Boa Vista, 92");
		clinica2.setTelefone("(81) 2122-3511");
		lista.add(clinica);
		lista.add(clinica2);
	}

	public void adiciona(Clinica clinica) {
		lista.add(clinica);
	}
	
	public List<Clinica> getClinicas() {
		return Banco.lista;
	}

}
