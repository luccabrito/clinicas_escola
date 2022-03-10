package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Clinica> lista = new ArrayList<>();
	private static List<Usuario> listaUsers = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Clinica clinica = new Clinica();
		clinica.setNome("SPA - UFPE");
		clinica.setEndereco("Rua Acadêmico Hélio Ramos, S/N");
		clinica.setTelefone("(81) 2126-8731");
		clinica.setId(chaveSequencial++);
		Clinica clinica2 = new Clinica();
		clinica2.setNome("FAFIRE");
		clinica2.setEndereco("Av. Conde da Boa Vista, 92");
		clinica2.setTelefone("(81) 2122-3511");
		clinica2.setId(chaveSequencial++);
		lista.add(clinica);
		lista.add(clinica2);
		Usuario u1 = new Usuario("lucca", "ymn");
		Usuario u2 = new Usuario("nico", "123");
		listaUsers.add(u1);
		listaUsers.add(u2);
	}

	public void adiciona(Clinica clinica) {
        clinica.setId(Banco.chaveSequencial++);
		lista.add(clinica);
	}
	
	public List<Clinica> getClinicas() {
		return Banco.lista;
	}
	
	public void removeClinica(Integer id) {
		Iterator<Clinica> it = lista.iterator();
		
		while (it.hasNext()) {
			Clinica cli = it.next();
		
			if (cli.getId() == id) {
				it.remove();
			}
		}
	}

	public Clinica buscaClinicaPelaId(Integer id) {
		for (Clinica clinica : lista) {
			if (clinica.getId() == id) {
				return clinica;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsers) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}