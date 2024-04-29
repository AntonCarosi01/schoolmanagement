package school;

class Segretario extends Persona {

	private String orarioLavoro;
	private String ufficio;

	public Segretario(String nome, String cognome, String email, String orarioLavoro, String ufficio) {
		super(nome, cognome, email);
		this.orarioLavoro = orarioLavoro;
		this.ufficio = ufficio;
	}

	// Getters and setters

	public String getOrarioLavoro() {
		return orarioLavoro;
	}

	public void setOrarioLavoro(String orarioLavoro) {
		this.orarioLavoro = orarioLavoro;
	}

	public String getUfficio() {
		return ufficio;
	}

	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}

}
