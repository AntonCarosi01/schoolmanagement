package school;

import java.util.ArrayList;
import java.util.List;

public class Scuola {

	private List<Studente> studenti;
	private List<Docente> docenti;

	public Scuola() {
		this.studenti = new ArrayList<>();
		this.docenti = new ArrayList<>();
	}

	// Getters & setters

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void setDocenti(List<Docente> docenti) {
		this.docenti = docenti;
	}

	// M.. +

	public void aggiungiStudente(Studente studente) {
		studenti.add(studente);
	}

	public void aggiungiDocente(Docente docente) {
		docenti.add(docente);
	}
}
