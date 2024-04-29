package school;

class Studente extends Persona {

	private String classe;
	private String sezione;

	public Studente(String nome, String cognome, String email, String classe, String sezione) {
		super(nome, cognome, email);
		this.classe = classe;
		this.sezione = sezione;
	}

	// Getters & setters

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

}