package diadia;

import diadia.lettori.Lettore;

public class DiaDia {

	public static void main(String[] args) {
		//Lettore lettore = new Lettore();
		Personaggio ciccia = creaPersonaggio("Ciccia", "Buffa", "Verde", "F");
		Personaggio giorgio = creaPersonaggio("Giorgio", "Giorgi", "Rosso", "M");
		System.out.println(giorgio);
		System.out.println(ciccia);
		giorgio.sposa(ciccia);
		System.out.println(giorgio);
		System.out.println(ciccia);
		ciccia.raccogliStrumento(new Strumento("clava", "arma"));
		giorgio.raccogliStrumento(new Strumento("rossetto", "cosmetico"));
		System.out.println(ciccia.getBorsa());
		ciccia.gettaStrumento(new Strumento("clava", "arma"));
		System.out.println(ciccia.getBorsa());
		System.out.println(giorgio.getBorsa());
		//System.out.println(lettore.leggiBooleano());
		//System.out.println(lettore.leggiIntero());
		Labirintite labirinto = new Labirintite();


	}

	private static Personaggio creaPersonaggio(String nome, String cognome, String razza, String genere) {
		Personaggio pers = new Personaggio(nome, cognome, new Specializzazione(), genere, razza, new Borsa());
		return pers;
	}

}
