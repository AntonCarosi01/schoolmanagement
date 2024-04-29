package school;

/*
 * SCHOOL MANAGEMENT
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scuola scuola = new Scuola();

		System.out.println("\n *** SCHOOL MANAGEMENT *** \n");

		int scelta;
		do {
			System.out.println("Menu:\n");
			System.out.println("1. Aggiungi studente");
			System.out.println("2. Aggiungi docente");
			System.out.println("3. Visualizza studenti");
			System.out.println("4. Visualizza docenti");
			System.out.println("0. Esci");
			System.out.print("\nScelta: ");
			scelta = scanner.nextInt();
			scanner.nextLine();

			switch (scelta) {
			case 1:
				aggiungiStudente(scanner, scuola);
				break;
			case 2:
				aggiungiDocente(scanner, scuola);
				break;
			case 3:
				visualizzaStudenti(scuola);
				break;
			case 4:
				visualizzaDocenti(scuola);
				break;
			case 0:
				System.out.println("Arrivederci!");
				break;
			default:
				System.out.println("Scelta non valida.");
			}
		} while (scelta != 0);
	}

	// - - -

	public static void aggiungiStudente(Scanner scanner, Scuola scuola) {
		System.out.println("Inserisci nome studente:");
		String nomeStudente = scanner.nextLine();
		System.out.println("Inserisci cognome studente:");
		String cognomeStudente = scanner.nextLine();
		System.out.println("Inserisci email studente:");
		String emailStudente = scanner.nextLine();
		System.out.println("Inserisci classe studente:");
		String classeStudente = scanner.nextLine();
		System.out.println("Inserisci sezione studente:");
		String sezioneStudente = scanner.nextLine();

		Studente studente = new Studente(nomeStudente, cognomeStudente, emailStudente, classeStudente, sezioneStudente);
		scuola.aggiungiStudente(studente);
		System.out.println("Studente aggiunto con successo.");
	}

	public static void aggiungiDocente(Scanner scanner, Scuola scuola) {
		System.out.println("Inserisci nome docente:");
		String nomeDocente = scanner.nextLine();
		System.out.println("Inserisci cognome docente:");
		String cognomeDocente = scanner.nextLine();
		System.out.println("Inserisci email docente:");
		String emailDocente = scanner.nextLine();

		Docente docente = new Docente(nomeDocente, cognomeDocente, emailDocente);
		System.out.println("Inserisci materie insegnate dal docente (termina con 'end'):");
		String materia;
		while (!(materia = scanner.nextLine()).equals("end")) {
			docente.aggiungiMateria(materia);
		}
		scuola.aggiungiDocente(docente);
		System.out.println("Docente aggiunto con successo.");
	}

	public static void visualizzaStudenti(Scuola scuola) {
		System.out.println("Elenco studenti:");
		for (Studente studente : scuola.getStudenti()) {
			System.out.println("Nome: " + studente.getNome() + " " + studente.getCognome() + ", Classe: "
					+ studente.getClasse() + ", Sezione: " + studente.getSezione());
		}
	}

	public static void visualizzaDocenti(Scuola scuola) {
		System.out.println("Elenco docenti:");
		for (Docente docente : scuola.getDocenti()) {
			System.out.println("Nome: " + docente.getNome() + " " + docente.getCognome() + ", Materie: "
					+ String.join(", ", docente.getMaterie()));
		}
	}
}
