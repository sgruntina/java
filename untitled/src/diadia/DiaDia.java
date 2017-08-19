package diadia;

public class DiaDia {

	public static void main(String[] args) {
		Personaggio ciccia = creaPersonaggio("Ciccia", "Buffa", "Verde", "F");
		Personaggio giorgio = creaPersonaggio("Giorgio", "Giorgi", "Rosso", "M");
		System.out.println(giorgio);
		System.out.println(ciccia);
		giorgio.sposa(ciccia);
		System.out.println(giorgio);
		System.out.println(ciccia);
	}

	private static Personaggio creaPersonaggio(String nome, String cognome, String razza, String genere) {
		Personaggio pers = new Personaggio(nome, cognome, new Specializzazione(), genere, razza, new Borsa());
		return pers;
	}

}
