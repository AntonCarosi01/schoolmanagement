package school;

import java.util.ArrayList;
import java.util.List;

class Docente extends Persona {

	private List<String> materie;

	public Docente(String nome, String cognome, String email) {
		super(nome, cognome, email);
		this.materie = new ArrayList<>();
	}

	// Getters & setters

	public void aggiungiMateria(String materia) {
		materie.add(materia);
	}

	public List<String> getMaterie() {
		return materie;
	}

	public void setMaterie(List<String> materie) {
		this.materie = materie;
	}

}
