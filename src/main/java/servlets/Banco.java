package servlets;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Clinica> lista = new ArrayList<>();

	public void adiciona(Clinica clinica) {
		lista.add(clinica);
	}
	
	public List<Clinica> getClinicas() {
		return Banco.lista;
	}

}
